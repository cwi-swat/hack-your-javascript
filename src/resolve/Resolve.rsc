module resolve::Resolve

import resolve::Util;
import javascript::Syntax;
import ParseTree;
import IO;

anno bool Statement@scope;
anno bool Tree@scope;

Refs resolve((Source)`<Statement* stats>`, Lookup lookup) 
  = resolve(stats, [varDefs(stats)], lookup);

Refs resolve(Statement* stats, Scope sc, Lookup lookup) {
  Refs refs = {};
  for (s <- stats) {
    //println("Resolving stat: <s>");
    switch (s) {
      case (Statement)`let <{VariableDeclaration ","}+ vds>;`:
        for (vd <- vds) {
          if (vd has exp) {
            refs += resolve(vd.exp, sc, lookup);
          } 
          sc = [ ("<vd.id>": vd.id@\loc) ] + sc;
        }
      default:
        refs += resolve(s, sc, lookup);
    }
  }
  return refs;
}

Refs resolve(Function f, Scope sc, Lookup lookup) {
  //println("Resolving func: <f>");
  return resolve(f.body, [ ( "<x>": x@\loc | x <- f.parameters ) + varDefs(f.body), *sc], lookup);
}

Refs resolve(Statement stat, Scope sc, Lookup lookup) {
  Refs refs = {};
  top-down-break visit (stat) {
    case Function f: 
      refs += resolve(f, sc, lookup);
    case (Statement)`{<Statement* stats>}`:
      refs += resolve(stats, sc, lookup);  
    case (Statement)`try {<Statement* t>} catch (<Id e>) {<Statement* c>}`: 
      refs += resolve(t, sc, lookup)
           +  resolve(c, [("<e>": e@\loc), *sc], lookup);
    case Expression e:
      refs += resolve(e, sc, lookup);
   }
   return refs;
}
  
Refs resolve(Expression exp, Scope sc, Lookup lookup) {
  Refs refs = {};
  //println("Resolving exp: <exp>");
  top-down-break visit (exp) {
    case Function f:
      refs += resolve(f, sc, lookup);
    case Id x: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name, use, sc) };
    }
  }
  return refs;
}  
  
  
Env varDefs(Statement* body) {
  env = (); 
  
  void define(Id x) {  env["<x>"] = x@\loc;  }
  
  top-down-break visit (body) {
    case Function f: 
      if (f has name) define(f.name);
    
    case (VarDecl)`var <{VariableDeclaration ","}+ vds>;`:
      for (vd <- vds) { 
        define(vd.id);
      }
    
    case VariableDeclarationNoIn vd: 
      define(vd.id);
      
    case (Statement)`for (var <Id x> in <Expression _>) <Statement _>`:
      define(x);

    // todo: labels
  }
  
  return env;
}


Refs resolve__(Statement* body, Scope sc, Lookup lookup) {
  Refs refs = {}; 
  top-down-break visit (body) {
    case (Function)`function <Id name>(<{Id ","}* formals>) { <Statement* body> }`:
      refs += resolve(body, [ //( "<name>": name@\loc)
                   ( "<x>": x@\loc | x <- formals ) 
                   + varDefs(body)
                  , *sc], lookup);
    
    case (Function)`function (<{Id ","}* formals>) { <Statement* body> }`:
      refs += resolve(body, [ ( "<x>": x@\loc | x <- formals ) + varDefs(body)
                            , *sc], lookup);
    
    case (Statement)`try {<Statement* t>} catch (<Id e>) {<Statement* c>}`: 
      refs += resolve(t, sc, lookup)
           +  resolve(c, [("<e>": e@\loc), *sc], lookup);
    
    case (Expression)`<Id x>`: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name, use, sc) };
    }
    
  }
  return refs;
}





// until we can make this generic...
start[Source] uniqueify(start[Source] s) {
  int count = 0;

  loc uniq(loc id) {
    id.fragment = "<count>";
    count += 1;
    return id;
  };
    
  return visit (s) {
    case Id x => x[@\loc=uniq(x@\loc)]
      when x@\loc.extension == "rsc"
  }
}


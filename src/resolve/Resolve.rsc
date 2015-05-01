module resolve::Resolve

import resolve::Util;
import javascript::Syntax;
import ParseTree;
import IO;

anno bool Statement@scope;
anno bool Tree@scope;

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
      when x@\loc.scheme == "rascal"
  }
}


Refs resolve((Source)`<Statement* stats>`, Lookup lookup) 
  = resolve(stats, [definitions(stats)], lookup);
  

Refs resolve(Statement* body, Scope sc, Lookup lookup) {
  Refs refs = {}; 
  top-down-break visit (body) {
    case (Function)`function <Id name>(<{Id ","}* formals>) { <Statement* body> }`:
      refs += resolve(body, [ //( "<name>": name@\loc)
                   ( "<x>": x@\loc | x <- formals ) 
                   + definitions(body)
                  , *sc], lookup);
    
    case (Function)`function (<{Id ","}* formals>) { <Statement* body> }`:
      refs += resolve(body, [ ( "<x>": x@\loc | x <- formals ) + definitions(body)
                            , *sc], lookup);
    
    case (Statement)`try {<Statement* t>} catch (<Id e>) {<Statement* c>}`: 
      refs += resolve(t, sc, lookup)
           +  resolve(c, [("<e>": e@\loc), *sc], lookup);
    
    case (Expression)`<Id x>`: {
      name = "<x>";
      use = x@\loc;
      refs += { <use, def, name> | loc def <- lookup(name, use, sc), bprintln("Def = <def>") };
    }
  }
  return refs;
}



Env definitions(Statement* body) {
  env = (); 
  
  void define(Id x) { 
    env["<x>"] = x@\loc; 
  }
  
  top-down-break visit (body) {
    case Function f: 
      if (f has name) define(f.name);
    
    case VariableDeclaration vd: 
      define(vd.id);
    
    case VariableDeclarationNoIn vd: 
      define(vd.id);
      
    case (Statement)`for (var <Id x> in <Expression _>) <Statement _>`:
      define(x);

    // todo: labels
    
  }
  
  return env;
}



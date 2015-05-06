module javascript::Resolve

import javascript::Syntax;
import ParseTree;
import IO;

alias Env = map[str name, loc decl];

// start of list = inner
alias Scope = list[Env];
alias Refs = rel[loc use, loc def, str name];

alias Lookup = set[loc](str, loc, Scope);
alias GetRenaming = map[loc,str](Refs refs);

// need compare of extensions, rascal files are not rascal:// anymore.
bool isCapture(loc u, loc d) = u.extension != d.extension;

tuple[Lookup, GetRenaming] makeResolver() {
  map[loc, str] toRename = ();
  
  set[loc] lookup(str name, loc use, Scope sc) {
    for (env <- sc, name in env) {
      def = env[name];
      
      if (!isCapture(use, def)) {
        return {def};
      }
      
      // captures are renamed until a non-capturing decl is found
      toRename[def] = name;
    }
    
    // not found
    return {};
  }
  
  map[loc,str] getRenaming(Refs refs) {
    ren = ();
    allNames = refs<2>;
    for (d <- toRename) {
      n = gensym(allNames, toRename[d]);
      allNames += {n};
      ren[d] = n;
      ren += ( u: n | <u, d, _> <- refs ); 
    }
    return ren;
  }
  
  return <lookup, getRenaming>;
}


str gensym(set[str] ns, str base) = gensym(ns, base + "$", 0);

str gensym(set[str] ns, str base, int i) {
  n = "<base><i>";
  if (n in ns) {
    return gensym(ns, base, i + 1);
  }
  return n;
}

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
      refs += resolve(t, sc, lookup) + resolve(c, [("<e>": e@\loc), *sc], lookup);
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
      for (vd <- vds) define(vd.id);
    
    case VariableDeclarationNoIn vd: 
      define(vd.id);
      
    case (Statement)`for (var <Id x> in <Expression _>) <Statement _>`:
      define(x);

    // todo: labels
  }
  
  return env;
}


// until we can make this generic...
// and maybe merg with resolve to prevent another traversal.
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



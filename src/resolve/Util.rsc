module resolve::Util

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
    i = 0;
    for (env <- sc, name in env) {
      def = env[name];

      //println("Looking for <name> (<use>)");       
      if (!isCapture(use, def)) {
        //println("Found it: <def>");
        return {def};
      }
      
      // captures are renamed until a non-capturing decl is found
      toRename[def] = name;
      i += 1;
    }
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

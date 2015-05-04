module Plugin

import util::IDE;
import javascript::Syntax;
import ParseTree;
import Message;
import IO;
import desugar::Desugar;
import resolve::Resolve;
import resolve::Util;

anno rel[loc,loc,str] Tree@hyperlinks;

void main() {
  makeRegistrar("Sweeter JS", "sjs")();  
}


void() makeRegistrar(str lang, str ext) {
   // caches
  start[Source] js;
  Refs xrefs;
  map[loc, str] renaming;
   
  return void() {
    registerLanguage(lang, ext, Tree(str src, loc l) {
      return parse(#start[Source], src, l);
    });
  
    registerContributions(lang, {
      annotator(Tree(Tree pt) {
        if (start[Source] s := pt) {
          <js, xref, renaming> = desugarAndResolve(s);
          s = addHoverDocs(s, renaming);
          xref2 = { <u, d, x> | <u, d, x> <- xref, u.path == pt@\loc.path, d.path == pt@\loc.path }; 
          return s[@hyperlinks=xref2];
        }
        return pt[@messages={error("BUG: not JS", pt@\loc)}];
      }),
  
      builder(set[Message](Tree tree) {
        // use the caches here
        fixed = rename(js, renaming);
        out = tree@\loc.top[extension="js"];
        writeFile(out, unparse(fixed));
        return {};
      })
    });
  };
}

start[Source] addHoverDocs(start[Source] s, map[loc, str] renaming) {
  return visit (s) {
    case Statement stm: {
      stm2 = top-down visit (desugar(stm)) {
        case Id x => parse(#Id, renaming[x@\loc])
          when x@\loc in renaming
      }
      if (stm2 != stm) {
        insert stm[@doc="<stm2>"];
      }
    }
    case Id x =>x[@doc=renaming[x@\loc]]
      when x@\loc in renaming
  }
}

tuple[start[Source], Refs, map[loc, str]] desugarAndResolve(start[Source] src) {
  js = uniqueify(desugarAll(src));
  <lookup, getRenaming> = makeResolver();
  xref = resolve(js.top, lookup);
  renaming = getRenaming(xref);
  return <js, xref, renaming>;
}

start[Source] rename(start[Source] src, map[loc, str] renaming) {
  return top-down visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}




  
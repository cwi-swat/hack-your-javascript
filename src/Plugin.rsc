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
  registerLanguage("Sweeter JS", "sjs", Tree(str src, loc l) {
     return parse(#start[Source], src, l);
  });
  
  registerContributions("Sweeter JS", {
    annotator(Tree(Tree pt) {
      if (start[Source] s := pt) {
        js = desugarAll(s);
        js = uniqueify(js);
        <lookup, getRenaming> = makeResolver();
        xref = resolve(js.top, lookup);
        renaming = getRenaming(xref);
        iprintln(renaming);
        iprintln(xref);
        s = top-down-break visit (s) {
          case Statement stm: {
            stm2 = top-down visit (desugar(stm)) {
              case Id x: {
                u = x@\loc;
                if (u in renaming) {
                  insert parse(#Id, renaming[u]);
                }
              }
            }
            if (stm2 != stm) {
              insert stm[@doc="<stm2>"];
            }
          }
          case Id x: {
             u = x@\loc;
             if (u in renaming) {
               insert x[@doc=renaming[u]];
             }
          }
        }
        xref2 = { <u, d, x> | <u, d, x> <- xref, u.path == pt@\loc.path, d.path == pt@\loc.path }; 
        return s[@hyperlinks=xref2];
      }
      return pt[@messages={error("BUG: not JS", pt@\loc)}];
    }),
  
    builder(set[Message](Tree tree) {
      if (start[Source] src := tree) {
        
        js = desugarAll(src);
        js = uniqueify(js);
        
        <lookup, getRenaming> = makeResolver();
        xref = resolve(js.top, lookup);
        renaming = getRenaming(xref);
        iprintln(renaming);
        iprintln(xref);
        js = top-down visit (js) {
          case Id x: {
            u = x@\loc;
            println("****** u = <u>");
            if (u in renaming) {
              println("-----\> <u>");
              insert parse(#Id, renaming[u]);
            }
          }
        }
        
        out = tree@\loc.top[extension="js"];
        writeFile(out, unparse(js));
        return {};
      }
      return {error("Not a SJS source tree", tree@\loc)};
    })
  });
}
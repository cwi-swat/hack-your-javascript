module Plugin

import util::IDE;
import javascript::Syntax;
import ParseTree;
import Message;
import IO;
import desugar::Desugar;

void main() {
  registerLanguage("Sweeter JS", "sjs", Tree(str src, loc l) {
     return parse(#start[Source], src, l);
  });
  
  registerContributions("Sweeter JS", {
    builder(set[Message](Tree tree) {
      if (start[Source] src := tree) {
        js = desugarAll(src);
        out = tree@\loc.top[extension="js"];
        writeFile(out, unparse(js));
        return {};
      }
      return {error("Not a SJS source tree", tree@\loc)};
    })
  });
}
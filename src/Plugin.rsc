module Plugin

import util::IDE;
import javascript::Syntax;
import ParseTree;
import Message;
import IO;
import javascript::Desugar;
import javascript::Resolve;
import vis::Figure;
import String;

anno rel[loc,loc,str] Tree@hyperlinks;

void main() {
    str lang = "SweeterJS";
    registerLanguage(lang, "sjs", Tree(str src, loc l) {
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
  
      builder(set[Message](Tree pt) {
        if (start[Source] s := pt) {
          <js, xref, renaming> = desugarAndResolve(s);
          fixed = rename(js, renaming);
          generateFiles(pt, fixed);  
          return {};
        }
        return {error("BUG: not JS", pt@\loc)};
      }),
      
      categories(
      	("TwitterConstant":{foregroundColor(color("white")), backgroundColor(rgb(64,153,255))})
      )
    });
}

void generateFiles(start[Source] orig, start[Source] desugared) {
	jsOut = orig@\loc.top[extension="js"];
 	writeFile(jsOut, unparse(desugared));
 	generateHtmlFile(orig, desugared);
}

start[Source] addHoverDocs(start[Source] s, map[loc, str] renaming) {
  return visit (s) {
    case Statement stm: {
      stm2 = desugar(stm);
      if (stm2 != stm) {
        insert stm[@doc="<stm2>"];
      }
    }
    case Expression exp: {
      exp2 = desugar(exp);
      if (exp2 != exp) {
        insert exp[@doc="<exp2>"];
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
  return visit (src) {
    case Id x => parse(#Id, renaming[x@\loc])
      when x@\loc in renaming
  }
}

void generateHtmlFile(start[Source] origAst, start[Source] desugaredAst) {
	str toJsStr(str code) {
		code = replaceAll(code, "\n", " \\n \\\n");
		code = replaceAll(code, "\"", "\\\"");
		code = replaceAll(code, "\'", "\\\'");
		return code;
	}
	
	tuple[str, str] extractTitleAndNr(/^ex<nr:[0-9]+>[_]<name:.*>[.]sjs$/) =
		<"Excercise <nr>: <capitalize(name)>", "exercise <nr>">;

	tuple[str, str] extractTitleAndNr(/^dem<nr:[0-9]+>[_]<name:.*>[.]sjs$/) =
		<"Demo <nr>: <capitalize(name)>", "demo <nr>">;
	
	default tuple[str, str] extractTitleAndNr(str s) = <"Unkown excersise or demo", "?">;		
	
	loc sjsFile = origAst@\loc.top;
	loc jsFile = sjsFile[extension = "js"];
	
	str orig = unparse(origAst);
	str desugared = unparse(desugaredAst);		
	
	tuple[str title, str nr] titleAndNr = extractTitleAndNr(sjsFile.file);
	
	str merge(str template) {
		template = replaceAll(template, "{{title}}", titleAndNr.title);
		template = replaceAll(template, "{{nr}}", titleAndNr.nr);
		template = replaceAll(template, "{{original}}", toJsStr(orig));
		template = replaceAll(template, "{{desugared}}", toJsStr(desugared));
		template = replaceAll(template, "{{desugaredSrc}}", desugared);
		return template;
	}

	str htmlTemplate = readFile(sjsFile.parent.parent.parent + "html/template.html");
	str mergedTemplate = merge(htmlTemplate);
	
	writeFile(sjsFile[extension = "html"], mergedTemplate);
}



  
module javascript::HtmlTemplateMerger

import ParseTree;
import IO;
import String;

import javascript::Desugar;

void generateHtmlFile(start[Source] origAst, start[Source] desugaredAst) {
	str toJsStr(str code) {
		code = replaceAll(code, "\n", " \\n \\\n");
		code = replaceAll(code, "\"", "\\\"");
		code = replaceAll(code, "\'", "\\\'");
		return code;
	}
	
	tuple[str, str] extractTitleAndNr(/^ex<nr:[1-9]+>[_]<name:.*>[.]sjs$/) =
		<"Excercise <nr>: <capitalize(name)>", "exercise <nr>">;

	tuple[str, str] extractTitleAndNr(/^dem<nr:[1-9]+>[_]<name:.*>[.]sjs$/) =
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
		template = replaceAll(template, "{{filename}}", jsFile.file);
		return template;
	}

	str htmlTemplate = readFile(sjsFile.parent.parent.parent + "html/template.html");
	str mergedTemplate = merge(htmlTemplate);
	
	writeFile(sjsFile[extension = "html"], mergedTemplate);
}


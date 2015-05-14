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
	
	loc sjsFile = origAst@\loc.top;
	loc jsFile = sjsFile[extension = "js"];
	
	str orig = unparse(origAst);
	str desugared = unparse(desugaredAst);		
	
	str title = "Unkown exercise";
	str nr = "?";
	if (/^ex<n:[1-9]+>[_]<name:.*>[.]sjs$/ := sjsFile.file) {
		nr = n;
		title = "Excercise <n>: <capitalize(name)>";
	}

	str merge(str template) {
		template = replaceAll(template, "=title=", title);
		template = replaceAll(template, "=nr=", nr);
		template = replaceAll(template, "=original=", toJsStr(orig));
		template = replaceAll(template, "=desugared=", toJsStr(desugared));
		template = replaceAll(template, "=filename=", jsFile.file);
		return template;
	}

	str htmlTemplate = readFile(sjsFile.parent.parent + "html/template.html");
	str mergedTemplate = merge(htmlTemplate);
	
	writeFile(sjsFile[extension = "html"], mergedTemplate);
}


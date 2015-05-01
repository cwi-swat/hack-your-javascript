module desugar::Ex3Assert

import javascript::Syntax;
import ParseTree;

syntax Statement
  = "assert" Expression ":" String ";"
  ;

Statement desugar((Statement)`assert <Expression e>: <String msg>;`)
  = (Statement)`if (!(<Expression e>)) throw <String esrc> + ": " + <String msg>;`
  when esrc := parse(#String, "\"<e>\""); 
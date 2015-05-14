@cachedParser{javascript.cached.SweeterJSCachedParser}
module series1::Ex3Assert

import javascript::Syntax;
import ParseTree;

/*
Optional: add a test statement which looks like:
  `test Expression should be Expression;`
Instead of throwing an exception it evaluates the test and prints out
if the test failed (with expected and actual value);
*/

syntax Statement
  = "assert" Expression ":" String ";"
  ;

Statement desugar((Statement)`assert <Expression e>: <String msg>;`)
  = (Statement)`if (!(<Expression e>)) throw <String esrc> + ": " + <String msg>;`
  when esrc := makeString(e); 
  
String makeString(value v) = parse(#String, "\"<v>\"");
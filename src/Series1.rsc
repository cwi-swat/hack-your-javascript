module Series1

extend javascript::Syntax;
import ParseTree;

syntax Expression
  = "@" Id
  | @category="TwitterConstant" "@(" {Expression ","}* ")"
  | @category="TwitterConstant" "#(" {Expression ","}* ")"
  ;
  
syntax Statement
  = "dont" Statement
  | "todo" String ";"
  | "unless" "(" Expression ")" Statement
  | "repeat" Statement "until" "(" Expression ")" ";"
  | "assert" Expression ":" String ";"
  | "debug" Expression ";"
  ;
  
// Reserve the new keywords
keyword Keywords = "todo" | "dont" | "unless" | "repeat" | "assert" | "debug";
  
/* 
 * 0. Debug statement (Example)
 */ 
  

Statement desugar((Statement)`debug <Expression ex>;`) {
  return (Statement) `if (DEBUG_FLAG) 
                     '  console.log(<Expression ex>);`;
}

/*
 * 1. At fields
 */ 
Expression desugar((Expression)`@<Id x>`) = (Expression)`this.<Id x>`;


/*
 * 2. Twitter search expressions
 */
Expression desugar((Expression)`@(<{Expression ","}* es>)`) 
  = (Expression)`searchAt(<{Expression ","}* es>)`;  

Expression desugar((Expression)`#(<{Expression ","}* es>)`)
  = (Expression)`searchHash(<{Expression ","}* es>)`;  


/*
 * 3. Don't statement
 */

Statement desugar((Statement)`dont <Statement _>`) = (Statement)`;`;

/*
 * 4. Todo statement
 */

Statement desugar((Statement)`todo <String s>;`) 
  = (Statement)`console.log("TODO: " + <String s>);`; 
 
/* 
 * 5. Unless statement
 */
 
Statement desugar((Statement)`unless (<Expression cond>) <Statement body>`)
  = (Statement)`if (!(<Expression cond>)) <Statement body>`;
 
 
/* 
 * 6. Repeat-until statement
 */

Statement desugar((Statement)`repeat <Statement stat> until (<Expression cond>);`)
  = (Statement)`do <Statement stat> while (!(<Expression cond>));`;

/* 
 * 7. Assert statement
 */


Statement desugar((Statement)`assert <Expression e>: <String msg>;`) {
  esrc = jsString(e);
  return (Statement)`if (!(<Expression e>)) 
                    '  throw "Assertion " + <String esrc> + " failed: " + <String msg>;`;
}
  
String jsString(Expression e) = parse(#String, "\"<unparse(e)>\""); 
 

Expression dummyExp() = (Expression)`NOT_YET_IMPLEMENTED`;
Expression dummyStat() = (Statement)`NOT_YET_IMPLEMENTED;`;


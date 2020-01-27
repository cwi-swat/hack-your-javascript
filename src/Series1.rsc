module Series1

extend javascript::Syntax;
import ParseTree;

syntax Statement
  = "dont" Statement
  | "todo" String ";"
  | "unless" "(" Expression ")" Statement
  | "repeat" Statement "until" "(" Expression ")" ";"
  | "assert" Expression ":" String ";"
  | "debug" Expression ";"
  | "foo!" ";"
  | "bar" Id  ";"
  ;
  
// Reserve the new keywords
keyword Keywords = "todo" | "dont" | "unless" | "repeat" | "assert" | "debug"
  | "bar";
  
  
Statement desugar((Statement)`foo! ;`) = desugar((Statement)`function () {var x; <Statement s>}`)
  when s := desugar((Statement)`bar x;`);
    
Statement desugar((Statement)`bar <Id x>;`) = (Statement)`function () {var x; <Id x>;}`;  
  
/* 
 * 0. Debug statement (Example)
 */ 
  

Statement desugar((Statement)`debug <Expression ex>;`) {
  return (Statement) `if (DEBUG_FLAG) 
                     '  console.log("DEBUG: " + (<Expression ex>));`;
}

test bool testDebug() 
  = desugar((Statement)`debug "Hello";`) 
  == (Statement)`if (DEBUG_FLAG) console.log("DEBUG: " + ("Hello"));`;


/*
 * 3. Don't statement
 */

Statement desugar((Statement)`dont <Statement _>`) = (Statement)`;`;

test bool testDont()
  = desugar((Statement)`dont if (x == 3) print(x);`) 
  == (Statement)`;`;

/*
 * 4. Todo statement
 */

Statement desugar((Statement)`todo <String s>;`) 
  = (Statement)`console.log("TODO: " + <String s>);`; 
 
 
test bool testTodo()
  = desugar((Statement)`todo "FIXME";`) 
  == (Statement)`console.log("TODO: " + "FIXME");`;
 
/* 
 * 5. Unless statement
 */
 
Statement desugar((Statement)`unless (<Expression cond>) <Statement body>`)
  = (Statement)`if (!(<Expression cond>)) <Statement body>`;
 

test bool testUnless()
  = desugar((Statement)`unless (x == 0) print(x);`)
  == (Statement)`if (!(x == 0)) print(x);`;
 
/* 
 * 6. Repeat-until statement
 */

Statement desugar((Statement)`repeat <Statement stat> until (<Expression cond>);`)
  = (Statement)`do <Statement stat> while (!(<Expression cond>));`;

test bool testRepeat()
  = desugar((Statement)`repeat {print(i); i--;} until (i == 0);`)
  ==  (Statement)`do {print(i); i--;} while (!(i == 0));`;

/* 
 * 7. Assert statement
 */


Statement desugar((Statement)`assert <Expression e>: <String msg>;`) {
  esrc = jsString(e);
  return (Statement)`if (!(<Expression e>)) 
                    '  throw "Assertion " + <String esrc> + " failed: " + <String msg>;`;
}


test bool testAssert()
  = desugar((Statement)`assert x != null: "x should not be null";`)
  == (Statement)`if (!(x != null))
                '  throw "Assertion " + "x != null" + " failed: " + "x should not be null";`;
  
String jsString(Expression e) = parse(#String, "\"<unparse(e)>\""); 


 

Expression dummyExp() = (Expression)`NOT_YET_IMPLEMENTED`;
Expression dummyStat() = (Statement)`NOT_YET_IMPLEMENTED;`;


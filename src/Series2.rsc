module Series2

extend javascript::Syntax;
import List;

syntax Statement
  = "swap" Id "," Id ";"
  | "test" Expression "should" "be" Expression ";"
  | "foreach" "(" Id "in" Expression ")" Statement
  ;

syntax Expression
  = Id "=\>" Expression
  | "(" {Id ","}* ")" "=\>" "{" Statement* "}"
  ;

syntax Expression = "[" Expression result "|" {Generator ","}+ "]";
  
syntax Generator
  = Expression
  | Id ":" Expression
  ;



/*
 * 1. Swap: "swap" Id "," Id ";"
 */
  
Statement desugar((Statement)`swap <Id x>, <Id y>;`)
  = (Statement)`(function() { 
               '   var tmp = <Id x>; 
               '   <Id x> = <Id y>; 
               '   <Id y> = tmp; 
               '})();`;
  
/*
 * 2. Test: "test" Expression "should" "be" Expression ";"
 */

Statement desugar((Statement)`test <Expression x> should be <Expression y>;`)
  = (Statement)`(function(actual, expected) { 
  			   '   if (actual !== expected) {
  			   '     console.log("Test failed; expected: " + expected + "; got: " + actual);    
  			   '   }
  			   '})(<Expression x>, <Expression y>);`;
  

/*
 * 3. Foreach:  "foreach" "(" Id "in" Expression ")" Statement
 */
 
  
Statement desugar((Statement)`foreach (<Id x> in <Expression e>) <Statement s>`)
  = (Statement)`{
  			   '  let l = <Expression e>, i; 
               '  for (i = 0; i \< l.length; i++) { 
               '    var <Id x> = l[i]; 
               '    <Statement s>
               '  }
               '}`;
  

 
 
/*
 * 4. Arrow functions: Id "=\>" Expression
 */
 

Expression desugar((Expression)`<Id param> =\> <Expression body>`)
  = (Expression)`(function (_this) { return (function (<Id param>) {return <Expression body2>;}); })(this)`
  when body2 := replaceThis(body);

Expression replaceThis(Expression e) {
  return top-down-break visit (e) {
    case Function _ : ; 
    case (Expression)`this` => (Expression)`_this`
  }
}

 
/*
 * 5. Comprehensions: "[" Expression result "|" {Generator ","}+ "]";
 *    Generator: Expression | Id ":" Expression
 */
 
Expression desugar((Expression)`[ <Expression r> | <{Generator ","}+ gens> ]`)
  = (Expression)`(function(){var result = []; <Statement body> return result;})()`
  when
    Statement body := gens2blocks(r, gens);  

Statement gens2blocks(Expression res, {Generator ","}+ gens) 
  = ( (Statement)`result.push(<Expression res>);` | gen2block(it, gen) | gen <- rgens )
  when rgens := reverse([ g | g <- gens]);

Statement gen2block(Statement inner, (Generator)`<Expression cond>`)
  = (Statement)`if (<Expression cond>) <Statement inner>`;
  
Statement gen2block(Statement inner, (Generator)`<Id x>: <Expression coll>`)
  = (Statement)`{
               '  var coll = <Expression coll>; 
               '  for (var i = 0; i \< x.length; i++) { 
               '    var <Id x> = coll[i]; 
               '    <Statement inner>
               '  }
               '}`;
 

 

 
 
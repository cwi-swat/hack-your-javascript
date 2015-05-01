module desugar::Ex2Repeat

extend javascript::Syntax;

/*
Optional 1: write a times loop which simply iterates a number of times:
  `times (Expression) Statement`

Optional 2: write an up-to loop which iterates from a value to a value:
  `from (Expression) to (Expression) Statement`
  
Optional 3: expose the loop counter in the body by introducing an "it" expression
  (e.g. syntax Expression = "it"). 
*/


syntax Statement
  = "repeat" "{" Statement* "}" "until" "(" Expression ")" ";"
  ;
  
Statement desugar((Statement)`repeat {<Statement* stats>} until (<Expression cond>);`)
  = (Statement)`do {<Statement* stats>} while (!(<Expression cond>));`;
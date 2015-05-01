module desugar::Ex2Repeat

extend javascript::Syntax;

syntax Statement
  = "repeat" "{" Statement* "}" "until" "(" Expression ")" ";"
  ;
  
Statement desugar((Statement)`repeat {<Statement* stats>} until (<Expression cond>);`)
  = (Statement)`do {<Statement* stats>} while (!(<Expression cond>));`;
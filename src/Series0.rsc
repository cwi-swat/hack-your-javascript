module Series0

extend javascript::Syntax;

syntax Expression 
  = right Expression "**" Expression
  ;
  
Expression desugar((Expression)`<Expression l> ** <Expression r>`) 
  = (Expression)`Math.pow(<Expression l>, <Expression r>)`;
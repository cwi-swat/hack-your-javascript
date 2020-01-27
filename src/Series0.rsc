module Series0

extend javascript::Syntax;

syntax Expression
  = right Expression "**" Expression // stronger precedence than multiplication etc. 
  > left (
      mul: Expression "*" !>> [*=] Expression
    | div: Expression "/" !>> [/=] Expression
    | rem: Expression "%" !>> [%=] Expression
  )
  ;

// a ** b ** c = a ** (b ** c) 

Expression desugar((Expression)`<Expression lhs> ** <Expression rhs>`) 
  = (Expression)`Math.pow(<Expression lhs>, <Expression rhs>)`;

Expression desugar((Expression)`<Expression lhs> ** <Expression rhs>`) { 
  return (Expression)`Math.pow(<Expression lhs>, <Expression rhs>)`;
}

  
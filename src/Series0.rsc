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

  
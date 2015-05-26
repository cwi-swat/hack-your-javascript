module series1::Ex0AtField

extend javascript::Syntax;

syntax Expression
  = "@" Id
  ;
  
Expression desugar((Expression)`@<Id x>`) = (Expression)`this.<Id x>`;
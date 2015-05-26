module series1::Ex0Pairs

extend javascript::Syntax;

syntax Expression
  = "\<" Expression "," Expression "\>"
  ;
  
Expression desugar((Expression)`\<<Expression x>, <Expression y>\>`) 
  = (Expression)`{_1: <Expression x>, _2: <Expression y>}`;
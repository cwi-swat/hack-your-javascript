module desugar::Ex9Twitter

extend javascript::Syntax;

syntax Expression
  = @category="Constant" "@" Id
  | "@(" Expression ")"
  | @category="Constant" "#" Id
  | "#(" Expression ")"
  ;
  
  

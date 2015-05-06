module series2::Ex9Twitter

extend javascript::Syntax;

syntax Expression
  = @category="Constant" "@" Id
  | "@(" Expression ")"
  | @category="Constant" "#" Id
  | "#(" Expression ")"
  ;
  
  

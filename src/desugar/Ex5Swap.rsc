module desugar::Ex5Swap

import javascript::Syntax;

syntax Statement
  = "swap" Id "," Id ";"
  ;
  
Statement desugar((Statement)`swap <Id x>, <Id y>;`)
  = (Statement)`(function() { var tmp = <Id x>; <Id x> = <Id y>; <Id y> = tmp; })();`;
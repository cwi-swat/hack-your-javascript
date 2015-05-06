module series2::Ex9Twitter

import List;

extend javascript::Syntax;

syntax Expression
  = TwitterSearchExpression+   
  ;
 
syntax TwitterSearchExpression 
  = @category="TwitterConstant" "@" Id
  | @category="TwitterConstant" "#" Id
  ;

Expression desugar((Expression)`<TwitterSearchExpression+ query>`) 
  = parse(#Expression, "search(\"" + intercalate(" ", [q | q <- query]) + "\")");  

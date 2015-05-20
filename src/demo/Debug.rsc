@cachedParser{javascript.cached.SweeterJSCachedParser}
module demo::Debug

extend javascript::Syntax;

syntax Expression
  = "debug" Expression
  ;
  

 Expression desugar((Expression)`debug <Expression ex>`) = 
 	(Expression) `console.log(<Expression ex>)`;
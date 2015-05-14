@cachedParser{javascript.cached.SweeterJSCachedParser}
module demo::Builder

extend javascript::Syntax;

syntax Expression
  = Expression "build" "{" Statement* body "}"
  ;
  

Expression desugar((Expression)`<Expression builder> build { <Statement* body> }`)
  = (Expression)`(function (builder) {var result; <Statement* body2> return result;})(<Expression builder>)`
  when
    body2 := addRecv(body);
  
  
Statement* addRecv(Statement* ss) {
  return top-down-break visit (ss) {
    case Function _: ; // don't enter nested functions
    case (Statement)`<Id m>(<{Expression ","}* args>);`
      => (Statement)`result = builder.<Id m>(<{Expression ","}* args>);`
  }
}
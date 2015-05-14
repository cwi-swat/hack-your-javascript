@cachedParser{javascript.cached.SweeterJSCachedParser}
module series2::Ex4ArrowFuncs

extend javascript::Syntax;

syntax Expression 
  = Id "=\>" Expression
  | "(" {Id ","}* ")" "=\>" "{" Statement* "}"
  ;
  
  
Expression desugar((Expression)`<Id param> =\> <Expression body>`)
  = (Expression)`(function (_this) { return (function (<Id param>) {return <Expression body2>;}); })(this)`
  when body2 := replaceThis(body);
  
Expression replaceThis(Expression e) {
  return top-down-break visit (e) {
    case Function _ : ; // break on arrow as well?
    case (Expression)`this` => (Expression)`_this`
  }
}
  
Expression desugar((Expression)`(<{Id ","}* params>) =\> {<Statement* stats>}`)
  = (Expression)`(function (<{Id ","}* params>) {<Statement* stats>}).bind(this)`;
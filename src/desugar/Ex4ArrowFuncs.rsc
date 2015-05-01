module desugar::Ex4ArrowFuncs

extend javascript::Syntax;

syntax Expression 
  = Id "=\>" Expression
  | "(" {Id ","}* ")" "=\>" "{" Statement* "}"
  ;

Expression desugar((Expression)`<Id param> =\> <Expression body>`)
  = (Expression)`(function (<Id param>) {return <Expression body>;}).bind(this)`;
  
Expression desugar((Expression)`(<{Id ","}* params>) =\> {<Statement* stats>}`)
  = (Expression)`(function (<{Id ","}* params>) {<Statement* stats>}).bind(this)`;
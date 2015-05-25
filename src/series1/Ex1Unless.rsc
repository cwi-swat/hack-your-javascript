module series1::Ex1Unless

extend javascript::Syntax;

/*
Optional 2: add a comment statement `dont Statement` which
eliminates the argument statement.
*/

// Example: a todo statement
syntax Statement
  = "todo" String ";"
  ;


syntax Statement
  = "unless" "(" Expression ")" Statement
  ;


Statement desugar((Statement)`todo <String s>;`)
  = (Statement)`console.log("TODO: " + <String s>);`;

Statement desugar((Statement)`unless (<Expression cond>) <Statement body>`)
  = (Statement)`if (!(<Expression cond>)) <Statement body>`;

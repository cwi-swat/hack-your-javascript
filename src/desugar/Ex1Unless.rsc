module desugar::Ex1Unless

extend javascript::Syntax;

/*
Optional: add a todo statement like `todo String;`
which prints to the console that there is a todo item.

Optional 2: add a comment statement `dont Statement` which
eliminates the argument statement.
*/


syntax Statement
  = "unless" "(" Expression ")" Statement
  ;


Statement desugar((Statement)`unless (<Expression cond>) <Statement body>`)
  = (Statement)`if (!(<Expression cond>)) <Statement body>`;
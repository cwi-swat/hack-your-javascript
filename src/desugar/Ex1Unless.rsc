module desugar::Ex1Unless

extend javascript::Syntax;

syntax Statement
  = "unless" "(" Expression ")" Statement
  ;


Statement desugar((Statement)`unless (<Expression cond>) <Statement body>`)
  = (Statement)`if (!(<Expression cond>)) <Statement body>`;
module series2::Ex6ForEach

extend javascript::Syntax;


syntax Statement
  = "foreach" "(" Id "in" Expression ")" Statement
  ;
  
Statement desugar((Statement)`foreach (<Id x> in <Expression e>) <Statement s>`)
  = (Statement)`{
  			   '  let l = <Expression e>, i; 
               '  for (i = 0; i \< l.length; i++) { 
               '    var <Id x> = l[i]; 
               '    <Statement s>
               '  }
               '}`;
  

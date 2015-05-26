module demo::Comprehensions

extend javascript::Syntax;
import List;

syntax Expression
  = "[" Expression result "|" {Generator ","}+ "]"
  ;
  
syntax Generator
  = Expression
  | Id ":" Expression
  ;
  
Expression desugar((Expression)`[ <Expression r> | <{Generator ","}+ gens> ]`)
  = (Expression)`(function(){var result = []; <Statement body> return result;})()`
  when
    Statement body := gens2blocks(r, gens);  

Statement gens2blocks(Expression res, {Generator ","}+ gens) 
  = ( (Statement)`result.push(<Expression res>);` | gen2block(it, gen) | gen <- rgens )
  when rgens := reverse([ g | g <- gens]);

Statement gen2block(Statement inner, (Generator)`<Expression cond>`)
  = (Statement)`if (<Expression cond>) <Statement inner>`;
  
Statement gen2block(Statement inner, (Generator)`<Id x>: <Expression coll>`)
  = (Statement)`{
               '  let coll = <Expression coll>, i; 
               '  for (i =0; i \< x.length; i++) { 
               '    let <Id x> = coll[i]; 
               '    <Statement inner>
               '  }
               '}`
  when 
    Id i := parse(#Id, "<x>_idx"); 

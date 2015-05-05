module desugar::RelAlg

extend javascript::Syntax;

syntax Expression
  = assoc Expression "∘" Expression
  > left Expression "∩" Expression
  > left Expression "∪" Expression
  > non-assoc (
      Expression "⊆" Expression
    | Expression "⊂" Expression
    | Expression "⊃" Expression
    | Expression "⊇" Expression
  )
  ;
  
Expression desugar((Expression)`<Expression l> ∩ <Expression r>`)
  = (Expression)`(function() { 
    '  var l = <Expression l>, r = <Expression r>, x = [];
    '  for (var i = 0; i \< l.length; i++) 
    '    if (r.indexOf(l[i]) !== -1) 
    '      x.push(l[i]);
    '  return x;
    '})()`;
    
Expression desugar((Expression)`<Expression l> ∪ <Expression r>`)
  = (Expression)`(function() { 
    '  var x = (<Expression l>).slice(), r = <Expression r>;
    '  for (var i = 0; i \< r.length; i++) 
    '    if (x.indexOf(r[i]) === -1) 
    '      r.push(l[i]);
    '  return x;
    '})()`;
    

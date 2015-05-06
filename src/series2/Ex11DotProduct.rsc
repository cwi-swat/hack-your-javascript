module series2::Ex11DotProduct

extend javascript::Syntax;


syntax Expression
  = non-assoc Expression ".*" Expression
  > mul: Expression "*" !>> [*=] Expression
  ; 
  
Expression desugar((Expression)`<Expression l> .* <Expression r>`)
  = (Expression)`(function () { 
                '  var l = <Expression l>, r = <Expression r>, sum = 0;
                '  for (var i = 0; i \< Math.min(l.length, r.length); i++) {
                '     sum += l[i] * r[i]; 
                '  }
                '  return sum;
                '})()`; 
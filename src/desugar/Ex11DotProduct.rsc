module desugar::Ex11DotProduct

extend javascript::Syntax;


syntax Expression
  = "√" Expression 
  | "Σ" Expression 
  | "∏" Expression 
  > left Expression "·" Expression
  > mul: Expression "*" !>> [*=] Expression
  ; 
  

Expression desugar((Expression)`√ <Expression e>`)
  = (Expression)`Math.sqrt(<Expression e>)`;

Expression desugar((Expression)`Σ <Expression e>`)
  =  (Expression)`(function () { 
                '  var sum = 0;
                '  var e = <Expression e>;
                '  for (var i = 0; i \< e.length; i++) {
                '     sum += e[i]; 
                '  }
                '  return sum;
                '})()`; 

Expression desugar((Expression)`∏ <Expression e>`)
  =  (Expression)`(function () { 
                '  var prod = 1;
                '  var e = <Expression e>;
                '  for (var i = 0; i \< e.length; i++) {
                '     prod *= e[i]; 
                '  }
                '  return prod;
                '})()`; 


Expression desugar((Expression)`<Expression l> · <Expression r>`)
  = (Expression)`(function () { 
                '  var l = <Expression l>, r = <Expression r>;
                '  var len = Math.min(l.length, r.length);
                '  var sum = 0;
                '  for (var i = 0; i \< len; i++) {
                '     sum += l[i] * r[i]; 
                '  }
                '  return sum;
                '})()`; 
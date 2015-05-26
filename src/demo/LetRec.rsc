module demo::LetRec


syntax Statement
  = "letrec" {VariableDeclaration ","}+ ";";
  
  
/*

letrec
  x = {x: x};
  
  
var x = new (function Object1() { return {x: this}; });
  
function Object1() {
   return {x: this}
}
var x = new Object1();
  
var x;
function x_func() {
  return {x: 
}
  
  
var x = function(x) { return {x: x}; };
x = x(x);


def fix[A,B](f: (A=>B)=>(A=>B)): A=>B = { lazy val p: A=>B = f(t => p(t)); p }

function fix(f) {
  var p = function() { return f(function (t) { return p(t); }); };
  return p();
}

*/
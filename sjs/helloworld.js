
function helloWorld(name) {
  if (!(name === "Jouke")) {
    console.log("Hello " + name + "!");
  }

  (function() { var tmp = x; x = y; y = tmp; })();

  var myFunc = (function (x) {return x;}).bind(this);

  if (!(x > 0)) throw "x > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(x > 10));
}
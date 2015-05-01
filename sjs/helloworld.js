

function helloWorld(name) {
  if (!(name === "Jouke")) {
    console.log("Hello " + name + "!");
  }

  var xs = [1, 2, 3, 4];
  
  var item = 18;
  q = JSLINQ(xs).Where(function(item$0) { return item$0.age > item; }).Select(function (item) { return {name: item.name, age: item.age}; });

  var me = @tvdstorm(10);

  var y, tmp;
  (function() { var tmp$0 = y; y = tmp; tmp = tmp$0; })();

  var myFunc = (function (_this) { return (function (_this$0) {return _this$0;}); })(this) + this ;

  if (!(myFunc(y) > 0)) throw "myFunc(y) > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(y > 10));
}
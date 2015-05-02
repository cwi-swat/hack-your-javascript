

function helloWorld(name) {
  if (!(name === "Jouke")) {
    console.log("Hello " + name + "!");
  }

  var myList = [
            {FirstName:"Chris",LastName:"Pearson"},
            {FirstName:"Kate",LastName:"Johnson"},
            {FirstName:"Josh",LastName:"Sutherland"},
            {FirstName:"John",LastName:"Ronald"},
            {FirstName:"Steve",LastName:"Pinkerton"}
            ];
  var item = 18;
  q = JSLINQ(myList).Where(function(item) { return item.FirstName === "Chris"; }).Select(function (item) { return {FirstName: item.FirstName, LastName: item.LastName}; });

  var me = @tvdstorm(10);


  var y, tmp;
  (function() { var tmp$0 = y; y = tmp; tmp = tmp$0; })();

  
  {var i$0, l$0; {l$0 = myList; for (i$0 = 0; i$0 < l$0.length; i$0++) { var x = l$0[i$0]; {
    var i;
    var l;
    
    console.log(x);
  }}}}


  var myFunc = (function (_this) { return (function (_this$0) {return _this$0;}); })(this) + this ;

  if (!(myFunc(y) > 0)) throw "myFunc(y) > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(y > 10));
}
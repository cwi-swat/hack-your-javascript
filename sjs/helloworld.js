

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
  
  var JSLINQ$0;
  
  q = JSLINQ(myList).Where(function(item) { return item.FirstName === "Chris"; }).Select(function (item) { return {FirstName: item.FirstName, LastName: item.LastName}; });

  var me = @tvdstorm(10);


  var y, tmp;
  (function() { var tmp$0 = y; y = tmp; tmp = tmp$0; })();

  var i = 0;
      
  function () {
    {let l = myList, i$0; for (i$0 = 0; i$0 < l.length; i$0++) { var x = l[i$0]; {
      console.log(x + i);
    }}}
  };

  var myFunc = (function (_this) { return (function (_this$0) {return _this$0;}); })(this) + this ;

  if (!(myFunc(y) > 0)) throw "myFunc(y) > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(y > 10));
}
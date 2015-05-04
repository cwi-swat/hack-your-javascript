

function helloWorld(name) {
  if (!(name === "Jouke")) {
    console.log("Hello " + name + "!");
    console.log("Goodbye " + name + "!");
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
  
  q = JSLINQ(myList).Where(function(item) { return item.FirstName === "Chris" + JSLINQ$0; }).Select(function (item) { return {FirstName: item.FirstName, LastName: item.LastName}; });

  var me = @tvdstorm(10);

  var y, tmp;
  (function() { var tmp$0 = y; y = tmp; tmp = tmp$0; })();

  var i = 0;
      
  function () {
    var l$1;
    {let l$0 = myList, i$0; for (i$0 = 0; i$0 < l$0.length; i$0++) { var x = l$0[i$0]; {
      {let l$2 = myList, i$1; for (i$1 = 0; i$1 < l$2.length; i$1++) { var y = l$2[i$1]; {
      
        console.log(x + i + l + l$1);
      }}}
    }}}
  };

  var myFunc = (function (_this) { return (function (_this$0) {return _this$0 + ((function (_this) { return (function (_this$1) {return _this;}); })(_this));}); })(this) ;

  if (!(myFunc(y) > 0)) throw "myFunc(y) > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(y > 10));
}
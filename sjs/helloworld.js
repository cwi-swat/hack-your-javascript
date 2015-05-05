

function helloWorld(name) {
  if (!(name === "Jouke")) {
    console$0.log("Hello " + name + "!");
    console$0.log("Goodbye " + name + "!");
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
      
  {let i$2 = 0; for (; i$2 < 10; i$2++) {
     console$0.log(i * i$2);
     {let i$3 = 0; for (; i$3 < 10; i$3++) {
       console$0.log(i$3 / i);
     }}
  }}     
  
  
  var doors = (function() { {var closed = 0; var opened = 1; var state = 2; var event = 3;} var state$0 = 0; return function(event$0) {if (state$0 == event) {if (event$0 === "event") { state$0 = state; } else ;} else if (state$0 == state) {if (event$0 === "foo") { state$0 = event; } else if (event$0 === "blerk") { state$0 = opened; console$0.log("Door is opened"); } else ;} else if (state$0 == opened) {if (event$0 === "gazonk") { state$0 = state; } else if (event$0 === "close") { state$0 = closed; console$0.log("Door is closed and state = " + state); } else ;} else if (state$0 == closed) {if (event$0 === "open") { state$0 = opened; console$0.log("Door is opened"); } else ;} else ;}; })();
  
  
  doors("open");
  doors("close");
  
  var console$0;
  console.log("TODO: " + "This is a todo.");
      
  function () {
    var l$1;
    {let l$2 = myList, i$1; for (i$1 = 0; i$1 < l$2.length; i$1++) { var x = l$2[i$1]; {
      {let l$0 = myList, i$0; for (i$0 = 0; i$0 < l$0.length; i$0++) { var y = l$0[i$0]; {
        console$0.log(x + i + l + l$1);
      }}}
    }}}
  };

  var myFunc = (function (_this) { return (function (_this$1) {return _this$1 + ((function (_this) { return (function (_this$0) {return _this;}); })(_this));}); })(this) ;

  if (!(myFunc(y) > 0)) throw "myFunc(y) > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(y > 10));
}
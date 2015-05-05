

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
      
  {let i$3 = 0; for (; i$3 < 10; i$3++) {
     console$0.log(i * i$3);
     {let i$0 = 0; for (; i$0 < 10; i$0++) {
       console$0.log(i$0 / i);
     }}
  }}     
  
  var l = [1,2,3,4];
  var r = [5,6,7,8];
  
  var dotprod = (function () { 
  var l$2 = l, r$0 = r;
  var len = Math.min(l$2.length, r$0.length);
  var sum = 0;
  for (var i = 0; i < len; i++) {
     sum += l$2[i] * r$0[i]; 
  }
  return sum;
})();
  
  var prod = Math.sqrt(Math.sqrt((function () { 
  var prod = 1;
  var e = l;
  for (var i = 0; i < e.length; i++) {
     prod *= e[i]; 
  }
  return prod;
})()));
  var sum = (function () { 
  var sum = 0;
  var e = r;
  for (var i = 0; i < e.length; i++) {
     sum += e[i]; 
  }
  return sum;
})();
  
  var doors = (function() { {var closed = 0; var opened = 1; var event = 2; var state = 3;} {let state$0 = 0; return function(event$0) {if (state$0 == state) {if (event$0 === "foo") { state$0 = event; } else if (event$0 === "blerk") { state$0 = opened; console$0.log("Door is opened"); } else ;} else if (state$0 == event) {if (event$0 === "event") { state$0 = state; } else ;} else if (state$0 == opened) {if (event$0 === "gazonk") { state$0 = state; } else if (event$0 === "close") { state$0 = closed; console$0.log("Door is closed and state = "); } else ;} else if (state$0 == closed) {if (event$0 === "open") { state$0 = opened; console$0.log("Door is opened"); } else ;} else ;}; }})();
  
  // do not terminate:
  helloWorld("Somebody");
  
  doors("open");
  doors("close");
  
  var console$0;
  console.log("TODO: " + "This is a todo.");
      
  function () {
    var l$1;
    {let l$0 = myList, i$2; for (i$2 = 0; i$2 < l$0.length; i$2++) { var x = l$0[i$2]; {
      {let l$3 = myList, i$1; for (i$1 = 0; i$1 < l$3.length; i$1++) { var y = l$3[i$1]; {
        console$0.log(x + i + l + l$1);
      }}}
    }}}
  };

  var myFunc = (function (_this) { return (function (_this$1) {return _this$1 + ((function (_this) { return (function (_this$0) {return _this;}); })(_this));}); })(this) ;

  if (!(myFunc(y) > 0)) throw "myFunc(y) > 0" + ": " + "x is not greater than 0";
  
  do {println("Bla");} while (!(y > 10));
}
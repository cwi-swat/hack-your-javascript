

function helloWorld(name) {
  unless (name === "Jouke") {
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
  var JSLINQ;
  
  q = select FirstName, LastName from myList where FirstName === "Chris" + JSLINQ;

  var me = @tvdstorm(10);

  var y, tmp;
  swap y, tmp;
  var i = 0;
      
  times (10) {
     console.log(i * it);
     times (10) {
       console.log(it / i);
     }
  }     
  
  var l = [1,2,3,4];
  var r = [5,6,7,8];
  
  var dotprod = l .* r;

  var my1stComp = [ i * j | i: l, j: r, j / 2 >= i ];  
  
  var doors = statemachine { 
    state closed {
       console.log("Door is closed and state = ");
       on open goto opened;
    }
    state opened {
      console.log("Door is opened");
      on close goto closed;
      on gazonk goto state;
    }
    state event { 
      on event goto state;
    }
    state state {  
      on blerk goto opened;
      on foo goto event;
    }
    
  };
  
  // do not terminate:
  helloWorld("Somebody");
  
  doors("open");
  doors("close");
  
  var console;
  todo "This is a todo.";
      
  function () {
    var l$1;
    foreach (x in myList) {
      foreach (y in myList) {
        console.log(x + i + l + l$1);
      }
    }
  };

  var myFunc = _this => _this + (_this => this) ;

  assert myFunc(y) > 0: "x is not greater than 0";
  
  repeat {
    println("Bla");
  } until (y > 10);
}


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
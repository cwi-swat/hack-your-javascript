

function helloWorld(name) {
  unless (name === "Jouke") {
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
  q = select FirstName, LastName from myList where FirstName === "Chris";

  var me = @tvdstorm(10);


  var y, tmp;
  swap y, tmp;

  var i;
  var l;

  foreach (x in myList) {
    console.log(x);
  }


  var myFunc = _this => _this + this ;

  assert myFunc(y) > 0: "x is not greater than 0";
  
  repeat {
    println("Bla");
  } until (y > 10);
}
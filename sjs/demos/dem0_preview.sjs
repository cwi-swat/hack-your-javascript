

// Select query demo
var myList = [{FirstName:"Chris",LastName:"Pearson"},
              {FirstName:"Kate",LastName:"Johnson"},
              {FirstName:"Josh",LastName:"Sutherland"},
              {FirstName:"John",LastName:"Ronald"},
              {FirstName:"Steve",LastName:"Pinkerton"}];
  
  
var q = select FirstName, LastName 
        from myList 
        where FirstName === "Chris";
 
console.log("Query output: ");
console.log(q);
  
// "HAML"

var names = ["Chris", "Crista", "Kevlin"];

var doc = %html {
  %head  %title "Hello Joy of Coding!";
  %body #main {
    %h1 "Hello Joy of Coding!";
    
    %ul for (var n in names) 
      %li { "Hello "; n; "!"; 3; }
  }
};

console.log("DOM tree: ");
console.log(doc);  
  

// State machines
var doors = statemachine { 
    state closed {
       console.log("Door is closed");
       on open goto opened;
    }
    state opened {
      console.log("Door is opened");
      on close goto closed;
    }
  };
  
  
doors("open");
doors("close");
doors("open");
doors("close");



  
  
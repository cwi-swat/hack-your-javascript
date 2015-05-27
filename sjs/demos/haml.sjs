
var Todo = createComponent();

var names = ["Chris", "Crista", "Kevlin"];


var elt = %html {
  %head  %title "Hello Joy of Coding!";
  %body #main {
    %h1 "Hello Joy of Coding!";
    
    %ul for (var n in names) 
      %li { "Hello "; n; "!"; }
  }
};



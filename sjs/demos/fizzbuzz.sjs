
function fizzBuzz(n) {
  unless (n) {
    n = 100;
  }
  
  assert n > 0: "n should be > 0";
  
  todo "Make ranges extension";
  
  var nums = [], i = 0;
  repeat {
    nums.push(i);
    i++;
  } until (i == n);
  
  function fb(x) {
    debug "x = " + x;

    unless (x % 3 == 0 || x % 5 == 0) {
      return x;
    }

    if (x % 15 == 0) return "FizzBuzz";
    if (x % 3 == 0) return "Fizz";
    if (x % 5 == 0) return "Buzz";

    assert false: "Cannot happen";
  }
  
  foreach (var x in [ fb(j) | var j in nums ]) {
    console.log(x);
  }
}


fizzBuzz(100);

fizzBuzz(-50);
var x = 1;
var y = 2;

debug 'Original: x = ' + x + ' & y = ' + y;

swap x, y;

debug 'Swapped: x = ' + x + ' & y = ' + y;


// What if we already have a variable called 'tmp'?
var tmp = 3;
swap x, tmp;

debug '2nd swap: x = ' + x + ' & tmp = ' + tmp;

var arr = [1,2,3,4,5,6];
console.log("Array before: " + arr);

arr = [elem * 2 | var elem in arr, elem % 2 === 0];
console.log("Array after: " + arr);

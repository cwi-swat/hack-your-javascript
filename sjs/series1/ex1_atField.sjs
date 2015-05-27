@x = 1;
@y = 2;

console.log("this.x(" + @x + ") + this.y(" + @y + ") = " + (@x + @y));

/* Just a little fun with the Javascript 'this' object */
@x = 1;

var myObj = {
	set : function(val) {
		@x = val;
	}
};
myObj.set(2);

var myOtherObj = {
	set : function(val) {
		@x = val;
	}
};
myOtherObj.set(3);

console.log("this.x = " + @x + ", MyObj.x = " + myObj.x + ", MyOtherObj.x = " + myOtherObj.x);

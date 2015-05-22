
function sayHello(name) {
	unless (name == "World") {
		debug "Finally, something original to greet!";
	}

	debug "Hello " + name + "!";
	debug "Goodbye " + name + "!";
}

sayHello("World");
sayHello("Earth");

//throw "This should be red";
throw new Error("This should also be red");
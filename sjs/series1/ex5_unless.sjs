function sayHello(name) {
	unless (name === "World") {
		debug "Finally, something original to greet!";
	}

	debug "Hello " + name + "!";
}

sayHello("World");
sayHello("Earth");
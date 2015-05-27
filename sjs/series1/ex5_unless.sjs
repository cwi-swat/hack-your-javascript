function sayHello(name) {
	unless (name === "World") {
		console.log("Finally, something original to greet!");
	}

	console.log("Hello " + name + "!");
}

sayHello("World");
sayHello("Earth");
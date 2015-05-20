
function sayHello(name) {
	unless (name == "World") {
		console.log("Finally, something original to greet!");
	}

	console.log("Hello " + name + "!");
	console.log("Goodbye " + name + "!");
}

throw new Error("Hullo error");

sayHello("Earth");
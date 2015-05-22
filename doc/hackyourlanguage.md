Hack Your Language with Rascal
=======


- Tijs van der Storm ([@tvdstorm](https://twitter.com/tvdstorm), [storm@cwi.nl](mailto:storm@cwi.nl))
- Jouke Stoel ([@jstoel](https://twitter.com/jstoel), [jouke.stoel@cwi.nl](mailto:jouke.stoel@cwi.nl))

### Preliminaries

The Github repo we'll use during this hands-on workshop is:

- [https://github.com/cwi-swat/hack-your-javascript](https://github.com/cwi-swat/hack-your-javascript)

Instructions on how to setup Eclipse and Rascal can be found in the repository in `doc/joc-prerequisites.pdf`.

Interactive documentation on Rascal can be found online at [http://tutor.rascal-mpl.org](http://tutor.rascal-mpl.org). This can also be started from within Eclipse from the Rascal menu under "Show Tutor".

Check out the `src/demo` directory to see examples of simple and more advanced language extensions.

### Desugaring in Rascal

We're going write "desugarings", which are source-to-source transformations that compile/transpile/rewrite Javascript language extensions ("syntactic sugar") to the base Javascript language (ECMAScript 5 + `let`). The project mentioned above contains the basic desugaring infrastructure. The only thing you have to do is to extensions of the main `desugar` function. The framework will call all of them that are in the project. 

The `desugar` function is extended by writing a case for the extension you want to desugar using concrete syntax matching. Let's dissect an example to see what that means:

<pre><code>Statement desugar((Statement)`debug &lt;String s&gt;`) {
  return (Statement)`if (DEBUG_FLAG) console.log(&lt;String s&gt;);`;
}
</code></pre>

This Rascal function definition _matches_ on the `debug` statement using concrete syntax. This means that the pattern is written using the language you are actually defining (in this case Javascript + `debug`). The pattern in this case is: 

    (Statement)`debug <String s>`

The first part in parentheses indicates the type of the values this pattern matches, -- in this case values of type `Statement`. The second part, enclosed in backticks (\`) is the actual pattern: first the keyword `debug` and then some `String`. The string part (enclosed in `<` and `>`) represents a typed _hole_, which will match anything of type `String`. If the match is successful the variable `s` is bound to the matched sub-value. 

The pattern used in the `return` statement is not used for matching, but for _construction_. In this case, the bound value of `s` is inserted into the argument of  `console.log`. 


Some notes:

- `desugar` cases need to return the type they are consuming. For instance, if you desugar a `Statement` the return type should be 
`Statement`. 

- For simple desugarings as the one above, there is a short-hand notation: 
<pre><code>Statement desugar((Statement)`debug &lt;String s&gt;`) = (Statement)`if (DEBUG_FLAG) console.log(&lt;String s&gt;);`;
</code></pre>

- Concrete syntax matching works "modulo layout". This means that the patterns will match source terms regardless of the whitespace and/or comments used in either the pattern or the source term. For instance, the desugaring above will match statements like `debug /* a comment */ "debug!"`, or statements with newlines or extra spacing in them. 

- As of yet, holes used in construction patterns (e.g., the returned value of the `debug` desugaring) only admit interpolation of variables. If you want to put in complex expressions, first make a variable and assign the complex expression to it.

- Patterns should comply to the grammar. If you make a mistake, you'll get a parse error in your Rascal program!

- If you need to use literal `<`, `>` or \` in patterns, escape them using `\` (backslash). 

- If you need multiple lines start every line except the first with `'` (single quote). For instance, as follows:
<pre><code>Statement desugar((Statement)`debug &lt;String s&gt;`) 
  = (Statement)`if (DEBUG_FLAG) 
               '  console.log(&lt;String s&gt;);`;
</code></pre>
 




#### Notes on the Javascript grammar

- Expressions are captured by the `Expression` non-terminal
- Statements  are captured by the `Statement` non-terminal
- String literals are captured by the `String` non-terminal
- Identifiers (variables, field names, etc.) are captured by the `Id` non-terminal.

## Exercises

Below we use upper-case identifiers in snippets to indicate meta-variables. Lower-case identifiers either represent keywords (e.g. `unless`) or object-langugae identifiers (e.g. `this`, `console`).

### Series 1: basic desugaring

##### 1 Ruby-style instance variables

In Ruby instance variables (fields) are prefixed with an `@`-sign. 
Write a desugaring that transforms `@X` (where `X` can be an `Id`) to `this.X`.

##### 2 Pairs

Javascript has structured literals for objects and arrays, but not pairs (or tuples). Write a transformation that desugars pairs written in between `<` and `>` to object literals with fields `_1` and `_2`. IOW: `<E1, E2>` desugars to `{_1: E1, _2: E2}`.

##### 3 Todo statement

Comments are often used to mark todo items in code. But why not use an explicit statement that nags your by writing the todo item to the `console`? In this case the desugaring transforms `todo X;` (where X represents a `String`) to `console.log("TODO: " + X);`.

_Optional_: write the syntax for a "dont" statement (similar to `todo`) with syntax `dont Statement`. It should desugar to code where the argument statement is eliminated. For instance, `dont S` would rewrite to the empty statement `;`.  

##### 4 Unless statement

Some languages include a statement for negated conditional. For instance, Ruby has `unless`. In this assignment we're adding such a statement to Javascript. The syntax is `unless "(" Cond ")" Body` (where `Cond` is an `Expression` and `Body` a `Statement`), and it should rewrite to `if (!(Cond)) Body`.

_Quiz_: why are the extra parentheses around `cond` needed?

_Optional_: write a desugaring for `repeat Body until "(" Cond ")"` which transforms to a `do-while` loop. 

##### 5 Assert statement

Assert statements are used to document your assumptions. If an assertion fails you get an exception listing showing the expression that failed and (optionally) a textual message. The `assert` we're defining here has the following syntax: `assert Expression: Message;` (where `Message` is a `String`). It should be translated to code that throws an exception if the expression evaluates to a falsy value. For instance, `assert E: S` desugars to: `if (!(E)) throw new Error("Assertion failed: " + msg);`

Use Rascal string interpolation to _unparse_ the argument expression into a (Rascal) string, and then parse it as a Javascript string literal (`String`) as follows: `msg = parse(#String, "\"<e>\"")` (assuming `e` is the expression). Now you can use `msg` in the constructed pattern. 

_Optional_: Write a similar desugaring for a `test` statement. In this case the syntax could be: `test Expression should be Expression;`
Instead of throwing an exception it evaluates both expressions, tests if they are equal, and prints out a message with expected and actual value if the test failed.

### Series 2: introducing bindings



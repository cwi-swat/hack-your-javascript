module demo::HAML

extend javascript::Syntax;
import String;
import ParseTree;

syntax Expression
  = hamlExp: Tag Props? Tail?
  ;
  
// Unnatural encoding to circumvent prefix sharing bug in parser generator
syntax Tail
  = "{" Element* "}"
  | Expression!call
  ;

syntax Element
  = hnest: Tag Props? Element 
  | hblock: "{" Element* "}"
  | hempty: Tag Props? ";"
  | hexpr: Expression!hamlExp!call ";"
  ;
  
syntax Props = "(" {PropertyAssignment ","}* ")";
  
layout NoLayout = @manual  ;

syntax Tag
  = TagName NoLayout {Modifier NoLayout}*
  | {Modifier NoLayout}+
  ;
  
syntax Modifier 
  = class: "." Id
  | id: "#" Id
  ;

syntax TagName // bug: giving category here, breaks highlighting
  = "%" NoLayout Id
  ;

Expression firstExp((Expression)`[<Expression e>]`) = e;

Expression desugar((Expression)`<Tag t> <Props a> {<Element* es>}`) 
  = firstExp(elt2js((Element)`<Tag t> <Props a> {<Element* es>}`));

Expression desugar((Expression)`<Tag t> <Props a> <Expression e>`) 
  = firstExp(elt2js((Element)`<Tag t> <Props a> <Expression e>;`));

Expression desugar((Expression)`<Tag t> <Props? a>`) 
  = firstExp(elt2js((Element)`<Tag t> <Props a>;`));

Expression desugar((Expression)`<Tag t> {<Element* es>}`) 
  = firstExp(elt2js((Element)`<Tag t> {<Element* es>}`));

Expression desugar((Expression)`<Tag t> <Expression e>`) 
  = firstExp(elt2js((Element)`<Tag t> <Expression e>;`));

Expression desugar((Expression)`<Tag t> <Props? a>`) 
  = firstExp(elt2js((Element)`<Tag t>;`));


// Blocks
Expression elt2js((Element)`{}`) = (Expression)`[]`;

Expression elt2js((Element)`{<Element e> <Element* es>}`) 
  = (Expression)`[<{Expression ","}* exps0>, <{Expression ","}* exps>]`
  when 
    (Expression)`[<{Expression ","}* exps0>]` := elt2js(e),
    (Expression)`[<{Expression ","}* exps>]` := elt2js((Element)`{<Element* es>}`); 

// Expressions and strings
Expression elt2js((Element)`<Expression e>;`) = (Expression)`[<Expression e>]`;

// Empty tags
Expression elt2js((Element)`<Tag t>;`)  
  = elt2js((Element)`<Tag t> ();`);

Expression elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>);`) 
  = elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>) {}`);

// Elements with arguments
Expression elt2js((Element)`<Tag t> <Element e>`)  
  = elt2js((Element)`<Tag t> () <Element e>`);
  
Expression elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>) <Element e>`) = 
  (Expression)`[createElement(<Expression tagExp>
              '  , {<{PropertyAssignment ","}* props2>, <{PropertyAssignment ","}* props>} 
              '  , <Expression args>)]`
 when
   Expression args := elt2js(e),
   tagExp := tag2jsTag(t),
   (Expression)`{<{PropertyAssignment ","}* props2>}` := tag2jsProps(t);


//Expression elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>) <Element e>`) = 
//  (Expression)`[(function(kids) { 
//              '   var x = document.createElement(<Expression tagExp>);
//              '   for (var i = 0; i \< kids.length; i++) 
//              '     x.appendChild(kids[i]);
//              '   var attrs = {<{PropertyAssignment ","}* props2>, <{PropertyAssignment ","}* props>};
//              '   for (var a in attrs) 
//              '     if (attrs.hasOwnProperty(a)) 
//              '       x.setAttribute(a, attrs[a]);
//              '
//              '   return x;
//              '})(<Expression args>)]`
// when
//   Expression args := elt2js(e),
//   tagExp := tag2jsTag(t),
//   (Expression)`{<{PropertyAssignment ","}* props2>}` := tag2jsProps(t);


// Tags

Expression tag2jsTag((Tag)`%<Id tn><Modifier* mods>`) {
  s = "<tn>";
  if (isCapitalized(s)) {
    return (Expression)`<Id tn>`;
  }
  return parse(#Expression, "\"<s>\"");
}

Expression tag2jsTag((Tag)`<Modifier+ mods>`) = (Expression)`"div"`;

Expression tag2jsProps((Tag)`<Modifier+ mods>`) = classesAndIds([ m | m <- mods ]);

Expression tag2jsProps((Tag)`%<Id _><Modifier* mods>`) = classesAndIds([ m | m <- mods ]);

Expression classesAndIds(list[Modifier] mods) {
   String toString(list[str] xs)
     = parse(#String, "\"" + intercalate(" ", xs) + "\"");
     
   classes = toString([ "<c>" | (Modifier)`.<Id c>` <- mods ]);
   ids  = toString([ "<c>" | (Modifier)`#<Id c>` <- mods ]);
   return (Expression)`{class: <String classes>, id: <String ids>}`;
} 

bool isCapitalized(str s) = capitalize(s) == s;

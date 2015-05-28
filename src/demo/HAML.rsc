module demo::HAML

extend javascript::Syntax;
import String;
import ParseTree;

syntax Expression = Element;

syntax Element
  = hnest: Tag Props? Element 
  | hblock: "{" Element* "}"
  | hempty: Tag Props? ";"
  | hvar: Id ";"
  | hlit: Literal ";"
  | hfor: "for" "(" "var" Id "in" Expression ")" Element
  | hif: "if" "(" Expression ")" Element () !>> "else" 
  | hifElse: "if" "(" Expression ")" Element "else" Element
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

Expression desugar((Expression)`<Element e>`) = firstExp(elt2js(e));

Expression firstExp((Expression)`[<Expression e>]`) = e;


// Blocks
Expression elt2js((Element)`{}`) = (Expression)`[]`;

Expression elt2js((Element)`{<Element e> <Element* es>}`) 
  = (Expression)`[<{Expression ","}* exps0>, <{Expression ","}* exps>]`
  when 
    (Expression)`[<{Expression ","}* exps0>]` := elt2js(e),
    (Expression)`[<{Expression ","}* exps>]` := elt2js((Element)`{<Element* es>}`); 

// Vars and strings
Expression elt2js((Element)`<Id e>;`) = (Expression)`[<Id e>]`;
Expression elt2js((Element)`<Literal l>;`) = (Expression)`[<Literal l>]`;

// Control flow
Expression elt2js((Element)`for (var <Id x> in <Expression e>) <Element elt>`) 
  = (Expression)`[(function (arr) { 
                '   var result = []; 
                '   for (var i = 0; i \< arr.length; i++) {
                '      var <Id x> = arr[i];
                '      var sub = <Expression z>;
                '      for (var j = 0; j \< sub.length; j++) {
                '        result.push(sub[j]);
                '      }
                '   }
                '   return result;
                '})(<Expression e>)]`
  when Expression z := elt2js(elt);

Expression elt2js((Element)`if (<Expression c>) <Element elt>`) 
  = (Expression)`[(function () { 
                '   if (<Expression c>) {
                '     return <Expression z>;
                '   }
                '   return []; 
                '})()]`
  when Expression z := elt2js(elt);


// Empty tags
Expression elt2js((Element)`<Tag t>;`)  
  = elt2js((Element)`<Tag t> ();`);

Expression elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>);`) 
  = elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>) {}`);

// Elements with arguments
Expression elt2js((Element)`<Tag t> <Element e>`)  
  = elt2js((Element)`<Tag t> () <Element e>`);
  
Expression elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>) <Element e>`) = 
  (Expression)`[{tag: <Expression tagExp>,
              '  attrs: {<{PropertyAssignment ","}* props2>, <{PropertyAssignment ","}* props>}, 
              '  kids: <Expression args>}]`
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

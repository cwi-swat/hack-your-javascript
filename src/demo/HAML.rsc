module demo::HAML

extend javascript::Syntax;
import String;
import ParseTree;

/*

%h2{ "This is the title" }

*/

syntax Expression
  = enest: Tag Props? "{" Element* "}"
  | eexp: Tag Props? Expression
  | eempty: Tag Props? 
  ;

syntax Element
  = hnest: Tag Props? Element 
  | hblock: "{" Element* "}"
  | hempty: Tag Props? ";"
  | hexpr: Expression!enest!eempty!eexp ";"
  ;
  
syntax Props
  = "(" {PropertyAssignment ","}* ")"
  ;
  
layout NoLayout
  = @manual 
  ;

  
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

Expression desugar((Expression)`<Tag t> <Props? a> {<Element* es>}`) 
  = elt2js((Element)`<Tag t> <Props? a> {<Element* es>}`);

Expression desugar((Expression)`<Tag t> <Props? a> <Expression e>`) 
  = elt2js((Element)`<Tag t> <Props? a> <Expression e>;`);

Expression desugar((Expression)`<Tag t> <Props? a>`) 
  = elt2js((Element)`<Tag t> <Props? a>;`);


// Blocks
Expression elt2js((Element)`{}`) = (Expression)`[]`;

Expression elt2js((Element)`{<Element e> <Element* es>}`) 
  = (Expression)`[<{Expression ","}* exps0>, <{Expression ","}* exps>]`
  when 
    (Expression)`[<{Expression ","}* exps0>]` := elt2js(e),
    (Expression)`[<{Expression ","}* exps>]` := elt2js((Element)`{<Element* es>}`); 

// Expressions and strings
Expression elt2js((Element)`<Expression e>;`) = (Expression)`[<Expression e>]`;

// Tagged elements
Expression elt2js((Element)`<Tag t> <Element e>`) = 
  elt2js((Element)`<Tag t> () <Element e>`);
  
Expression elt2js((Element)`<Tag t> (<{PropertyAssignment ","}* props>) <Element e>`) = 
  (Expression)`createElement(<Expression tagExp>
              '  , {<{PropertyAssignment ","}* props2>, <{PropertyAssignment ","}* props>} 
              '  , <Expression args>)`
 when
   args := elt2js(e),
   tagExp := tag2jsTag(t),
   (Expression)`{<{PropertyAssignment ","}* props2>}` := tag2jsProps(t);


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

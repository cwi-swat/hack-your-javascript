@cachedParser{javascript.cached.SweeterJSCachedParser}
module demo::StateMachine

extend javascript::Syntax;
import ParseTree;

syntax Expression
  = "statemachine" "{" States states "}"
  ;
  
syntax State
  = "state" Id id "{" Statement* entry Transitions transitions "}"
  ;
  
syntax Trans
  = "on" Id event "goto" Id target ";"
  ;
  
syntax Transitions = Trans* lst;
syntax States = State* lst;


Expression desugar((Expression)`statemachine {<States ss>}`)
  = (Expression)`(function() { 
                '   <Statement consts>
                '   {
                '     let state = 0;
                '     return function(event) {
                '        <Statement body>
                '     };  
                '   } 
                '})()`
  when
    consts := states2consts(ss, 0),
    body := states2ifs(ss, entryCode(ss)); 

Statement states2consts((States)``, int i) = (Statement)`{}`;

Statement states2consts((States)`<State s><State* ss>`, int i)
  = (Statement)`{var <Id id> = <DecimalInteger d>; <Statement* rest>}`
  when 
    id := s.id,
    d := parse(#DecimalInteger, "<i>"),
    (Statement)`{<Statement* rest>}` := states2consts((States)`<State* ss>`, i + 1);

map[Id, Statement*] entryCode(States ss)
  = ( s.id: s.entry | s <- ss.lst );

Statement states2ifs(States ss,  map[Id, Statement*] entryCode) 
  = ( (Statement)`;` | state2if(s, it, entryCode) | s <- ss.lst );

Statement state2if(State s, Statement els, map[Id, Statement*] entryCode) {
  stateVar = s.id;
  code = trans2ifs(s.transitions, entryCode);
  return (Statement)`if (state == <Id stateVar>) {
                    '  <Statement* code>
                    '} else 
                    '  <Statement els>`; 
}

Statement trans2ifs(Transitions trs, map[Id, Statement*] entryCode) 
  = ( (Statement)`;` | trans2if(tr, it, entryCode) | tr <- trs.lst );


Statement trans2if(Trans tr, Statement els, map[Id, Statement*] entryCode) {
  event = parse(#String, "\"<tr.event>\"");
  entry = entryCode[tr.target] ? emptyStats();
  target = tr.target;
  return (Statement)`if (event === <String event>) { 
                    '  state = <Id target>; 
                    '  <Statement* entry> 
                    '} else
                    '  <Statement els>`;
}

// Ugh
Statement* emptyStats() = ss
  when (Statement)`{<Statement* ss>}` := (Statement)`{}`;

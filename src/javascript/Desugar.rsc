module javascript::Desugar

extend javascript::Syntax;
extend Series1;
extend Series2
extend demo::HAML;
extend demo::StateMachine;
extend demo::SelectQuery;
extend demo::Comprehensions;
extend demo::Builder;
extend demo::Debug;

default Statement desugar(Statement stat) = stat;
default Expression desugar(Expression expr) = expr;

start[Source] desugarAll(start[Source] src) {
  return visit (src) {
    case Statement s => desugar(s)
    case Expression e => desugar(e)
  }
}
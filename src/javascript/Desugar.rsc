module javascript::Desugar

extend javascript::Syntax;
extend series1::Ex1Unless;
extend series1::Ex2Repeat;
extend series1::Ex3Assert;
extend series2::Ex4ArrowFuncs;
extend series2::Ex5Swap;
extend series2::Ex6ForEach;
extend series2::Ex7Classes;
<<<<<<< Updated upstream
extend demo::SelectQuery;
extend series2::Ex9Twitter;
extend demo::StateMachine;
extend series2::Ex11DotProduct;
extend demo::Comprehensions;
=======
extend series2::Ex9Twitter;
extend demo::StateMachine;
extend demo::SelectQuery;
extend demo::Comprehensions;
extend demo::Builder;
>>>>>>> Stashed changes

default Statement desugar(Statement stat) = stat;
default Expression desugar(Expression expr) = expr;

start[Source] desugarAll(start[Source] src) {
  return visit (src) {
    case Statement s => desugar(s)
    case Expression e => desugar(e)
  }
}
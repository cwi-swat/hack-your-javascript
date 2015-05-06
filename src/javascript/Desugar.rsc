module javascript::Desugar

extend javascript::Syntax;
extend desugar::Ex1Unless;
extend desugar::Ex2Repeat;
extend desugar::Ex3Assert;
extend desugar::Ex4ArrowFuncs;
extend desugar::Ex5Swap;
extend desugar::Ex6ForEach;
extend desugar::Ex7Classes;
extend desugar::Ex8SQLSelect;
extend desugar::Ex9Twitter;
extend desugar::Ex10StateMachine;
extend desugar::Ex11DotProduct;
extend desugar::Comprehensions;

default Statement desugar(Statement stat) = stat;
default Expression desugar(Expression expr) = expr;

start[Source] desugarAll(start[Source] src) {
  return visit (src) {
    case Statement s => desugar(s)
    case Expression e => desugar(e)
  }
}
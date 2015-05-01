module desugar::Desugar

extend javascript::Syntax;
extend desugar::Ex1Unless;
extend desugar::Ex2Repeat;
extend desugar::Ex3Assert;
extend desugar::Ex4ArrowFuncs;
extend desugar::Ex5Swap;

default Statement desugar(Statement stat) = stat;
default Expression desugar(Expression expr) = expr;

start[Source] desugarAll(start[Source] src) {
  return visit (src) {
    case Statement s => desugar(s)
    case Expression e => desugar(e)
  }
}
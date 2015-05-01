module desugar::Desugar

extend javascript::Syntax;

default Statement desugar(Statement stat) = stat;
default Expression desugar(Expression expr) = expr;

start[Source] desugarAll(start[Source] src) {
  return visit (src) {
    case Statement s => desugar(s)
    case Expression e => desugar(e)
  }
}
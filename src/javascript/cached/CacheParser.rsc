module javascript::cached::CacheParser

import lang::rascal::grammar::ParserGenerator;
import IO;
import Grammar;

import javascript::Desugar;
  
void saveParser() {
    p = newGenerate("javascript.cached", "SweeterJSCachedParser", grammar(#start[Source]));
    writeFile(|project://hack-your-javascript/src/javascript/cached/SweeterJSCachedParser.java|, p);
}
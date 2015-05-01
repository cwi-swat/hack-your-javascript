module desugar::Ex8SQLSelect

extend javascript::Syntax;

// Using jsLinq

syntax Expression
  = cond: Expression!cond "?" Expression!cond ":" Expression 
  > "select" Fields "from" Expression "where" Expression
  ;
  
syntax Fields = {Id ","}* lst;


Expression desugar((Expression)`select <Fields flds> from <Expression from> where <Expression where>`)
  = (Expression)`JSLINQ(<Expression from>).Where(function(item) { return <Expression where2>; }).Select(function (item) { return <Expression obj>; })`
  when 
  item := (Id)`item`,
  where2 := vars2fields(where, flds, item),
  obj := ids2object(flds, item);  


Expression vars2fields(Expression exp, Fields flds, Id obj) {
  return top-down-break visit (exp) {
    case Function _: ;
    case (Expression)`<Id x>`: {
      if (Id y <- flds.lst, x == y) {
        insert (Expression)`<Id obj>.<Id x>`;
      }
    }
  }
}

Expression ids2object((Fields)``, Id obj) = (Expression)`{}`;

Expression ids2object((Fields)`<Id id>, <{Id ","}* ids>`, Id obj)
  = (Expression)`{<Id id>: <Id obj>.<Id id>, <{PropertyAssignment ","}* props>}`
  when 
  (Expression)`{<{PropertyAssignment ","}* props>}` := 
    ids2object((Fields)`<{Id ","}* ids>`, obj);  
  

/* JSLINQ(myList)
                   .Where(function(item){ return item.FirstName == "Chris"; })
                   .OrderBy(function(item) { return item.FirstName; })
                   .Select(function(item){ return item.FirstName; });

  */
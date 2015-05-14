@cachedParser{javascript.cached.SweeterJSCachedParser}
module series2::Ex9Twitter

import List;

extend javascript::Syntax;

syntax Expression 
  = @category="TwitterConstant" "@(" {Expression ","}* ")"
  | @category="TwitterConstant" "#(" {Expression ","}* ")"
  ;

Expression desugar((Expression)`@(<{Expression ","}* es>)`) 
  = (Expression)`searchAt(<{Expression ","}* es>)`;  

Expression desugar((Expression)`#(<{Expression ","}* es>)`)
  = (Expression)`searchHash(<{Expression ","}* es>)`;  


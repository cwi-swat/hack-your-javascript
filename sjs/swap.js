
var doc = (function (builder) {var result; result = builder.h2("Hello world");
   result = builder.ul((function (builder) {var result; result = builder.li("Item 1");
      result = builder.li("Item 2");
      result = builder.li("Item 3"); return result;})(html)); return result;})(html);
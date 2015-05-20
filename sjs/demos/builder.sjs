
var doc = html build {
   h2("Hello world");
   ul(html build {
      li("Item 1");
      li("Item 2");
      li("Item 3");
   }); 
};
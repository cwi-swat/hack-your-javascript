
// First we'll search for the tweets to @joyofcoding
@("joyofcoding").then(showResult);

// Then, hopefuly we guessed the hashtag correct, we'll search for a live update of this conference 
#("joyofcoding15").then(showResult);
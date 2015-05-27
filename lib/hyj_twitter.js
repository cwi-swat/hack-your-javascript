'use strict'

var cb = new Codebird;
cb.setBearerToken("AAAAAAAAAAAAAAAAAAAAAGI8fgAAAAAAGC6z0wrc2gLIHj%2F0Yb%2FBp4QAXko%3DJARELmzovFtHBB30i1PntWWV86QQRwvDiQzISwprUrDMCBtdEQ");	

var searchAt = function() {
	var query = "";
	for (var i = 0; i < arguments.length; i++) {
		query = query + "@" + arguments[i];
	}
	
	return search(query);
};

var searchHash = function() {
	var query = "";
	for (var i = 0; i < arguments.length; i++) {
		query = query + "#" + arguments[i];
	}
	
	return search(query);
};


var search = function(query) {
	return Q.Promise(function(resolve, reject) {
		var queryParams = "q=" + query;
		
		cb.__call(
			"search_tweets",
			queryParams,
			function(resp) {
				resolve(resp);
			},
   			true
   		);
   	});
};

var showResult = function(results) {
	console.log("\n");
	console.log("Found tweets for query '" + results.search_metadata.query + "'");
	console.log("--------------------------------");
	
	for (var i = 0; i < results.statuses.length; i++) {
		console.log("Tweet: " + results.statuses[i].text);
		console.log("Send by: " + results.statuses[i].user.screen_name);
		console.log("On: " + results.statuses[i].created_at);
		console.log("\n");
	}

	if (results.statuses.length === 0) {
		console.log("No tweets founds");
		console.log("\n");
	}
};

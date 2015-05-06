'use strict'

var cb = new Codebird;
cb.setBearerToken("AAAAAAAAAAAAAAAAAAAAAGI8fgAAAAAAGC6z0wrc2gLIHj%2F0Yb%2FBp4QAXko%3DJARELmzovFtHBB30i1PntWWV86QQRwvDiQzISwprUrDMCBtdEQ");	

var search = function(query) {
	return new Promise(function(resolve, reject) {
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
}

var showResult = function(results) {
	var result = document.getElementById("result");
	while (result.firstChild) {
		result.removeChild(result.firstChild);
	}

	function createElem(elemType, className, innerText) {
		var elem = document.createElement(elemType);
		if (className !== undefined) {
			elem.className = className;
		}

		if (innerText !== undefined) {
			elem.innerText = innerText;
		}

		return elem;
	}

	for (var i = 0; i < results.statuses.length; i++) {
		var message = createElem("div", "message", results.statuses[i].text);
		var author = createElem("span", "author",
				results.statuses[i].user.screen_name);
		var date = createElem("span", "date", " tweeted on "
				+ results.statuses[i].created_at);

		var metadata = createElem("div", "metadata");
		metadata.appendChild(author);
		metadata.appendChild(date);

		var tweet = createElem("div", "tweet");
		tweet.appendChild(message);
		tweet.appendChild(metadata);
		tweet.appendChild(createElem("hr"))

		result.appendChild(tweet);
	}
}

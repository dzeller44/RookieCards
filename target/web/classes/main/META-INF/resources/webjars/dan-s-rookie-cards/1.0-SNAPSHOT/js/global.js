function deleteUser(userkey) {
	window.location.href = '/deleteuser/' + userkey;
}

function filterCardSearch(fieldName, filterType) {
	// Get selected service...
	var e = document.getElementById(fieldName);
	var fieldValue = e.options[e.selectedIndex].value;
	console.log(fieldName + " Field Value = " + fieldValue);
	window.location.href = "/filtercardsearch?type=" + filterType + "&value=" + fieldValue;	
}

function searchCards() {
	var e = document.getElementById("searchText");
	var fieldValue = e.value;
	if (fieldValue != "") {
		console.log("value 1 = " + fieldValue);
		window.location.href = "/mainsearch/" + fieldValue;	
	}
}

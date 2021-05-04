$(document).ready(function() {
 $("#createForm").on('submit', function(e) {
	e.preventDefault();
	var form = this;
	var a = document.getElementById("textName").value;
	var b = document.getElementById("textSport").value;
	if(a == null || a == "" || b == null || b == ""){
		document.getElementById("textName").classList.add("redPlaceHolder");
		document.getElementById("textSport").classList.add("redPlaceHolder");
	}
	else{
		form.submit();
	}
});
});
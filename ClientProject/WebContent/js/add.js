$(document).ready(function() {
 $("#AddForm").on('submit', function(e) {
	e.preventDefault();
	var form = this;
	var a = document.getElementById("name").value;

	if(a == null || a == ""){
		document.getElementById("name").classList.add("redPlaceHolder");
	}
	else{
		form.submit();
	}
});

 $("#FinishForm").on('submit', function(e) {
	e.preventDefault();
	var form = this;
	var num = document.getElementById("list").getElementsByTagName("li").length;

	if(num < 8){
		document.getElementById("feedback").textContent = "Please add 8 teams in order to proceed.";
	}
	else{
		form.submit();
	}
});
});
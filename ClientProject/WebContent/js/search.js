$(document).ready(function() {
	$("#UpdateBtn").click(function() {
	clearFields();
	$("#txtName").attr("placeholder", "Tournament updated");
	})
});

function clearFields() {
	$("#txtID").val("");
	$("#txtName").val("");
	$("#txtSport").val("");
}
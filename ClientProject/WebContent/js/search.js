$(document).ready(function() {
	$("#UpdateBtn").click(function() {
		var strId = $("#txtID").val();
		var strName = $("#txtName").val();
		var strSport = $("#txtSport").val();
		var strVersion = 1;
		var obj = { id: strId, name: strName, sport: strSport, version: strVersion };
		var jsonString = JSON.stringify(obj);
		if (strId != "") {
			$.ajax(
				{
					method: "PUT",
					url: "http://localhost:8080/ClientProject/MainServlet/" + strId,
					data: jsonString, dataType: 'json', error: ajaxUpdateReturnError, success: ajaxUpdateReturnSuccess
				})
			function ajaxUpdateReturnSuccess(result, status, xhr) {
				clearFields();
				$("#txtName").attr("placeholder", "Tournament updated");
			}
			function ajaxUpdateReturnError(result, status, xhr) {
				alert("Error Update");
				console.log("Ajax-find: " + status);
			}
		}

	})
});

function clearFields() {
	$("#txtID").val("");
	$("#txtName").val("");
	$("#txtSport").val("");
}
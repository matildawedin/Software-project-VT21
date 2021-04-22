$(document).ready(function() {
	$("#FindBtn").click(function() {
		var strValue = $("#txtID").val();
		if (strValue != "") {
			$.ajax({
				method: "GET",
				url: "http://localhost:8080/ClientProject/MainServlet/" + strValue,
				error: ajaxFindReturnError,
				success: ajaxFindReturnSuccess
			})
			function ajaxFindReturnSuccess(result, status, xhr) {
				ParseJsonFileTournamnet(result);
			}
			function ajaxFindReturnError(result, status, xhr) {
				alert("Error");
				console.log("Ajax-find: " + status);
			}
		}
	})
	$("#UpdateBtn").click(function(){
		var strId = $("#txtID").val();
		var strName = $("#txtName").val();
		var strSport = $("#txtSport").val();
		var strVersion = $("#txtVersion").val();
		var obj = { id: strId, name: strName, sport: strSport, version: strVersion};
		var jsonString = JSON.stringify(obj);
		if  (strId != "") {
			$.ajax(
				{
					method: "PUT",
					url: "http://localhost:8080/ClientProject/MainServlet/" +  strId,
					data: jsonString, dataType: 'json', error: ajaxUpdateReturnError, success: ajaxUpdateReturnSuccess
					})
				function ajaxUpdateReturnSuccess(result, status, xhr) {
					//clearFields();
					$("#txtName").attr("placeholder", "Tournament updated");
				}
				function ajaxUpdateReturnError(result, status, xhr) {
					alert("Error Update");
					console.log("Ajax-find: " + status);
				}
		}
		
	})
});
function ParseJsonFileTournamnet(result) {
	$("#txtID").val(result.txtID);
	$("#txtName").val(result.txtName);
	$("#txtSport").val(result.txtSport);
	$("#txtVersion").val(result.txtVersion);
}

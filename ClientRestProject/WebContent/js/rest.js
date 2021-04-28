$(document).ready(function() {
	$("#FindBtnTour").click(function() {
		var strValue = $("#txtID").val();
		if (strValue != "") {
			$.ajax({
				method: "GET",
				url: "http://localhost:8080/ClientRestProject/RestServlet/" + strValue,
				error: ajaxFindReturnError,
				success: ajaxFindReturnSuccess
			})
			function ajaxFindReturnSuccess(result, status, xhr) {
				ParseJsonFileTournament(result);
			}
			function ajaxFindReturnError(result, status, xhr) {
				alert("Error");
				console.log("Ajax-find: " + status);
			}
		}
	})
	$("#UpdateBtnTour").click(function(){
		var strId = $("#txtID").val();
		var strName = $("#txtName").val();
		var strSport = $("#txtSport").val();
		var obj = { id: strId, name: strName, sport: strSport};
		var jsonString = JSON.stringify(obj);
		if  (strId != "") {
			$.ajax(
				{
					method: "PUT",
					url: "http://localhost:8080/ClientRestProject/RestServlet/" +  strId,
					data: jsonString, dataType: 'json', error: ajaxUpdateReturnError, success: ajaxUpdateReturnSuccess
					})
				function ajaxUpdateReturnSuccess(result, status, xhr) {
					clearFields();
					$("#txtName").attr("placeholder", "Tournament updated");
				}
				function ajaxUpdateReturnError(result, status, xhr) {
					alert("You can not update the TournamentID only the name and sport");
					console.log("Ajax-find: " + status);
				}
				
		}
		
	})
});
function ParseJsonFileTournament(result) {
	$("#txtID").val(result.txtID);
	$("#txtName").val(result.txtName);
	$("#txtSport").val(result.txtSport);
	
}
function clearFields() {
$("#txtID").val("");
$("#txtName").val("");
$("#txtSport").val("");

}

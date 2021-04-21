$(document).ready(function() {
	function xx() {
		var teamSelect = $("#teamList");
		var selectedID = $("selectedID").val();
		selectedID = teamSelect.options[teamSelect.selectedIndex].text;
	}


});
function onTeamChange(){
	var teamSelect = document.getElementById("teamList");
	var tournamentSelect = document.getElementById("tournamentList");
	document.getElementById("selectedID").value = teamSelect.options[teamSelect.selectedIndex].value;
	
}
function onTournamentChange(){
	var teamSelect = document.getElementById("teamList");
	var tournamentSelect = document.getElementById("tournamentList");
	document.getElementById("selectedID").value = tournamentSelect.options[tournamentSelect.selectedIndex].value;
}
function radioFunction()
{
	var radioTeam =document.getElementById("teamRadio");
	var radioTournament =document.getElementById("tournamentRadio");
	document.getElementById("selectedID").value = "";

	if(radioTeam.checked == true){
		document.getElementById("teamList").style.display = "inline";
		document.getElementById("tournamentList").style.display = "none";
		
	}
	else if(radioTournament.checked == true){
		document.getElementById("tournamentList").style.display = "inline";
		document.getElementById("teamList").style.display = "none";
	}
}




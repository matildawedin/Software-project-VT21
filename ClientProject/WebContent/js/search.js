
function onTeamChange(){
	var teamSelect = document.getElementById("teamList");
	var findBtn = document.getElementById("FindBtn");
	
	if(teamSelect.options[teamSelect.selectedIndex].value != "startOption"){
		document.getElementById("selectedID").value = teamSelect.options[teamSelect.selectedIndex].value;
		findBtn.style.display = "inline";
	}
	else{
		findBtn.disabled = true;
	}
}
function onTournamentChange(){
	var tournamentSelect = document.getElementById("tournamentList");
	var findBtn = document.getElementById("FindBtn");
	
	if(tournamentSelect.options[tournamentSelect.selectedIndex].value != "startOption"){
		document.getElementById("selectedID").value = tournamentSelect.options[tournamentSelect.selectedIndex].value;
		findBtn.style.display = "inline";
	}
	else{
		findBtn.disabled = true;
	}
	
	
}
function radioFunction()
{
	var radioTeam =document.getElementById("teamRadio");
	var radioTournament =document.getElementById("tournamentRadio");
	document.getElementById("selectedID").value = "";
	document.getElementById("FindBtn").style.display = "none";
	document.getElementById("teamList").selectedIndex = 0;
	document.getElementById("tournamentList").selectedIndex = 0;

	if(radioTeam.checked == true){
		document.getElementById("teamList").style.display = "inline";
		document.getElementById("tournamentList").style.display = "none";
		
		
	}
	else if(radioTournament.checked == true){
		document.getElementById("tournamentList").style.display = "inline";
		document.getElementById("teamList").style.display = "none";
	}
}
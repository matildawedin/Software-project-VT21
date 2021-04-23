function onShowTournaments(){
	var viewTournaments = document.getElementById("tournamentList");
	
	if(tournamentSelect.options[tournamentSelect.selectedIndex].value != "startOption"){
		document.getElementById("selectedID").value = tournamentSelect.options[tournamentSelect.selectedIndex].value;
		findBtn.style.display = "inline";
	}
	else{
		findBtn.disabled = true;
	}
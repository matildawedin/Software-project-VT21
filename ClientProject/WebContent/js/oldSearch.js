$(document).ready(function() {
	window.onload = function setList(){
		var teamList= $("#teamList");
		var tournamentList= $("#tournamentList");
		var teams = $("#teams").val();
		var tournaments = $("#tournaments").val();
		
		for(var x in teams){
			teamList.options[teamList.options.length]= new Option(x,x);
		}
		for(var x in tournaments){
			tournamentList.options[tournamentList.options.length] = new Option(x,x);
		}
	}
});

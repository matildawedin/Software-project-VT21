function onloadFunction() {
	document.getElementById("UpdateBtn").disabled = true;

}


function onTeamUpdate() {
	document.getElementById("UpdateBtn").disabled = false;

}
function onUpdate() {
	document.getElementById("response").innerHTML = "Team name updated";
	return false;
}
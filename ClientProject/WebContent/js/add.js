	function populateList(teamList){
		var i;
		for(i = 0; i<8; i++){
			document.getElementById("list").append(teamList[i]);
			//document.getElementById("list").$("#teamList").val();
		}
		alert("Its happening");
	//document.getElementById("list").append($("#teamName").val());
	}
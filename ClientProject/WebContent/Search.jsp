<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="org.ics.ejb.Team"%>
<%@ page import="java.util.ArrayList"%>
<html>
<head>
<link rel="icon" type="image/png" href="images/icon.png" />
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/searchStyle.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
</script>
<title>Search</title>
</head>
<script src="js/Search.js"></script>
<body>
    <%ArrayList<Team> teams = (ArrayList<Team>) request.getAttribute("teams");%>
    <%ArrayList<Tournament> tournaments = (ArrayList<Tournament>) request.getAttribute("tournaments");%>
	<h3>Select category</h3>
	<div class="radio-toolbar" onchange="radioFunction()">
		<input type="radio" id="tournamentRadio" name="select"
			value="Tournament"> <label for="tournamentRadio">Tournament</label>
		<input type="radio" id="teamRadio" name="select" value="Team">
		<label for="teamRadio">Team</label>
	</div>
	<tb>
	<form action="/ClientProject/MainServlet" method="post">
		<div>
			<select name="select" id="teamList" onchange="onTeamChange()"
				style="display: none">
				<%for (Team t : teams) {%>
				<option value="<%=t.getTeamID()%>"><%=t.getTeamName()%></option>
				<%}%>
			</select> <select name="select" id="tournamentList"
				onchange="onTournamentChange()" style="display: none">
				<%for (Tournament t : tournaments) {%>
				<option value="<%=t.getTournamentID()%>"><%=t.getTournamentName()%></option>
				<%}%>
			</select> <input type="submit" name="submit" value="Search" id="FindBtn" />
		</div>
	</tb>
	<input type="text" id="selectedID" name="selectedID">
	<input name="operation" value="Show" type="hidden">
	</form>
</body>
</html>
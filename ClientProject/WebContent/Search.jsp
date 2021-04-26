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
<script src="js/search.js"></script>
</head>
<body>
<form action="/ClientProject/MainServlet" method="get">
    <%ArrayList<Team> teams = (ArrayList<Team>) request.getAttribute("teams");%>
    <%ArrayList<Tournament> tournaments = (ArrayList<Tournament>) request.getAttribute("tournaments");%>
    <input name="operation" value="get" type="hidden">
</form>
    <header>
    <h1>Search for team or tournament</h1>
    </header>
	<nav class="navbar">
		<ul>
			<a href="Home.jsp">Home</a>
			<a href="Create.jsp">Create</a>
			<a  class="active">Find</a>
			<a href ="About.jsp">About</a>
		</ul>
	</nav>
	<div class="main">
		<h4 for="radio-toolbar">Select category</h4>
		<div class="radio-toolbar" onchange="radioFunction()">
			<input type="radio" id="tournamentRadio" name="select"
				value="Tournament"> <label for="tournamentRadio">Tournament</label>
			<input type="radio" id="teamRadio" name="select" value="Team">
			<label for="teamRadio">Team</label>
		</div>
		<tb>
		<form action="/ClientProject/MainServlet" method="post">
			<div class="selectdiv">
				<select name="select" id="teamList" onchange="onTeamChange()" style="display: none">
					<option value="startOption">-- select one --</option>
					<%for (Team t : teams) {%>
					<option value="<%=t.getTeamID()%>"><%=t.getTeamName()%></option>
					<%}%>
				</select> 
				<select name="select" id="tournamentList" onchange="onTournamentChange()" style="display: none">
					<option value="startOption">-- select one --</option>
					<%for (Tournament t : tournaments) {%>
					<option value="<%=t.getTournamentID()%>"><%=t.getTournamentName()%></option>
					<%}%>
				</select> <input type="submit" name="submit" value="Search" id="FindBtn" style="display: none" />
			</div>
		</tb>
		<input type="hidden" id="selectedID" name="selectedID"> 
		<input name="operation" value="Show" type="hidden">
		</form>
	</div>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
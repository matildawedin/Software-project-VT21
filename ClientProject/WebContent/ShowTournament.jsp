<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="org.ics.ejb.Team"%>
<%@ page import="java.util.Set"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/show.css">
<title>Tournament</title>
<script src="js/show.js"></script>
</head>
<body>
	<form action="/ClientProject/MainServlet" method="post">
		<%Tournament tournament = (Tournament) request.getAttribute("tournament");%>
		<%Set<Team> teams= (Set<Team>) request.getAttribute("teams");%>
		<h2>Tournament</h2>
		<p>
			<input type="hidden" name="txtID" id="txtID" value="<%=tournament.getTournamentID()%>" >
		</p>
		<label>Name</label>
		<p>
			<input type="text" name="txtName" id="txtName" value="<%=tournament.getTournamentName()%>">
		</p>
		<label>Sport</label>
		<p>
			<input type="text" name="txtSport" id="txtSport"
				value="<%=tournament.getSport()%>">
		</p>
		<input type="submit" name="submitBtn" value="Update" id="UpdateBtn">
		<input name="operation" value="UpdateTournament" type="hidden">
		<ul id="teamList">
		<%for(Team t : teams){ %>
		<li><a value="<%=t.getTeamID()%>"><%=t.getTeamName()%></a>
		<% } %>
		</ul>
	</form>
	<input type="submit" name="submit" value="Tillbaka" onclick="location.href='/ClientProject/MainServlet'"/> 
</body>
</html>
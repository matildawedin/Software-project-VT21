<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="org.ics.ejb.Team"%>
<%@ page import="java.util.Set"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/showStyle.css">
<title>Tournament</title>
<script src="js/show.js"></script>
</head>
<body>
	<header>
		<h1>Tournament</h1>
	</header>
	<nav>
		<ul class="navul">
			<a href="Home.jsp">Home</a>
			<a href="AddParticipants.jsp">Create</a>
			<a class="active">Find</a>
			<a href="About.jsp">About</a>
		</ul>
	</nav>
	<h2>Tournament</h2>
	<section>
		<form action="/ClientProject/MainServlet" method="post">
			<%Tournament tournament = (Tournament) request.getAttribute("tournament");%>
			<%Set<Team> teams = (Set<Team>) request.getAttribute("teams");%>
			<%String feedback = request.getAttribute("response").toString();%>
			<p>
				<input type="hidden" name="txtID" id="txtID"
					value="<%=tournament.getTournamentID()%>">
			</p>
			<p><%=feedback%></p>
			<label>Name</label>
			<aside>
				<label id="participantLable">Participants</label>
				<ul id="teamList">
					<%for (Team t : teams) {%>
					<li><a value="<%=t.getTeamID()%>"><%=t.getTeamName()%></a> 
					<% }%>
				</ul>
			</aside>
			<p>
				<input type="text" name="txtName" id="txtName"
					value="<%=tournament.getTournamentName()%>">
			</p>
			<label>Sport</label>
			<p>
				<input type="text" name="txtSport" id="txtSport"
					value="<%=tournament.getSport()%>">
			</p>
			<input type="submit" name="submitBtn" value="Update" id="UpdateBtn">
			<input name="operation" value="UpdateTournament" type="hidden">
		</form>
		<form action="/ClientProject/MainServlet" method="get">
			<input id="backBtn" type="submit" name="submit" value="Back"/>
		</form>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
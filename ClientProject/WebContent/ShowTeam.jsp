<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Team"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/show.css">
<script src="js/show.js"></script>
<title>Team</title>
</head>
<body>
<header>
		<h1>Team</h1>
	</header>
	<nav class="navbar">
		<ul>
			<a href="/Home.jsp">Home</a>
			<a href="/AddParticipants.jsp">Create</a>
			<a class="active">Find</a>
			<a>About</a>
		</ul>
	</nav>
	<form action="/ClientProject/MainServlet" method="post">
		<%Team team = (Team) request.getAttribute("team");%>
		<section class="section">
		<p>
			<input type="hidden" name="txtID" id="txtID" value="<%=team.getTeamID()%>" >
		</p>
		<label>Name</label>
		<p>
			<input type="text" name="txtName" id="txtName" value="<%=team.getTeamName()%>">
		</p>
		<input type="submit" name="submitBtn" value="Update" id="UpdateBtn">
		<input name="operation" value="UpdateTeam" type="hidden">
	</form>
	<input id="backBtn" type="submit" name="submit" value="Tillbaka"> 
	<input name="operation" value="get" type="hidden">
	</section>
<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
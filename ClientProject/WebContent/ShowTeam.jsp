<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Team"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/showStyle.css">
<script src="js/show.js"></script>
<title>Team</title>
</head>
<body onload="onloadFunction()">
	<header>
		<h1>Team</h1>
	</header>
	<nav>
		<ul class="navul">
			<a href="Home.jsp">Home</a>
			<a href="Create.jsp">Create</a>
			<a class="active">Find</a>
			<a href="About.jsp">About</a>
		</ul>
	</nav>
	<section class="section">
		<form action="/ClientProject/MainServlet" method="post">
			<%Team team = (Team) request.getAttribute("team");%>
			<%String feedback = request.getAttribute("response").toString();%>
			<p>
				<input type="hidden" name="txtID" id="txtID"
					value="<%=team.getTeamID()%>">
			</p>
			<p class="response"><%=feedback%></p>
			<label>Name</label>
			<p>
				<input onchange="onTeamUpdate()" type="text" name="txtName" id="txtName"
					value="<%=team.getTeamName()%>" >
			</p>
			<input type="submit" name="submitBtn" value="Update" id="UpdateBtn">
			<input name="operation" value="UpdateTeam" type="hidden">
		</form>
		<form  action="/ClientProject/MainServlet" method="get">
		<input id="backBtn" type="submit" name="submit" value="Back">
		<input name="operation" value="get" type="hidden">
		</form>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Team"%>
<html>
<head>
<link rel="icon" type="image/png" href="images/icon.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/showStyle.css">
<script src="js/show.js"></script>
<title>Team</title>
</head>
<body>
	<header>
		Team
	</header>
	<nav>
		<ul class="navul">
			<a href="Home.jsp">Home</a>
			<a href="Create.jsp">Create</a>
			<a class="active">Find</a>
			<a href="About.jsp">About</a>
			<a href="Testing.jsp">Test</a>
		</ul>
	</nav>
	<section>
	<div class="teamSection">
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
				<input type="text" name="txtName" id="txtName"
					value="<%=team.getTeamName()%>" autocomplete='off' oninput="onUpdate();" >
			</p>
			<input type="submit" name="submitBtn" value="Update" id="UpdateBtn" disabled>
			<input name="operation" value="UpdateTeam" type="hidden">
		</form>
		<br>
		<form  action="/ClientProject/MainServlet" method="get">
		<input id="backBtn" type="submit" name="submit" value="Back">
		</form>
		</div>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
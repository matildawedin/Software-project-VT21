<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Team"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="js/show.js"></script>
<title>Team</title>
</head>
<body>
	<form action="/ClientProject/MainServlet" method="post">
		<%Team team = (Team) request.getAttribute("team");%>
		<h2>Team</h2>
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
	<input type="submit" name="submit" value="Tillbaka" onclick="location.href='/ClientProject/MainServlet'"> 

</body>
</html>
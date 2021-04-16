<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Person</title>
</head>
<body>
	<%Tournament tournament = (Tournament) request.getAttribute("tournament");%>
	<h2>Tournament</h2>
	<p>
		<input type="text" name="txtID" id="txtID" value="<%=tournament.getTournamentID()%>">
	</p>
	<p>
		<input type="text" name="txtName" id="txtName" value="<%=tournament.getTournamentName()%>">
	</p>
	<p>
		<input type="text" name="txtSport" id="txtSport" value="<%=tournament.getSport()%>">
	</p>
	<form action="/ClientProject/MainServlet" method="get">
		<input type="button" name="submitBtn" value="Update" id="UpdateBtn">
		<input type="button" name="submitBtn" value="Find" id="FindBtn">
		<input type="submit" name="submit" value="Tillbaka"> 
		<input name="operation" value="Search" type="hidden">
	</form>
</body>
</html>
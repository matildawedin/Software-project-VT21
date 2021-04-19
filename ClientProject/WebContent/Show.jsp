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
	<form action="/ClientProject/MainServlet" method="post">
		<%Tournament tournament = (Tournament) request.getAttribute("tournament");%>
		<h2>Tournament</h2>
		<p>
			<input type="text" name="txtID" id="txtID"
				value="<%=tournament.getTournamentID()%>">
		</p>
		<p>
			<input type="text" name="txtName" id="txtName"
				value="<%=tournament.getTournamentName()%>">
		</p>
		<p>
			<input type="text" name="txtSport" id="txtSport"
				value="<%=tournament.getSport()%>">
		</p>
		<input type="submit" name="submitBtn" value="Update" id="UpdateBtn">
		
	</form>
	<form action="/ClientProject/MainServlet" method="get">
		<input type="submit" name="submit" value="Tillbaka"> 
		<input type="button" name="submitBtn" value="Find" id="FindBtn"> 
		<input name="operation" value="Search" type="hidden">
	</form>
</body>
</html>
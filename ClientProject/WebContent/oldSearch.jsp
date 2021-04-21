<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<script src="js/show.js"></script>
</head>
<body onload="setList()">
	<h2>Search</h2>
	
	
	<select name="newList" id="testID">
	<c:forEach items="${teams}" var="team">
	<option value="${team.teamID}">${team.teamName}</option>
	</c:forEach>
	</select>
	
	
	
	<input id="teams" type="hidden" value="<%=teams%>"> 
	<input id="tournaments" type="hidden" value="<%=tournaments%>">
	
	<select onload="setList()" name="list" id="teamList">
		<option value="" selected="selected">Select team</option>
	</select>
	<br></br>
	<select name="list" id="tournamentList">
		<option value="" selected="selected">Select tournament</option>
	</select>
	<form action="/ClientProject/MainServlet" method="post">
		<h3>Select category</h3>
		<div class="radio-toolbar">
			<input type="radio" id="tournamentRadio" name="select"
				value="Tournament" checked> <label for="tournamentRadio">Tournament</label>
			<input type="radio" id="teamRadio" name="select" value="Team">
			<label for="teamRadio">Team</label>
		</div>
		<input type="submit" name="submit" value="Search" id="FindBtn" /> <input
			name="operation" value="Show" type="hidden">
	</form>
</body>
</html>
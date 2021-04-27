<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Team"%>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/addStyle.css">
<title>BracketGenerator</title>
</head>
<body  onload="populateList()">
<%String tournamentId = request.getAttribute("tournamentId").toString();%> 
<%String feedback = request.getAttribute("response").toString();%>
<%ArrayList<String> teamList = (ArrayList<String>) request.getAttribute("teamList");%>
	<header>
		<h1>Add your participants</h1>
	</header>
	<script>
	function populateList(){
		<%for(String s : teamList){%>
		var name = "<%=s%>";
		var li = document.createElement('li');
		li.setAttribute("class", "listPadding");
		li.innerHTML = name; 
		document.getElementById("list").appendChild(li);
			<%}%>
	}</script>
		<nav>
			<ul class="navul">
				<a href ="Home.jsp">Home</a>
				<a class="active">Create</a>
				<a href ="MainServlet.java">Find</a>
				<a href ="About.jsp">About</a>
				<a href="Testing.jsp">Test</a>
			</ul>
		</nav>
		<section id="row">
		<section id="main">
			<section id="content">
					<fieldset>
						<legend>New Team:</legend>
						<br>Name: <br>
						<form action="/ClientProject/MainServlet" method="post">
							<input type="text" name="name" id="name" value="">
							<input type="submit" name="submitBtn" value="Add" id="AddBtn"> 
							<input name="tourId" value="<%=tournamentId%>" type="hidden">
							
							<input name="operation" value="Add" type="hidden">
						</form>
					</fieldset>
					<p id ="feedback"><%=feedback%></p>
			</section>
			<section id="allTeams">
			<fieldset class="allTeam">
			<legend>Added teams:</legend>
			<ol id="list">
			</ol>
			</fieldset>
			</section>
			<div class="cancelBtn">
			<form action="/ClientProject/MainServlet" method="post" id="FinishForm">
				<input type="submit" form="FinishForm" name="submitBtn" value="Finish" id="FinishBtn"> 
				<input type="submit" form="FinishForm" name="submitBtn" value="Cancel" id="CancelBtn"> 
				<input name="operation" value="Home" type="hidden">
			</form>
			</div>
		</section>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>

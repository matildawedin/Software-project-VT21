<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Team"%>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<html>
<head>
<link rel="icon" type="image/png" href="images/icon.png" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/addStyle.css">
<title>BracketGenerator</title>
<script src="js/add.js"></script>
</head>
<body  onload="populateList()">
<%String tournamentId = request.getAttribute("tournamentId").toString();%> 
<%String feedback = request.getAttribute("feedback").toString();%>
<%ArrayList<String> teamList = (ArrayList<String>) request.getAttribute("teamList");%>
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
	<header>
		Add your participants
	</header>
		<nav>
			<ul class="navul">
				<a href ="Home.jsp">Home</a>
				<a class="active">Create</a>
				<a href ="MainServlet">Find</a>
				<a href ="About.jsp">About</a>
				<a href="Testing.jsp">Test</a>
			</ul>
		</nav>
		<section id="main">
			<section class="content">
					<fieldset>
						<legend>New Team</legend>
						<br>Name:
						<form action="/ClientProject/MainServlet" method="post" id="AddForm">
							<input type="text" name="name" id="name" value="" class="textField" placeholder="Enter the name">
							<br><br>
							<input type="submit" value="Add" id="AddBtn" class="button"> 
							
							<input name="tourId" value="<%=tournamentId%>" type="hidden">
							<input name="operation" value="Add" type="hidden">
						</form>
					</fieldset>
					<p id="feedback"><%=feedback%></p>
			</section>
			<section class="content">
			<fieldset id="allTeam">
			<legend>Added teams</legend>
			<ol id="list">
			</ol>
			</fieldset>
			</section>
			<form action="/ClientProject/MainServlet" method="post" id="FinishForm">
				<input type="submit" value="Finish" class="button"> 
				<input type="submit" value="Cancel" id="CancelBtn" class="button"> 
				<input name="operation" value="Home" type="hidden">
			</form>
		</section>
		<br><br>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>

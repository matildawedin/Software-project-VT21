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
<script src="js/add.js"></script>
<title>BracketGenerator</title>
</head>
<body onload="populateList()">
<%String tournamentId = request.getAttribute("tournamentId").toString();%> 
<%ArrayList<String> teamList = (ArrayList<String>) request.getAttribute("teamList");%>
	<header>
		<p>Add your participants</p>
	</header>
	<script>
	function populateList(){
		//var i;
		<%for(String s : teamList){%>
			document.getElementById("list").append(<%=s%>);
			<%}%>
		alert("Its happening");
	//document.getElementById("list").append($("#teamName").val());
	}</script>
	<section id="row" onload="populateList()">
		<nav>
			<ul>
				<li><a href ="Home.jsp">Home</a></li>
				<li class="active"><a>Create</a></li>
				<li><a href ="Search.jsp">Find</a></li>
				<li><a href ="About.jsp">About</a></li>
			</ul>
		</nav>

		<aside>
			<table id="asideTable">
				<tr>
					<th><span id="city"></span></th>
					<th><span></span></th>
					<th><span></span></th>
					<th><span id="ipNbr"></span></th>
				</tr>
				<tr>
					<td><span id="degree"></span></td>
					<td><span id="weather"></span></td>
					<td><span></span></td>
					<td><span></span></td>
				</tr>
				<tr>
					<td colspan="4"><span id="sunrise"></span></td>
				</tr>
				<tr>
					<td colspan="4"><span id="sunset"> </span></td>
				</tr>
			</table>
		</aside>

		<section id="main">
			<section id="content">
				<article>
					<fieldset id="addTeam">
						<legend>New Team:</legend>
						Name: <br>
						<form action="/ClientProject/MainServlet" method="post">
							<input type="text" name="name" id="name" value="">
							<input type="submit" name="submitBtn" value="Add" id="AddBtn"> 
							<input name="tourId" value="<%=tournamentId%>" type="hidden">
							
							<input name="teamName" value="<%=teamList.get(0)%>" id="teamName1" type="hidden">
							<input name="teamName" value="<%=teamList.get(1)%>" id="teamName2" type="hidden">
							<input name="teamName" value="<%=teamList.get(2)%>" id="teamName3" type="hidden">
							<input name="teamName" value="<%=teamList.get(3)%>" id="teamName4" type="hidden">
							<input name="teamName" value="<%=teamList.get(4)%>" id="teamName5" type="hidden">
							<input name="teamName" value="<%=teamList.get(5)%>" id="teamName6" type="hidden">
							<input name="teamName" value="<%=teamList.get(6)%>" id="teamName7" type="hidden">
							<input name="teamName" value="<%=teamList.get(7)%>" id="teamName8" type="hidden">
							
							<input name="operation" value="Add" type="hidden">
						</form>
					</fieldset>
				</article>
				<fieldset id="allTeams">
			<legend>Added teams:</legend>
			<ul id="list">
			</ul>
			</fieldset>
			</section>
			<form action="/ClientProject/MainServlet" method="post" id="CancelForm">
				<input type="submit" form="CancelForm" name="submitBtn" value="Cancel" id="CancelBtn"> 
				<input name="operation" value="Home" type="hidden">
			</form>
		</section>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>

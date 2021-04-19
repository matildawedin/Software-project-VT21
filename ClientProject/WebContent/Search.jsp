<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/searchStyle.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
</script>
<title>Search</title>
</head>
<body>
	<h2>Search</h2>
	<form action="/ClientProject/MainServlet" method="post">
		<h3>Select category</h3>
		<div class="radio-toolbar">
			<input type="radio" id="tournament" name="select" value="Tournament"
				checked> <label for="tournament">Tournament</label> <input
				type="radio" id="team" name="select" value="Team">
			<label for="team">Team</label>
		</div>
		<table>
			<td><input type="text" name="txtID"
				placeholder="ID number.."> <input type="submit"
				name="submit" value="Search" id="FindBtn" /></td>
		</table>
		<input name="operation" value="Show" type="hidden">
	</form>
</body>
</html>
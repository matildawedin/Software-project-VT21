<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/png" href="images/icon.png" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/createStyle.css">
<title>BracketGenerator</title>
<script src="js/create.js"></script>
</head>
<body>
	<header>Create a new Tournament</header>
		<nav>
			<ul class="navul">
				<a href ="Home.jsp">Home</a>
				<a class="active">Create</a>
				<a href ="MainServlet">Find</a>
				<a href ="About.jsp">About</a>
				<a href="Testing.jsp">Test</a>
			</ul>
		</nav>
		<br><br><br><br>
		<section id="content">
					<br>
						<fieldset id="createNew">
							<legend>New Tournament</legend>
							Name: <br> 
							<form action="/ClientProject/MainServlet" id="createForm" method="post">
							<input type="text" name="name" value="" id="textName" class="textField" placeholder="Enter the name">
							<br><br> Sport: <br> 
							<input type="text" name="sport" value="" id="textSport" class="textField" placeholder="Enter the sport"> 
							<br><br> 
							<input type="submit" value="Create" class="button" id="createBtn"> 
							<input type="submit" value="Cancel" class="button" form ="CancelForm"> 
							<input name="operation" value="Create" type="hidden">
							</form>
							<form action="/ClientProject/MainServlet" method="post">
							<input name="operation" value="Home" type="hidden">
							</form>
						</fieldset>
			</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>

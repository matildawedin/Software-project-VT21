<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
	
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/createStyle.css">
<title>BracketGenerator</title>
</head>
<body>
	<header>
		<h1>Create a new Tournament</h1>
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
		<br><br><br><br>
		<section>
		<section id="main">
			<section>
					<article>
					<br>
						<fieldset id="createNew">
							<legend>Create new:</legend>
							Name: <br> 
							<form action="/ClientProject/MainServlet" method="post">
							<input type="text" name="name" id="name" value="">
							<br> Sport: <br> 
							<input type="text" name="sport" id="sport" value=""> 
							<br><br> 
							<input type="submit" name="submitBtn" value="Create" id="CreateBtn"> 
							<input type="submit" form = "CancelForm" name="submitBtn" value="Cancel" id="CancelBtn"> 
							<input name="operation" value="Create" type="hidden">
							</form>
							<form action="/ClientProject/MainServlet" method="post" id="CancelForm">
							<input name="operation" value="Home" type="hidden">
							</form>
						</fieldset>
					</article>
			</section>
		</section>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>

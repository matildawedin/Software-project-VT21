<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/png" href="images/icon.png" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/Home.css">
<script src="js/API.js"></script>
<title>BracketGenerator</title>
</head>
<body>
	<header>Home</header>
	<nav>
		<ul class="navul">
			<a class="active">Home</a>
			<a href="Create.jsp">Create</a>
			<a href="MainServlet">Find</a>
			<a href="About.jsp">About</a>
			<a href="Testing.jsp">Test</a>
		</ul>
	</nav>
	<br>
	<br>
	<section id="welcome">
		<article>
			<h2>Welcome to BracketGenerator</h2>
			<p>On this website you can create and edit tournaments and teams.
				This service is connected to the larger BracketGenerator system that
				is mainly accessible through our desktop application.</p>
			<img id="bracketImg"
				src="https://avatars.githubusercontent.com/u/4306614?s=400&v=4">
		</article>
	</section>
	<section id="weatherSection">
		<p>
			<span id="date"></span> <img id="sunriseImg"
				src="https://cdn.iconscout.com/icon/premium/png-512-thumb/sunrise-2311899-1920789.png">
			<span id="sunrise"></span> <br> <span id="city"></span> <br>
			<img id="sunsetImg"
				src="https://image.flaticon.com/icons/png/512/116/116224.png">
			<span id="sunset"></span> <br> <br> <img id="weatherImg">
			<br> <span id="degree"></span> <span id="weather"></span>
		</p>
	</section>
	<br>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
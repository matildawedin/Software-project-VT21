<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="java.util.ArrayList"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
 </script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/about.css">
<title>About</title>
</head>
<body>
	<header>
		About Us
	</header>
		<nav>
			<ul class="navul">
				<a href="Home.jsp">Home</a>
				<a href="Create.jsp">Create</a>
				<a href="MainServlet">Find</a>
				<a class="active">About</a>
				<a href="Testing.jsp">Test</a>
			</ul>
		</nav>
		<div class="row">
		<div class="column">
		<h2>Our Team</h2>
		<div class="row2">
		<div class="column2">
		<img src="images/Matilda.jpg">
		<div class="card">
		<h4>Matilda Wedin</h4>
		</div>
		</div>
		<div class="column2">
		<img src="images/Ludvig.jpg">
		<div class="card">
		<h4>Ludvig Karsten</h4>
		</div>
		</div>
		<div class="column2">
		<img src="images/Ellen.jpg">
		<div class="card">
		<h4>Ellen Nordgren</h4>
		</div>
		</div>
		<div class="column2">
		<img src="images/Leo.jpg">
		<div class="card">
		<h4>Leo Rasmusson</h4>
		</div>
		</div>
		<div class="column2">
		<img src="images/Cissi.jpg">
		<div class="card">
		<h4>Cecilia Minder</h4>
		</div>
		</div>
		</div>
		</div>
		<div class="column">
		<h2>About BracketGenerator</h2>
		<img id="bracketImg" src="images/icon.png">
			<p id="bracketInfo">Our aim is to make it easy for everyone to create a
				tournament. That's why we created BracketGenerator. Enjoy making
				the best tournaments for you and your teams.</p>
		</div>
		</div>
		
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
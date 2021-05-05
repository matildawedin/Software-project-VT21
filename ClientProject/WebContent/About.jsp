<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>

<%@page import="java.util.ArrayList"%><html>
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
		<div class="mainSection">
		<div class="leftColumn">
		<h2>Our Team</h2>
		<div class="innerSection">
		<div class="card">
		<img src="images/Matilda.jpg">
		<h4>Matilda Wedin</h4>
		</div>
		<div class="card">
		<img src="images/Ludvig.jpg">
		<h4>Ludvig Karsten</h4>
		</div>
		<div class="card">
		<img src="images/Ellen.jpg">
		<h4>Ellen Norgren</h4>
		</div>
		<div class="card">
		<img src="images/Leo.jpg">
		<h4>Leo Rasmusson</h4>
		</div>
		<div class="card">
		<img src="images/Cissi.jpg">
		<h4>Cecilia Minder</h4>
		</div>
		</div>
		</div>
		<div class="rightColumn">
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
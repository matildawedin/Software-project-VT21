<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/png" href="images/icon.png" />
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/testStyle.css">
<title>BracketGenerator Test</title>
</head>
<body>
	<header>
		JUnit Test
	</header>
	<nav>
		<ul class="navul">
			<a href="Home.jsp">Home</a>
			<a href="Create.jsp">Create</a>
			<a href="MainServlet">Find</a>
			<a href="About.jsp">About</a>
			<a class="active">Test</a>
		</ul>
	</nav>
	<br><br><br><br>
	<section id=content>
	<br>
		<p id=title>Press the button below to run test</p>
		 <br>
		<form action="TestServlet" method="get">
				<input type="hidden" name= "suite" value="ics.junit.ejb.TournamentBeanTest">
			 <input type="submit" value="Run" id="button"/>
		</form>
	</section>
	<br><br>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
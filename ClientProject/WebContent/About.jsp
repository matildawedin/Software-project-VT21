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
<script src="js/rest.js"></script>
<!-- Ska denna �ndras? -->
<title>BracketGenerator</title>
</head>
<body>
	<header>
		<h1>About</h1>
	</header>
		<nav>
			<ul class="navul">
				<a href="Home.jsp">Home</a>
				<a href="Create.jsp">Create</a>
				<a href="MainServlet">Find</a>
				<a class="active">About</a>
			</ul>
		</nav>
		<section id="row">
		<!--B�rjan p� den f�rsta section, m�ste de �vriga sections + aside vara inuti denna?  -->
		<aside>
			<!-- Detta �r aside rutan, d�r det �r t�nkt att vi ska g�ra sj�lva loggningen. Hur kommer det sig att denna hamnar h�gt upp n�r den ligger mellan sections? -->
			<h2>Currently active Tournaments!</h2>
			<p>Have a quick look to see all the tournaments we have active at
				the moment</p>
			<table id="asideTable1">
			</table>
			<input type="button" name="ViewButton" value="View" id="ViewBtn">
		</aside>

		<section id="main2">
			<!-- Detta �r mittenrutan d�r about-infon ska finnas  -->
			<H2>About BracketGenerator</H2>
			<p>Our aim is to make it easy for everyone to create a
				tournament. That's why we created BracketGenerator. The creators of
				this page are Leo, Ellen, Ludvig, Matilda & Cecilia. Enjoy making
				the best tournaments for you and your teams.</p>
		</section>

	</section>

	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>

</body>
</html>
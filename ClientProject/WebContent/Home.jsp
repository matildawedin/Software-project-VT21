<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
	<header>
		<h1>Home</h1>
	</header>
		<nav>
			<ul class="navul">
				<a class="active">Home</a>
				<a href="Create.jsp">Create</a>
				<a href="MainServlet">Find</a>
				<a href="About.jsp">About</a>
			</ul>
		</nav>
		<section id="row">
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
					<td colspan="4"><span id="sunset"></span></td>
				</tr>
			</table>
			<img border="0"
				src="https://images-na.ssl-images-amazon.com/images/I/41hzbXlmykL.png"
				alt="Pulpit rock" style="width: 250px; height: 159px;">
		</aside>
		<section id="main" style="height: 320px; width: 343px">
			<H2>Welcome to BracketGenerator</H2>
			<p>On this website you can create and edit tournaments and teams
				asd.</p>

			<img border="0"
				src="https://avatars.githubusercontent.com/u/4306614?s=400&v=4"
				alt="Pulpit rock" style="width: 324px; height: 158px;">

			<article></article>
		</section>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>
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
 <link rel="stylesheet" type="text/css" href="css/about.css">
 <script src="js/API.js"></script>
 <title>BracketGenerator</title>
</head>
<body>
 <header>
<p>About</p>
 </header>
 <section id="row">
<nav>
 <ul>
				<li><a href ="Home.jsp">Home</a></li>
				<li ><a href ="Create.jsp">Create</a></li>
				<li><a href ="Search.jsp">Find</a></li>
				<li class="active"><a>About</a></li>
				</ul>
</nav>
<aside>
 <table id="asideTable">
  <H2>Tournaments</H2>
 <tr>
 <td><span id="tournament"></span></td>
 <td><span id="sport"></span></td>
 </tr>

 </table>
</aside>
 <section id="main2" style="height: 320px; width: 343px">
 <H2> About BracketGenerator</H2>
 <p>The creators behind this page are students form Lund University. The system developers have worked together since the beginning of 2021. The team is know for their creative work and their use of new innovations when building websites. </p>
 </section>
 </section>
 <footer>
 <p>&copy; BracketGenerator</p>
 </footer>
</body>
</html>
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
 <script src="js/API.js"></script> <!-- Ska denna �ndras? -->
 <title>BracketGenerator</title>
</head>
<body>
 <header>
<p>About</p>
 </header>
 <section id="row"> <!--B�rjan p� den f�rsta section, m�ste de �vriga sections + aside vara inuti denna?  -->
<nav>
 <ul>
				<li><a href ="Home.jsp">Home</a></li>
				<li ><a href ="Create.jsp">Create</a></li>
				<li><a href ="Search.jsp">Find</a></li>
				<li class="active"><a>About</a></li>
				</ul>
</nav>
  <aside> <!-- Detta �r aside rutan, d�r det �r t�nkt att vi ska g�ra sj�lva loggningen. Hur kommer det sig att denna hamnar h�gt upp n�r den ligger mellan sections? -->
 <table id="asideTable">
 <tr>
 <p>Test</p>
 </tr>
 </table>
</aside>

 <section id="main2" style="height: 320px; width: 343px"> <!-- Detta �r mittenrutan d�r about-infon ska finnas  -->
 <H2> About BracketGenerator</H2>
 <p> The creators of this page is...</p>
 </section>

 </section>

 <footer>
 <p>&copy; BracketGenerator</p>
 </footer>
</body>
</html>
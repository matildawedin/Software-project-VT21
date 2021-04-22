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
 <script src="js/rest.js"></script> <!-- Ska denna ändras? -->
 <title>BracketGenerator</title>
</head>
<body>
 <header>
<p>About</p>
 </header>
 <section id="row"> <!--Början på den första section, måste de övriga sections + aside vara inuti denna?  -->
<nav>
 <ul>
				<li><a href ="Home.jsp">Home</a></li>
				<li ><a href ="Create.jsp">Create</a></li>
				<li><a href ="Search.jsp">Find</a></li>
				<li class="active"><a>About</a></li>
				</ul>
</nav>
  <aside> <!-- Detta är aside rutan, där det är tänkt att vi ska göra själva loggningen. Hur kommer det sig att denna hamnar högt upp när den ligger mellan sections? -->
 <table id="asideTable1">
 <tr>
 <H2>Currently active Tournaments!</H2>
 <p> Have a quick look to see all the tournaments we have active at the moment </p>
 <input type="button" name="ViewButton" value="View" id="ViewBtn">
 </tr>
 </table>
</aside>

 <section id="main2" style="height: 320px; width: 343px"> <!-- Detta är mittenrutan där about-infon ska finnas  -->
 <H2> About BracketGenerator</H2>
 <p> Our aim is to make it easy for everyone to create a tournament. 
 That's why we created BracketGenerator. The creators of this page are Leo, Ellen, Ludvig, Matilda & Cecilia. 
 Enjoy making the best tournaments for you and your teams.</p>
 </section>

 </section>

 <footer>
 <p>&copy; BracketGenerator</p>
 </footer>
</body>
</html>
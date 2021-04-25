<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="org.ics.ejb.Tournament"%>
<%@ page import="org.ics.facade.FacadeLocal"%>
<%@ page import="java.util.ArrayList"%>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
 </script>
 <meta charset="ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="css/about.css">
 <script src="js/about.js"></script> 
 <title>BracketGenerator</title>
</head>
<body>
  <%ArrayList<Tournament> tournaments = (ArrayList<Tournament>) request.getAttribute("tournaments");%>
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
 <table id="asideTable1" style="width: 15px; ">
 <tr style="height: 23px; width: 428px">
 <H2>Currently active Tournaments!</H2>
 <p> Have a quick look to see all the tournaments we have active at the moment </p>
 </tr>
 <input type="button" name="viewBtn" value="View " id="viewTournaments" onclick="getTournaments()">
 		<ul id="tournamentList">
		<%for(Tournament t : tournaments){ %>
		<li><a value="<%=t.getTournamentID()%>"><%=t.getTournamentName()%></a>
		<% } %>
		</ul>
 </table>
</aside>

 <section id="main2" style="height: 320px; width: 343px"> 
 <H2> About BracketGenerator</H2>
 <p> Our aim is to make it easy for everyone to create a tournament. 
 That's why we created BracketGenerator. The creators of this page are Leo, Ellen, Ludvig, Matilda & Cecilia. 
 Enjoy making the best tournaments for you and your teams.</p>
 </section>

 <footer>
 <p>&copy; BracketGenerator</p>
 </footer>
</section>
</body>
</html>
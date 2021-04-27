<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
	
</script>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/createStyle.css">
<title>BracketGenerator</title>
</head>
<body>
	<header>
		<h1>Create a new Tournament</h1>
	</header>
		<nav>
			<ul class="navul">
				<a href ="Home.jsp">Home</a>
				<a class="active">Create</a>
				<a href ="MainServlet">Find</a>
				<a href ="About.jsp">About</a>
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
					<td colspan="4"><span id="sunset"> </span></td>
				</tr>
			</table>
		</aside>
		<section id="main">
			<section id="content">
					<article>
						<fieldset id="createNew">
							<legend>Create new:</legend>
							Name: <br> 
							<form action="/ClientProject/MainServlet" method="post">
							<input type="text" name="name" id="name" value="">
							<br> Sport: <br> 
							<input type="text" name="sport" id="sport" value=""> 
							<br><br> 
							<input type="submit" name="submitBtn" value="Create" id="CreateBtn"> 
							<input type="submit" form = "CancelForm" name="submitBtn" value="Cancel" id="CancelBtn"> 
							<input name="operation" value="Create" type="hidden">
							</form>
							<form action="/ClientProject/MainServlet" method="post" id="CancelForm">
							<input name="operation" value="Home" type="hidden">
							</form>
						</fieldset>
					</article>
			</section>
		</section>
	</section>
	<footer>
		<p>&copy; BracketGenerator</p>
	</footer>
</body>
</html>

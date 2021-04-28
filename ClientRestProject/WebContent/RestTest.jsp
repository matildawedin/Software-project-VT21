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
<link rel="stylesheet" type="text/css" href="css/rest.css">
<script src="js/rest.js"></script>
<title>BracketGenerator</title>
</head>
<body>
	<header>
		<p>Update Tournament name and sport</p>
	</header>
	<section id="row">
		<nav>
			<ul>
				<li><a class="active">Update</a></li>
			</ul>
		</nav>
		<section id="TournamentFind" style="height: 273px; width: 250px">
			<article>
				<fieldset id="PersonalFS1 " style="width: 230px; height: 250px; ">
					<legend>Find tournament with ID:</legend>
					TournamentID:<br> 
					<input type="text" name="txtID" id="txtID" placeholder="Starting with I100"><br> 
					Tournament name:<br> 
					<input type="text" name="txtName" id="txtName" value=""> <br>
					Tournament sport:<br> 
					<input type="text" name="txtSport" id="txtSport" value=""> <br><br> 
					<input type="button" name="submitBtn" value="Find" id="FindBtnTour"> 
					<input type="button" name="submitBtn" value="Update" id="UpdateBtnTour">
					</fieldset>
			</article>
			</section>
			</section>
			<footer>
				<p>&copy; BracketGenerator</p>
			</footer>
</body>
</html>
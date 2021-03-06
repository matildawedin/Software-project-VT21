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
	<br><br>
	<section id="content">
				<fieldset id="find ">
					<legend>Find tournament with ID:</legend>
					<br> TournamentID:<br> 
					<input type="text" id="txtID" placeholder="Starting with I100" class="textField">
					<br><br>  Tournament name:<br> 
					<input type="text" id="txtName" value="" class="textField" disabled>
					<br><br> Tournament sport:<br> 
					<input type="text" id="txtSport" value="" class="textField" disabled> <br><br> 
					<input type="button"  value="Find" id="FindBtnTour" class="button"> 
					<input type="button"  value="Update" id="UpdateBtnTour" class="button">
					</fieldset>
			</section>
			<footer>
				<p>&copy; BracketGenerator</p>
			</footer>
</body>
</html>

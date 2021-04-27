<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>My Test Page</title>
</head>
<body>

<hr>
<p>Här kan du välja en eller flera av följande test:<br></p>
<form action="TestServlet"method="get"name="youPickItForm">
<select name="suite"size="2"multiple>
<option value="ics.junit.ejb.TournamentBeanTest">
ics.junit.ejb.TournamentBeanTest</option>
</select>
<input type="submit"value="Run"/>
</form>
</body>
</html>
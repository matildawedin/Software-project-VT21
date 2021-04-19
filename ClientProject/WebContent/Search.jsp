<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="/ClientProject/MainServlet" method="get">
		<table cellspacing="0" cellpadding="0" border="0" align="left">
			<tr>
				<td><h2>Search</h2></td>
			</tr>
			<tr>
				<td>
				<input type="text" name="txtID" size="25" maxlength="25">
				<input type="submit" name="submit" value="Skicka fråga" id="FindBtn" />
				</td>
			</tr>
			<tr>
				
			</tr>
		</table>
		<input name="operation" value="Show" type="hidden">
	</form>
</body>
</html>
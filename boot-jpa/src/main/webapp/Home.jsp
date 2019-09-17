<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
		Alien ID: <input type="text" name="aid"><br>
		Alien Name: <input type="text" name="aname"><br>
		Alien Tech: <input type="text" name="atech"><br>
		<input type="submit">
	</form>
	<br><br><br><hr><br>
	
	<form action="getAlien">
		Alien ID: <input type="text" name="aid"><br>
		<input type="submit">
	</form>
</body>
</html>
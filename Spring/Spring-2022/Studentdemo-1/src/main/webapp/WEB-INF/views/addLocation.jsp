<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Location</h1>
	<form action="/myLocation/saveloc" method="post">
		<pre>
		Name: <input type="text" name="name">
		Code: <input type="text" name="code">
		Type: <input type="text" name="type">
		<input type="submit" value="add">
		</pre>
		<h3>${message}</h3>
	</form>
	
	<a href="/myLocation/showLocations">view locations</a>
	
</body>
</html>
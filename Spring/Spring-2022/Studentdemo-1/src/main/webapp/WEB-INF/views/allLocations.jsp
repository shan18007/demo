<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Locations</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Code</th>
			<th>Type</th>
			<th>action</th>
		</tr>
		<c:forEach items="${locations}" var="loc">
			<tr>
				<td>${loc.id}</td>
				<td>${loc.name}</td>
				<td>${loc.code}</td>
				<td>${loc.type}</td>
				<td><a href="/myLocation/deleteLocation?id=${loc.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<h3>${message}</h3>
</body>
</html>

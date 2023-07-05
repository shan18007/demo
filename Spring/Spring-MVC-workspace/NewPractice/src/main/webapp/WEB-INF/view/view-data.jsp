<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirm</title>
</head>
<body>
	<h2>Student Confirm</h2>
	Student id: ${student.sid}<br>
	Student Name: ${student.sname}<br>
	Favourate Language: ${student.favLanguage}<br>
	Hobbies :
	<br>
	<c:forEach var="ob" items="${student.hobbies}">
		${ob}<br>
	</c:forEach>
	
</body>
</html>
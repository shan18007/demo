<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Data</h3>
	<br> first Name = ${student.firstName}
	<br> last Name = ${student.lastName}
	<br> CGPA = ${student.cgpa}
	<br> postal code = ${student.postalCode}
	<br> Course Code = ${student.courseCode}

	<hr>
</body>
</html>
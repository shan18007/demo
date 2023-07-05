<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
	<hr>
		First Name: ${st.fName}<br>
		Last Name:${st.lName}<br>
		Country:${st.country}<br>
		OS:
		<ul>
		<c:forEach var="temp" items="${st.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
		</ul>
	<hr>

</body>
</html>
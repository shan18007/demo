<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<form:form action="process-form" modelAttribute="student">
	<i>fields mark with (*) are mandatory..! </i><br>
	First Name: (*) <form:input path="firstName" />
	 <form:errors path="firstName" cssClass="error" /><br>
	Last Name:<form:input path="lastName" /><br>
	CGPA  <form:input path="cgpa" />
	 <form:errors path="cgpa" cssClass="error" /><br>
	 
	 	Postal code:  <form:input path="postalCode" />
	 <form:errors path="postalCode" cssClass="error" /><br>
	  
	 	Course code:  <form:input path="courseCode" />
	 <form:errors path="courseCode" cssClass="error" /><br>
	<input type="submit" value="Submit">
</form:form>
</head>
<body>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome Spring!</h2>
	<br>
	<security:authorize access="hasRole('MANAGER')">
		<a href="${pageContext.request.contextPath}/leaders"> Meetings for
			leaders</a>
		<hr>
 	
 	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
		<a href="${pageContext.request.contextPath}/systems"> Meetings for
			ADMIN</a>
		<hr>
	</security:authorize>


	<p>
		User:
		<security:authentication property="principal.username" />
		<br> <br> Role :
		<security:authentication property="principal.authorities" />
	<hr>
	</p>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="post">

		<input type="submit" value="Logout">
	</form:form>
</body>
</html>
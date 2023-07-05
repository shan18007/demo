<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome ADMIN</h2>
	<br>
	fix all old systems..

	<a href="${pageContext.request.contextPath}/">back to home</a>
	
<form:form
		action="${pageContext.request.contextPath}/logout"
		method="post">
		
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome Spring!</h2>
	
<form:form
		action="${pageContext.request.contextPath}/logout"
		method="post">
		
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>
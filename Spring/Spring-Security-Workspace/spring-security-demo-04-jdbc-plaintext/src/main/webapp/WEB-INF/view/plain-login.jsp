<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<style>
.failed {
	color: red;
}
</style>

</head>
<body>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="post">
		<c:if test="${param.error!=null }">
			<i class="failed">Sorry! you entered invalid username or password</i>
		</c:if>
		<p>
			user name: <input type="text" name="username" />
		</p>
		<p>
			password : <input type="password" name="password" />
		</p>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>
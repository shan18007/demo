<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>Student is Confirm</h2>

	<br>
	<br>
	<hr>
	<hr>
	<h2>Using Model</h2>
	<h3>
		Direct Model : ${message} <br> First Name: ${message.firstName} <br>
		Last Name: ${message.lastName} <br> Country: ${message.country} <br>
		Favourate Language: ${message.favLanguage}<br> <br>
		operating System :

		<ul>
			<c:forEach var="temp" items="${message.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>

	</h3>
</body>
</html>

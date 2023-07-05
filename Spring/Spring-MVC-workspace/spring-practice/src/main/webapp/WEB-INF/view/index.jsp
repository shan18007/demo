
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>

<html>
<head>
	<style>
		.error{
			color:red;
		}
	</style>
</head>
<body>
	<h2>Student form</h2>
	<hr>

	<form:form action="processForm" modelAttribute="student"> 
	<i>Asterisk(*) means mandatory</i> <br>
		first Name(*) : <form:input path="fName" />
		<form:errors path="fName" cssClass="error"/>
		<br>
		<br>
		Last Name: <form:input path="lName" />
		<br>
		<br>

		<br>
		<br>
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>

		<br>
		<br>
		<form:checkbox path="operatingSystems" value="Windows" />Windows<br>
		<form:checkbox path="operatingSystems" value="Mac OS" />Mac OS<br>
		<form:checkbox path="operatingSystems" value="Linux" />Linux<br>
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>


</body>
</html>

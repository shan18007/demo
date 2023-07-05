<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<html>
<body>
	<h2>Welcome to Spring-MVC</h2>

	<form:form action="process-form" method="post" modelAttribute="student">
		First name
		<form:input path="firstName" />
		<br>
		Last name
		<form:input path="lastName" />
		<br>
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		Favourate Language:
		<form:radiobutton path="favLanguage" value="Java" />JAVA<br>
		<form:radiobutton path="favLanguage" value="PHP" />PHP<br>
		<form:radiobutton path="favLanguage" value="C#" />C#<br>
		<form:radiobutton path="favLanguage" value="Python" />
		<br>
		<br>
		<br>
		
		Operating Systems:
		<form:checkbox path="operatingSystems" value="Windows" />windows
		<form:checkbox path="operatingSystems" value="Linux" />Linux
		<form:checkbox path="operatingSystems" value="mac" />Mac
		<button type="submit" value="submit">Submit</button>
	</form:form>

</body>
</html>

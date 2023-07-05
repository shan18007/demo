<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false" %>

<html>
<body>
<h2>Student Form</h2>
<form:form action="process-form" modelAttribute="student">
	<form:input path="sid"/><br>
	<form:input path="sname"/><br>
	<form:select path="favLanguage">
		<form:options items="${student.favLanguageOptions}"/>
	</form:select>
	<br>
	<form:checkbox path="hobbies" value="Music"/>Music
	<form:checkbox path="hobbies" value="Cricket"/>Cricket
	<form:checkbox path="hobbies" value="Football"/>Football
	<form:checkbox path="hobbies" value="Reading"/>Reading
	<br>
	<button value="submit">Submit</button>
</form:form>

</body>
</html>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="header.jsp"%>
<meta charset="ISO-8859-1">
</head>
<body>
	<div id="container">
	<h3>Save Customer</h3>
			<form:form action="saveCustomer" method="post" modelAttribute="customer">
				<form:hidden path="customerId" />
				<table>
						
					<tr>
						<td><label>customerName:</label></td>
						<td><form:input path="customerName" /></td>
					</tr>
					<tr>
						<td><label>email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input class="save" type="submit" value="Add" /></td>
					</tr>
				</table>
				
			</form:form>
			
			<div style="clear; both;"></div>
			<p> <a href="${pageContext.request.contextPath}/customer/list">Back to List</a> </p>
	</div>
</body>
</html>
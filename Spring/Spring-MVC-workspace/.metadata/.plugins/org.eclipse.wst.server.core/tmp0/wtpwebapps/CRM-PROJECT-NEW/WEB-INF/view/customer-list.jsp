<html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp"%>
<%@page isELIgnored="false"%>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"></link>
<body>

	<input type="button" value="Add Customer" class="add-button"
		onClick="window.location.href='form'; return false;">
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<td>Customer Id</td>
					<td>Customer Name</td>
					<td>Customer Email</td>
					<td>Action</td>
				</tr>

				<c:forEach var="c" items="${customer}">

					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${c.customerId}"></c:param>
					</c:url>


					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${c.customerId}"></c:param>
					</c:url>

					<tr>
						<td>${c.customerId}</td>
						<td>${c.customerName}</td>
						<td>${c.email}</td>
						<td><a href="${updateLink}">update</a> | 
						<a onclick="if (!(confirm('Are you sure you want to delete this customer'))) return false"
							href="${deleteLink}">Delete</a></td>
					</tr>

				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>

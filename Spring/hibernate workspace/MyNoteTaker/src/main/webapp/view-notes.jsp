<%@page import="com.entity.Note"%>
<%@page import="java.util.List"%>
<%@page import="com.service.NoteServiceImpl"%>
<%@page import="com.service.NoteService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show notes</title>
<%-- <%@include file="header.jsp"%> --%>
</head>
<body>
	<%
	NoteServiceImpl ns = new NoteServiceImpl();
	List<Note> list = ns.getAllNotes();
	%>
	<div class="container">
		<div class="mt-4 text-center">
			<h1 style="color: seagreen">All Notes</h1>
		</div>
		<%
		String msg = (String) session.getAttribute("msg");
		if (msg != null) {
		%>
		<div class="col-md-6 m-auto text-center">
			<div class="alert alert-success p-2" role="alert">
				<%=msg%>
			</div>
		</div>
		<%
		}
		session.removeAttribute("msg");
		%>


		<%
		for (Note note:list) {
		%>
		<div class="card col-md-8 m-auto">
			<div class="card-header">
				Title:
				<%=note.getTitle()%>
			</div>
			<div class="card-body">
				<p class="card-title">
					Content:
					<%=note.getNote()%></p>
				<div text-center>
					<div>
						<form action="UpdateServlet?id=<%=note.getId()%>"
							method="Post">
							<button class="btn btn-primary">Update</button>
						</form>
					</div>
					<div>
						<form action="DeleteServlet?id=<%=note.getId()%>"
							method="Post">
							<button class="btn btn-danger">Delete</button>
						</form>
					</div>

				</div>
			</div>
			<div class="card-footer text-muted">
				Added Date:
				<%=note.getAdded_date()%></div>
		</div>
		<br>
		<%
		}
		%>


	</div>
<%-- 	<%@include file="footer.jsp"%> --%>
</body>
</html>
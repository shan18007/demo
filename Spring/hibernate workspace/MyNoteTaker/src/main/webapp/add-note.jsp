<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>add-note</title>
</head>
<%@include file="header.jsp"%>
<body>

	<div class="container ">

		<div class="card mt-4 mb-3 m-5 col-md-8 m-auto">
			<h3 class="card-header text-success text-center">Add Note</h3>
			<div class="card-body p-3">

				<form method="post">
					<div class="mb-3">
						<label class="form-label">Note Title</label> <input required
							type="text" class="form-control" name="title" id="title"
							placeholder="Enter your title here">
					</div>
					<div class="mb-3">
						<label class="form-label">Content</label>
						<textarea class="form-control" required name="content" id="content"
							rows="4"></textarea>
					</div>
					<div id="btn" class="text-center">
						<button class="btn btn-outline-primary">Add Note</button>
					</div>

				</form>
				
				
				
			</div>
		</div>
	</div>
	<%@include file="view-notes.jsp" %>
	<%@include file="footer.jsp"%>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
	
// 	$("#btn").click(function(){
// 		$.post("GetNotsServlet"),
// 	})
	$( "form" ).submit(function( event ) {
		  $.post("AddServlet",{
			  title: $("#title").val(),
			  content: $("#content").val()
		  }, function(data, status){
// 			    alert("Data: " + data + "\nStatus: " + status);
		  });
				  
		  event.preventDefault();
		});



</script>

</html>
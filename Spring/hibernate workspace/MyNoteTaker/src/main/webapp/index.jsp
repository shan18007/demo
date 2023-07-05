<html>

<body>

	<%@include file="header.jsp"%>

	<div class="container">


		<div class="card text-center mt-4" style="color: seagreen">
			<div class="card-header">
				<h2>Welcome to NoteTaker</h2>
			</div>
		</div>

		<div class="card mb-4 p-5">
			<div class="row g-0">
				<div class="col-md-4">
					<img src="img/Note-icon.png" style="max-width: 300px;" img-fluid
						rounded-start" alt="...">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h3 class="card-title text-dark">Manage your Notes easily</h3>
						<h4 class="card-text text-secondary">Create your free acoount
							and enjoy the unlimited service for adding your notes.</h4>
						<p class="card-text">
							<small class="text-muted">Get access from anywhere</small>
						</p>
						<a href="add-note.jsp"><h1>Lets go</h1></a>
						
						<!-- Button trigger modal -->
						<button type="button" class="btn btn-primary"
							data-bs-toggle="modal" data-bs-target="#loginModal">Login</button>
						<button class="btn btn-success">Signup</button>
					</div>
				</div>
			</div>
		</div>




		<!-- Modal -->
		<div class="modal fade" id="loginModal" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Login Your Account</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">

						<form id="login-form">
							<div class="mb-3">
								<label class="form-label">Email
									address</label> <input type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>
							<div class="mb-3 m-auto">
								<label  class="form-label">Password</label>
								<input type="password" class="form-control"
									id="exampleInputPassword1">
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>









	</div>

	<%@include file="footer.jsp"%>

	<script>
	 $(document).ready(fuction(){
		$("#login-form")
		 
	 });
	
	</script>
</body>

</html>

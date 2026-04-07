<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<!-- Favicon -->
<link rel="icon" type="image/png" href="images/logo.png">

<!-- Bootstrap 4 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

<style>
body {
	overflow-x: hidden;
	background-color: #f4f6f9;
}

/* Sidebar */
#sidebar {
	min-height: 100vh;
	width: 230px;
	background: linear-gradient(to bottom, #1d2671, #c33764);
	transition: all 0.3s;
}

#sidebar .nav-link {
	color: white;
	font-size: 15px;
}

#sidebar .nav-link:hover {
	background: rgba(255, 255, 255, 0.2);
}

#sidebar.active {
	margin-left: -230px;
}

/* Content */
#content {
	width: 100%;
	padding: 20px;
	transition: all 0.3s;
}

/* Cards */
.dashboard-card {
	border-radius: 12px;
	transition: 0.3s;
}

.dashboard-card:hover {
	transform: scale(1.05);
}

.card-icon {
	font-size: 35px;
	opacity: 0.8;
}

/* Responsive */
@media ( max-width : 768px) {
	#sidebar {
		margin-left: -230px;
	}
	#sidebar.active {
		margin-left: 0;
	}
}
</style>
</head>

<body>

	<!-- Top Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<button class="btn btn-outline-light" id="menu-toggle">
			<i class="fas fa-bars"></i>
		</button>

		<!-- Logo + Title -->
		<a class="navbar-brand ml-3 d-flex align-items-center" href="#"> <img
			src="https://cdn-icons-png.flaticon.com/512/743/743007.png"
			width="35" height="35" class="mr-2"> Admin Dashboard
		</a>

		<ul class="navbar-nav ml-auto">
			<li class="nav-item text-white mt-2 mr-3">
				<%
				HttpSession s = request.getSession(false);
				%> Welcome, <%=(s != null) ? s.getAttribute("un") : "Admin"%>
			</li>
			<li class="nav-item"><a href="LogoutServlet"
				class="btn btn-danger btn-sm"> <i class="fas fa-sign-out-alt"></i>
					Logout
			</a></li>
		</ul>
	</nav>

	<div class="d-flex">

		<!-- Sidebar -->
		<div id="sidebar" class="text-white p-3">
			<h4 class="text-center py-3 border-bottom">Admin Panel</h4>


			<ul class="nav flex-column">
				<li class="nav-item"><a href="adminDashboard.jsp"
					class="nav-link"> <i class="fas fa-home"></i> Dashboard
				</a></li>
				<li class="nav-item"><a href="addVehicles.jsp" class="nav-link">
						<i class="fas fa-car"></i> Add Vehicle
				</a></li>
				<li class="nav-item"><a href="vehicle.jsp" class="nav-link">
						<i class="fas fa-list"></i> View Vehicles
				</a></li>
				<li class="nav-item"><a href="ViewBookingsServlet"
					class="nav-link"> <i class="fas fa-calendar-check"></i>
						Bookings
				</a></li>
				<li class="nav-item"><a href="users.jsp" class="nav-link">
						<i class="fas fa-users"></i> Users
				</a></li>
			</ul>
		</div>

		<!-- Page Content -->
		<div id="content" class="container-fluid">

			<div class="row mt-4">

				<!-- Vehicles -->
				<div class="col-md-3 col-sm-6 mb-3">
					<div class="card bg-primary text-white dashboard-card">
						<div class="card-body d-flex justify-content-between">
							<div>
								<h6>Total Vehicles</h6>
								<h3>25</h3>
							</div>
							<div class="card-icon">
								<i class="fas fa-car"></i>
							</div>
						</div>
					</div>
				</div>

				<!-- Users -->
				<div class="col-md-3 col-sm-6 mb-3">
					<div class="card bg-success text-white dashboard-card">
						<div class="card-body d-flex justify-content-between">
							<div>
								<h6>Total Users</h6>
								<h3>120</h3>
							</div>
							<div class="card-icon">
								<i class="fas fa-users"></i>
							</div>
						</div>
					</div>
				</div>

				<!-- Bookings -->
				<div class="col-md-3 col-sm-6 mb-3">
					<div class="card bg-warning text-white dashboard-card">
						<div class="card-body d-flex justify-content-between">
							<div>
								<h6>Total Bookings</h6>
								<h3>75</h3>
							</div>
							<div class="card-icon">
								<i class="fas fa-calendar-alt"></i>
							</div>
						</div>
					</div>
				</div>

				<!-- Revenue -->
				<div class="col-md-3 col-sm-6 mb-3">
					<div class="card bg-danger text-white dashboard-card">
						<div class="card-body d-flex justify-content-between">
							<div>
								<h6>Total Revenue</h6>
								<h3>₹45,000</h3>
							</div>
							<div class="card-icon">
								<i class="fas fa-rupee-sign"></i>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>
	</div>

	<!-- Scripts -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

	<script>
		document.getElementById("menu-toggle").addEventListener(
				"click",
				function() {
					document.getElementById("sidebar").classList
							.toggle("active");
				});
	</script>

</body>
</html>

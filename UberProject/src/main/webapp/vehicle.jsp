
<%-- if ("Available".equalsIgnoreCase(v.getAvailability())) {   --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page
	import="java.util.*,com.vcube1.dao.Vehicle,com.vcube1.modal.VehicleModal"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Available Vehicles</title>

<!-- Bootstrap 4 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>

<body class="bg-light">

	<div class="container mt-5">

		<h2 class="text-center mb-4">Available Vehicles</h2>

		<div class="card shadow-sm">
			<div class="card-body">

				<table class="table table-bordered table-hover text-center">
					<thead class="thead-dark">
						<tr>
							<th>Vehicle Name</th>
							<th>Vehicle Type</th>
							<th>Rent / Day</th>
							<th>Availability</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>

						<%
						Vehicle dao = new Vehicle();
						List<VehicleModal> list = dao.getAllVehicles();

						for (VehicleModal v : list) {
							// Uncomment if you want only available vehicles
							// if ("Available".equalsIgnoreCase(v.getAvailability())) {
						%>
						<tr>
							<td><%=v.getVehicleName()%></td>
							<td><%=v.getVehicleType()%></td>
							<td>₹ <%=v.getRentPerDay()%></td>
							<td><span class="badge badge-success"> <%=v.getAvailability()%>
							</span></td>
							<td>
								<a href="book?id=<%= v.getVehicleId() %>" class="btn btn-primary btn-sm">book</a>
								<!-- <form action="booking.jsp" method="post" class="mb-0">
									<input type="hidden" name="vehicleName"
										value="<%=v.getVehicleName()%>">
									<button type="submit" class="btn btn-success btn-sm">
										Book Now</button>
								</form>  -->
							</td>
						</tr>
						<%
						// }
						}
						%>

					</tbody>
				</table>
				<div class="mb-3">
					<a href="adminlogin.jsp" class="btn btn-secondary"> ← Back </a>
				</div>
			</div>
		</div>

	</div>

	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

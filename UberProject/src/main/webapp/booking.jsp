<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.vcube1.modal.BookingModal"%>

<%
BookingModal v = (BookingModal) request.getAttribute("v");
%>

<!DOCTYPE html>
<html>
<head>
<title>Vehicle Booking</title>

<!-- Bootstrap 5 CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="bg-light">

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">

				<div class="card shadow">
					<div class="card-header bg-primary text-white text-center">
						<h4>Vehicle Booking Form</h4>
					</div>

					<div class="card-body">
						<form action="BookingServlet" method="post">

							<div class="mb-3">
								<label class="form-label">User ID</label> <input type="number"
									name="userId" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Vehicle ID</label> <input
									type="number" name="vehicleId" class="form-control"
									value="<%=v != null ? v.getVehicleId() : ""%>" readonly>
							</div>

							<div class="mb-3">
								<label class="form-label">Start Date</label> <input type="date"
									name="start_date" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">End Date</label> <input type="date"
									name="end_date" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Total Amount</label> 
								 <input
									type="number" name="total_amount" step="0.01"
									class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Status</label> <select name="status"
									class="form-select">
									<option value="Booked">Booked</option>
									<option value="Pending">Pending</option>
									<option value="Cancelled">Cancelled</option>
									<option value="Completed">Completed</option>
								</select>
							</div>

							<div class="d-grid">
								<input type="submit" value="Book Vehicle"
									class="btn btn-success">
							</div>
						</form>
						<div class="mb-3">
							<a href="adminlogin.jsp" class="btn btn-secondary"> ← Back </a>
						</div>
					</div>


				</div>

			</div>
		</div>
	</div>

</body>
</html>

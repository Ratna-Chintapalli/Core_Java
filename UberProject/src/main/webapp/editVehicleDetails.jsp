<%@ page import="com.vcube1.modal.VehicleModal" %>
<%
    VehicleModal v = (VehicleModal) request.getAttribute("v");
    if (v == null) return;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Vehicle</title>

<!-- Bootstrap 4 CSS -->
<link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<style>
    body {
        background-color: #f4f6f9;
    }
    .card {
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.15);
    }
    .btn-custom {
        background-color: #1d2671;
        color: white;
        border-radius: 25px;
    }
    .btn-custom:hover {
        background-color: #c33764;
        color: white;
    }
</style>
</head>

<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card">
                <div class="card-header bg-dark text-white text-center">
                    <h4>Edit Vehicle</h4>
                </div>

                <div class="card-body">
                    <form action="UpdateVehicleServlet" method="post">

                        <!-- Vehicle ID -->
                        <div class="form-group">
                            <label>Vehicle ID</label>
                            <input type="text" name="vehicle_id"
                                   class="form-control"
                                   value="<%= v.getVehicleId() %>" readonly>
                        </div>

                        <!-- Vehicle Name -->
                        <div class="form-group">
                            <label>Vehicle Name</label>
                            <input type="text" name="vehicle_name"
                                   class="form-control"
                                   value="<%= v.getVehicleName() %>" required>
                        </div>

                        <!-- Vehicle Type -->
                        <div class="form-group">
                            <label>Vehicle Type</label>
                            <select name="vehicle_type" class="form-control" required>
                                <option <%= "Car".equals(v.getVehicleType()) ? "selected" : "" %>>Car</option>
                                <option <%= "Bike".equals(v.getVehicleType()) ? "selected" : "" %>>Bike</option>
                                <option <%= "Scooter".equals(v.getVehicleType()) ? "selected" : "" %>>Scooter</option>
                            </select>
                        </div>

                        <!-- Rent Per Day -->
                        <div class="form-group">
                            <label>Rent Per Day</label>
                            <input type="number" name="rent_per_day"
                                   class="form-control"
                                   value="<%= v.getRentPerDay() %>" required>
                        </div>

                        <!-- Availability -->
                        <div class="form-group">
                            <label>Availability</label>
                            <select name="availability" class="form-control" required>
                                <option value="Yes" <%= "Yes".equals(v.getAvailability()) ? "selected" : "" %>>
                                    Available
                                </option>
                                <option value="No" <%= "No".equals(v.getAvailability()) ? "selected" : "" %>>
                                    Not Available
                                </option>
                            </select>
                        </div>

                        <!-- Buttons -->
                        <div class="text-center">
                            <button type="submit" class="btn btn-custom px-4">
                                Update Vehicle
                            </button>
                            <a href="adminDashboard.jsp" class="btn btn-secondary px-4 ml-2">
                                Back
                            </a>
                        </div>

                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

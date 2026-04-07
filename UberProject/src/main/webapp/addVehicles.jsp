<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Vehicle</title>

<!-- Bootstrap 4 -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

<style>
    body {
        background: #f4f6f9;
    }
    .card {
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.15);
    }
    .card-header {
        background: #1d2671;
        color: white;
        border-radius: 15px 15px 0 0;
    }
    .form-control {
        border-radius: 25px;
    }
    .btn-custom {
        border-radius: 25px;
        background: #1d2671;
        color: white;
    }
    .btn-custom:hover {
        background: #c33764;
        color: white;
    }
</style>
</head>

<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6 col-sm-10">
            <div class="card">
                
                <div class="card-header text-center">
                    <h4><i class="fas fa-car"></i> Add Vehicle</h4>
                </div>

                <div class="card-body">

                    <form action="AddVehicleServlet" method="post">

                        <!-- Vehicle Name -->
                        <div class="form-group">
                            <label><i class="fas fa-car-side"></i> Vehicle Name</label>
                            <input type="text" name="vehicle_name"
                                   class="form-control"
                                   placeholder="Enter vehicle name" required>
                        </div>

                        <!-- Vehicle Type -->
                        <div class="form-group">
                            <label><i class="fas fa-list"></i> Vehicle Type</label>
                            <select name="vehicle_type" class="form-control" required>
                                <option value="">-- Select Type --</option>
                                <option>Car</option>
                                <option>Bike</option>
                                <option>Scooter</option>
                            </select>
                        </div>

                        <!-- Rent Per Day -->
                        <div class="form-group">
                            <label><i class="fas fa-rupee-sign"></i> Rent Per Day</label>
                            <input type="number" step="0.01"
                                   name="rent_per_day"
                                   class="form-control"
                                   placeholder="Enter rent per day" required>
                        </div>

                        <!-- Availability -->
                        <div class="form-group">
                            <label><i class="fas fa-check-circle"></i> Availability</label>
                            <select name="availability" class="form-control" required>
                                <option value="">-- Select Availability --</option>
                                <option value="Yes">Available</option>
                                <option value="No">Not Available</option>
                            </select>
                        </div>

                        <!-- Buttons -->
                        <div class="text-center">
                            <button type="submit" class="btn btn-custom px-4">
                                <i class="fas fa-save"></i> Add Vehicle
                            </button>
                            <a href="adminlogin.jsp" class="btn btn-secondary px-4">
                                <i class="fas fa-arrow-left"></i> Back
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

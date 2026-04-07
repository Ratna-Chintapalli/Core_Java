<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<!-- Bootstrap 4 -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

<style>
    body {
        background: linear-gradient(to right, #11998e, #38ef7d);
        height: 100vh;
    }
    .card {
        margin-top: 80px;
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }
    .form-control {
        border-radius: 25px;
    }
    .btn-custom {
        border-radius: 25px;
        background-color: #11998e;
        color: white;
    }
    .btn-custom:hover {
        background-color: #0c7b6c;
    }
</style>
</head>

<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-5 col-sm-10">
            <div class="card p-4">

                <div class="text-center mb-3">
                    <i class="fas fa-user-plus fa-3x text-success"></i>
                    <h3 class="mt-2">User Registration</h3>
                </div>

                <form action="ViewUsersServlet" method="post">

                    <!-- Name -->
                    <div class="form-group">
                        <label><i class="fas fa-user"></i> Name</label>
                        <input type="text" name="name"
                               class="form-control"
                               placeholder="Enter full name" required>
                    </div>

                    <!-- Email -->
                    <div class="form-group">
                        <label><i class="fas fa-envelope"></i> Email</label>
                        <input type="email" name="email"
                               class="form-control"
                               placeholder="Enter email" required>
                    </div>

                    <!-- Mobile -->
                    <div class="form-group">
                        <label><i class="fas fa-phone"></i> Mobile</label>
                        <input type="number" name="mobile"
                               class="form-control"
                               placeholder="Enter mobile number" required>
                    </div>

                    <!-- Password -->
                    <div class="form-group">
                        <label><i class="fas fa-lock"></i> Password</label>
                        <input type="password" name="password"
                               class="form-control"
                               placeholder="Enter password" required>
                    </div>

                    <!-- Buttons -->
                    <button type="submit" class="btn btn-custom btn-block">
                        Register
                    </button>

                    <p class="text-center mt-3">
                        Already have an account?
                        <a href="login.jsp">Login</a>
                    </p>

                </form>
				<div class="mb-3">
					<a href="adminlogin.jsp" class="btn btn-secondary"> ← Back </a>
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

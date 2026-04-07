<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<!-- Bootstrap 4 CSS -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

<style>
body {
    background: linear-gradient(135deg, #667eea, #764ba2);
    min-height: 100vh;
}

.login-card {
    border-radius: 15px;
    box-shadow: 0 10px 25px rgba(0,0,0,0.3);
}

.form-control {
    border-radius: 10px;
}

.btn-custom {
    border-radius: 10px;
    background-color: #667eea;
    color: white;
}

.btn-custom:hover {
    background-color: #5a67d8;
}

.login-icon {
    font-size: 50px;
    color: #667eea;
}
</style>
</head>

<body>

<div class="container d-flex justify-content-center align-items-center" style="min-height:100vh;">
    <div class="col-md-5 col-sm-10">
        <div class="card login-card p-4">
            
            <div class="text-center mb-4">
                <i class="fas fa-user-shield login-icon"></i>
                <h3 class="mt-2">Admin Login</h3>
                <p class="text-muted">Vehicle Rental System</p>
            </div>

            <form method="post" action="AdminController">

                <div class="form-group">
                    <label>Username</label>
                    <input type="text"  class="form-control"  name="username" placeholder="Enter username" required>
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <input type="password"  class="form-control" name="password" placeholder="Enter password"  required>            
                </div>

                <button type="submit" class="btn btn-custom btn-block">
                    <i class="fas fa-sign-in-alt"></i> Login
                </button>

            </form>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>

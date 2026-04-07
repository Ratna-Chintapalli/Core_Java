<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*,com.vcube1.dao.User,com.vcube1.modal.UserModal,com.vcube1.controller.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>

<!-- Bootstrap 4 -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

<style>
    body {
        background: linear-gradient(to right, #2193b0, #6dd5ed);
        height: 100vh;
    }
    .card {
        margin-top: 100px;
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.2);
    }
    .form-control {
        border-radius: 25px;
    }
    .btn-login {
        border-radius: 25px;
        background-color: #2193b0;
        color: white;
    }
    .btn-login:hover {
        background-color: #176d87;
        color: white;
    }
</style>
</head>

<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-5 col-sm-10">
            <div class="card p-4">
				 <%HttpSession s = request.getSession(false);%>
         		 Welcome <%=s.getAttribute("name")%>
                <div class="text-center mb-3">
                    <i class="fas fa-user-circle fa-3x text-primary"></i>
                    <h3 class="mt-2">User Login</h3>
                </div>

                <form action="vehicle.jsp" method="post">
					 <div class="form-group">
                        <label><i class="fas fa-envelope"></i> UserName</label>
                        <input type="text" name="name"
                               class="form-control"
                               placeholder="Enter your name" required>
                    </div>
					
                    <!-- Email 
                    <div class="form-group">
                        <label><i class="fas fa-envelope"></i> Email</label>
                        <input type="email" name="email"
                               class="form-control"
                               placeholder="Enter your email" required>
                    </div> -->

                    <!-- Password -->
                    <div class="form-group">
                        <label><i class="fas fa-lock"></i> Password</label>
                        <input type="password" name="password"
                               class="form-control"
                               placeholder="Enter your password" required>
                    </div>

                    <button type="submit" class="btn btn-login btn-block">
                        <i class="fas fa-sign-in-alt"></i> Login
                    </button>

                    <p class="text-center mt-3">
                        Don’t have an account?
                        <a href="users.jsp">Register here</a>
                    </p>
					
                </form>
				<div class="mb-3">
					<a href="adminlogin.jsp" class="btn btn-secondary"> ← Back</a>
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

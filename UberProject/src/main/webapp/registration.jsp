<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicle Rental System</title>

<!-- Bootstrap 5 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

<style>
    body {
        min-height: 100vh;
        background: linear-gradient(135deg, #16a085, #2ecc71);
        display: flex;
        align-items: center;
        justify-content: center;
    }

    /* Admin button */
    .admin-btn {
        position: fixed;
        top: 15px;
        right: 20px;
        z-index: 10;
    }

    .admin-btn a {
        font-size: 14px;
        padding: 6px 14px;
        border-radius: 20px;
    }

    /* Card */
    .dashboard-card {
        background: #fff;
        border-radius: 25px;
        padding: 40px 30px;
        box-shadow: 0 15px 40px rgba(0,0,0,0.25);
        width: 100%;
        max-width: 420px;
        text-align: center;
    }

    .dashboard-card i.car-icon {
        font-size: 50px;
        color: #28a745;
        margin-bottom: 15px;
    }

    .dashboard-card h2 {
        font-weight: 700;
        margin-bottom: 5px;
    }

    .dashboard-card p {
        color: #6c757d;
        margin-bottom: 25px;
    }

    .btn-user {
        border-radius: 12px;
        padding: 12px;
        font-size: 16px;
    }

    .btn-register {
        border-radius: 12px;
        padding: 12px;
        font-size: 16px;
    }

    /* Mobile adjustments */
    @media (max-width: 576px) {
        .dashboard-card {
            padding: 30px 20px;
        }
        .dashboard-card h2 {
            font-size: 22px;
        }
    }
</style>
</head>

<body>

<!-- ADMIN BUTTON -->
<div class="admin-btn">
    <a href="index.jsp" class="btn btn-dark btn-sm">
        <i class="fas fa-user-shield"></i> Admin
    </a>
</div>

<!-- CENTER CARD -->
<div class="dashboard-card">

    <i class="fas fa-car car-icon"></i>

    <h2>Vehicle Rental System</h2>
    <p>User Access</p>

    <a href="login.jsp" class="btn btn-success btn-user w-100 mb-3">
        <i class="fas fa-right-to-bracket"></i> User Login
    </a>

    <a href="users.jsp" class="btn btn-outline-success btn-register w-100">
        <i class="fas fa-user-plus"></i> User Registration
    </a>

</div>

</body>
</html>

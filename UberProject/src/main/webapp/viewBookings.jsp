<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.vcube1.modal.BookingModal" %>

<%
    List<BookingModal> bookings =
        (List<BookingModal>) request.getAttribute("bookings");
%>

<!DOCTYPE html>
<html>
<head>
<title>View Bookings</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-4">
    <h3 class="text-center mb-4">All Bookings</h3>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>Booking ID</th>
                <th>User ID</th>
                <th>Vehicle ID</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th>Total Amount</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
        <%
            if (bookings != null && !bookings.isEmpty()) {
                for (BookingModal b : bookings) {
        %>
            <tr>
                <td><%= b.getBookingId() %></td>
                <td><%= b.getUserId() %></td>
                <td><%= b.getVehicleId() %></td>
                <td><%= b.getStartDate() %></td>
                <td><%= b.getEndDate() %></td>
                <td><%= b.getTotalAmount() %></td>
                <td><%= b.getStatus() %></td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="7" class="text-center">No bookings found</td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>

    <a href="adminlogin.jsp" class="btn btn-secondary">Back</a>
</div>

</body>
</html>

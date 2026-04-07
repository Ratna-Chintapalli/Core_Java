<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.vcube1.dao.Vehicle, com.vcube1.modal.VehicleModal" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin DashBoard</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%
    HttpSession s = request.getSession(false);
    Vehicle dao = new Vehicle();
    List<VehicleModal> list = dao.getAllVehicles();
%>
<h3 class="text-center mt-3">
    Welcome : <%= s.getAttribute("un") %>
</h3>
<h4 class="text-center mt-3">Available Vehicles</h4>
<table class="table table-bordered table-hover text-center mt-4">
    <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Rent / Day</th>
            <th>Availability</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <%for (VehicleModal v : list) {%>
        <tr>
            <td><%= v.getVehicleId() %></td>
            <td><%= v.getVehicleName() %></td>
            <td><%= v.getVehicleType() %></td>
            <td>₹ <%= v.getRentPerDay() %></td>
            <td><%= v.getAvailability() %></td>
            <td>
              	<a href="book?id=<%= v.getVehicleId() %>" class="btn btn-success btn-sm">Book</a>		
                <!-- Edit -->
                <a href="edit?id=<%= v.getVehicleId() %>" class="btn btn-primary btn-sm">Edit</a>
                <!-- Delete -->
                <form action="DeleteVehicleServlet" method="post" style="display:inline;"
                      onsubmit="return confirm('Are you sure?');">
                    <input type="hidden" name="vehicle_id" value="<%= v.getVehicleId() %>">
                    <button class="btn btn-danger btn-sm">Delete</button>
                </form>

            </td>
        </tr>
        <%
        }
        %>
    </tbody>
</table>
<a href="adminlogin.jsp" class="btn btn-secondary">← Back</a>
<% String msg = request.getParameter("msg");
    if ("deleted".equals(msg)) {%>
<script>alert("Vehicle deleted successfully");</script>
<%}%>
</body>
</html>

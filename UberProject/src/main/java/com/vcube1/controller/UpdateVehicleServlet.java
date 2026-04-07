package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.dao.Vehicle;
import com.vcube1.modal.VehicleModal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateVehicleServlet")
public class UpdateVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String id = request.getParameter("vehicle_id");

	        if (id != null) {

	            VehicleModal v = new VehicleModal();
	            v.setVehicleId(Integer.parseInt(id));
	            v.setVehicleName(request.getParameter("vehicle_name"));
	            v.setVehicleType(request.getParameter("vehicle_type"));
	            v.setRentPerDay(Double.parseDouble(request.getParameter("rent_per_day")));
	            v.setAvailability(request.getParameter("availability"));

	            Vehicle dao = new Vehicle();
	            dao.updateVehicleDetails(v);
	        }

	        response.sendRedirect("adminDashboard.jsp");
	}

}

package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.dao.Vehicle;
import com.vcube1.modal.VehicleModal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteVehicleServlet")
public class DeleteVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id = request.getParameter("vehicle_id");
	        if (id != null ) {
	            int vehicleId = Integer.parseInt(id);
	            Vehicle dao = new Vehicle();
	            dao.delete(vehicleId);
	        }
	        response.sendRedirect("adminDashboard.jsp");
		
		
		
//		int vehicleId = Integer.parseInt(request.getParameter("vehicle_id"));
//	    Vehicle dao = new Vehicle();
//	    //String status = dao.delete(vehicleId);
//		if (vehicleId != null) {
//			dao.delete(vehicleId);
//			response.sendRedirect("adminDashboard.jsp");
//
//		} else {
//			response.sendRedirect("adminDashboard.jsp");
//
//		}
	}

}

package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.dao.Vehicle;
import com.vcube1.modal.VehicleModal;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vehiclename=request.getParameter("vehicle_name");
		String vehicletype=request.getParameter("vehicle_type");
		double rentperday = Double.parseDouble(request.getParameter("rent_per_day"));
		String availabaility=request.getParameter("availability");
		VehicleModal v=new VehicleModal();
		v.setVehicleName(vehiclename);
		v.setVehicleType(vehicletype);
		v.setRentPerDay(rentperday);
		v.setAvailability(availabaility);
		
		Vehicle dao=new Vehicle();
		String status=dao.addvehicle(v);
		if(status.equals("success")) {
			System.out.println("Inserted Successfully");
			RequestDispatcher rd=request.getRequestDispatcher("vehicle.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("addVehicles.jsp");
			rd.forward(request, response);
		}
		
		
	}

}

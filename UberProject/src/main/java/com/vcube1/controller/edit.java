package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.dao.Vehicle;
import com.vcube1.modal.VehicleModal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		if (id != null) {
			int vehicleId = Integer.parseInt(id);
			Vehicle dao = new Vehicle();
			VehicleModal v = dao.editByVehicleId(vehicleId);
			request.setAttribute("v", v);
			request.getRequestDispatcher("editVehicleDetails.jsp").forward(request, response);
			return;
		}
		response.sendRedirect("adminDashboard.jsp");
	}

}


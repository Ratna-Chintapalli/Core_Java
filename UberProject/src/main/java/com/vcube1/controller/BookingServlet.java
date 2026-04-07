package com.vcube1.controller;

import java.io.IOException;
import java.sql.Date;

import com.vcube1.dao.Booking;
import com.vcube1.dao.Vehicle;
import com.vcube1.modal.BookingModal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//        int userId = Integer.parseInt(request.getParameter("user_id"));
//        int vehicleId = Integer.parseInt(request.getParameter("vehicle_id"));
		int userId = Integer.parseInt(request.getParameter("userId"));
		int vehicleId = Integer.parseInt(request.getParameter("vehicleId"));

		Date startDate = Date.valueOf(request.getParameter("start_date"));
		Date endDate = Date.valueOf(request.getParameter("end_date"));

		String status = request.getParameter("status");

		// 1️⃣ calculate number of days
		long diff = endDate.getTime() - startDate.getTime();
		long days = (diff / (1000 * 60 * 60 * 24)) + 1;
		Vehicle vehicleDao = new Vehicle();
		double rentPerDay = vehicleDao.getRentByVehicleId(vehicleId);
		double totalAmount = days * rentPerDay;
		BookingModal b = new BookingModal();
		b.setUserId(userId);
		b.setVehicleId(vehicleId);
		b.setStartDate(startDate);
		b.setEndDate(endDate);
		b.setTotalAmount(totalAmount);
		b.setStatus(status);

		Booking bookingDao = new Booking();
		boolean result = bookingDao.addBooking(b);

		if (result) {
			response.sendRedirect("ViewBookingsServlet");
		} else {
			response.sendRedirect("booking.jsp");
		}
	}
}

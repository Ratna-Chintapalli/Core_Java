package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.dao.Vehicle;
import com.vcube1.modal.BookingModal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/book")
public class book extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");        

        if (id != null) {
            int vehicleId = Integer.parseInt(id);
            BookingModal v = new BookingModal();
            v.setVehicleId(vehicleId);
            request.setAttribute("v", v);
            request.getRequestDispatcher("booking.jsp").forward(request, response);
        }else {
        		response.sendRedirect("viewBookings.jsp");
        }
    }
}

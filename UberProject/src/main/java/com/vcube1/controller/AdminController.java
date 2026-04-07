package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.modal.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Admin c = new Admin();
		c.setUsername(username);
		c.setPassword(password);
		boolean status = true;
		if (status) {
			System.out.println("Login Successsful");
			HttpSession s=request.getSession();
			s.setAttribute("un", c);
			RequestDispatcher rd = request.getRequestDispatcher("adminlogin.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("SomeThing Went Wrong ");	
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
			rd.forward(request, response);
		}

	}

}

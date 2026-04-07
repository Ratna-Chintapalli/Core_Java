package com.vcube1.controller;

import java.io.IOException;

import com.vcube1.dao.User;
import com.vcube1.modal.UserModal;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ViewUsersServlet")
public class ViewUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int mobileno=Integer.parseInt(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		UserModal um=new UserModal();
		um.setName(name);
		um.setEmail(email);
		um.setMobileno(mobileno);
		um.setPassword(password);
		
		User dao=new User();
		String status=dao.insertUsers(um);
		if(status.equals("success")) {
			System.out.println("Inserted Successfully");
			HttpSession s=request.getSession();
			s.setAttribute("name",um );
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("users.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

}

package com.admin.controller;

import java.io.IOException;
import java.util.List;

import com.admin.classes.Admin;
import com.admin.model.AdminDBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		String errorMessage = "";
		
		List<Admin> adminDetails = AdminDBUtil.validate(username, password);
		
		if(adminDetails != null && !adminDetails.isEmpty()) {
			
			HttpSession session = request.getSession();
			session.setAttribute("adminDetails", adminDetails);
			response.sendRedirect(request.getContextPath() + "/adminDashboard.jsp");
			
		} else {
			
			errorMessage += "Username or password incorrect!!<br>";
			request.setAttribute("errorMessage", errorMessage);
		    request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
		    return;
		    
		}
	}

}

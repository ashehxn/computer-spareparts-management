package com.admin.controller;

import java.io.IOException;

import com.admin.model.ShopUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShopUserInsertServlet")
public class ShopUserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		String name = request.getParameter("name");
		int adminId = Integer.parseInt(request.getParameter("adminId"));
		
		boolean isTrue;
		
		isTrue = ShopUserDBUtil.insertSUser(name, username, password, adminId);
			
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("insertSuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertUnsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}

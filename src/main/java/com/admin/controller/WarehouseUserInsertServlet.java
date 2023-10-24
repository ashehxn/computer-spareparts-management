package com.admin.controller;

import java.io.IOException;

import com.admin.model.WarehouseUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/WarehouseUserInsertServlet")
public class WarehouseUserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		String userType = request.getParameter("userType");
		int warehouseId = Integer.parseInt(request.getParameter("warehouseId"));
		int adminId = Integer.parseInt(request.getParameter("adminId"));
		
		boolean isTrue;
		
		isTrue = WarehouseUserDBUtil.insertWUser(name, password, username, userType, warehouseId, adminId);
			
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("insertSuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertUnsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}

package com.admin.controller;

import java.io.IOException;

import com.admin.model.WarehouseUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/WarehouseUserDeleteServlet")
public class WarehouseUserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		boolean isTrue;
		
		isTrue = WarehouseUserDBUtil.deleteWarehouseUser(id);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("deleteSuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("deleteUnsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}

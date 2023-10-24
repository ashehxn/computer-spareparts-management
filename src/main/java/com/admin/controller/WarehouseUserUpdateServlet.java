package com.admin.controller;

import java.io.IOException;

import com.admin.classes.WarehouseUser;
import com.admin.model.WarehouseUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/WarehouseUserUpdateServlet")
public class WarehouseUserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		String username = request.getParameter("user");
		String type = request.getParameter("type");
		int warehouseId = Integer.parseInt(request.getParameter("warehouseId"));
		int adminId = Integer.parseInt(request.getParameter("adminId"));
		
		WarehouseUser wUser = new WarehouseUser(id, name, username, password, type, warehouseId, adminId);
		
		boolean isTrue;
		
		isTrue = WarehouseUserDBUtil.updateWarehouseUser(wUser);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("updateSuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("updateUnsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}
}

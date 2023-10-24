package com.admin.controller;

import java.io.IOException;
import java.util.List;

import com.admin.classes.WarehouseUser;
import com.admin.model.WarehouseUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShowWarehouseUsers")
public class WarehouseUserManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<WarehouseUser> warehouseUsers = WarehouseUserDBUtil.selectWarehouseUsers();
		
		request.setAttribute("warehouseUsers", warehouseUsers);
	
		RequestDispatcher dis = request.getRequestDispatcher("manageWarehouseUser.jsp");
		dis.forward(request, response);
		
	}

}

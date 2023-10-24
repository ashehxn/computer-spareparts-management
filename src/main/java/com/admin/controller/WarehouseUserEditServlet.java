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

@WebServlet("/WarehouseUserEditServlet")
public class WarehouseUserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		WarehouseUser currentUser = WarehouseUserDBUtil.selectOneWarehouseUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("editWarehouseUser.jsp");
		request.setAttribute("warehouseUser", currentUser);
		dispatcher.forward(request, response);
		
	}

}

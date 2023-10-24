package com.admin.controller;

import java.io.IOException;

import com.admin.classes.ShopUser;
import com.admin.model.ShopUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShopUserUpdateServlet")
public class ShopUserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		String name = request.getParameter("name");
		int adminId = Integer.parseInt(request.getParameter("adminId"));
		
		ShopUser sUser = new ShopUser(id, username, name, password, adminId);
		
		boolean isTrue;
		
		isTrue = ShopUserDBUtil.updateShopUser(sUser);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("updateSuccess.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("updateUnsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}

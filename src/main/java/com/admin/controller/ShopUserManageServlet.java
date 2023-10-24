package com.admin.controller;

import java.io.IOException;
import java.util.List;

import com.admin.classes.ShopUser;
import com.admin.model.ShopUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShowShopUsers")
public class ShopUserManageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ShopUser> shopUsers = ShopUserDBUtil.selectShopUsers();
		
		request.setAttribute("shopUsers", shopUsers);
	
		RequestDispatcher dis = request.getRequestDispatcher("manageShopUser.jsp");
		dis.forward(request, response);
		
	}

}

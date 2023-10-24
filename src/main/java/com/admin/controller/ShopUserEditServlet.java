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

@WebServlet("/ShopUserEditServlet")
public class ShopUserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		ShopUser currentUser = ShopUserDBUtil.selectOneShopUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("editShopUser.jsp");
		request.setAttribute("shopUser", currentUser);
		dispatcher.forward(request, response);
		
	}

}

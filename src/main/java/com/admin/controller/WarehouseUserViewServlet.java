package com.admin.controller;

import java.io.IOException;
import java.util.List;

import com.admin.classes.ShopUser;
import com.admin.classes.WarehouseUser;
import com.admin.model.ShopUserDBUtil;
import com.admin.model.WarehouseUserDBUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/WarehouseUserViewServlet")
public class WarehouseUserViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String searchQuery = request.getParameter("searchQuery");

        if (searchQuery != null) {
        	
        	List<WarehouseUser> warehouseUsers = WarehouseUserDBUtil.searchWarehouseUsers(searchQuery);
        	request.setAttribute("warehouseUsers", warehouseUsers);
        	request.getRequestDispatcher("viewWarehouseUsers.jsp").forward(request, response);
        }
        else {
        	List<WarehouseUser> warehouseUsers = WarehouseUserDBUtil.selectWarehouseUsers();
    		request.setAttribute("warehouseUsers", warehouseUsers);
    		RequestDispatcher dis = request.getRequestDispatcher("viewWarehouseUsers.jsp");
    		dis.forward(request, response);
        }
		
	}
}

package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/inventory_managment_db";
	private static String user = "root";
	private static String pass = "avishkaSHEHAN.4563";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);	
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
				
	}
	
}

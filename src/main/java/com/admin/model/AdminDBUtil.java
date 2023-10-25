package com.admin.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.DBConnect;
import com.admin.classes.Admin;

public class AdminDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	
	public static List<Admin> validate(String username, String password) {
		
		ArrayList<Admin> admin = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where username = '"+username+"' and password = '"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt("adminId");
				String name = rs.getString("username");
				String userN = rs.getString("password");
				
				Admin ad = new Admin();
				ad.setAdminId(id);
				ad.setName(name);
				ad.setUsername(username);
				
				admin.add(ad);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return admin;
		
	}
	
}

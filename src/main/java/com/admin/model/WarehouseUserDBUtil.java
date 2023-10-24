package com.admin.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.DBConnect;
import com.admin.classes.WarehouseUser;

public class WarehouseUserDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	
	public static boolean insertWUser(String name, String password, String username, String userType, int warehouseId, int adminId) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into warehouse_staff values(0, '"+name+"', '"+password+"', '"+username+"', '"+userType+"', '"+warehouseId+"', '"+adminId+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	public static List<WarehouseUser> selectWarehouseUsers() {
		
		List<WarehouseUser> warehouseUsers = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select staffId, name, username, type, warehouseId, adminId from warehouse_staff";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("staffId");
				String name = rs.getString("name");
				String username = rs.getString("username");
				String type = rs.getString("type");
				int warehouseId = rs.getInt("warehouseId");
				int adminId = rs.getInt("adminId");
				
				WarehouseUser wUser = new WarehouseUser(id, name, username, type, warehouseId, adminId);
				warehouseUsers.add(wUser);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return warehouseUsers;
		
	}
	
	public static boolean updateWarehouseUser(WarehouseUser wUser) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update warehouse_staff set name='"+wUser.getName()+"', username='"+wUser.getUsername()+"', password='"+wUser.getPassword()+"', type='"+wUser.getType()+"', warehouseId='"+wUser.getWarehouseId()+"', adminId='"+wUser.getAdminId()+"' where staffId='"+wUser.getStaffId()+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static WarehouseUser selectOneWarehouseUser(int id) {
		
		WarehouseUser wUser = null;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select staffId, name, username, password, type, warehouseId, adminId from warehouse_staff where staffId = '"+id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String type = rs.getString("type");
				int warehouseId = rs.getInt("warehouseId");
				int adminId = rs.getInt("adminId");
				wUser = new WarehouseUser(id, name, username, password, type, warehouseId, adminId);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return wUser;
	}
	
	public static boolean deleteWarehouseUser(int id) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from warehouse_staff where staffId='"+id+"' ;";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<WarehouseUser> searchWarehouseUsers(String searchQuery) {
        List<WarehouseUser> searchResults = new ArrayList<>();
        try {
        	String searchSQL = "SELECT * FROM warehouse_staff WHERE " +
                    "name LIKE '%" + searchQuery + "%' " +
                    "OR username LIKE '%" + searchQuery + "%' " +
                    "OR staffId = '" + searchQuery + "'";

        	ResultSet rs = stmt.executeQuery(searchSQL);
        	
            while (rs.next()) {
            	int id = rs.getInt("staffId");
				String name = rs.getString("name");
				String username = rs.getString("username");
				String type = rs.getString("type");
				int warehouseId = rs.getInt("warehouseId");
				int adminId = rs.getInt("adminId");
                searchResults.add(new WarehouseUser(id, name, username, type, warehouseId, adminId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return searchResults;
    }
}

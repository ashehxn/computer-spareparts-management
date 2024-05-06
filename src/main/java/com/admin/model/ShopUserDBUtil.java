package com.admin.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.DBConnect;
import com.admin.classes.ShopUser;

public class ShopUserDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	
	//	Insert function
	public static boolean insertSUser(String name, String username, String password, int adminId) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into shopmanager values(0, '"+username+"', '"+password+"', '"+name+"', '"+adminId+"')";
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
	
	//	Select All users function
	public static List<ShopUser> selectShopUsers() {
		
		List<ShopUser> shopUsers = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select shopMgrId, name, username, adminId from shopmanager";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("shopMgrId");
				String name = rs.getString("name");
				String username = rs.getString("username");
				int adminId = rs.getInt("adminId");
				
				ShopUser sUser = new ShopUser(id, username, name, adminId);
				shopUsers.add(sUser);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return shopUsers;
		
	}
	
	public static boolean updateShopUser(ShopUser sUser) {
	
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update shopmanager set name='"+sUser.getName()+"', username='"+sUser.getUsername()+"', password='"+sUser.getPassword()+"', adminId='"+sUser.getAdminId()+"' where shopMgrId='"+sUser.getId()+"'";
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
	
	public static ShopUser selectOneShopUser(int id) {
		
		ShopUser sUser = null;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select shopMgrId, name, username, password, adminId from shopmanager where shopMgrId = '"+id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String name = rs.getString("name");
				String username = rs.getString("username");
				String password = rs.getString("password");
				int adminId = rs.getInt("adminId");
				sUser = new ShopUser(id, username, name, password, adminId);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return sUser;
	}
	
	public static boolean deleteShopUser(int id) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from shopmanager where shopMgrId='"+id+"' ;";
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
	
	public static List<ShopUser> searchShopUsers(String searchQuery) {
        List<ShopUser> searchResults = new ArrayList<>();
        try {
        	String searchSQL = "SELECT * FROM shopmanager WHERE " +
                    "name LIKE '%" + searchQuery + "%' " +
                    "OR username LIKE '%" + searchQuery + "%' " +
                    "OR shopMgrId = '" + searchQuery + "'";

        	ResultSet rs = stmt.executeQuery(searchSQL);
        	
            while (rs.next()) {
                int shopMgrId = rs.getInt("shopMgrId");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String name = rs.getString("name");
                int adminId = rs.getInt("adminId");
                searchResults.add(new ShopUser(shopMgrId, username, name, password, adminId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return searchResults;
    }
	
}

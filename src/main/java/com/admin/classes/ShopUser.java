package com.admin.classes;

public class ShopUser extends User{
	
	private int id;
	private int adminId;
	
	public ShopUser(int id, String username, String name, int adminId) {
		super(name, username);
		this.id = id;
		this.adminId = adminId;
	}

	public ShopUser(int id, String username, String name, String password, int adminId) {
		super(name, username, password);
		this.id = id;
		this.adminId = adminId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
}

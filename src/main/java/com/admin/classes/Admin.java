package com.admin.classes;

public class Admin {
	
	private int adminId;
	private String name;
	private String username;
	
	public Admin(int adminId, String name, String username) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.username = username;
	}

	public int getAdminId() {
		return adminId;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}
	
}

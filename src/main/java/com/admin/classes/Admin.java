package com.admin.classes;

import com.admin.model.AdminInterface;

public class Admin implements AdminInterface {
	
	private int adminId;
	private String name;
	private String username;
	
	public Admin() {
		this.adminId = 0;
		this.name = null;
		this.username = null;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

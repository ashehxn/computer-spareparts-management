package com.admin.classes;

public class ShopUser {
	
	private int id;
	private String username;
	private String name;
	private String password;
	private int adminId;
	
	public ShopUser(int id, String username, String name, int adminId) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.adminId = adminId;
	}

	public ShopUser(int id, String username, String name, String password, int adminId) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.adminId = adminId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
}

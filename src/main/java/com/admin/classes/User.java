package com.admin.classes;

public class User {
	private int userId;
	private String name;
	private String username;
	private String password;
	
	public User(int userId, String name, String username) {
		this.userId = userId;
		this.name = name;
		this.username = username;
	}

	public User(int userId, String name, String username, String password) {
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
}

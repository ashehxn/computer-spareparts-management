package com.admin.classes;

public class WarehouseUser {
	
	private int staffId;
	private String name;
	private String username;
	private String password;
	private String type;
	private int warehouseId;
	private int adminId;
	
	public WarehouseUser(int staffId, String name, String username, String type, int warehouseId, int adminId) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.username = username;
		this.type = type;
		this.warehouseId = warehouseId;
		this.adminId = adminId;
	}

	public WarehouseUser(int staffId, String name, String username, String password, String type, int warehouseId,
			int adminId) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.type = type;
		this.warehouseId = warehouseId;
		this.adminId = adminId;
	}



	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
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
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
}

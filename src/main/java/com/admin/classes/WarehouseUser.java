package com.admin.classes;

public class WarehouseUser extends User{
	
	private int staffId;
	private String type;
	private int warehouseId;
	private int adminId;
	
	public WarehouseUser(int staffId, String name, String username, String type, int warehouseId, int adminId) {
		super(name, username);
		this.staffId = staffId;
		this.type = type;
		this.warehouseId = warehouseId;
		this.adminId = adminId;
	}

	public WarehouseUser(int staffId, String name, String username, String password, String type, int warehouseId,
			int adminId) {
		super(name, username, password);
		this.staffId = staffId;
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

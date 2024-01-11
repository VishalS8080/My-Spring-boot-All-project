package com.example.demo.Roles;

public class Role {
	
	private int id;
	
	private String Rolename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return Rolename;
	}

	public void setRolename(String rolename) {
		Rolename = rolename;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", Rolename=" + Rolename + "]";
	}
	
	
	

}

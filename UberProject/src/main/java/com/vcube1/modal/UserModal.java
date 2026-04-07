package com.vcube1.modal;

public class UserModal {
	private String name;
	private String email;
	private int mobileno;
	private String password;
	public UserModal() {
		
	}
	public UserModal(String name, String email, int mobileno, String password) {
		super();
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserModal [name=" + name + ", email=" + email + ", mobileno=" + mobileno+ "]";
	}
	
	
}

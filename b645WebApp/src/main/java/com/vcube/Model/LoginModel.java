package com.vcube.Model;

public class LoginModel {
	
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
	private String username;
	private String password;
	
	public LoginModel() {
		
	}
	public LoginModel(String un,String pwd) {
		this.username=un;
		this.password=pwd;
	}
	
	public String toString() {
		return username;
	}
	
	

}

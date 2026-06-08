package com.vcube.Model;

public class Student{
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	
	public Student() {
		
	}
	public Student(String fn,String ln,String pwd,String un) {
		this.username=un;
		this.firstname=fn;
		this.lastname=ln;
		this.password=pwd;
	}
	
	public String toString() {
		return firstname+":"+lastname+":"+username;
	}
	
}

	
	
	

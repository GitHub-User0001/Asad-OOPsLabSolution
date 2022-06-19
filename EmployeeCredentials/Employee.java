package com.Credentials;

public class Employee {
	private String firstname;
	private String lastname;
	private String department;
	private String email;
	private char[] password;
	
	public Employee(String firstname, String lastname, String department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	
	

}

package com.gl.itdepartement.model;

public class Employee {
	private String firstName;
	private String lastName;
	//Create default constructor
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Create parameterized constructor
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Create getter and setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}




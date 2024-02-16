package com.springcore.SpringCore;

public class Student {

	private int id;
	private String name;
	private String address;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
/* The arguments of a constructor can only be found by type, not by name, 
 * so there is no way for the framework to reliably match properties to constructor args. 
 * Therefore, they require a no-arg constructor to create the object, then can use the setter methods to 
 * initialise the data.
 * */
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
// we use default no argument constructor because if we want to create an object of the class and dont want to pass any argument
// then we use empty constructor 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// creating the getter and setter methods of the variables to get and set the values 
	//getter method for the ID field
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

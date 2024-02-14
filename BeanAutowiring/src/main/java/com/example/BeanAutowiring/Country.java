package com.example.BeanAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Country {
	
	private int id;
	private String name;
	private State state;
	
	///Getter and setter methods for the fields 
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
	public State getstate() {
		return state;
	}
	
	/// autowiring the values in the setState method
	@Autowired
	public void setstate(State state) {
		this.state = state;
	}
	
	//super class constructor 
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	///method to display all the values of the class
	public void display()
	{
		 System.out.println("City Id : " + id); 
	     System.out.println("City Name : " + name); 
	     System.out.println("State : " + state.getName()); 
	}
	

}

package com.example.BeanAutowiring;

import org.springframework.stereotype.Component;

@Component
///State class with a variable stateNamee
public class State {
	
	private String stateName;

	
	///getter and setter method of the field
	public String getName() {
		return stateName;
	}

	public void setName(String stateName) {
		this.stateName = stateName;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}

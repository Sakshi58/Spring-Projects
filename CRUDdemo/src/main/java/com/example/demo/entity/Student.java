package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/// A student class with fields , getter/setter methods and constructors 
@Entity
@Table(name="student")
public class Student 
{

	//define fields
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	//define constructor
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public Student( String firstName, String lastName, String email) {
		super();
		//this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	
	//define getter/setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	//define toString() method
	
	@Override
	public String toString() {
		return "Student [id=" + id + 
				", firstName=" + firstName + 
				", lastName=" + lastName + 
				", email=" + email + "]";
	}

	
	
	
	
}

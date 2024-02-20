package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="UserData")
public class User {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int id;
	 String name;
	 
// @Column annotation to specify the details of the column
	 @Column(name="Address", columnDefinition = "varchar(10) default 'Pune'" , nullable = false)
	 String city;
	 
	 /**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

		//default constructor for object creation
	    User() {}
	    
	    /**
		 * @param name
		 */
		

		User(int id, String name, String city)
	    {
	        this.id = id;
	        this.name = name;
	        this.city = city;
	    }

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
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		
}

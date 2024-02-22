package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;

//An interface that allows Spring to find the repository interface and create proxy objects for that
public interface StudentDAO  {

	//Creating the data in the database
	 void save(Student theStudent);
	 
	//Read/Retrieving the data from the database
	 Student findById(Integer id);
	 
	//Querying the results
	 List<Student> findAll();
	 
	 List<Student> findByLastName(String theLastName);
	 
    //Updating the data in the database
	void update(Student student); 
	
	//Deleting the data from the database
	void delete(int id);
	
	int deleteAll();
}

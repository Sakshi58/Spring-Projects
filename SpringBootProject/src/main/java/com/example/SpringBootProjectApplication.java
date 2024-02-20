package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


///////***********CRUD OPERATION USING SPRING DATA JPA ********************/////////////////

/* A springBoot project using Spring Data JPA to access relational database and to perform CRUD operations 
 * A POJO Class User to having fields and getter/setter methods 
 * An Interface UserRepo which extends a JPA specific repository 
 * fetching the database from application.properties 
 * */

@SpringBootApplication
	/*CommandLineRunner is a software or tool, provided by the Spring framework for 
 	* quickly developing and testing the application from the command prompt
	*/
public class SpringBootProjectApplication implements CommandLineRunner {

	@Autowired
	private UserRepo ob;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
	

	// CommandLineRunner contains run() method which is overridden

	  @Override
	    public void run(String... args) throws Exception {
		  
			/*
			 * adding some new users in the table creating the object of the User class and
			 * then passing arguments to its arg constructor
			 */	       
		    User record1 = new User(101, "sameer1","");
	        User record2 = new User(102,"Sakshi1","");
	        User record3 = new User(103,"Ben1","");
	        User record4 = new User(104,"Man1","");
	        User record5 = new User(105,"Pam1","");
	        User record6 = new User(106,"Sam1","");
	        
	 //    creating an ArrayList to store all the data
	        List<User> list = new ArrayList<>();
	        list.add(record1);
	        list.add(record2);
	        list.add(record3);
	        list.add(record4);
	        list.add(record5);
	        list.add(record6);
	        
/// To INSERT DATA into MySQL TABLE WE USE SAVE() METHOD	 
/// JPARepository<>.save()  Method 
	        
	        ob.saveAll(list);
	        
//	JPARepository<>.count() -it returns the total count of the entities in the table	   
	       System.out.println("total count of entities in the table = "+ob.count()); 
	        
////******** METHOD TO FIND THE RECORDS FROM MYSQL TABLE  *********////////// 	       
	       
			/*
			 * JPARepositery<>.findById() method is used for finding the records from mysql. 
			 * .findById() is used to find the record by the id 
			 * .findAll() is used to find all the records from table
			 */	        
	        List<User> records = ob.findAll();
	        
	        System.out.println("User table records are as follows: ");
	        
///			function to display the records	        
	        records.stream().forEach(e -> {
	        	
	        	System.out.println(e.getId() + " " + e.getName());
	        } );
	   
///**********METHOD TO DELETE RECORDS FROM MYSQL TABLE ************//////////// 
	 
			/*
			 * JPARepository.deleteById() method is used to delete records by their ID from
			 * mysql .deleteAll() is used to delete all the records from the table
			 */  
	      ob.deleteById(105);
	      ob.deleteAll();
       
	      List<User> recordss = ob.findAll();
	      
	    ///displaying the records after deletion 
	        System.out.println("After deletion ");
            recordss.stream().forEach(e -> {
	        	
	        	System.out.println(e.getId() + " " + e.getName());
	        } );
	  
	  }

}

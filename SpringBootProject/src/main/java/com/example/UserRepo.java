package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This file is used for extending the JPA methods with hibernate implementation


/*  In order to start leveraging the Spring Data programming model with JPA,
 *  a DAO interface needs to extend the JPA specific Repository interface, "JpaRepository". 
 *  This will enable Spring Data to find this interface and automatically create an implementation for it.
 *  
 *  The JpaRepository class will give you methods for CRUD functionalities 
*/

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

//	 @Query("SELECT * FROM user")
}

package com.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Main class
public class App {
	
	//Main method
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
	/*
	 * creating an object of the ApplicationContext that will store all the beans
	 * and manage the bean lifecycle
	 */    
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    
    ///creating an instance of the class to get the bean 
    Student student =(Student) context.getBean("student1");
    
    System.out.println(student);
  }
}

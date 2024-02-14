package com.example.ComponentDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.example.services.MyServices;

@SpringBootApplication
public class ComponentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentDemoApplication.class, args);
		
		
		/*
		 * creating an object of the AnnotationConfigApplicationContext to store all the bean definitions 
		 * Scanning the package to detect any custom bean using @Component Annotation 
		 */		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.example.ComponentDemo");
		
		/*
		 * Using the refresh scope, Spring will clear its internal cache of these
		 * components on an EnvironmentChangeEvent. Then, on the next access to the
		 * bean, a new instance is created.
		 */	    
		context.refresh();
		
		/*
		 * creating the objetct of the ComponentTry class and accessing its method
		 */		
		
		ComponentTry componenttry = context.getBean(ComponentTry.class);
		componenttry.demo();
		
		
		
		context.scan("com.example.services");
	    
		/*
		 * creating the object of the MyServices class and accessing its method
		 */	
		
	    MyServices myservice = context.getBean(MyServices.class);
	    
	    int factoriall = myservice.factorial(5);
	    
	    System.out.println("Factorial of 5 = "+factoriall);

		context.close();
	}

}

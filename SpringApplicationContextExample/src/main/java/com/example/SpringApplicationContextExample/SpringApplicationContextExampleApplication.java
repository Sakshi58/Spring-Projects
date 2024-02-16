package com.example.SpringApplicationContextExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.SpringApplicationContextExample.config.AppConfig;
import com.example.SpringApplicationContextExample.domain.Student;

@SpringBootApplication
public class SpringApplicationContextExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationContextExampleApplication.class, args);
		
		
		/* Main method for the Student class and AppConfig class 
		 * Created a Spring Bean using ApplicationContext 
		 * */
		 // SpringApplication.run(DemoApplication.class, args);

	    // Creating its object
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    Student student = context.getBean(Student.class);

	    // displaying the properties of the Student class
	    System.out.println(student);
	}

	
	
}

package com.example.BeanAutowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/* A java maven project to show working of @Autowired Annotation 
 * 
 * Create  a Java Maven project and create a java class named State with a variable named stateName and then 
 * Create another class named Country with variables such as ID, city name and State class secondary object and 
 * autowire the state value into the Country class through @Autowired annotation and Setter Dependency .
 * Injection.
 * */
@SpringBootApplication
public class BeanAutowiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanAutowiringApplication.class, args);

		
		/*creating an object of the ApplicationContext so that it holds all the
		 * beans created by the application and passing the name of the Bean Configuration XML file
		 */		
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfig.xml");
		
		
		/*
		 * creating the object of Country class and getting the related bean through
		 * getBean() method
		 * setting the values of the fields.
		 */        
		Country country = (Country) context.getBean("country"); 
        country.setId(01); 
        country.setName("Varanasi"); 
        State st = context.getBean("state", State.class); 

        country.setstate(st); 
        country.display();

	context.close();
	}

}

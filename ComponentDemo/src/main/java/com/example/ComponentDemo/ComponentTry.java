package com.example.ComponentDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan

/*
 * annotating the class with @Component annotation so that it directly
 * identifies all the custom beans
 */

public class ComponentTry {

	//a demo function to show the working of the annotation
	public void demo()
	{
		System.out.println("Hello coder ");
	}
}

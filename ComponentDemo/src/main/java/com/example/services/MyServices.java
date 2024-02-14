package com.example.services;

import org.springframework.stereotype.Service;

@Service

/*
 * A Class MyServices annotated with @Service annotation to show the working of
 * the @Service annotation
 */
public class MyServices {

	public int factorial(int n)
	{
		int fact =1;
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
}

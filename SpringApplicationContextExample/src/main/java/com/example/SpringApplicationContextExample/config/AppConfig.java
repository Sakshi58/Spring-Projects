package com.example.SpringApplicationContextExample.config;

import org.springframework.context.annotation.*;

import com.example.SpringApplicationContextExample.domain.Student;

@Configuration

//Simple Class 
public class AppConfig {

///@Bean annotation to instantiate a bean
@Bean

// Method
public Student student() {

 return new Student(1, "Java Bean");
}
}
package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

@SpringBootApplication
public class CruDdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruDdemoApplication.class, args);
	}
	
	 
	@Bean   //inject the StudentDao
	public CommandLineRunner commandLineRunner(StudentDAO studentDao)  
	{
		///lambda function  functionName->{function method}
		return runner -> {
//          create student data 
		//createMultipleStudents(studentDao);
			
//			read/retrieve the data
			//readStudent(studentDao);
			
// 			Query students data
			queryForStudents(studentDao);
			
		//	queryByLastName(studentDao);
			
//		update the student
		//	update(studentDao);
			
//		delete the student data 
			//delete(studentDao);
			
			deleteAll(studentDao);
		};
	}
	
	private void deleteAll(StudentDAO studentDao) {

		System.out.println("deleting all the rows ");
		int rows = studentDao.deleteAll();
		System.out.println("rows deleted = "+rows);
	}


	private void delete(StudentDAO studentDao) {

		int id = 3;
		System.out.println("deleting the student id == "+id);
		
		studentDao.delete(id);
	}


	private void update(StudentDAO studentDao) {

		//retrieve the student data based on the primary key
		int studentid = 1;
		System.out.println("Getting student with id = "+studentid);
		Student student = studentDao.findById(studentid);
		
		//change first name to scooby
		System.out.println("update the student name");
		student.setFirstName("Scooby");
		
		//update the student
		studentDao.update(student);
	
		//display the updated student
		System.out.println("Updated student = "+ student);
	}


	private void queryByLastName(StudentDAO studentDao) {

		List<Student> name = studentDao.findByLastName("Rick");
		
		
		for(Student s : name)
		{
			System.out.println(s);
		}
	}


	private void queryForStudents(StudentDAO studentDao) {
	
		// get a list of students 
		List<Student> studentList = studentDao.findAll(); 
		
		// display the list of students 
		for(Student s : studentList )
		{
			System.out.println(s);
		}
		
	}


	private void readStudent(StudentDAO studentDao) {
		
		// create student objects 
		System.out.println("Creating a new student object ");
		Student temp = new Student("Tom","Fiery","tomf@gmail.com");
		
		// save the student objects 
		System.out.println("saving the student object ");
		studentDao.save(temp);
		
		//Display id of the saved student
		System.out.println("Displaying the id of the student ");
		int theId = temp.getId();

	   System.out.println("student id = "+theId);
		
		//retrieve the student based on the id : primary key
		System.out.println("Retrieving the student by findById() method ");
		Student mystudent = studentDao.findById(theId);
		
		// read the student objects 
		 System.out.println("Reading the student data ");
		 System.out.println("student data = "+mystudent);
	}


	//Create Multiple Students  method
	private void createMultipleStudents(StudentDAO studentDao) {
		
		///create multiple students objects 
		System.out.println("Creating 3 new student objects ");
		Student student1 = new Student("Tom","Fiery","tomf@gmail.com");
		Student student2 = new Student("Anaya","Naumi","an261@gmail.com");
		Student student3 = new Student("Zeb","Rick","zeb43@gmail.com");

		//saving the students objects
		
		System.out.println("Saving the student object");
//		List<Student> list = new ArrayList<>();
//		list.add(student1);
//		list.add(student2);
//		list.add(student3);
		
		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);
	}
	
/// CREATING A NEW STUDENT OBJECT
	private void createStudent(StudentDAO studentDao) {
		
		//create student object
		System.out.println("Creating a new student object ");
		Student student = new Student("Sam","Curran","sam@gmail.com");
		
		//save the student object 
		System.out.println("Saving the student object");
		studentDao.save(student);
		
		
		//display id of the saved student 
		System.out.println("displaying the saved student");
		System.out.println("Student ID = "+student.getId()
				           +", Student FirstName = "+student.getFirstName()
				           +", Student LastName = "+student.getLastName()
				           +", Student email = "+student.getEmail());
	}
}

package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

/* DAO Implementation and then we will inject the entity manager  */

@Repository
public class StudentDaoImpl implements StudentDAO{

	
	//define field for entityManager

//EntityManager : Interface used to interact with the persistence context. 

	private EntityManager entitymanager;
	
	
	
	/**
	 * 
	 */
	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	//inject entityManager using constructor
	@Autowired
	public StudentDaoImpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;				///injecting the entity manager
	}

	
	//override save() method
	@Transactional
	public void save(Student theStudent) {

//		.persist() will save the student to the database
// 		persistence means to save data somewhere reliable where it will still be there after your application terminates		
		
		entitymanager.persist(theStudent);			//it will save the object to the database
	}

	@Override
	public Student findById(Integer id)
	{
		//.find(entity class ,  primary key) ;
		return entitymanager.find(Student.class, id);
	}


	@Override
	public List<Student> findAll() {

		//create query
		TypedQuery<Student> theQuery = entitymanager.createQuery("FROM Student  ", Student.class);
		
		
		///return query results
		return theQuery.getResultList();
	}
	
	@Override
	public List<Student> findByLastName( String theLastName)
	{
		TypedQuery<Student> theQuery = entitymanager.createQuery("FROM Student WHERE lastName =:theData ", Student.class);
		
		// set query parameter
		theQuery.setParameter("theData ", theLastName);
	 	
		List<Student> al = theQuery.getResultList();
		return al;
	}


	@Override @Transactional
	public void update(Student student) {

		entitymanager.merge(student);
	}


	@Override  @Transactional
	public void delete(int id) {
		// retrieve the student
		Student thestudent = entitymanager.find(Student.class, id);
		
		//delete the student
		entitymanager.remove(thestudent);
		
	}


	@Override @Transactional
	public int deleteAll() {

		int deleterows = entitymanager.createQuery("DELETE FROM Student").executeUpdate();
		
		
		return deleterows;
	}
}

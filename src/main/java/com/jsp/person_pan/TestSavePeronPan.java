package com.jsp.person_pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePeronPan {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("yash");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//create person object
		Person person=new Person();
		person.setName("abc");
		person.setEmail("abc@mail.com");
		person.setCno(1234567890);
		
		
		//pan object 
		Pan pan=new Pan();
		pan.setAddress("abcdef");
		//setting pan with specified person
		pan.setPerson(person);
		
		
		
	}

}

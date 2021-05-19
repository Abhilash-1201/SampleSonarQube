package net.javaguides.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.javaguides.model.Faculty1;
import net.javaguides.util.HibernateUtil;

public class FacultyDAO
{
	public void saveFaculty(Faculty1 faculty) {
	Transaction transaction = null;
	try{
		Session session = HibernateUtil.getsessionFactory().openSession();
		//start the transaction
		transaction = session.beginTransaction();
		
		//save faculty object
		session.save(faculty);
		//comit the transaction
		transaction.commit();
		System.out.println("Success!!");
	}catch (Exception e) {
		if(transaction != null) {
		transaction.rollback();
		}
	}
	}
	
	//update faculty1
	
	public void Updatefaculty(Faculty1 faculty) {
		Transaction transaction = null;
		try{
			Session session = HibernateUtil.getsessionFactory().openSession();
			//start the transaction
			transaction = session.beginTransaction();
			
			//save faculty object
			session.saveOrUpdate(faculty);
			//comit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();
			}
		}
		}
	
	public Faculty1 getfacultyById(int person_id) {
		Transaction transaction = null;
		Faculty1 fact = null;
		try{
			Session session = HibernateUtil.getsessionFactory().openSession();
			//start the transaction
			transaction = session.beginTransaction();
			
			//get faculty by id
			fact = session.get(Faculty1.class, person_id);
			//comit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();
			}
		}
		return fact;
		}
	
	public List<Faculty1> getAllFaculties() {
		Transaction transaction = null;
		List<Faculty1> faculties = null;
		try{
			Session session = HibernateUtil.getsessionFactory().openSession();
			//start the transaction
			transaction = session.beginTransaction();
			
			//get faculties
			faculties = session.createQuery("from Faculty1").list();
			//comit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();
			}
		}
		return faculties;
		}
	public void Deletefaculty(int person_id) {
		Transaction transaction = null;
		try{
			Session session = HibernateUtil.getsessionFactory().openSession();
			//start the transaction
			transaction = session.beginTransaction();
			
			Faculty1 fact = session.get(Faculty1.class, person_id);
			session.delete(fact);
			
			//comit the transaction
			transaction.commit();
		}catch (Exception e) {
			if(transaction != null) {
			transaction.rollback();
			}
		}
		}
}

package net.javaguides.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.javaguides.model.Document;

import net.javaguides.util.Hibernate_doc_Util;

public class documentDAO 
{
	public void saveDocument(Document document)
	{
		Transaction transaction = null;
		try {
		Session session = Hibernate_doc_Util.getsessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(document);
		transaction.commit();
		}catch(Exception e) {
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
}

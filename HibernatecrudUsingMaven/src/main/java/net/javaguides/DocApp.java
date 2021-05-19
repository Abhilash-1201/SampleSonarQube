package net.javaguides;

import java.util.Scanner;

import net.javaguides.dao.documentDAO;
import net.javaguides.model.Document;

public class DocApp {

	public static void main(String[] args) {
		
		documentDAO document_dao = new documentDAO();
		Document document = new Document();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of documents to save");
		int docNum = sc.nextInt();
		for(int i = 1 ; i<=docNum; i++) {
		System.out.println("Enter DocName");
		String name = sc.next();
		document.setDoc_name(name);
		System.out.println("Enter Doctype");
		String docType = sc.next();
		document.setDoc_type(docType);
		document_dao.saveDocument(document);
		}
	
		
	}

}

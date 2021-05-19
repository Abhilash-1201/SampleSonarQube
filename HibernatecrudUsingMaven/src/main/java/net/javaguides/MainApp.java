package net.javaguides;

import java.util.List;
import java.util.Scanner;

import net.javaguides.dao.FacultyDAO;
import net.javaguides.dao.documentDAO;
import net.javaguides.model.Document;
import net.javaguides.model.Faculty1;

public class MainApp {

	public static void main(String[] args) {
		 
		
		
		//save faculty

		FacultyDAO dao = new FacultyDAO();
		Faculty1 fact = new Faculty1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of faculties to save");
		int facNo = sc.nextInt();
		for(int i = 1 ; i<=facNo; i++) {
		System.out.println("Enter person name");
		String person_name = sc.next();
		fact.setPerson_name(person_name);
		System.out.println("Enter person gender");
		String gender = sc.next();
		fact.setGender(gender);
		System.out.println("Enter person contact");
		String contact = sc.next();
		fact.setContact(contact);
		System.out.println("Enter person Email");
		String email = sc.next();
		fact.setEmail(email);
		dao.saveFaculty(fact);
		}
		
		
		/*//update faculty
		faculty.setPerson_name("Ramu");
		dao.Updatefaculty(faculty);
		
		//get facultyByid
		
		Faculty1 fact = dao.getfacultyById(faculty.getPerson_id());
		
		//get all faculties
		
		List<Faculty1> listfact = dao.getAllFaculties();
		listfact.forEach(Faculty -> System.out.println(Faculty.getPerson_id()));
		
		//delete faculty
		
		dao.Deletefaculty(faculty.getPerson_id());
	}*/
}
}

package net.javaguides.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Faculty1 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="p_id")
	private int person_id;
	@Column(name="p_name")
	private String person_name;
	@Column(name="p_gender")
	private String gender;
	@Column(name="p_contact")
	private String contact;
	@Column(name="p_email")
	private String email;
	public Faculty1() {
		super();
	}
	public Faculty1( String person_name, String gender, String contact, String email) {
		super();
		
		this.person_name = person_name;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Faculty1 [person_id=" + person_id + ", person_name=" + person_name + ", gender=" + gender + ", contact="
				+ contact + ", email=" + email + "]";
	}
	
	
}

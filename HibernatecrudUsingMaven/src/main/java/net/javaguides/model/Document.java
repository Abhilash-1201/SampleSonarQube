package net.javaguides.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nsas_doc")
public class Document
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="docId")
	private int doc_id;
	@Column(name="docName")
	private String doc_name;
	@Column(name="docType")
	private String doc_type;
	public Document() {
		super();
	}
	public Document( String doc_name, String doc_type) {
		super();
		
		this.doc_name = doc_name;
		this.doc_type = doc_type;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	@Override
	public String toString() {
		return "Document [doc_id=" + doc_id + ", doc_name=" + doc_name + ", doc_type=" + doc_type + "]";
	}
	
	
	
}

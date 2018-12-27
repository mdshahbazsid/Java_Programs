package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class StudentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Student_id")
	private int id;
	@Column(name="Student_name")
	private String name;
	
/*1	@ManyToOne
	private StudentAddress studentaddress;
	
	public StudentAddress getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(StudentAddress studentaddress) {
		this.studentaddress = studentaddress;
	} 1*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

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
@Table(name="Student_Address")
public class StudentAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Address_id")
	private int id;
	@Column(name="Address_details")
	private String address;
	@ManyToOne
	private StudentDetails studentdetails;
	
	public StudentDetails getStudentdetails() {
		return studentdetails;
	}
	public void setStudentdetails(StudentDetails studentdetails) {
		this.studentdetails = studentdetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

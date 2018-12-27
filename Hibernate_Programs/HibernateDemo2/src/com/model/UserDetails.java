package com.model;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="User_Details")
public class UserDetails { 
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uid")
	private int id;
	@Column(name="uname")
	private String name;
	
/*	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="hstreet")),
		@AttributeOverride(name="city",column=@Column(name="hcity")),
		@AttributeOverride(name="state",column=@Column(name="hstate")),
		@AttributeOverride(name="pincode",column=@Column(name="hpincode"))
	})
	private Address homeaddress;
	@Embedded
	private Address officeaddress;*/
	
/*	public Address getHomeaddress() {
	return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
	this.homeaddress = homeaddress;
	}
	public Address getOfficeaddress() {
	return officeaddress;
	}
	public void setOfficeaddress(Address officeaddress) {
	this.officeaddress = officeaddress;
	}*/
	
/*	@ElementCollection
	@JoinTable(name="User_Address",joinColumns=@JoinColumn(name="ID"))
	private Set<Address> listofaddress = new HashSet<>();
	
	
	public Set<Address> getListofaddress() {
		return listofaddress;
	}
	public void setListofaddress(Set<Address> listofaddress) {
		this.listofaddress = listofaddress;
	}*/
	
	@ElementCollection
	@JoinTable(name="User_Address",joinColumns=@JoinColumn(name="ID"))
	@GenericGenerator(name="mygen",strategy="sequence")
	@CollectionId(columns= {@Column(name="Add_ID")},generator="mygen",type=@Type(type="long"))
	private Collection<Address> listofaddress = new ArrayList<>();
	
	public Collection<Address> getListofaddress() {
		return listofaddress;
	}
	public void setListofaddress(Collection<Address> listofaddress) {
		this.listofaddress = listofaddress;
	}
	@Lob
	private String description;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}

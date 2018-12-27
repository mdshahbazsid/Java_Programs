package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "User_Details_2")
public class UserDetails {

	@Id
	@GeneratedValue
	@Column(name="u_id")
	private int id;
	@Column(name="u_name")
	private String name;
	
/*1	@OneToOne
	@JoinColumn(name="v_id")
	private Vehicle vehicle; 
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	} 1*/
	
	@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="u_id"),
			   inverseJoinColumns=@JoinColumn(name="v_id")
			)
	private Collection<Vehicle> listofvehicles = new ArrayList<>();
	
	public Collection<Vehicle> getListofvehicles() {
		return listofvehicles;
	}
	public void setListofvehicles(Collection<Vehicle> listofvehicles) {
		this.listofvehicles = listofvehicles;
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
}

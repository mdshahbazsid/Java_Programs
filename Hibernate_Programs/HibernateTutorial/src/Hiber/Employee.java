package Hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Table")
public class Employee {
    
	@Id
	@GeneratedValue
	private int Id;
	@Column(name="F_name")
	private String First_Name;
	@Column(name="L_name")
	private String Last_Name;
	@Column(name="Sal")
	private int Salary;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Salary=" + Salary
				+ "]";
	}
	
}

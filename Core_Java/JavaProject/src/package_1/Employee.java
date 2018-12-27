package package_1;

import java.util.Scanner;

public class Employee {
	
	int empId;
	String empName;
	int empSalary;
	
	 static int totalSalary;
	
	public Employee() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee ID : ");
		empId=sc.nextInt();
		System.out.print("Enter Employee Name : ");
		empName=sc.next();
		System.out.print("Enter Employee Salary : ");
		empSalary=sc.nextInt();
		
		totalSalary = totalSalary + empSalary;
		
	}
	public void dispalyEmployeeDetails() {
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSalary);
	}
	public static  int displayTotalSalary() {
		return totalSalary;
	}
}


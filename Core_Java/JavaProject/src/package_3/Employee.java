package package_3;

public class Employee implements Comparable<Employee> {


	int empId;
	String empName;
	int salary;
	
	public Employee(int eid,String ename,int salary)
	{
		empId=eid;
		empName=ename;
		this.salary=salary;
	}
	
	@Override
	public int compareTo(Employee arg0) {
		
		if(this.salary>arg0.salary)
			return 1;
		else if(this.salary<arg0.salary)
			return -1;
		else
			return 0;
	}
	
}

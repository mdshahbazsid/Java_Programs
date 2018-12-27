package package_3;

import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
        TreeSet<Employee> empColl=new TreeSet<Employee>();
		
		empColl.add(new Employee(1001,"Suresh",31000));
		empColl.add(new Employee(1003,"Ritesh",45000));
		empColl.add(new Employee(1002,"Nitish",35000));
		
		for(Employee employee:empColl)
		{
			System.out.println(employee);
		}

	}

}

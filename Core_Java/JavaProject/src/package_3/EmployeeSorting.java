package package_3;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorting {

	public static void main(String[] args) {
		
        ArrayList<Employee> empColl=new ArrayList<Employee>();
		
		empColl.add(new Employee(1002,"Suresh",45000));
		empColl.add(new Employee(1001,"Vinod",31000));
		empColl.add(new Employee(1004,"Wasim",38000));
		
		//SalarySort objSalarySort=new SalarySort();
		
		EmployeeNameSort objEmpNameSort=new EmployeeNameSort();
		
		Collections.sort(empColl,objEmpNameSort);
		
		for(Employee employee:empColl)
		{
			System.out.println(employee);
		}

	}

}

package package_3;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		if(arg0.salary>arg1.salary)
			return 1;
		else if(arg0.salary<arg1.salary)
			return -1;
		else
			return 0;
	}

	
}

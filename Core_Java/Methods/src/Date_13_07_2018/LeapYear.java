package Date_13_07_2018;
import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    
    LeapCheck obj=new LeapCheck();
    System.out.print("Enter the Year : ");
	int year;
	obj.getLeap(year=sc.nextInt());
	}
}

 class LeapCheck{
	 
	boolean leap=false;
	
	void getLeap(int year) {
		if(year%4==0) 
		{
			if(year%100==0)
			{
				if(year%400==0) 
					leap=true;
			    else
				    leap=false;
			}
			else
				leap=true;
		}
		else 
			leap=false;
		if(leap)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is a not a leap year");
	}
}
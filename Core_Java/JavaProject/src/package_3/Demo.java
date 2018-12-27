package package_3;

import java.util.Scanner;

public class Demo {
	

	 

	public static void main(String arg[]) {
		
		    
		        int num, i, count=0;
		        Scanner scan = new Scanner(System.in);
				
		        System.out.print("Enter a Number : ");
		        num = scan.nextInt();
				
		        for(i=2; i<num; i++)
		        {
		            if(num%i == 0)
		            {
		                count++;
		                break;
		            }
		        }
		        if(count == 0)
		        {
		            System.out.print("This is a Prime Number");
		        }
		        else
		        {
		            System.out.print("This is not a Prime Number");
		        }
		    
    
    
}
}

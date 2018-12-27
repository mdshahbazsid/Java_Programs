package Date_19_07_2018;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.s : ");
    int num1=sc.nextInt();
	int num2=sc.nextInt();
	int x;
       while(num2 != 0)
       {
    	   x=num2;
    	   num2 = num1%num2;
    	   num1=x;
       }
       int hcf=num1;
       System.out.println("HCF = "+hcf);
	}

}

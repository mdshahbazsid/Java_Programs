package Date_17_07_2018;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calc obj=new Calc();
		obj.print("Enter the Ist no. : ");
		int s1=sc.nextInt();
		obj.print("Enter the IInd no. : ");
		int s2=sc.nextInt();
		obj.print("\tEnter your Choise\n1.Addition\n2.Subtaction\n3.Multiply\n4.Divide\n");
		int choise=sc.nextInt();
		switch(choise)
		{
		      case 1:obj.sum(s1,s2);
		      break;
		      case 2:obj.sub(s1,s2);
		      break;
		      case 3:obj.multiply(s1,s2);
		      break;
		      case 4:obj.divide(s1,s2);
		      break;
		}
		
	}

}

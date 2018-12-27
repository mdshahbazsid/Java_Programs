package Date_13_07_2018;
import java.util.Scanner;
public class SmallestNumSearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.s : ");
	System.out.print("Num1 : ");
    int num1=sc.nextInt();
    System.out.print("Num2 : ");
    int num2=sc.nextInt();
    System.out.print("Num3 : ");
    int num3=sc.nextInt();
    Num obj=new Num();
    obj.searchNum(num1, num2, num3);
	}

}
class Num{

	void searchNum(int num1,int num2,int num3){
	if((num1>num2)&&(num1>num3))
	    System.out.println("Num1 is greater");
	if((num2>num1)&&(num2>num3))
		System.out.println("Num2 is greater");
	if((num3>num1)&&(num3>num2))
		System.out.println("Num3 is greater");
	
	}	

}
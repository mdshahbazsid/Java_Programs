package Date_02_07_2018;
import java.util.Scanner;
public class Cw {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter any positive integer");
	int i=sc.nextInt();
	int s=0;
	while(i>0)
	{
	 s=s+(i%10);
	 i=i/10;
	}
	System.out.println(s);
	}
   
}

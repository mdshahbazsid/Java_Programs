package Date_02_07_2018;
import java.util.Scanner;
public class DecToOct {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Decimal Number");
    int i=sc.nextInt();
    String rem="";
    while(i!=0)
    {
    	rem=(i%8)+rem;
    	i=i/8;
    }
    System.out.println(rem);
    
	}

}


package Date_10_07_2018;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest1 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String s=sc.nextLine();
	 Boolean b= Pattern.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,4}",s);
	 System.out.print(b);
	}

}

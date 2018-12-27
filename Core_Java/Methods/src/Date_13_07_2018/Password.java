package Date_13_07_2018;

import java.util.regex.Pattern;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your password : ");
	String pass;
	PasswordMatch obj=new PasswordMatch();
	obj.getPass(pass=sc.nextLine());

	}
}
class PasswordMatch{
	void getPass(String pass)
	{
		Boolean b= Pattern.matches("[0-9]{2,10}[A-Za-z]{4,10}",pass);
		System.out.println(b);
	}
}
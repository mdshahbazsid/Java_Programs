package Date_02_07_2018;
import java.util.Scanner;
public class RectArea{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any  Number/Word to performe Palindrome test");
	String s=sc.nextLine();
	int i=s.length();
	String s2="";
	int j;
	for(j=i-1;j>=0;--j)
	{		
		s2=s2+s.charAt(j);
		
	}
	   System.out.println(s2);
	   if(s2.compareTo(s)==0)
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("Fail");
	   }
      
    } 
}
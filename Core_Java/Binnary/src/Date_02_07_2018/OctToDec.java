package Date_02_07_2018;
import java.util.Scanner;
public class OctToDec {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter octal no.");
    String s=sc.nextLine();
    StringBuffer str=new StringBuffer(s);
    String st=str.reverse().toString();
    int j,k=0;
    for(j=0;j<st.length();++j)
    {
    	int x=Integer.parseInt(str.substring(j,j+1));
    	k=k+((int)Math.pow(8,j)*x);
 
   }
    System.out.println(k);
    }

	}


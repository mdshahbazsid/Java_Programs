import java.util.Scanner;
import java.util.Arrays;
public class ArrayTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
    System.out.print("Enter the length of Array = ");
    String i=sc.nextLine();
    String num []=new String[Integer.parseInt(i)];
    for(int j=0;j<num.length;++j)
    {
    	System.out.println("Enter no. which you want to enter in array");
    	String k=sc.nextLine();
    	num[j]=k;
    }
    System.out.println("Array is : "+Arrays.toString(num));
    //Swapping 1st and last no. in array
    System.out.println("Array after swaping 1st and last no. is : ");
    String s1=num[0];
    String s2=num[num.length-1];
    num[0]=s2;
    num[num.length-1]=s1;
    System.out.println("Array is : "+Arrays.toString(num));
   	}
 
}

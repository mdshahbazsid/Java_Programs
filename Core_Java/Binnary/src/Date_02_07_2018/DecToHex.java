package Date_02_07_2018;
import java.util.Scanner;
public class DecToHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.print("Enter a decimal number: ");
        int i= sc.nextInt();
        int j;
        String s="";
		 while(i>0)
        {
            j = i%16;
            s = hex[j]+s;
            i = i/16;
        }
        System.out.print("Hexadecimal number is : "+s);  

	}

}

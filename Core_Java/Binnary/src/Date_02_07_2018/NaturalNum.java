package Date_02_07_2018;
import java.util.Scanner;
public class NaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. b/w 1 to infinity");
		int i=sc.nextInt();
		int j,sum=0;
		System.out.println("No.s are");
		for(j=1;j<=i;++j) {
			sum=sum+j;
			System.out.println(j);
			
		}
		
		System.out.println("sum is : "+sum);		
        sc.close();
	}

}

package Date_02_07_2018;
import java.util.Scanner;
public class BinaryAddition {
	
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			        System.out.println("Enter 1st binary no.");
	                String s1=sc.nextLine();
	                System.out.println("Enter 2nd binary no.");
	                String s2=sc.nextLine();		
			StringBuffer str1=new StringBuffer(s1);
	                StringBuffer str2=new StringBuffer(s2);
			String rev1=str1.reverse().toString();
	                String rev2=str2.reverse().toString();
	                
			        System.out.println("reverse of 1st no. "+rev1);
	                System.out.println("reverse of 2nd no. "+rev2);
			int d=0;
			for(int i=0;i<rev1.length();i++){
				if(rev1.charAt(i)=='1'){
					d=d+(int)Math.pow(2,i);
				}
			}
			System.out.println("Decimal Number of 1st : "+d);
			int c=0;
			for(int j=0;j<rev2.length();j++){
				if(rev2.charAt(j)=='1'){
					c=c+(int)Math.pow(2,j);
				}
			}
			System.out.println("Decimal Number of 2nd : "+c);
	                System.out.println("Decimal no. after add : "+(c+d));
	                int x=c+d;
	                String bin="";
	                while(x!=0){
	                   bin=(x%2)+bin;
	                   x=x/2;
	                }
		       System.out.println("binary no. after addition is = "+bin);
	         }
	}


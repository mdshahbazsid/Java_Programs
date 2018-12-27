package Date_02_07_2018;

import java.util.Arrays;
import java.util.Scanner;

public class hex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary no.");
		String s1 = sc.nextLine();

		int l = s1.length();

		System.out.println(l % 4);
		for (int i = 1; i <= l % 4; i++) {
			s1 = '0' + s1;
		}

		StringBuffer str1 = new StringBuffer(s1);
		String rev1 = str1.reverse().toString();
		System.out.println("reverse of no. is " + rev1);
		
		String srr[]=new String[l%4];
		int b=0;
		int e=b+4;
		for(int i=0;i<srr.length;i++) {
			
			
			srr[i]=rev1.substring(b, e);
			
			b=b+4;
			e=e+4;
		}
		
		for(int i=srr.length-1;i>=0;i--) {
			int d=0;
			for(int j=0;j<srr[i].length();j++){
				if(srr[i].charAt(j)=='1'){
					d=d+(int)Math.pow(2,j);
				}
			}
			if(d>9) {
				switch(d) {
				case 10:System.out.print("A");
				break;
				case 11:System.out.print("B");
				break;
				case 12:System.out.print("C");
				break;
				case 13:System.out.print("D");
				break;
				case 14:System.out.print("E");
				break;
				case 15:System.out.print("F");
				}
			}
			else {
				System.out.print(d);
			}
			
		}
		
		sc.close();
		
	}
}

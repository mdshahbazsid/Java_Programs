import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String temp="";
		int p=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				
				temp=temp+s.charAt(p)+".";
				
				p=i+1;
			}
		}
		System.out.println(temp.toUpperCase()+s.substring(p,p+1).toUpperCase()+s.substring(p+1).toLowerCase());
	}

}

package Date_13_07_2018;
import java.util.Scanner;
public class MiddleCharacter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Sentence : ");
	String sen=sc.nextLine();
	MiddleChar obj=new MiddleChar();
	obj.checkchar(sen);
	VowelCheck obj1=new VowelCheck();
    obj1.checkvowel(sen);
    CountWords obj2=new CountWords();
    obj2.wordcount(sen);
	}

}

class MiddleChar{
	
	void checkchar(String s)
	{
		int length=s.length();
		int i=length/2;
		int j=length%2;
		if(j==0)
		{
			System.out.println("Middle characters are : "+s.charAt(i-1)+s.charAt(i));	
		}
		else
		{
			System.out.println("Middle character is : "+s.charAt(i));
		}
	}
}
class VowelCheck{
	void checkvowel(String s)
	{   
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				count=count+1;
			}
			
		}
		System.out.println("No.of Vowels are : "+count);
	}
}
class CountWords{
	void wordcount(String s) 
	{   
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count=count+1;
			}
		}
		System.out.println("No.of Words in the Sentence = "+(count+1));
	}
}
package package_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		
		String str="I am in best in performance. bust";
		Pattern pattern=Pattern.compile("b.st");
		Matcher match=pattern.matcher(str);
		
//		if(match.find())
//		System.out.println("Pattern found");
//		
//		else
//			System.out.println("Pattern Not Found");
		
		while(match.find())
		{
			System.out.println(match.group());
		}
		

	}

}

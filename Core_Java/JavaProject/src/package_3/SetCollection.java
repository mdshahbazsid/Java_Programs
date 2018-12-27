package package_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCollection {

	public static void main(String[] args) {
	
		HashSet hs = new HashSet();
		
		hs.add("Mohit");
		hs.add("Bhuwika");
		hs.add("Shashank");
		hs.add("Mohit");
		hs.add(789);
		
		System.out.println("HashSet is : "+hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("Mohit");
		lhs.add("Zeeshan");
		lhs.add(999);
		lhs.add("Shaar");
		lhs.add("Mohit");
		
		System.out.println("HashSet is : "+lhs);
		
		TreeSet ts=new TreeSet();
		
		ts.add("Mohit");
		ts.add("Shabaz");
//		ts.add(908);
		ts.add("Jagran");
		ts.add("Mohit");
		
		System.out.println("HashSet is : "+ts);

	}

}

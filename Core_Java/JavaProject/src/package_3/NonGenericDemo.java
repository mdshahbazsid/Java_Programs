package package_3;

import java.util.ArrayList;

public class NonGenericDemo {

	public static void main(String arg[])
	{
		
		ArrayList listItem=new ArrayList();
		
		listItem.add("Sudhir");
		listItem.add("Anirudh");
		listItem.add("Punitha");
		
		Integer intrObj=(Integer)listItem.get(1); //Runtime error encounters
		
		System.out.println(intrObj);
		
	}	
}

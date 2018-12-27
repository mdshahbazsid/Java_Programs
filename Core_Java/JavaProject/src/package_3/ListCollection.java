package package_3;

import java.util.ArrayList;

public class ListCollection {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		
		list.add("Suneel");
		list.add("Abhishek");
		list.add("Kartik");
		list.add(5999);
		list.add("Shristi");
		list.add("Kunal");
		list.add(678);
		list.add(890);
		list.add(4,999);
		
		System.out.println(list);
		
		for (Object elm:list)
		{
			if(elm instanceof String)
			{
				String myString=(String) elm;
				System.out.println("String Elemnt : "+myString);
			}
			else
			{
				Integer myInt=(Integer) elm;
				System.out.println("Integer Element : "+myInt);
			}
		}
		System.out.println("Collection Size:"+list.size());
		list.remove(3);
		System.out.println(list);
		
		list.remove("Kartik");
		System.out.println(list);
		
        ArrayList list1=new ArrayList();
		
		list1.add("Dhanish");
		list1.add("Praveen");
		
        list.addAll(list1);
		
		System.out.println(list);
		
		if(list.contains(678))
		{
			System.out.println("678 object is there:");
		}
		else
		{
			System.out.println("678 object is not there:");
		}
		
	}

}

package package_1;

public class StaticVariableDemo 
{
	static int var1;
	
	int var2;
	
	public StaticVariableDemo()
	{
		var1++;
		var2++;
	}
	
	public static void main(String arg[])
	{
		StaticVariableDemo obj1=new StaticVariableDemo();
		
		StaticVariableDemo obj2=new StaticVariableDemo();
		
		StaticVariableDemo obj3=new StaticVariableDemo();
		
		System.out.println("Instance Variable for Object3 var2:"+obj3.var2);
		
		System.out.println("Static Variable for Object3 var1:"+obj3.var1);
		
	}
}

package Date_13_07_2018;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(fact(5));

		

	}
	/*static void loop(int i) {
		if(i<=10) {
			System.out.println(i);
			loop(++i);
		}
	}*/
	// Factorial test;
	static int fact(int i)
	{
		if(i==0) 
		{
			return 1;
		}
		else 
		{
			return i*fact(i-1);
		}	
	}
	
}

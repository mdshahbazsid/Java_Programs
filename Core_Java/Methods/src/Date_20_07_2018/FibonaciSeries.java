package Date_20_07_2018;

public class FibonaciSeries {

	public static void main(String[] args) {
    loop(0);
    
	}

   static int fibonaci(int n)
    {  
	   if(n==0 || n==1)
    		return n;
    	else
    		return fibonaci(n-1)+fibonaci(n-2); 	
    }
   static void loop(int n)
   {
	   if(n<=10)
	   {
		   System.out.print(fibonaci(n)+",");
		   loop(++n);
	   }
   }
   
}
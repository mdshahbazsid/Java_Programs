package Date_13_07_2018;

public class PrimeCheck {

	public static void main(String[] args) {
    
    for(int a=2;a<100;a++)
    {
       if((PrimePair1.prime(a)==true)&&(PrimePair1.prime(a+2)==true))
    		   {
    	            System.out.println("("+a+","+(a+2)+")");
    		   }
    }

    }
}
class PrimePair1{
	static Boolean prime(int p) 
	{
        for(int i=2;i<p;i++) 
        {  
        	if(p%i==0)
        		return false;
        }
        return true;
	}	
}

package Date_13_07_2018;

public class PrimeNum {

	public static void main(String[] args) {
		System.out.println("Prime no.s are :");
        PrimePair obj=new PrimePair();
	}

}
class PrimePair{
	void prime(int p) {
        for(int i=2;i<100;i++)
        {   
        	int count=0;
        	for(int j=2;j<i;j++)
        	{
        		if(i%j==0)
        		{
        			count++;
        		}			
        	}
        	if(count==0)
    		{
    			System.out.print(i+" ");
    		}
        	
        }
	}
}
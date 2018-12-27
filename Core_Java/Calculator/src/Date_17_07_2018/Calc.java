package Date_17_07_2018;

public class Calc implements printInterface {
    @Override   
	public void print(String s) {
    	   System.out.print(s);
       }
    public void sum(int a,int b)
    {
    	this.print("Addition = "+(a+b));
    }
    public void sub(int a,int b)
    {
    	this.print("Difference = "+(a-b));
    }
    public void multiply(int a,int b)
    {
    	this.print("Product = "+(a*b));
    }
    public void divide(int a,int b)
    {
    	try  
    	{
    		this.print("Division = "+(a/b));
    	}
    	catch(ArithmeticException ae)
    	{
    	    this.print("infinity");	
    	}
    }
    
}

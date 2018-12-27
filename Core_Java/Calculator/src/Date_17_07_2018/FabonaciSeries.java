package Date_17_07_2018;

public class FabonaciSeries implements printInterface {
    @Override  
	public void print(String s){
    	System.out.print(s);
    }
    public void Series()
      {   
   	      int a=0,b=1;
   	      this.print(a+","+b);
   	      for(int i=3;i<10;i++)
           	 {
   		         int c=a+b;
   		         this.print(","+c);
   		         a=b;
   		         b=c;
   	         }
      } 
}

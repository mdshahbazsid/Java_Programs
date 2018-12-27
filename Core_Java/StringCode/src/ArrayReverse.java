import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of Array = ");
    int i=sc.nextInt();
    int arr1[]= new int[i];
    for(int l=0;l<arr1.length;l++)
    {
    	System.out.print("Enter number : ");
        int k=sc.nextInt();
    	arr1[l]=k;
    }
    System.out.println(Arrays.toString(arr1));
    //Reversing the Array
    
    /*int arr2[]=new int[i];
    for(int x=0;x<arr1.length;x++)
    {
    	arr2[x]=arr1[i-1];
    	i--;
    }
    System.out.println(Arrays.toString(arr2));
    //Repeating of no.
    
    for(int x=0;x<arr1.length-1;x++)
    {
    	for(int b=x+1;b<arr1.length;b++)
    	{
    		if(arr1[x]==arr1[b])
    		{  
    			System.out.println(arr1[b]+"repeats");
    		   
    		}	 	
        }
    }*/
   //Checking common no.
    
    int arr2[]= new int[i];
    for(int l=0;l<arr1.length;l++)
    {
    	System.out.print("Enter number : ");
        int k2=sc.nextInt();
    	arr2[l]=k2;
    }
    System.out.println(Arrays.toString(arr2));
    for(int x=0;x<arr1.length;x++)
    {
    	for(int b=0;b<arr2.length;b++)
    	{
    		if(arr1[x]==arr2[b])
    		{
    		   System.out.println("Number which are common to both arrays : "+arr1[x]);
    		   break;  
    		}	
    	}	
    }
    
	}
}
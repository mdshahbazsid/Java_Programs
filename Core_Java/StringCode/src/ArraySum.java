import java.util.Scanner;
import java.util.Arrays;
public class ArraySum {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of Array = ");
    int i=sc.nextInt();
    int arr[]= new int[i];
    int sum=0;
    for(int l=0;l<arr.length;l++)
    {
    	System.out.println("Enter number : ");
        int k=sc.nextInt();
    	arr[l]=k;
    	sum=sum+k;
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Enter your choise num. = ");
    int j=sc.nextInt();
    for(int x=0;x<arr.length;x++)
    {
    	if(j==arr[x])
    	{
    		System.out.println("True");    		
       	}
    	
    }
    
    System.out.println("Sum of Arrays Elements = "+sum);
    System.out.println("Avg of Arrays Elements = "+(double)sum/i);

	}
	
}

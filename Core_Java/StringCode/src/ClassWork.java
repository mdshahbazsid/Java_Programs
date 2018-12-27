import java.util.Arrays;
import java.util.Scanner;
public class ClassWork {

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
    for(int x=0;x<arr1.length;x++)
    {
    	for(int b=x+1;b<arr1.length;b++)
    	{
    		if((arr1[x]==arr1[b])&&(x!=b))
    		{
    			System.out.println(arr1[x]);
    		
    		}
    	}
    }
	}
}
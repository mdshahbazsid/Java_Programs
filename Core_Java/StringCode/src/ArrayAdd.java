import java.util.Arrays;
import java.util.Scanner;
public class ArrayAdd {

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
    int arr2[]= new int[i];
    for(int l=0;l<arr2.length;l++)
    {
    	System.out.print("Enter number : ");
        int j=sc.nextInt();
    	arr2[l]=j;
    }
    System.out.println(Arrays.toString(arr2));
    System.out.println("After multiplication");
    for(int x=0;x<arr1.length;x++) 
    {
    	int m=arr1[x]*arr2[x];
    	System.out.print(m+",");
    	
    }
    
	}

}

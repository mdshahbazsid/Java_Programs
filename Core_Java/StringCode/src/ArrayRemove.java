import java.util.Scanner;
import java.util.Arrays;
public class ArrayRemove {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of Array = ");
    int i=sc.nextInt();
    int arr1[]= new int[i];
    int l;
    for(l=0;l<arr1.length;l++)
    {
    	System.out.print("Enter number : ");
        int k=sc.nextInt();
    	arr1[l]=k;
    }
    System.out.println(Arrays.toString(arr1));
    System.out.println("Enter the index no. of element which you want to remove");
    int j=sc.nextInt();
    int arr2[]=new int[i-1];
    for(int h=j;h<arr1.length-1;h++)
    {
        arr1[h]=arr1[h+1];
        
    }
    arr2=Arrays.copyOf(arr1,i-1);
    System.out.println(Arrays.toString(arr2));
    }

}

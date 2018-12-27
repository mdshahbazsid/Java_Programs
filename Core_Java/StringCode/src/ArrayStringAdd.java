import java.util.Scanner;
import java.util.Arrays;
public class ArrayStringAdd {

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
    
    System.out.print("Enter the index no. of element to which you want to add number : ");
    int j=sc.nextInt();
    System.out.print("Enter no. which you want to add : ");
    int n=sc.nextInt();
    int arr2[]=new int[i+1];
    arr2=Arrays.copyOf(arr1,i+1);
    int arr3[]=arr2;
    for(int x=j;x<=arr1.length-1;x++)
    {
    	arr3[x+1]=arr1[x];
    }
    arr3[j]=n;
    System.out.println(Arrays.toString(arr3));
    }

}


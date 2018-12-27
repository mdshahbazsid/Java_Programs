import java.util.Arrays;
import java.util.Scanner;
public class ArraySearch {

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
    /*Arrays.sort(arr1);
    int brr[]=new int[arr1.length];
    int k=0;
    for(int a=0;a<arr1.length;a++) {
    	if(Arrays.binarySearch(brr, arr1[a])<0) {
    		brr[k]=arr1[a];
    		
    		int count=1;
    		for(int x=0;x<arr1.length;x++) {
    			if(a!=x) {
    				if(arr1[x]==arr1[a]) {
    					count++;
    				}
    			}
    		}
    		k++;
    		if(count>1)
    		System.out.println(arr1[a]+" Repeats "+count+" times");
    	}
    }*/
    for(int x=0;x<arr1.length-1;x++) 
    {
    	for(int x1=x+1;x1<arr1.length;x1++)
    	{
    		if(arr1[x]==arr1[x1])
    		{   
    			System.out.println(arr1[x1]);
    		}
    		break;
    	}
    }
    }
}
import java.util.Scanner;
import java.util.Arrays;
public class Demo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
    System.out.print("Enter the length of Array = ");
    String i=sc.nextLine();
    int num []=new int[Integer.parseInt(i)];
    for(int j=0;j<num.length;++j)
    {
    	System.out.println("Enter no. which you want to enter in array");
    	int k=sc.nextInt();
    	num[j]=k;
    }
    System.out.println("Array is : "+Arrays.toString(num));
    
 //<Rotation of Array From Left to Right>
    int temp=0;
    for(int l=0;l<num.length;l++)
    {
    	if(l-1==-1) 
    	{
    		temp=num[l];
    		num[l]=num[num.length-1];
    		num[num.length-1]=temp;
    		continue;
    	}
    	temp=num[l-1];
		num[l-1]=num[l];
		num[l]=temp;
    }
    int l=num.length-1;
    num[l]=num[l]^num[l-1];
	num[l-1]=num[l]^num[l-1];
	num[l]=num[l]^num[l-1];
    System.out.println("New Array is : "+Arrays.toString(num));
	}
    	
}
package Date_10_07_2018;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of rows : ");
        int r=sc.nextInt(); 
        System.out.print("Enter the no. of coloumn : ");
        int c=sc.nextInt();
        System.out.println("Matrix order = "+r+"x"+c);
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
        	System.out.println("Enter the no.s in rows");
        	for(int j=0;j<c;j++)
        	{
        		int x=sc.nextInt();
        		arr[i][j]=x; 
        		System.out.print(" ");
        	}
        	
        }
        System.out.println(Arrays.toString(arr));
	}

}

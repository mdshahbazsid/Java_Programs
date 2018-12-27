package Date_13_07_2018;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the no. of rows in matrix : ");
	int r=sc.nextInt();
	System.out.print("Enter the no. of column in matrix : ");
	int c=sc.nextInt();
	System.out.println("Matrix Order = "+r+" x "+c);
	int arr[][]=new int[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			arr[i][j]=1;
			System.out.print(arr[i][j]+" ");	
		}
		System.out.println();
	}
	
	}

}

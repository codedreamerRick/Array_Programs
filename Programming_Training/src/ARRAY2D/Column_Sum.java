package ARRAY2D;

import java.util.Arrays;
import java.util.Scanner;

public class Column_Sum {

//					addition of all the elements in each column
	
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int n=sc.nextInt();
		int a[][]=new int[n][3];
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter the elements of row "+(i+1));
			for (int j = 0; j < a[i].length; j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) 
		{
			int sum=0;
			for (int j = 0; j < n; j++) 
			{
				sum+=a[j][i];
			}	
			System.out.print(sum+" ");
		}

	}
}

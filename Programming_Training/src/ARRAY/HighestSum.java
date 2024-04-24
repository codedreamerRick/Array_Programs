package ARRAY;

import java.util.Scanner;

public class HighestSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the 1st array elements ");
		for(int i = 0 ; i < size ; i++) 
		{
			 a[i] = sc.nextInt();
		}
		int sum1 = 0;
		for( int i = 0 ; i < a.length ; i++) 
		{
			for( int j = i+1 ; j < a.length ; j++) 
			{
				int sum = a[i] + a[j];
				if(sum > sum1)
				{
					sum1 = sum;
				}
			}
		}
		System.out.println("Sum => "+sum1);
	}
}

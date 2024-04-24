package DSA_College_Training;

import java.util.Scanner;

public class Array_Deletion_Last {

//				delete an element from last position
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++) 
		{
			a[i] = s.nextInt();
		}
		System.out.println("Array elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nNew array elements are:");
		for (int i = 0; i < size-1; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

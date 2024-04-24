package DSA_College_Training;

import java.util.Scanner;

public class Array_Deletion_Given_index {

//				delete an element from given position	
	
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
		System.out.println("\nEnter the position of deletion");
		int pos = s.nextInt();
		if(pos > 0 && pos < size)
		{
			for (int i = pos-1; i < size-1; i++) 
			{
				a[i] = a[i+1]; 
			}
			size--;
			System.out.println("New array elements are:");
			for (int i = 0; i < size; i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
		else
		{
			System.out.println("Invalid position");
		}
	}
}

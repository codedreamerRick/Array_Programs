package DSA_College_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Insertion_Given_Position {

//			inserting an element at given position
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int [] a = new int [size +1];
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++) 
		{
			a[i] = s.nextInt();
		}
//		System.out.println(Arrays.toString(a));
		System.out.println("Array elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the element to be inserted");
		int ele = s.nextInt();
		System.out.println("Enter the position of insertion");
		int pos = s.nextInt();
		if(pos > 0 && pos < size)
		{
			for (int i = size-1; i >= pos-1; i--) 
			{
				a[i+1] = a[i]; 
			}
			a[pos-1] = ele;
			size++;
			System.out.println("New array elements are:");
			for (int i = 0; i < size; i++) 
			{
				System.out.print(a[i]+" ");
			}
		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
}

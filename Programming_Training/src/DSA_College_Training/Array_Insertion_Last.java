package DSA_College_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Insertion_Last {

//				inserting an element at last position	
	
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
		System.out.println("The array elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the element to be inserted at last");
		int ele = s.nextInt();
		a[size] = ele;
		size++;
//		System.out.println(Arrays.toString(a));
		System.out.println("New array elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

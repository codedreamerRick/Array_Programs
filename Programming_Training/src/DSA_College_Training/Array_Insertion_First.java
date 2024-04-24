package DSA_College_Training;

import java.util.Scanner;

public class Array_Insertion_First {

//				inserting an element at first position
	
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
		System.out.println("Array elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter the element to be inserted at begining");
		int ele = s.nextInt();
		for (int i = size-1; i >= 0; i--) 
		{
			a[i+1] = a[i]; 
		}
		a[0] = ele;
		size++;
//		System.out.println(Arrays.toString(a));
		System.out.println("New array elements are:");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

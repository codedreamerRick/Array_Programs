package SVIT_COLLEGE;

import java.util.Arrays;
import java.util.Scanner;

public class Array_INsertion_Begining {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enetr the size of an array to be created");
		int size = s.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = s.nextInt();
		}
		int [] b = new int [a.length +1];
		int j=  0;
		System.out.println("Enter the elements to be inserted...");
		int ele = s.nextInt();
		b[0] = ele;
		for (int i = 1; i < b.length; i++) 
		{
			{
				b[i] = a[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}


package SVIT_COLLEGE;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {

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
		System.out.println(Arrays.toString(a));
	}
}

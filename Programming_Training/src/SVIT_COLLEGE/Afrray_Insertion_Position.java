package SVIT_COLLEGE;

import java.util.Arrays;
import java.util.Scanner;

public class Afrray_Insertion_Position {

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
		System.out.println("The array ele,ments are...");
		System.out.println(Arrays.toString(a));
		int [] b = new int [a.length -1];
		System.out.println("Enter the position to be deleted...");
		int pos = s.nextInt();
		int j=  0;
		for (int i = 0; i < a.length; i++) 
		{
			if(i != pos-1)
			{
				b[j] = a[i];
				j++;
			}

		}
		System.out.println(Arrays.toString(b));
	}
}

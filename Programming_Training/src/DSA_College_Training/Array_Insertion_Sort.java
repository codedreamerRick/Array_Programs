package DSA_College_Training;

import java.util.Arrays;

public class Array_Insertion_Sort {

//							insertion sort	
	
	public static void main(String[] args) 
	{
		int [] a = {55,44,11,9};
		for (int i = 1; i < a.length; i++) 
		{
			int temp = a[i];
			int j = i-1;
			while(j >= 0 && temp < a[j])
			{
					a[j+1] = a[j];
					j--;
			}
			a[j+1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}

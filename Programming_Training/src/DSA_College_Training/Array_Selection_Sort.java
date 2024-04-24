package DSA_College_Training;

import java.util.Arrays;

public class Array_Selection_Sort {

//						selection sort
	
	public static void main(String[] args) 
	{
		int [] a = {65,7,1,69};
		for (int i = 0; i < a.length-1; i++) 
		{
			int min = i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			if(i != min)
			{
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

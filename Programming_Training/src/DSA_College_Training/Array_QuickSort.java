package DSA_College_Training;

import java.util.Arrays;

public class Array_QuickSort {

//							quick sort
	
	public static void main(String[] args) 
	{
		int [] a = {91,55,25,1,2,95};
		int lb = 0, ub = a.length-1;
		quickSort(a, lb, ub	);
		System.out.println(Arrays.toString(a));
	}
	static void quickSort(int a[] , int lb, int ub )
	{
		if(lb < ub)
		{
				int loc = partition(a, lb, ub);
				quickSort(a, lb, loc-1);
				quickSort(a, loc+1, ub);
		}
	}
	static int partition(int a[] , int lb, int ub)
	{
			int pivot = a[lb];
			int si = lb, ei = ub;
			while(si < ei)
			{
				while(a[si] <= pivot)
				{
					si++;
				}
				while(a[ei] > pivot)
				{
					ei--;
				}
				if(si < ei)
				{
					int temp = a[ei];
					a[ei] = a[si];
					a[si] = temp;
				}
				else
				{
					int temp = a[ei];
					a[ei] = a[lb];
					a[lb] = temp;
				}
			}
			
		return ei;
	}
}

package ARRAY;

import java.util.Arrays;

public class Even_Ascending_Odd_Descending_Same_Array {

	public static void main(String[] args) 
	{
		int [] a = {11,17,19,1,3,2,9,18,24};
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		int temp = 0;
		int findex = 0,lindex = a.length-1;
			for (int i = 0; i < a.length-1; i++) 
			{
				if(findex != lindex)
				{
					if(a[findex] % 2 == 1)
					{
						if(a[lindex] % 2 == 0)
						{
							temp = a[findex];
							a[findex] = a[lindex];
							a[lindex] = temp;
							findex++;
						}
						lindex--;
					}
					else if (a[findex] % 2 == 1 && a[lindex] % 2 == 1 && a[findex + 1] % 2 == 1)
					{
						findex++;
						lindex--;
					}
					else
					{
						findex++;
						lindex--;
					}
				}
				else
				{
					break;
				}
			}
		int k;
		for ( k = 0; k < a.length; k++)
		{
			if(a[k] % 2 != 0 )
			{
				break;
			}
		}
		for (int i = 0; i < k-1; i++)
		{
			for (int j = 0; j < k-1; j++)
			{
				if( a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
				for (int i = k; i < a.length-1; i++)
				{
					for (int j = k; j < a.length-1; j++)
					{
						if( a[j] < a[j+1])
						{
							temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
					}
				}
		System.out.println(Arrays.toString(a));
	}
}

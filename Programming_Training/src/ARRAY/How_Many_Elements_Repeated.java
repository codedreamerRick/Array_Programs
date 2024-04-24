package ARRAY;

import java.util.ArrayList;

public class How_Many_Elements_Repeated {

	public static void main(String[] args) 
	{
		int [] a = {2,3,2,2,4,5,3,3};
		ArrayList a1 = new ArrayList();
		int c = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if(! a1.contains(a[i]))
			{
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[i] == a[j])
					{
						c++;
						a1.add(a[i]);
						break;
					}
				}
			}
		}
		System.out.println(c+" elements are repeated");
	}
}

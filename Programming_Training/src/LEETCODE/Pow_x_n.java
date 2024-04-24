package LEETCODE;

public class Pow_x_n {

//	public static void main(String[] args) 
//	{
//		int n = 2147483647;
//		int n1 = 0;
//		if(n < 0)
//		{
//			 n1 = n * -1;
//		}
//		else
//			 n1 = n;
//		double x = 0.00001;
//		double res = 1;
//		for (int i = 1; i <= n1; i++) 
//		{
//			if(n >= 0)
//			{
//				{
//					res *= x;
//				}
//			}
//			else if(n < 0)
//			{ 
//				{
//					res /= x;
//				}
//			}
//		}
//		System.out.println(res);	
//	}
//				another way using built-in method
	
	public static void main(String[] args) 
	{
		int n = 2147483647;
		double x = 0.00001;
		System.out.println(Math.pow(x,n));
	}
}

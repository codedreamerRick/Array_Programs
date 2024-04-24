package NUMBER_PROGRAM;

import java.util.Scanner;

public class BinaryToDecimal {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter a binary number to be converted into decimal");
			int num=s.nextInt();
			int res = binaryToDecimal(num);
			System.out.println(num+" = "+res);
		}
		
		static int binaryToDecimal(int num)
		{
			int sum = 0;
			int pow = 0;
			while(num > 0) 
			{
					int rem = num % 10;
						if(pow == 0) 
						{
							rem *= 1;
						}
						else
						{
							int decimal = 1;
							for (int i = 1; i <= pow; i++)
							{
								decimal *= 2;
							}
							rem *= decimal;
						}
						  sum += rem;
						pow++;
					num = num / 10;	
			}
			return sum;
		}
}

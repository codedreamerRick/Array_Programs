package NUMBER_PROGRAM;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a decimal number to be converted into binary");
		int num=s.nextInt();
		int res = decimalToBinary(num);
		System.out.println(num+" = "+res);
	}
	
	static int decimalToBinary(int n) {
		String rem = "";
		while(n > 1) {
			rem += n % 2;
			n /= 2;
		}
		rem += n;
		String res = "";
		for (int i = rem.length()-1; i >= 0; i--) {
			res += rem.charAt(i);
		}
		return Integer.parseInt(res);
	}
}

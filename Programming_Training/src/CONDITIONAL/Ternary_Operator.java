package CONDITIONAL;

public class Ternary_Operator {

	public static void main(String[] args) 
	{
		int a = 2, b = 15, c = 7;
		int res = a>b ? (a>c ? a : c) : (b>c ? b : c);
		System.out.println(res);
	}
}

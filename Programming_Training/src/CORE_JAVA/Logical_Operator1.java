package CORE_JAVA;

public class Logical_Operator1 {

	public static void main(String[] args) 
	{
		int a = 10;
		if(a % 3 == 0 && a % 5 == 0)
		{
			System.out.println(a+" is divisible by both 3 and 5");
		}
		else
		{
			System.out.println(a+" is not divisible by both 3 and 5");
		}
	}
}

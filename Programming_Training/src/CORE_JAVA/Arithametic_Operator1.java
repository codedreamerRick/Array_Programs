package CORE_JAVA;

public class Arithametic_Operator1 {

	public static void main(String[] args) 
	{
		int prod1 = 1250, prod2 = 1450;
		prod1 = prod1 + prod1 * 12 / 100;
		prod2 = prod2 + prod2 * 12 / 100;
		int totalbill = prod1 + prod2;
		System.out.println("Total bill amount to be paid: "+totalbill);
	}
}

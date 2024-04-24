package PIRAMID;

public class Bottom_Piramid {

	public static void main(String[] args) 
	{
		int n = 15;
		int spaces = 0;
		int star = 2 * n - 1;
		for (int i = 1; i <= n; i++) 
		{
				for (int sp = 1; sp <= spaces; sp++) 
				{
						System.out.print("  ");
				}
						
				for (int st = 1; st <= star; st++) 
				{
						System.out.print("* ");
				}
				spaces++;
				star -= 2;
				System.out.println();
		}
	}
}

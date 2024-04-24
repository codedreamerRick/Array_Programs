package PIRAMID;

public class Top_Piramid {

	public static void main(String[] args) 
	{
		int n = 15;
		int spaces = n - 1;
		int star = 1;
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
				spaces--;
				star += 2;
				System.out.println();
		}
	}
}

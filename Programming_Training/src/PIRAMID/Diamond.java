package PIRAMID;

public class Diamond {

	public static void main(String[] args)
	{
		int n = 6;
		int spaces = n - 1;
		int star = 1;
		for (int i = 1; i < 2 * n; i++) 
		{
				for (int sp = 1; sp <= spaces; sp++) 
				{
						System.out.print("  ");
				}
						
				for (int st = 1; st <= star; st++) 
				{
						System.out.print("* ");
				}
				if(i < n)
				{
					spaces--;
					star += 2;
				}
				else
				{
					spaces++;
					star -= 2;
				}
				System.out.println();		
		}
	}
}

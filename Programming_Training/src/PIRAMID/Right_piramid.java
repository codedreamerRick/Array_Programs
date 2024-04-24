package PIRAMID;

public class Right_piramid {

	public static void main(String[] args) 
	{
		int n = 10;
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
					star++;
				}
				else
				{
					spaces++;
					star--;
				}
				System.out.println();		
		}
	}
}

package PIRAMID;

public class ABCD_Diamond {

	public static void main(String[] args) throws InterruptedException 
	{
		int n = 15;
		int spaces = n - 1;
		int star = 1;
		char c = 'A';
		for (int i = 1; i < 2 * n; i++) 
		{
			Thread.sleep(200);
				for (int sp = 1; sp <= spaces; sp++) 
				{
						System.out.print("  ");
				}
						
				for (int st = 1; st <= star; st++) 
				{
					if(c >= 'A' && c <= 'Z')
					{
						System.out.print(c+++" ");
						Thread.sleep(200);
					}
					else
					{
						c = 'A';
						System.out.print(c+++" ");	
						Thread.sleep(200);
					}
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

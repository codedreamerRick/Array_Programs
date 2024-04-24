package PIRAMID;

public class Left_Piramid {

	public static void main(String[] args) 
	{
		int n = 16;
		int star = 1;
		for (int i = 1; i < 2 * n; i++) 
		{				
				for (int st = 1; st <= star; st++) 
				{
						System.out.print("* ");
				}
				if(i < n)
				{
					star++;
				}
				else
				{
					star--;
				}
				System.out.println();		
		}
	}
}

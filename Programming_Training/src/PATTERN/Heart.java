package PATTERN;

public class Heart {

//								heart shape	
	
	public static void main(String[] args) 
	{
		int n = 7;
		System.out.println();
		for(int i=1;i<=n;i++ )
		{
			for(int j=1;j<=n;j++)
			{
				if((i == 1 && j != 1 && j != n/2 + 1 && j != n) || (i == 2 && j<=7) || (i==4 && j!=1 && j!=7)
						|| (i==5 && j!=1 && j!=2 && j!=6 && j!=7) || (i==6 && j==4) || (i == 3 && j<=7) || (i==4 && j!=1 && j!=7))
				{
					System.out.print("*  ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}

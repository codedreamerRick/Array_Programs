package PIRAMID;

public class Number_Triangle {

	public static void main(String[] args) 
	{
		int n=20;
		for(int i=1;i<=n;i++)
		{
			int a=i;
			int b=n-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+b;
				b--;
			}
			System.out.println();
		}
	}
}

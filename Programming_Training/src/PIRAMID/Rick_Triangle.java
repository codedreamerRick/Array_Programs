package PIRAMID;

public class Rick_Triangle {

	public static void main(String[] args) 
	{
		String s = "helloWorld";
		int n = s.length();
		for (int i = 1; i <= n; i++) 
		{
			int a = 0;
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(s.charAt(a++)+" ");
			}
			System.out.println();
		}
	}
}

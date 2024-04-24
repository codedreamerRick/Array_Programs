package STRING;

import java.util.Scanner;

public class EmailValidation {

//			Check the given string is valid or not with an @ and a domain
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Email ID");
		String s = sc.nextLine();
		boolean flag = false;
		int c1 = 0, c2 = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == '@' || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 0 && s.charAt(i) <= 9) || (s.charAt(i) == '.'))
			{
				if(s.charAt(i) == '@')
				{
					c1++;
				}
				else if(s.charAt(i) == '.')
				{
					c2++;
				}
				flag = true;
			}
			else 
			{
				flag = false;
				break;
			}     
		}
		if(flag == true)
		{
			if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
			{
				if(s.endsWith(".com") || s.endsWith(".org") || s.endsWith(".in"))
				{
					if(c1 == 1 && c2 == 1)
					{
						System.out.println("It's a valid Email Id");
					}
					else
						System.out.println("Enter a valid Email Id");
				}
				else
					System.out.println("Enter a valid Email Id");
			}
			else
				System.out.println("Enter a valid Email Id");
		}
		else
			System.out.println("Enter a valid Email Id");
	}
}

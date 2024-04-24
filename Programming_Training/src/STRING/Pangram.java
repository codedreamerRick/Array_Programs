package STRING;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

//					check the string is pangram or not
	
	public static void main(String[] args)
	{
		String s = "the quick brown fox jumps over a lazy dog".toLowerCase();
		s = s.replace(" ", "");
		char [] ch1 = s.toCharArray();
		Arrays.sort(ch1);
		String visit = "";
		for (int i = 0; i < ch1.length; i++)
		{
			char c = ch1[i];
			if(visit.indexOf(c) == -1)
			{
				if(c >= 'a' && c <= 'z')
				{
					visit += c;
				}
			}
		}
		char c1 = 'a';
		for (int i = 0; i < visit.length(); i++)
		{
			char c2 = visit.charAt(i);
			if(c1 == c2)
			{
				c1++;
			}
			else
			{
				System.out.println("Its not a Panagram");
				System.exit(0);
			}
		}
		System.out.println("It's a Pangram");
	}
}

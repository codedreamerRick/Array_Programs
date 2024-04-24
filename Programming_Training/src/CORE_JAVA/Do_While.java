package CORE_JAVA;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char c;
		do
		{
			System.out.println("Welcome");
			System.out.println("Do you want me to print again? ");
			System.out.println("Press y if yes else press n");
			c = sc.next().charAt(0);
		}
		while(c != 'n' && c == 'y');
	}
}

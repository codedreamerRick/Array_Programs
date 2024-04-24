package DSA_College_Training;

import java.util.Scanner;

public class Stack_Operations {


	static Scanner s = new Scanner(System.in);
	static int size;
	static int [] stackA;
	static int top;
	public static void main(String[] args) 
	{
		
		int choice = 0;
		while(choice != 10)
		{
		if(stackA == null)
		{
			System.out.println("You don't have created stack to push the data");
				System.out.println("\nPress 1 for creating the stack");
				choice = s.nextInt();
				switch (choice) 
				{
					case 1:
						create();
						break; 
				}
		}
		else
		{
				System.out.println("\n1. Push");
				System.out.println("2. Display");
				System.out.println("3. Pop");
				System.out.println("4. Empty");
				System.out.println("5. Full");
				System.out.println("10. Stop");
				System.out.println("=== Enter your choice ===");
				choice = s.nextInt();
				switch (choice) 
				{
					case 1:
						push();
						break;
					case 2:
						display();
						break;
					case 3:
						pop();
						break;
					case 4:
						isEmpty();
						break;
					case 5:
						isFull();
						break;
				}
		}
	}
}
	
//							stack creation
	
	static void create()
	{
		System.out.println("Enetr the size of your stack array");
		size = s.nextInt();
		stackA = new int [size];
		top = -1;
		System.out.println("Stack is successfully created...");
	}
	
//							display stack elements
	
	static void display()
	{
		if(top != -1)
		{
			for(int i = top; i >= 0; i--)
			{
				System.out.print(stackA[i]+" ");
			}
		}
		else
			System.out.println("Stack is underflow...");
	}
	
//							push operation
	

	static void push()
	{
		if(top == size-1)
			{
				System.out.println("Stack is overflow");
			}
			else
			{
				System.out.println("Enter the data to be pushed");
				int data  = s.nextInt();
				top++;
				stackA[top] = data;
				System.out.println("Successfully pushed...");
			}
	}
	
//							pop operation
	
	static void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			System.out.println("Successfully poped "+stackA[top]+" ...");
			top--;
		}
	}
	
//							checking empty or not
	
	static void isEmpty()
	{
		if(top == -1)
		{
			System.out.println("Stack is underflow");
		}
		else
			System.out.println("Stack is not underflow");
	}
	
//							checking full or not
	
	static void isFull()
	{
		if(top == size-1)
		{
			System.out.println("Stack is overflow");
		}
		else
			System.out.println("Stack is not overflow");
	}
}

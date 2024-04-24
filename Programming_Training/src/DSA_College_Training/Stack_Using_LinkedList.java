package DSA_College_Training;

import java.util.Scanner;

public class Stack_Using_LinkedList {

	static Scanner s = new Scanner(System.in); 
	static Node head;
	static Node top;
	public static void main(String[] args) 
	{
		char ch;
		do 
			{
				Node n = new Node();
				System.out.println("Enter the data for your node");
				n.data = s.nextInt();
				n.next = null;
				if(top == null)
				{
					top = n;
					
				}
				else
				{
					n.next = top;
					top=n;
				}
				System.out.println("Do you want to create one more node? press 'y' if yes else press 'n'");
				ch = s.next().charAt(0);
			}while(ch == 'y');
		display();
		peek();
		pop();
	}
	
//						display nodes using stack	
	
	static void display()
	{
		Node temp = top;
		if(temp == null)
		{
			System.out.println("Stack underflow...");
		} 
		else
		{
			System.out.println("Node datas are...");
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
//						pop operation
	
	static void pop()
	{
		if(top == null)
		{
			System.out.println("Stack is underflow...");
		}
		else
		{
			while(top != null)
			{
				Node temp = top;
				System.out.println("\n"+temp.data+" deleted successfully...");
				top = temp.next;
				temp.next = null;
			}
		}
		display();
	}
	
//								peek operation	
	
	static void peek()
	{
		if(top != null)
		{
			System.out.println("\nPeek element is "+top.data);
		}
		else
		{
			System.out.println("\nStack is underflow");
		}
	}
}


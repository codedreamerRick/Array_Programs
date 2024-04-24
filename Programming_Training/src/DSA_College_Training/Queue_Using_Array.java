package DSA_College_Training;

import java.util.Scanner;

public class Queue_Using_Array {

	static Scanner s = new Scanner(System.in);
	static int size;
	static int [] queue;
	static int front = -1, rear = -1;
	public static void main(String[] args) 
	{
		
		int choice = 0;
		while(choice != 4)
		{
		if(queue == null)
		{
			System.out.println("You don't have created Queue to insert the data");
				System.out.println("\nPress 1 for creating the Queue");
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
				System.out.println("\n1. Insert");
				System.out.println("2. Display");
				System.out.println("3. Delete");
				System.out.println("4. Stop");
				System.out.println("=== Enter your choice ===");
				choice = s.nextInt();
				switch (choice) 
				{
					case 1:
						enQueue();
						break;
					case 2:
						display();
						break;
					case 3:
						dQueue();
						break;
				}
		}
	}
}
	
//							stack creation
	
	static void create()
	{
		System.out.println("Enetr the size of your Queue array");
		size = s.nextInt();
		queue = new int [size];
		System.out.println("Queue is successfully created...");
	}
	
//							display queue elements
	
	static void display()
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Queue is empty...");
		}
		else
		{
			System.out.println("Queue datas are:");
			for(int i = front; i <= rear; i++)
			{
				System.out.print(queue[i]+" ");
			}
		}
	}
	
//							enQueue operation
	
	static void enQueue()
	{
		if(front == -1 && rear == -1)
		{
			front = rear = 0;
			System.out.println("Enter your data");
			int data = s.nextInt();
			queue[rear] = data;
		}
		else if(rear == size-1)
		{
			System.out.println("Queue is full...");
		}
		else 
		{
			rear++;
			System.out.println("Enter your data");
			int data = s.nextInt();
			queue[rear] = data;
		}
	}
	
//							dQueue operation

	static void dQueue()
	{
		if(front == - 1 && rear == -1)
		{
			System.out.println("Queue is empty...");
		}
		else if(front == rear)
		{
			System.out.println(queue[front]+" is deleted successfully...");
			front = rear = -1;
		}
		else
		{
			while(front <= rear)
			{
				System.out.println(queue[front]+" is deleted successfully...");
				front++;
			}
			front = rear = -1;
		}
	}
}

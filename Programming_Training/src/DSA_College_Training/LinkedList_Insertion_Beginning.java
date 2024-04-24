package DSA_College_Training;

import java.util.Scanner;

public class LinkedList_Insertion_Beginning 
{
		static Scanner s = new Scanner(System.in);
		static Node head = null;
		static Node temp = null;
		static char ch;
		public static void main(String[] args) 
		{
			System.out.println("Press 1 for creation");
			System.out.println("Press 2 for display");
			System.out.println("Press 3 for insertion at beginning");
			System.out.println("Press 4 for searching");
			System.out.println("Enter your choice");
			int choice = s.nextInt();
			switch (choice) 
			{
				case 1:
					create();
					break;
				case 2:
					display();
					break;
				case 3:
					insertBeginning();
					break;
				case 4:
					search();
					break;
					
			}
		}
			
//							creating nodes
		
			static void create()
			{
				do 
				{
					Node n = new Node();
					System.out.println("Enter the data for your node");
					n.data = s.nextInt();
					n.next = null;
					if(head == null)
					{
						head = n;
						temp = n;
					}
					else
					{
						temp.next = n;
						temp = n;
					}
					System.out.println("Do you want to create one more node? press 'y' if yes else press 'n'");
					ch = s.next().charAt(0);
				}while(ch == 'y');
				display();
			}
			
//							displaying nodes
			
			static void display()
			{
				if(head != null)
				{
					System.out.println("Node datas are:");
					Node temp1 = head;
					while(temp1 != null)
					{
						System.out.println(temp1.data);
						temp1 = temp1.next;
					}
				}
				else
				{
					System.out.println("First you create few nodes");
					create();
				}
			}
				
//					inserting a node at beginning
		
			static void insertBeginning()
			{
				System.out.println("First Create few nodes");
				create();
				if(head != null)
				{
					Node n = new Node();
					System.out.println("Enter the data to be inserted");
					n.data = s.nextInt();
					n.next = null;
					n.next = head;
					head = n;
				}
				else
				{
					System.out.println("First you create the nodes");
				}
				display();
				System.out.println("Do you want to create one more node? press 'y' if yes else press 'n'");
				ch = s.next().charAt(0);
				if(ch == 'y')
				{ 
					create();
				}
				else
				{
					System.exit(0);
				}
			}
			
//						searching data from linked list	
			    
			static void search()
			{
				if(head != null)
				{
					temp = head;
					System.out.println("Enter the data to be searched");
					int data = s.nextInt();
					while(temp != null)
					{
						if(temp.data == data)
						{
							System.out.println("Data found...");
							System.exit(0);
						}
						temp = temp.next;
					}
					System.out.println("Data not found...");
				}
				else
				{
					System.out.println("You don't have any nodes to search");
					System.out.println("Do you wanna create few nodes...'y' or 'n'" );
					char c = s.next().charAt(0);
					if(c == 'y')
					{
						create();
						search();
					}
				}	
			}
			
}
				

//	class Node
//	{
//		int data;
//		Node1 next;
//	}

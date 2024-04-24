package DSA_College_Training;

import java.util.Scanner;

public class DoublyLinkedLIst {

		static Scanner s = new Scanner(System.in);
		static Node head;
		static Node temp;
		static char ch;
		public static void main(String[] args) 
		{
			System.out.println("Press 1 for add");
			System.out.println("Press 2 for display");
			System.out.println("Press 3 for insertion at beginning");
			System.out.println("Press 4 for searching");
			System.out.println("=== Enter your choice ===");
			int choice = s.nextInt();
			switch (choice) 
			{
				case 1:
					create();
					break;
				case 2:
					display();
					break;
//				case 3:
//					insertBeginning();
//					break;
//				case 4:
//					search();
//					break;
					
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
					n.prev = null;
					if(head == null)
					{
						head = n;
						temp = head;
					}
					else
					{
						temp.next = n;
						n.prev = temp;
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
						System.out.print(temp1.data+" ");
						temp1 = temp1.next;
					}
				}
				else
				{
					System.out.println("First you create few nodes");
					create();
				}
			}	
		
}



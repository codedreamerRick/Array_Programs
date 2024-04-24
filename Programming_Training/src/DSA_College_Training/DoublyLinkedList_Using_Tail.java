package DSA_College_Training;

import java.util.Scanner;

public class DoublyLinkedList_Using_Tail {

	static Scanner s = new Scanner(System.in);
	static Node head;
	static Node tail;
	static int count = 0;
	public static void main(String[] args) 
	{
		int choice = 0;
		while(choice != 10)
		{
			System.out.println("\nPress 1 for add");
			System.out.println("Press 2 for display");
			System.out.println("Press 3 for insertion at beginning");
			System.out.println("Press 4 for insertion at end");
			System.out.println(("Press 5 for insertion at position"));
			System.out.println("Press 6 for deleting at beginning");
			System.out.println("Press 7 for deleting at end");
			System.out.println("Press 8 for deleting at position");
			System.out.println("Press 10 to stop");
			System.out.println("=== Enter your choice ===");
			choice = s.nextInt();
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
					insertEnd();
					break;
				case 5:
					insertPosition();
					break;
				case 6:
					deleteBeginning();
					break;
				case 7:
					deleteEnd();
					break;
				case 8:
					deletePosition();
					break;
			}
		}
		System.out.println("Thanks for using...");
	}
		
//						creating nodes using tail
	
		static void create()
		{
				Node n = new Node();
				System.out.println("Enter the data for your node");
				n.data = s.nextInt();
				n.next = null;
				n.prev = null;
				if(head == null)
				{
					head = n;
					tail = head;
				}
				else
				{
					tail.next = n;
					n.prev = tail;
					tail = n;
				}
				count++;
		}
		
//						displaying nodes
		
		static void display()
		{
			if(head != null)
			{
//						from first to last				
				System.out.println("\nNode datas are:");
				Node temp = head;
				while(temp != null)
				{
					System.out.print(temp.data+" ");
					temp = temp.next;
				}
				
//						from last to first
				System.out.println("\nNode datas are:");
				temp = tail;
				while(temp != null)
				{
					System.out.print(temp.data+" ");
					temp = temp.prev;
				}
			}
			else
			{
				System.out.println("\nFirst you create few nodes");
				create();
			}
		}
		
//						insertion at beginning
		
		static void insertBeginning()
		{
			if(head != null)
			{
				Node n = new Node();
				System.out.println("\nEnter the data to be inserted");
				n.data = s.nextInt();
				n.next = null;
				n.prev = null;
				head.prev = n;
				n.next = head;
				head = n;
			}
			else
			{
				System.out.println("First you create the nodes");
				create();
			}
			count++;
		}
		
//							insertion at end
		
		static void  insertEnd()
		{
			if(head != null)
			{
				Node n = new Node();
				System.out.println("\nEnter the data to be inserted");
				n.data = s.nextInt();
				n.next = null;
				n.prev = null;
				tail.next = n;
				n.prev = tail;
				tail = n;
			}
			else
			{
				System.out.println("First you create the nodes");
				create();
			}
			count++;
		}
		
//						insertion at given position
		
		static void insertPosition()
		{
			if(head != null)
			{
				System.out.println("Enter the position to be inserted");
				int pos = s.nextInt();
				if(pos == 1)
				{
					insertBeginning();
				}
				else if(pos == count)
				{
					insertEnd();
				}
				else
				{
					Node n = new Node();
					Node pn = null;
					Node temp = head;
					System.out.println("\nEnter the data to be inserted");
					n.data = s.nextInt();
					n.next = null;
					n.prev = null;
					int i = 1;
					while(i < pos)
					{
						pn = temp;
						temp = temp.next;
						i++; 
					}
					pn.next = n;
					n.prev = pn;
					temp.prev = n;
					n.next = temp;
				}
			}
			else
			{
				System.out.println("First you create the nodes");
				create();
			}
			count++;
		}
		
//					delete at beginning
		
		static void deleteBeginning()
		{
			Node temp = head;
			if(head == tail)
			{
				head = tail = null; 
				System.out.println("Deleted successfully...");
			}
			else
			{
				head = head.next;
				head.prev = null;
				temp.next = null;
				System.out.println("Deleted successfully...");
			}
			count--;
		}
		
//					delete at rear end
		
		static void deleteEnd()
		{
			if(head == tail)
			{
				head = tail = null;
				System.out.println("Deleted successfully...");
			}
			else
			{
				tail = tail.prev;
				tail.next = null;
				System.out.println("Deleted successfully...");
			}
			count--;
		}
		
//					delete at position		
		
		static void deletePosition()
		{
			System.out.println("Enter the position to be deleted");
			int pos = s.nextInt();
			if(pos == 1)
			{
				deleteBeginning();
			}
			else if(pos == count)
			{
				deleteEnd();
			}
			else
			{
				Node pn = null;
				Node nn = null;
				Node temp = head;
				int i = 1;
				while(i < pos)
				{
					pn =  temp;
					temp = temp.next;
					i++;
				}
				pn.next = temp.next;
				temp.prev = null;
				nn = temp.next;
				temp.next = null;
				nn.prev = pn;
				System.out.println("Deleted successfully...");
			}
			count--;
		}
}

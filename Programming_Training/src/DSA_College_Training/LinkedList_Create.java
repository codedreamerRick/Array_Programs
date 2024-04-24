package DSA_College_Training;

import java.util.Scanner;

public  class LinkedList_Create {

//				creation of linked list
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Node head = null;
		Node temp = null;
		char ch;
		
//							creating nodes
		
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
		
//							displaying nodes
		
		System.out.println("Node datas are:");
		temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
	class Node
	{
		int data;
		Node next;
		Node prev;
	}

package DSA_College_Training;

import java.util.Scanner;

public class LinkedList_Insertion_Position {

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
		
//							displaying
		
		if(head != null)
		{
			System.out.println("Node datas are:");
			temp = head;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
//						insertion at given position		
		
		if(head != null)
		{
			System.out.println("Enter the position to be inserted");
			int pos = s.nextInt();
			Node pn = null;
			int i = 1;
			Node n = new Node();
			System.out.println("Enter the data to be  inserted");
			n.data = s.nextInt();
			n.next = null;
			temp = head;
			while(i < pos)
			{
				pn = temp;
				temp = temp.next;
				i++;
			}
			pn.next = n;
			n.next = temp;
		}
		else
		{
			System.out.println("First you create the nodes");
		}
		
//								displaying		
		
		if(head != null)
		{
			System.out.println("updated node datas are:");
			temp = head;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		else
		{
			System.out.println("First you create the nodes");
		}
	}
}

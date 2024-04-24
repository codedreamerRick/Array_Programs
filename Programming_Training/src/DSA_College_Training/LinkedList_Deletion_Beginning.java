package DSA_College_Training;

import java.util.Scanner;

public class LinkedList_Deletion_Beginning {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Node head = null;
		Node temp = null;
		char ch;
		
//							nodes creation
		
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
		
//							display	
		
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
		
//						deletion at beginning		
		
		if(head != null)
		{
			temp = head;
			head = temp.next;
			temp.next = null;
		}
		else
		{
			System.out.println("First you create the nodes");
		}
		
//							displaying		
		
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

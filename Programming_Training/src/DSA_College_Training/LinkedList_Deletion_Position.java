package DSA_College_Training;

import java.util.Scanner;

public class LinkedList_Deletion_Position {

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
		
//						deletion at position	
		
		System.out.println("Enter the position to be deleted");
		int pos = s.nextInt();
		int i = 1;
		Node pn = null;
		temp = head;
		boolean flag = false;
		if(pos == 1 && temp.next != null)
		{
			head = temp.next;
			temp.next = null;
			temp = head;
		}
		else
		    {
			while(i < pos && pos >=1)
			{
				if(temp.next == null)
				{
					head = null;
					temp = null;
					flag = true;
					break;
				}
				else
				{
					pn = temp;
					temp = temp.next;
					i++;
				}
			}
			if(flag == false)
			{
				pn.next = temp.next;
				temp.next = null;
			}
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
			System.out.println("Data deleted successfully...");
			System.exit(0);
			System.out.println("First you create the nodes");
		}
	}
}

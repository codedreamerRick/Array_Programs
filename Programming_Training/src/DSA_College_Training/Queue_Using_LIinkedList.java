package DSA_College_Training;

import java.util.Scanner;

public class Queue_Using_LIinkedList {

	static Scanner s = new Scanner(System.in);
	static Node head;
	static Node front, rear;

	public static void main(String[] args) {
		int choice = 0;
		while (choice != 6) {
			System.out.println("\n1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Peek Element");
			System.out.println("5. IsEmpty");
			System.out.println("6. Stop");
			System.out.println("=== Enter your choice ===");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				enQueue();
				break;
			case 2:
				display();
				break;
			case 3:
				dQueue();
				break;
			case 4:
				peek();
				break;
			case 5:
				isEmpty();
				break;
			}
		}
	}

//								create Queue

	static void enQueue() {
		Node n = new Node();
		System.out.println("Enter the data for your node");
		n.data = s.nextInt();
		n.next = null;
		if (front == null && rear == null) {
			front = rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
	}

//							displaying data

	static void display() {
		Node temp = front;
		if (temp == null) {
			System.out.println("Queue is empty...");
		} else {
			System.out.println("Node datas are...");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
//							peek element
	
	static void peek()
	{
		System.out.println("Peek element is "+front .data);
	}

//							deQueue data

	static void dQueue() 
	{
		if (front == null && rear == null) {
			System.out.println("Queue is empty...");
		} else if (front == rear) {
			System.out.println(front.data + " is deleted successfully...");
			front = rear = null;
		} else {
			while (front != null) {
				System.out.println(front.data + " is deleted successfully...");
				front = front.next;
			}
			front = rear = null;
		}
	}
	
//							check empty or not
	
	static void isEmpty()
	{
		if(front == null && rear == null)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue is not empty");
		}
	}
}

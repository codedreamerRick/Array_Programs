package ARRAY;

import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		int [] b = a;
		System.out.println("The array elements are:  ");
		for(int i = 0 ; i < size ; i++) {
			System.out.println(b[i]);
		}
	}
}
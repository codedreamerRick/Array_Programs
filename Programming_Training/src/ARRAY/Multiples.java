package ARRAY;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check of its multiples");
		int num=sc.nextInt();
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the array elements ");
		for(int i = 0 ; i < size ; i++) {
			 a[i] = sc.nextInt();
		}
		boolean flag=false;
		for(int i = 0 ; i < size ; i++) {
			int n = a[i];
			if(n % num == 0) {
				System.out.println(a[i]+" is multiples of 5");
				flag = true;
			}
		}
		if(flag==false)
		System.out.println("No multiples are present");
	}
}


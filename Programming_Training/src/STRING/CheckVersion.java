package STRING;

import java.util.Scanner;

public class CheckVersion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two versions to be checked");
		String v1 = sc.nextLine();
		String v2 = sc.nextLine();
		checkVersion(v1, v2);
	}
	
	static void checkVersion(String v1, String v2) {		
		if(v1.length() < v2.length()) 
			v1 += ".0";
		else if(v2.length() < v1.length())
			v2 += ".0";	
		for (int i = 0; i < v1.length(); i++) {	
			if(v1.charAt(i) != v2.charAt(i)) {			
				int n1 = Integer.parseInt(""+v1.charAt(i));
				int n2 = Integer.parseInt(""+v2.charAt(i));
				if(n1 > n2) 				
					System.out.println(v2+" is the downgraded version");
				else 
					System.out.println(v2+" is the upgraded version");
				return;
			}
		}
		System.out.println("Both are the same version");
	}
}

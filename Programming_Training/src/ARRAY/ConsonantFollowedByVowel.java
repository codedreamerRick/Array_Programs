package ARRAY;

import java.util.Arrays;

public class ConsonantFollowedByVowel {

	public static void main(String[] args) {		
		String [] arr = {"h", "A","e","r", "o","f"};
		consonantFollowedByVowel(arr);
	}
	
	static void consonantFollowedByVowel(String [] arr) {		
		for (int i = 0; i < arr.length; i++) {			
			for (int j = 0; j < arr.length-1; j++) {				
				if((arr[j].equalsIgnoreCase("a") || arr[j].equalsIgnoreCase("e") || arr[j].equalsIgnoreCase("i") || arr[j].equalsIgnoreCase("o") || arr[j].equalsIgnoreCase("u")) && (!arr[j+1].equalsIgnoreCase("a") && !arr[j+1].equalsIgnoreCase("e") && !arr[j+1].equalsIgnoreCase("i") && !arr[j+1].equalsIgnoreCase("o") && !arr[j+1].equalsIgnoreCase("u"))) {					
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

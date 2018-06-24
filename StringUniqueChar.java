package Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class StringUniqueChar {

	public static final Scanner scanner =  new Scanner(System.in);
	
	public static void main(String args[]) {
		
		String inputStr = scanner.nextLine();

		boolean isUnique = true;
		
		for(int i=0; i<inputStr.length(); i++) {
			char searchStr = inputStr.charAt(i) ;
					
			for(int j=0; j<inputStr.length(); j++) {
				if (!(j==i)) {
					if (searchStr == inputStr.charAt(j)) {
						isUnique = false;
					}		
				}
			}
		}
	
		System.out.println("Input String :" +inputStr  +" is Unique ? " +isUnique);	
		isUnique = isUniqueChars(inputStr);
		System.out.println("Input String2 :" +inputStr  +" is Unique2 ? " +isUnique);
	}
	
	private static boolean isUniqueChars(String str) {
		boolean isUnique = true;
		if (str.length() >  128) {
			isUnique =  false; 
		}
		
		boolean[] char_set = new boolean[128];
		
		for(int i =0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				isUnique =  false; 
			}
		}
		return isUnique;
	}
}

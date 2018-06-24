package Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutation {
	public static final Scanner scanner =  new Scanner(System.in);

	public static void main(String args[]) {
		
		String strInput1 = scanner.nextLine();
	    String strInput2 = scanner.nextLine();
	    
	    boolean isPermutation = findPermutation(strInput1, strInput2);
	    System.out.println("The strInput1 :"  +"'" +strInput1  +"'" +" is Permutation of " +"'" +strInput2 +"'" +"? " +isPermutation);
	}
	
	private static boolean findPermutation(String str1, String str2) {
		
		boolean isPermutation =  false;
		ArrayList<Character> strArray = new ArrayList<Character> ();
		
		for(int i=0; i <str1.length(); i++) {
			strArray.add(str1.charAt(i));
		}

		Set<String> hashSet = new HashSet<String>();
		for(int i=0; i < strArray.size(); i++) {
			char repChar = strArray.get(i);
			
			
			for(int j =0; j < strArray.size(); j++) {
				ArrayList<Character> strArray2 = new ArrayList<Character> (strArray);
				StringBuffer sb = new StringBuffer();
				if (!(i==j)) {
					int ind = strArray.indexOf(strArray.get(j));
					strArray2.set(i, strArray.get(j));
					strArray2.set(ind, strArray.get(i));
					
					for(int k =0; k < strArray2.size(); k++) {
						sb.append(strArray2.get(k));
					}
				}
				hashSet.add(sb.toString());
			}
		}
		hashSet.add(str1);
		
		for (String s : hashSet ) {
			System.out.println(s);
			if (s.equals(str2)) {
				isPermutation = true;
			}
			
			if (isPermutation) {
				System.out.println("match found");
			}
		}
	
		return isPermutation;
	}
}

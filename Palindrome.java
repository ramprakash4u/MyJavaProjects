package Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
	public static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        // Implement your solution here. Read input from STDIN, print output to STDOUT. 
        ArrayList<String> strArray = new ArrayList<String>();
        
        String[] Str = new String[] {"pop", "not a type writer", "Ah, Satan sees Natasha"};
        
        String inStr = "a";
        do 
        {
            inStr = scanner.nextLine();
            if(!(inStr.equals(" ")))
            strArray.add(inStr);
        } while (!(inStr.equals(" ")));
        
        
        for(int i =0; i< strArray.size(); i++) {
            String inputStr = strArray.get(i);
            String isPalindrome = checkPalindrome(inputStr);
            System.out.println(isPalindrome);
        }

    }
    
    public static String checkPalindrome( String strInput) {
       String str1 = "";
       String outStr = "";
       strInput = strInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       int n = strInput.length();
       for(int i =n-1; i>=0; i--) {
           str1 = str1 + strInput.charAt(i);
       }
      
        if (strInput.equalsIgnoreCase(str1)) {
            outStr = "YES";
        } else {
            outStr = "NO";
        }
        return outStr;
    }
    


}

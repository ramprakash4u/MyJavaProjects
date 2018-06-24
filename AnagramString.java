package Examples;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AnagramString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String Str1 = scanner.nextLine();
        String Str2 = scanner.nextLine();
    	
    	
        Map<String, Integer> strMap1 = new HashMap<String, Integer> ();
        Map<String, Integer> strMap2 = new HashMap<String, Integer> ();
        int charRem = 0;
        
        for(int i=0; i< Str1.length(); i++) {
           char s1 = Str1.charAt(i); 
           boolean isMatch = false;
           ArrayList<Character> strAry = new ArrayList<Character> ();
           
           for(int j=0; j< Str2.length();j++) {
               if (s1 == Str2.charAt(j) ) {
                   strAry.add(s1);
                   isMatch = true;
                   Integer a1 = 0;
                   String ss1 = Character.toString(s1);
                   if(strMap1.containsKey(ss1)) {
                       a1 = strMap1.get(ss1);
                       Integer aa1 = a1;
                       a1 = a1 + 1;
                       strMap1.replace(ss1,aa1,a1);
                   } else {
                       a1 = a1 + 1;
                       strMap1.put(ss1, a1);
                   }
                   break;
               }
           }
        
            if (!isMatch) {
                 charRem = charRem + 1;
            } else {
                isMatch = false;
            }
                
        }
        
        for(int i=0; i< Str2.length(); i++) {
           char s2 = Str2.charAt(i); 
           boolean isMatch = false;
           ArrayList<Character> strAry2 = new ArrayList<Character> ();
            
           for(int j=0; j< Str1.length();j++) {
               if (s2 == Str1.charAt(j) ) {
                   strAry2.add(s2);
                   isMatch = true;
                   Integer a2 = 0;
                   String ss2 = Character.toString(s2);
                    if(strMap2.containsKey(ss2)) {
                       a2 = strMap2.get(ss2);
                       Integer aa2 = a2;
                       a2 = a2 + 1;
                       strMap2.replace(ss2,aa2,a2);
                   } else {
                       a2 = a2 + 1;
                       strMap2.put(ss2, a2);
                   }
                   break;
               }
           }
        
            if (!isMatch) {
                 charRem = charRem + 1;
            } else {
                isMatch = false;
            }
        }
        
        for(Map.Entry<String, Integer> entry1 : strMap1.entrySet()) {
            Integer map1Val = entry1.getValue();
            for(Map.Entry<String, Integer> entry2 : strMap2.entrySet()) {
                if (entry1.getKey().equals(entry2.getKey()))  {
                    if (!(map1Val.equals(entry2.getValue()))) {
                        int valDiff = map1Val - entry2.getValue();
                        charRem = charRem + Math.abs(valDiff);
                    }
                }
            }
        }
        
         scanner.close();
        System.out.println(+charRem);
    }
}

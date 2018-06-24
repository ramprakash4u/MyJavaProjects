package Examples;

import java.util.Scanner;
import java.util.*;

public class StrAnagram {

	public static final Scanner scanner =  new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter str1:");
		String str1 =  scanner.nextLine();

		System.out.print("Enter str2:");
		String str2 =  scanner.nextLine();
		int x = strAnagramFind("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
		System.out.println(+x);
	}

	public static int strAnagramFind(String str1, String str2) { 
		int a = 0;
		String[] str1Array = str1.split("");
		str1Array = new HashSet<String>(Arrays.asList(str1Array)).toArray(new String[0]);
		String[] str2Array = str2.split("");
		str2Array = new HashSet<String>(Arrays.asList(str2Array)).toArray(new String[0]);
		ArrayList<String> strCommon = new ArrayList<String>() ;
		ArrayList<String> strUnCommon = new ArrayList<String>() ;
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		for(int i=0; i< str1Array.length; i++) {
			int count2 =0;

			for (int j=0; j< str2Array.length; j++) {
				int count = 0;

				if (str1Array[i].equals(str2Array[j])) {
					if (count == 0) {	
						count++;
						strCommon.add(str1Array[i]);	
						count2++;
					} else {
						count = 0;			
					}       	
				}

			}
			if(count2==0) {
				strUnCommon.add(str1Array[i]);
				count2 =0;
			}
		}
		a = strUnCommon.size();
		System.out.println("strUnCommon= "+strUnCommon);
		System.out.println("strCommon= "+strCommon);
		int a1 = strCommon.size();
		int a2 = str2Array.length;
		int finalvalue = a+(a2-a1);
		return finalvalue;
	}
}

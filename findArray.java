package Examples;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Exception;

public class findArray {

	public static final Scanner scanner =  new Scanner(System.in);
	public static void main(String args[]) throws Exception {
	System.out.print("Enter arraySize:");
	int arraySize =  scanner.nextInt();
	
	if (arraySize < 1 || arraySize > arraySize)
     {
          throw new Exception("arraySize should be greater than 0 and less than 100000");
     }
	
	
	int[] arrayInput = new int[arraySize];
	 for(int i=0; i<(arraySize); i++) {
		 System.out.print("Enter arrayInput[i]:");
		 arrayInput[i] = scanner.nextInt();
       }
	 
	System.out.print("Enter Integer K to search in Array:");
	int k =  scanner.nextInt();
	boolean foundOut = searchArray(arraySize, arrayInput, k);
	System.out.println(foundOut);
	
	}
	
	public static boolean searchArray(int arraySize, int[] inputArray, int k ) {
		
		boolean found = Arrays.stream(inputArray)
		              .anyMatch(x -> x == k);
		return found;
	}
}

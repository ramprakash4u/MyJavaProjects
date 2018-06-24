package Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class findOddNumber {

	public static final Scanner scanner =  new Scanner(System.in);
	public static void main(String args[]) {
		System.out.print("Enter Start Integer:");
		int start =  scanner.nextInt();

		System.out.print("Enter End Integer:");
		int end =  scanner.nextInt();
		int[] out = oddNumbers(start, end);
		for (int i=0; i < out.length; i++) {
			System.out.println(+out[i]);
		}
		
	}

	static int[] oddNumbers(int l, int r) {

		ArrayList<Integer> oddArrayLst = new ArrayList<Integer>();
		
		for (int i=l;i<r+1;i++) {
			if (i % 2 == 0){
							
			} else {
				oddArrayLst.add(i);
			}
		}
		int size = oddArrayLst.size();
		int[] oddArray = new int[size];
		for (int i = 0; i< size; i++) {
			oddArray[i] = oddArrayLst.get(i);
		}
		
//		for (int i=0; i < oddArray.length; i++) {
//			System.out.println(+oddArray[i]);
//		}
		
		return oddArray;

	}
}

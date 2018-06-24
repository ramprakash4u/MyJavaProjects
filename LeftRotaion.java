package Examples;

import java.util.*;
import java.lang.Exception;

public class LeftRotaion {
	
	public static void main(String[] args) throws Exception {
		int arraySize;
		int noOfRotation;
		Scanner in =new Scanner(System.in);
//		System.out.print("Enter arraySize:");
//		arraySize = in.nextInt();
//		 if (arraySize < 1 || arraySize > 100000)
//	        {
//	             throw new Exception("arraySize should be greater than 0 and less than 100000");
//	        }
//	        
//		 
//		System.out.print("Enter noOfRotation:");
//		noOfRotation = in.nextInt();
//		 if (noOfRotation < 1 || noOfRotation > arraySize)
//	        {
//	             throw new Exception("noOfRotation should be greater than 0 and less than " +arraySize);
//	        }
		
//		int[] rotArray = new int[arraySize];
//		 for(int i=0; i<(arraySize); i++) {
//			 System.out.print("Enter rotArray:");
//	            rotArray[i] = in.nextInt();
//	        }
//		 
//		 ArrayList<String> str = new ArrayList<String>();
//		 for(int i=0; i<(arraySize); i++) {
//			 System.out.print("Enter arrayString:");
//	            String str1 = in.nextLine();
//	            str.add(str1);
//	        }
		 
		 System.out.print("Enter inputString:");
		 String str1 = in.nextLine();
		 List<String> str = Arrays.asList(str1.split("\n"));
		 
		 for(int i=0; i<(str.size()); i++) {
		 System.out.println("output :" +str.get(i));
		 }
		
//        int[] rotArrayOut = rotLeft(arraySize, noOfRotation, rotArray);
//        
//        for(int i=0; i<arraySize; i++) {
//        	 System.out.print(rotArrayOut[i]+" ");
//        }
    }
       
    public static int[]  rotLeft(int arraySize, int rot, int[] rotArray){
        
        int[] rotArray1 = new int[arraySize];
       
         for(int i=0,j=rot,k=0;i<arraySize;j++,i++)
 	     {  
 	       if(j<arraySize)
 	        rotArray1[i]=rotArray[j];
 	       else
 		    {rotArray1[i]=rotArray[k];   
 		     k++;
 		  }  
    }
        return rotArray1;
}
    
}
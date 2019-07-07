package tricks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintCollections {
	
	public static void main(String[] args) {

	System.out.println("\n" +"===============================Printing ArrayList of Integer=================================");
	ArrayList<Integer> intAry = new ArrayList<Integer> ();
	intAry.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	intAry.forEach(a -> System.out.println(a));   /*Printing ArrayList in newLine */
	System.out.println(intAry.toString());        /* Printing ArrayList in same line */
	System.out.println(Arrays.toString(intAry.toArray()));  /* Printing ArrayList in same line */
	
	System.out.println("\n" +"********Convert String into ArrayList of each character in String*****");
	
    ArrayList<String> strList = new ArrayList<String> ();
    strList.addAll(Arrays.asList("helloword", "convertstringinto", "arraylistofeachletterinstring"));
	List<String> x = new ArrayList<String> (Arrays.asList(strList.get(0).split("")));
	System.out.println(x);
	
	System.out.println("\n" +"********Print ArrayList without comma in single line*****");
	System.out.println(intAry.toString().replace(",", " "));
	

	System.out.println("\n" +"********Convert ArrayList to Array*****");
	Integer [] testArray = new Integer[intAry.size()];
	testArray = intAry.toArray(testArray);   /* toArray method returns object class */
	System.out.println(Arrays.toString(testArray));
	
	System.out.println("\n" +"********Convert Array to ArrayList*****");
	List<Integer> list = Arrays.asList(testArray);
	System.out.println(list.toString());
	
	System.out.println("\n" +"===============================Printing ArrayList of String===================================");
	ArrayList<String> strAry = new ArrayList<String> ();
	strAry.addAll(Arrays.asList("abc","def","ghi","klm","mno","pqr"));
	strAry.forEach(a -> System.out.println(a));   /*Printing ArrayList in newLine */
	System.out.println(strAry.toString());        /* Printing ArrayList in same line */
	System.out.println(Arrays.toString(strAry.toArray()));  /* Printing ArrayList in same line */
	
	System.out.println("\n" +"===============================Printing Map of String, Interger================================");
	Map<String, Integer> testMap = new HashMap<String, Integer> ();
	testMap.put("one", 1);
	testMap.put("two", 2);
	testMap.put("three", 3);
	testMap.put("four", 4);
	testMap.put("five",5);
	
	for(String key : testMap.keySet()) {
		System.out.println(key +"," +testMap.get(key));
	}
	
	System.out.println("\n" +"********Print all Keys & Values of Map separately, can be used for condition check*****");
	for(Entry<String, Integer> entry : testMap.entrySet()) {
		String key = entry.getKey();
		Integer val = entry.getValue();
		System.out.println("key :" +key +"," +" val :" +val);
	}
	
	System.out.println("\n" +"********Print all Keys of Map in one line*****");
	Set<String> keys = testMap.keySet();
	System.out.println(keys.toString());   /* this will work without toString() also as super object has inbuild tostring */
	
	System.out.println("\n" +"********Print all Values of Map in one line****");
	Collection<Integer> values = testMap.values(); 
	System.out.println(values.toString());
	
	System.out.println("\n" +"********Print all Keys & Values of Map in one line****");
	Set<Entry<String, Integer>> entries = testMap.entrySet();
	System.out.println(entries.toString());
	
	System.out.println("\n" +"********Retrieve Map value by position directly****");
	Object key = testMap.keySet().toArray()[2];
	Integer h = testMap.get(key);
	System.out.println(key +"," +h);
	
		
	System.out.println("\n" +"===============================Printing set of Interger====================================");
	
	Set<Integer> intSet = new HashSet<Integer> ();
	intSet.addAll(Arrays.asList(11,12,13,14,15,16,17,18,19,20));
	System.out.println(intSet.toString());
	
	System.out.println("\n" +"********Print Set in sorted way converting Set to TreeSet****");
	TreeSet intTreeSet = new TreeSet(intSet);
	System.out.println(intTreeSet.toString());
	
	System.out.println("\n" +"********Convert Integer to String****");
	Integer i =5;
	double f = 2.5;
	String str = Integer.toString(i);
	String str2 = String.valueOf(f);
	
	System.out.println("\n" +"********Convert String to Integer****");
	int t = Integer.parseInt(str);
   
	System.out.println("\n" +"===============================Printing Sorting====================================");
	
	ArrayList<Integer> sortAry = new ArrayList<Integer> ();
	
	sortAry.addAll(Arrays.asList(22,25,23,30,28,26,29,21,24,27));
	
	System.out.println("\n" +"********Printing ArrayList in sorted****");
	
	TreeSet<Integer> sortTree = new TreeSet<Integer>(sortAry);
	System.out.println(sortTree.toString());
	
	Collections.sort(sortAry);
	System.out.println(sortAry.toString());
		
	System.out.println("\n" +"********Printing ArrayList in reverse sorted****");
	Collections.sort(sortAry, Collections.reverseOrder());
	System.out.println(sortAry.toString());
	
	
	
	System.out.println("\n" +"********Convert String to char Array in one line****");
	String a = "Anagram";
	char[]	charAry = a.toCharArray();
	Arrays.sort(charAry);
	System.out.println(charAry);
	
	
	System.out.println("\n" +"===============================Regex====================================");
	Pattern pattern= Pattern.compile("geeks");
	Matcher m = pattern.matcher("geeksforgeeks.org");
	while (m.find()) {
	  System.out.println(m.start() +" to " + (m.end()-1));
	}
	
	System.out.println("\n" +"===============================Sum List or Array elements=================================");
	
	System.out.println("\n" +"********Sum elements in Array********");
	int[] intarray = new int[] {2,5,7,9,4};
	int sum = IntStream.of(intarray).sum();
	System.out.println("Sum of all elements in Array :" +sum);
	
	System.out.println("\n" +"********Sum elements in ArrayList****");
	ArrayList<Integer> sumArrLst = new ArrayList<Integer> (Arrays.asList(4,6,7,2,9));
	int b = sumArrLst.parallelStream().reduce(0, Integer::sum); 
	int c =  sumArrLst.stream().mapToInt(Integer::intValue).sum();  /*Another way to sum list elements */
	System.out.println("Sum of all elements in ArrayList :" +b +"," +c);
	
	System.out.println("\n" +"===============================Find prime number=================================");
	
	BigInteger bigNo = new BigInteger("31") ;
    boolean b1  = bigNo.isProbablePrime(1);
    System.out.println("Is " +bigNo +" a prime number ? " +b1);

    System.out.println("\n" +"===============================Left n Rotation=================================");
    int[] rotArray = new int[] {1,2,3,4,5};
    Queue<Integer> q = new LinkedList<>();
    
    for(int g=0; g<rotArray.length; g++) {
    	q.add(rotArray[g]);
    }
    int d =4;
    for(int j=0; j<d; j++) {
        int u= q.poll();
        q.add(u);
        
    }
    System.out.println("Left rotation of Array :" +Arrays.toString(rotArray) +" By " +d +" is -> " +q.toString().replace(",","").replace("[","").replace("]",""));
 
	}
	
	
}


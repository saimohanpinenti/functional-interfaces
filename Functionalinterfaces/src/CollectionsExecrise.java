import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsExecrise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1. Write a program to traverse (or iterate) ArrayList? (Solution)
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(112);
		list.add(23);
		list.add(42);
		for(Integer i : list) {
			System.out.println(i);
		} //first way
		list.stream().forEach(System.out::println);// second way
		
//		Q2 Write a program to convert List to Array.  (Solution)

	  Object[] citinames=list.toArray();
	  for(Object obj:citinames) {
		  System.out.println(obj);
	  }
	  int arr[] = new int[list.size()];
	  int j =0;
	  for(Integer i:list)
	  {
		  arr[j++] = i;
	  }
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
//		Q3 Write a program to traverse(or iterate) HashSet? (Solution)
		HashSet<String> bikes = new HashSet<>();
		bikes.add("yamaha");
		bikes.add("royal enfield");
		bikes.add("maha");
		bikes.add("yal enfield");
		bikes.add("kayamaha");
		bikes.add("superroyal enfield");
		
		bikes.stream().forEach(System.out::println);
		for(String bike: bikes)
		{
			System.out.println(bike);
		}
		
//		Q4 Given an element write a program to check if element(value) exists in ArrayList?
		if(list.contains(3)) {
			System.out.println("Cotains the element 3 in the list");
		}
		
//		Q5 Given an element write a program to check if element exists in HashSet?
		if(bikes.contains("yamaha")) {
			System.out.println("hashset contains the bike Yamaha");
		}
		
//		Q6 Write a program to initialize a HashMap in java ?
		HashMap<String,Integer>cars = new HashMap<>();
		cars.put("HondaCIty", 1230000);
//		Q7 Write a program to initialize an ArrayList in java?

//Q8  Write a program to convert Array to List? (Solution)
		List numbers = Arrays.asList(arr);
//		Arraylist<Integer> nums = new ArrayList<>(Arrays.asList(arr)); 
		  String[] cities={"Boston", "Dallas", "New York", "Chicago"};

	      //Converting Array to ArrayList using Arrays.asList()
	      ArrayList<String> lists= new ArrayList<>(Arrays.asList(cities));
	      
	      // Add more elements to the converted list
	      lists.add("San Francisco");
	      lists.add("San jose");
	      
	      // Print arraylist elements using for-each loop
	      for(String s : lists) {
	        System.out.println(s);      
	      }
//	      Q9 Write a program to find the length of the ArrayList? (Solution)
	      System.out.println(lists.size());
//	      Q10 Write a program to add elements to the HashMap given the key and value data type is String?
	      cars.put("ertiga", 230000);
	      cars.put("Honda", 1230000);
//	      Q11 Write a program to initialize a HashSet in java?
//	      already done
//	      Q12 Write a program to add elements to ArrayList ?
	      lists.add("salaman");
//	      Q13 Write a program to add elements to HashSet? 
	      bikes.add("glamour");

//Q14 Write a program to get size of HashMap? (Solution)
	      cars.put("certiga", 230000);
	      cars.put("dHonda", 1230000);
	      System.out.println(cars.size());
//	      Q15  How to check if HashMap is empty? (Solution)
	      cars.isEmpty();
//	      Q16 Write a program to iterate the HashMap ? (Solution)
	      Set<String> keys  =cars.keySet();
	      keys.stream().forEach( key->{
	    	  System.out.println(key+" "+cars.get(key));
	      });
	      HashMap<String, String> hashmap = new HashMap<String, String>();
	      hashmap.put("Key1", "Value1");
	      hashmap.put("Key2", "Value2");
	      System.out.println("Iterating or looping map using entrySet and foreach loop");
	      // Iterating or looping using entrySet() method
	      Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
	      for (Map.Entry entry : entrySet) {
	          System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
	      }
//	      Q17 Write a program to sort HashMap by keys ? (Solution)
	      Set<String>hashkeys = cars.keySet();
	      List<String>finalKes = hashkeys.stream().sorted().collect(Collectors.toList());
	      finalKes.forEach(key ->{
	    	  System.out.println(key+""+cars.get(key));
	      });

		
	      
	}

}

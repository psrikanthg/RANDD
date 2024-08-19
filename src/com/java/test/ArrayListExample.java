package com.java.test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExample {
	
	public static void main(String args[]) {
		String mail = "ashutosh.jha@puresoftware.com,sreekanth.pamangundla@puresoftware.com,khushboo.bharti@puresoftware.com,pratap.pawar@blazeclan.com";
		List<String> to =  Arrays.asList(mail);
		String recepits[] =to.toArray(new String[0]);
		System.out.println("Array list "+recepits);
		
		List<Customer> arrayList = new ArrayList<>();
		
		arrayList.add(new Customer(1, "ADLD"));
		arrayList.add(new Customer(2, "EW"));
		System.out.println();
		
		Map<String, String> map = Stream.of(new String[][] {
			  { "AD", "ADLD" }, 
			  { "ADLD", "ADLD" }, 
			  { "ADA", "ADLD" }, 
			  { "LDA", "ADLD" },
			}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map.get(null));
		String msg = null;
		
		/*
		 * Customer james = arrayList.stream() .filter(customer ->
		 * msg.equals(customer.getName())) .findAny() .orElse(null);
		 * System.out.println(james.getName());
		 */
		
		
		List<String> arList = new ArrayList<String>();
		
		arList.add("ADLD");
		arList.add("EW");
		arList.add("CS");
		arList.add("THEFT");
		
		System.out.println(arList.contains("ADLD"));
		
		 Map<String, String> claimType = Stream.of(new String[][] {
			 		  { "AD", "ADLD" }, 
			 		  { "ADLD", "ADLD" }, 
			 		  { "ADA", "ADLD" }, 
			 		  { "LDA", "ADLD" },
			 		  { "EW", "EW" },
			 		  { "EWA", "EW" },
			 		  { "THEFT", "THEFT" },
			 		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		 
		
				 
		
		
	}

}

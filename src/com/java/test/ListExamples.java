package com.java.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExamples {
	
	public static void main(String args[]) {
		
		
		 List<String> sameClaimRRPRiskList =  new ArrayList<>();
		 sameClaimRRPRiskList.add("A");
		 sameClaimRRPRiskList.add("B");
		 sameClaimRRPRiskList.add("C");
		 sameClaimRRPRiskList.add("D");
		
		 sameClaimRRPRiskList.forEach(s ->{
			printString(s);
		 });
		 
		 if(sameClaimRRPRiskList.isEmpty()) {
			 System.out.println(" list is empty ");
		 }else {
			 System.out.println(" list is not empty ");
		 }
		 
		 
		 List<String> fruits = new ArrayList<>();
		 fruits.add("Apple");
		 fruits.add(null);
		 fruits.add("Banana");
		 fruits.add(null);
		 System.out.println("Fruits objects:: "+fruits);
		 
		 fruits.removeIf(Objects::isNull);
		 System.out.println("Fruits objects after removing null::"+fruits);
	}
	
	public static void printString(String s) {
		System.out.println(s);
	}

}

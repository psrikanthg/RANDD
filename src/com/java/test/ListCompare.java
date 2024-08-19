package com.java.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListCompare {
	
	public static void main(String args[]) {
		
		List<String> ls1 = new ArrayList<>();
		ls1.add("ATMTEL20211109000324");
		ls1.add("ATMTEL20211109000393");
		ls1.add("ATMTEL20211109000436");
		List<String> ls2 = new ArrayList<>();
		ls1.add("ATMTEL20211109000324");
		ls1.add("ATMTEL20211109000393");
		ls1.add("ATMTEL20211109000436");
		//ls2.add("ATMTEL20211110000037");
		//ls2.add("ATMTEL20211110000046");
		
		//List<String> str1List = new ArrayList<String>(Arrays.asList(str1));	
		//List<String> str2List = new ArrayList<String>(Arrays.asList(str2));
		//Set<String> noDuplicate = new HashSet<>(Arrays.asList(str1));
		//System.out.println("after removing deplicate: "+str1.length);
		ls2.removeIf(x -> ls1.contains(x)); 
		ls2.forEach(System.out::println);
		System.out.println("after removing deplicate: "+ls2.size()+ " "+ls2);
		
	}

}

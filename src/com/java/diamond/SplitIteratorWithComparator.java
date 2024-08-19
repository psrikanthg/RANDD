package com.java.diamond;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorWithComparator {
	
	public static void main(String args[]) {
		//List<String> languageList = Arrays.asList("A", "B", "C", "D", "E", "F");
		List<String> languageList = List.of("Java", "C", "C++", "Python", "Scala", "Kotlin");
		Spliterator<String> languageSpliterator = languageList.spliterator();
		
		languageSpliterator.forEachRemaining(System.out::println);
		
		
		//System.out.println(languageSpliterator.getComparator());
	}

}

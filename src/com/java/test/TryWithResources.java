package com.java.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

public class TryWithResources {
	
	
	public static void main(String args[]) throws FileNotFoundException {
		//java 9 features, try with resources, can declare outside try
		FileOutputStream fOS = new FileOutputStream("javatpoint.txt");
		
		try(fOS) {
			String sr ="welcome to java";
			byte b[]=  sr.getBytes();
			fOS.write(b);
			System.out.println("File Written");
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		 //Java 9 version example, factory methods introduced in java 1.9
		  List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
		  for(String l:list) {  
	            System.out.println(l);  
	        }  
		  
		  Map<Integer, String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");
		  System.out.println(map);
		  
		
		
	}

}

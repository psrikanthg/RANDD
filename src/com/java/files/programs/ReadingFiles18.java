package com.java.files.programs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFiles18 {
	
	public static void main(String args[]) throws IOException {
		
		 String fileName ="javatpoint.txt";
		
		 File file = new File(fileName);
		 
		 if(file.createNewFile()) {
			 System.out.println("File is Created");
		 }else {
			 System.out.println("File already exists");
		 }
		
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.java.test;
import java.util.Arrays;
import java.util.List;

public class Playground {
	
	public static void main(String args[]) {
		
		List<Integer> ints = Arrays.asList(5, 3, 4,1);
		int total =0;
		
		for(Integer num: ints) {
			total +=num;
		}
		
		System.out.println("Total:: "+total);
		//lambada expression allows only local effective final or final variables inside 
		//Local variable total defined in an enclosing scope must be final or effectively final
		total =0;
		ints.forEach(num -> {
			total+= num;
		});
		
		
	}

}

package com.java.test;
import java.util.Objects;
import java.util.Optional;

public class OptionalClassExample {
	
	public static void main(String args[]) {
		
		String myName = null;
		Optional<String> opt =  process(myName);
		
		if(opt.isPresent()) {
			System.out.println(" String is not empty:: "+opt.get());
		}else {
			System.out.println("String is empty:: ");
		}
		
		if((Objects.nonNull(null))){
			System.out.println("null is object");
		}else {
			System.out.println("null is non object");
		}
	}
	
	
	public static Optional<String> process(String str){
		
		if(str !=null) {
			return Optional.ofNullable(str); 
		}
		
		return Optional.empty();
	}

}

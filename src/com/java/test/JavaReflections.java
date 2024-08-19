package com.java.test;
import java.lang.reflect.Field;
import java.util.Arrays;

public class JavaReflections {
	
	public static void main(String args[]) throws SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Field[] personFields = Child.class.getSuperclass().getDeclaredFields();
	    Field[] employeeFields = Child.class.getDeclaredFields();
	    Field[] allFields = new Field[employeeFields.length + personFields.length];
	    Arrays.setAll(allFields, i -> 
	      (i < personFields.length ? personFields[i] : employeeFields[i - personFields.length]));
	    
	    String fieldName = "policyStartDate";
	    for(Field fieldArray: allFields) {
	    	fieldArray.setAccessible(true);
	    	String fValue = (String)fieldArray.get("policyStartDate");
	    	System.out.println("Arrays :"+fValue);
	    }
	    System.out.println("Arrays :"+allFields.toString());
		
		
	}
	
	
	

}

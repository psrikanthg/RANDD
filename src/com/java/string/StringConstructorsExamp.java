package com.java.string;

public class StringConstructorsExamp {
	public static void main(String... args){
		
		StringBuilder builder = new StringBuilder();
		builder.append("stringbuilder can be passed as argument to the string..");
		
		System.out.println(" builder content is "+builder);
		
		String strBuilder = new String(builder);
		strBuilder = strBuilder.concat("successfull added");
		System.out.println("strbuilder is "+strBuilder);
		
		StringBuffer buffer = new StringBuffer(); //Zero length
		System.out.println(" lenth is "+buffer.length());
		buffer.append("string buffer can be passed as argument to the string");
		
		String strBuffer = new String(buffer);
		
		strBuffer = strBuffer.concat("appended to buffer");
		System.out.println(strBuffer);
		
		
		
	}
	
	

}

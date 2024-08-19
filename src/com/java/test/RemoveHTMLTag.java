package com.java.test;

public class RemoveHTMLTag {
	
	public static void main(String args[]) {
		String str = "<div><b>Geeks for Geeks</b></div>";
		str = str.replaceAll("\\<.*?\\>", "");
		System.out.println(str);
	}

}

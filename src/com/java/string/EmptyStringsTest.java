package com.java.string;
public class EmptyStringsTest {
    public static boolean isEmpty(String s) {
        return (s == null | s.length() == 0);
    }

    public static void main(String args[]) {
    	
    	EmptyStringsTest emptyStringsTest = new EmptyStringsTest();
    	EmptyStringsTest emptyStringsTest1 = emptyStringsTest;// new EmptyStringsTest();
    	
    	if(emptyStringsTest.equals(emptyStringsTest1)){
    		System.out.println(" equals method object class checks only the reference");
    	}
        if (isEmpty(null)) {
            System.out.print("empty ");
        } else {
            System.out.print("not_empty ");
        }
    }
}
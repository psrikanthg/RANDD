package com.java.string;
public class Test { 
	int a =10;
	public void doStuff1(int a){
		
		a+=1;
		System.out.println(a++);
	}
	
 public void doStuff2(int a){
		
		a+=1;
		System.out.println(++a);
	}
    private static void doStuff(String str) {
        int var = 4;
        if (var == str.length()) {
            System.out.print(str.charAt(var--) + " "); //charAt index starts from zero
        }
        else {
            System.out.print(str.charAt(0) + " ");
        }
    }
    public static void main(String args[]) {
    	Test test = new Test();
    	test.doStuff2(3);
    	System.out.println("After Modification: ");
    	System.out.println(test.a);
         doStuff("abcd");
          doStuff("efg");
          doStuff("hi");
        
        
        
    }
}
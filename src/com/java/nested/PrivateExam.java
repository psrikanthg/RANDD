package com.java.nested;

public class PrivateExam {
	
	private int a=10;
	private int b=20;
	String name ="srikanth";
	
	public void show(){
		
		int d=5;
		
		class Nested {  //Illegal modifier for the local class Nested; only abstract or final is permitted
			
			public Nested(){
				
			}
			int getCount(){
				//System.out.println(d);  //Cannot refer to the non-final local variable d defined in an enclosing scope
				System.out.println(name);
				return a*b;
			}
		}
		
		class Nessted1  extends Nested{
			
			
		}
		
		Nested nested  = new Nested();
		System.out.println(nested.getCount());;
	}

	
	public static void main(String ...args){
		
		PrivateExam exam = new PrivateExam();
		exam.show();
	}
}

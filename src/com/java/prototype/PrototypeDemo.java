package com.java.prototype;

public class PrototypeDemo {
	
	public static void main(String args[]) {
		
		Employee e = new Employee("Srikanth", 036, "Palm Court Block D", 1500.00) ;
		e.showRecord();
		
		Prototype g = e.getClone();
		Employee f =(Employee)g;
		f.showRecord();
		
	}

}

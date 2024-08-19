package com.java.designpatterns;
/*
 * When you want to represent a full or partial hierarchy of objects.
 * When the responsibilities are needed to be added dynamically to the individual objects without 
 * affecting other objects. Where the responsibility of object may vary from time to time.
 * 4 elements of Composite Pattern
 * 1 Declares interface for objects in composition.
 * 2. Implements default behavior for the interface common to all classes as appropriate.
 * 3. Declares an interface for accessing and managing its child components.
 * componenet, Leaf, Composite and client
 * Composite: Defines behavior for components having children.
 * 
 * Compose objects into tree structure to represent part-whole hierarchies, 
 * Composite lets client treat individual objects n compositions of objects uniformly
 *  
 */
public class CompositePatternDemo {
	
	public static void main(String args[]) {
		
		 Employee emp1=new Casher(101,"Sohan Kumar", 20000.0);  
         Employee emp2=new Casher(102,"Mohan Kumar", 25000.0);  
         Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);   
         Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  
            
          manager1.addEmployee(emp1);  
          manager1.addEmployee(emp2);  
          manager1.addEmployee(emp3);  
          manager1.print();  
	}

}

package com.java.designpatterns;

/**
 * 
 * 
 * @author admin-pamangundla
 *
 * decouple the functional abstraction from the implementation 
 * so that two can vary independently
 *
 */
public class BridgePatternDemo {
	
	public static void main(String args[]) {
		
		//It enables the separation of implementation from the interface.
		//It improves the extensibility.
		//It allows the hiding of implementation details from the client.
		QuestionFormat questions = new QuestionFormat("Java Programming Language");  
	    questions.q = new JavaQuestions();  
	        questions.deleteQuestion("what is class?");  
	        questions.display();  
	    questions.newOne("What is inheritance? ");  
	      
	    questions.newOne("How many types of inheritance are there in java?");  
	    questions.displayAll();  
		
	}

}

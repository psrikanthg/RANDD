package com.java.designpatterns;
/*
 *  QuestionManager class that will use Question interface which will act as a bridge.
 * 
 */
public class QuestionManager  {

	protected Question q;
	public String catalog;
	
	public QuestionManager(String catalog) {
		this.catalog = catalog;
	}
	
	public void next() {
		q.nextQuestion();
	}
	
	public void previous() {
		q.previousQestion();
	}
	
	public void newOne(String quest) {
		q.newQestion(quest);
	}
	
	public void deleteQuestion(String quest) {
		q.deleteQuestion(quest);
	}
	
	public void display() {
		q.displayQuestion();
	}
	
	public void displayAll() {
		System.out.println("Question Paper: "+catalog);
		q.displayAllQuestions();
	}
	
	
}

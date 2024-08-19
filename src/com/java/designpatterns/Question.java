package com.java.designpatterns;

public interface Question {
	
	public void nextQuestion();
	public void previousQestion();
	public void newQestion(String q);
	public void deleteQuestion(String q);
	public void displayQuestion();
	public void displayAllQuestions();
	
}

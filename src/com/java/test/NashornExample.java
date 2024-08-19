package com.java.test;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
	
	public static void main(String args[]) throws ScriptException {
		
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
		engine.eval("print('Hello Nashorn');");
	}

}

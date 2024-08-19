package com.java.interface1;

public class MultiInt implements I2{

	public static void main(String args[]){
		   new MultiInt().go();
		}

		void go(){
		  System.out.println(doStuff());
		}

		int doStuff(){
		return 3;
		}

}

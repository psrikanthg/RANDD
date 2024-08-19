package com.java.statics;

public class StaticExam {
	 public static void book() {
	               System.out.println(" static block can be called from non static block");
	               
	        }
	        
	        public void cancelBooking() {
	                this.book();
	        }    
	        
	        static int x[];
	        
	        static {
	            x[0] = 1;
	        }
	        
	      public static void main(String... args){
	    	  
	    	  StaticExam exam = new StaticExam();
	    	  exam.cancelBooking();
	    	  
	    	  Runtime runtime = Runtime.getRuntime();
	    	  System.out.println(runtime.availableProcessors());
	    	  
	      }
}


package com.parent;
public class TryMe {
	
	public TryMe(){
		super();
		
	}
	 public static void book(short a) {
	        System.out.print("short ");
	    }
	    
	    public static void book(Short a) {
	        System.out.print("SHORT ");
	    }
	    
	    public static void book(Long a) {
	        System.out.print("LONG ");
	    }
	    
     Integer A;
      int a;
      public TryMe(int a) {
          this.a = A + a;
         System.out.print(this.a);
     }
      
      
      private Integer value = 1;
      
      public Integer getValue() {
          return value;
      }
      
      public void changeVal(Integer value) {
    	  //The constructor Integer(int) is deprecated since version 9
    	  //instead of use Integer.valueOf(int)
          value = new Integer(3);
      }
      
      public static void main(String args[]) {        
         /* Integer A = new Integer(1);
          TryMe t = new TryMe(A);*/
          
          short shortRoom = 1;
          int intRoom = 2;
          
          book(shortRoom);
          //book(intRoom);
          TryMe t = new TryMe();
          Integer a = new Integer(2);
          t.changeVal(a);
          System.out.print(a);
     }
  }
import java.io.BufferedReader;
import java.util.TreeSet;


public class SampleNewInEx {

	  void show(Object ob){
		  
		  System.out.println(" Object ..."+ob);
		  
	  }
	  
	  void show(String obj){
		  
		  System.out.println("String  obj"+obj);
	  }
	  
	  void show(int obj){
		  
		  System.out.println(" int ->> "+obj);
	  }
	  
	  void show(Double obj){
		  
		  System.out.println(" Double->>> "+obj);
	  }
	  
	  public static void main(String args[]){
		  
		  
		  new SampleNewInEx().show(0);
		  new SampleNewInEx().show("");
		 // new SampleNewInEx().show(null); The method show(Object) is ambiguous for the type SampleNewInEx
		  BufferedReader bufferedReader  = new BufferedReader(null);
		 
		  TreeSet set  = new TreeSet();
		  
		  set.add("a");
		  set.add("b");
		  set.add("A");
		  
		  System.out.println(" set"+set);
		  
		  int a = 10;
		  
		 System.out.println(Math.E);
		 
		 for(int i=0; true; i++){
			 System.out.println(" inside the braek");
			 break;
			 
		 }
	  }
}


public class GenericsExample<T> {
	
	T obj;
	
	public GenericsExample(){
		
		System.out.println("Genrcis constructors created...");
	}
	public void add(T obj){
		this.obj  = obj;
		
	}
   
	public T get(){
		
		return obj; 
	}
	
	
	public static void main(String args[]){
		
		GenericsExample<String> example  = new GenericsExample<String>();
		
		example.add("hello generic");
		
		System.out.println(" String generics added sucessfully "+example.get());
		
		
		GenericsExample<Integer> example2  = new GenericsExample<Integer>();
		example2.add(new Integer(100));
		
		System.out.println(" Integers addess succesfully "+example2.get());
	}
}

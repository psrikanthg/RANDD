
public class GenericExam<T> {
	
	
	T obj;
	//static T obj2; //static can not be used in generics
	
	T get(){
		
		return obj;
	}
	
	void set(T obj){
		
		this.obj = obj;
		
	}
	
	public static void main(String args[]){
		
		int a =10;
		GenericExam<Integer> example  = new GenericExam<Integer>();
		example.set(new Integer(10));
		System.out.println(example.get());
	   
	}

}


public class SubClass  extends BaseClass{
	
	public SubClass(){
		super();
		m1= "Hi";		
	}
	
	
	private String m1;
	
	public static void show(){
		System.out.println(" hello show ");
	}
	public void foo(){
		System.out.println(" Sub Class fool is exectued..");
		System.out.println(" SubClass foo()"+m1.toLowerCase());
	}
	
	public static void main(String args[]){
		
		//BaseClass  base = new SubClass();
		//base.foo();
		SubClass class1 = null;
		class1.show();
		String s = null;
		System.out.println(s.valueOf(10));
	}

}

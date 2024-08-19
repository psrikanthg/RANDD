import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;



public class Employee implements Cloneable{

	
	public String id;
	public String firstName, lastName;
	
	
	
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@CustomAnnotationEx(value =10)
	public void sayHello(){
		System.out.println(" hello annotation ");
	}
	
	
	public static void main(String args[]) throws SecurityException, NoSuchMethodException{
		
		List<String> list =  new ArrayList<String>();
		A a = new A();
		Employee employee = new Employee();
		Method m =  employee.getClass().getMethod("sayHello");
		
		CustomAnnotationEx annotationEx  = m.getAnnotation(CustomAnnotationEx.class);
		System.out.println(" annotation values is"+annotationEx.value());
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println("list size is  "+list);
		 
	}
	
	
}


class A implements Cloneable{
	
	
	
}

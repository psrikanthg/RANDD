
public class SingleTon {

	
	public String name, lastName;
	
	private SingleTon(){
		
		
	}
	
	public static SingleTon  getInstance(){
		
		return  new SingleTon();
	}
	
	public void show(){
		
		System.out.println("firstName"+name+" "+lastName);
	}
	
	
	public static void main(String args[]){
		
		SingleTon.getInstance().show();
		
	}
}

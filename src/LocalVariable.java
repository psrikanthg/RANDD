import java.util.Scanner;


public class LocalVariable implements Cloneable{

	
	public LocalVariable(){
		//return;
		
	}
	public int i;
	public void show(int i){
		
		i =  i;
		System.out.println(i);
	}
	
	
	 
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		 new LocalVariable().show(10);
		 
		
		
	}
}


public class ThreadExample {
	
	public static void main(String args[]) {
		
		new Thread(() ->{
			System.out.println("Hellow thread");
		}).start();
		
		
	}

}

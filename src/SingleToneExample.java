
public class SingleToneExample {

	public static SingleToneExample example  =null;
	
	private SingleToneExample(){
		
		
	}
	
	
	public static SingleToneExample getInstance(){
		
		if(example == null){
			return new SingleToneExample();
		} else{
			return null;
		}
		
	}
	
	public void show(){
		
		System.out.println("Single Tone Exmaple ");
	}
	
	
	public static void main(String args[]){		
		SingleToneExample.getInstance().show();
		
	}
	

}

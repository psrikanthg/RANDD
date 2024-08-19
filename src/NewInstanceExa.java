/*
 *  there are different ways to create objects
 *  using new keyword
 *  using Class.newinstance
 *  using clone
 *  using deserialization
 *  using newInstance() method of constructor class
 * 
 * 
 * 
 */
public class NewInstanceExa {
	
	public static  void main(String args[]){
		
		try {
			Class class1  = Class.forName("SampleNewInEx");
			SampleNewInEx ex  =(SampleNewInEx)class1.newInstance();
			
			ex.show();
			
			
		} catch (Exception exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		
		
	}

}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MediaPlayer {

	
	public static void main(String[] args) throws Exception {
	    /*java.io.File file = new java.io.File("bark.aiff");
	    AudioClip sound = Applet.newAudioClip(file.toURL());
	    sound.play();*/
		
		int a[] = {10, 20, 30};
		hello(a);
		MediaPlayer player = new MediaPlayer();
		Innner  innner = player.new Innner();
		
		Map<String, String> m = new HashMap<String, String>();
		m.put("Hello", "Hello");
		
		Iterator iterator =  m.entrySet().iterator();
		
		while(iterator.hasNext()){
			Map.Entry<String, String>  hello =(Map.Entry<String, String>)iterator.next(); 
			
			System.out.println("Hello map   "+hello.getValue());
			System.out.println("Hello map   "+hello.getKey());
			
		}
 		
	  }
	
	
	 static void  hello(int ...name){
		for(int b:name){
			System.out.println(b);
		}
		System.out.println("Hello...");
		
	}
	 
	 
	 public class Innner{
		 
		 public Innner(){
			 System.out.println("Hello Inner Class");
		 }
		 
	 }

}


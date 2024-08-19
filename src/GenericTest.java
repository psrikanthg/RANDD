import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GenericTest {
	
	public void drawShape(List<? extends Shape> list){
		Set<String> set  = new HashSet<String>();
		
		set.add("Helloll..");
		
		for(String s: set){
			System.out.println(s);
		}
		
		for(Shape s:list){
			s.draw();
		}
	}
	
	
	public static void main(String args[]){
		
		List<Rectangle> list = new ArrayList<Rectangle>();
				
				list.add(new Rectangle());
		
		List<Circle> circles = new ArrayList<Circle>();
		
		  circles.add(new Circle());
		
		GenericTest genericTest  = new GenericTest();
		
		genericTest.drawShape(list);
		
		genericTest.drawShape(circles);
		
		
	}

}

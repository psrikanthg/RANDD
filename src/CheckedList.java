import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;


public class CheckedList  implements InterfaceM1 , Interac2{
	
	public static void main(String args[]){
		
		ArrayList<String> arg = new ArrayList<String>();
		
		arg.add("1234");
		arg.add("12345");
		
		arg.add(new String("1234"));
		
		arg.add("1234");
		arg.add("1234");
		
		ArrayList rawlist = arg;
		
		rawlist.add(new Date());
		
		Collection<String> typesafeView = Collections.checkedList(rawlist,String.class);  
		
		System.out.println(rawlist);
		
		
		
 	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class StringBuilderClass {
	
	
	public static void main(String ar[]){
		StringBuilder builder = new StringBuilder();
		
		/*builder.append("           srikanth;             ");
		
		
		String finla = builder.substring(0, builder.length()-1);
		//System.out.println("test::::::::::"+builder.substring(0, builder.length()-1)+"finalll::::"+finla);
		System.out.println("Hello   "+builder.length());
		String name = builder.toString();
		name = name.trim();
		System.out.println("Hello111      "+name.substring(0, name.length()-1));
		
		if(builder.indexOf("srikanth") >=0){
			
			System.out.println(builder.indexOf("srikanth1"));
		}
		
		
		Set<String>  list = new HashSet<String>();
		String fullName = "srikanth"+","+"LastName"+";";
		list.add("s1");
		list.add("s2");
		list.add(fullName);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
		
		list.clear();*/
		
		List<String> list =  new ArrayList<String>();
		
		list.add("srikanth");
		list.add("sasi");
		list.add("srikanth");
		if(!list.isEmpty()){
			if(list.contains("srikanth")){
				System.out.println("its true...");
				
			}
			
		}
		// 
		
		String s = "srikanth";
		System.out.println("ssss");
		//char ars[] = s.toCharArray();
		//System.out.println(ars[3]);
		
		String b = String.valueOf(s+s.substring(0, 4));
		System.out.println(b);
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("srikanth", "mca");
		map.put("lohit", "4year");
		
		Set<Entry<String, String>> set  = map.entrySet();
		
		Iterator<Map.Entry<String, String>> iterator = set.iterator();
		
		while(iterator.hasNext()){
			Map.Entry<String, String> values = iterator.next();
			
	         System.out.println("hello"+values.getKey()+"values  "+values.getValue());
		}
		
		StringBuilder builder1 = new StringBuilder(10);
		String string = new String();
		
		   System.out.println(builder1.length()+"fffffffffffffffffffff"+string.length());
		
	}
	
	
	

}

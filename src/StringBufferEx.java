
public class StringBufferEx {
	
	
	public static void main(String args[]){
		
		String s1= new String("java");
		String s2 = new String("java");
		
		String arg= "1234;"; 
		String ar[] = arg.split(";");
		
		for(String b: ar){
			
			System.out.println(" -->>>"+b);
		}
		

		System.out.println(" both string are equal "+s1.equals(s2));
		
		StringBuffer buffer = new StringBuffer("java");
		StringBuffer buffer2 = new StringBuffer("java");
		
		System.out.println("both stringbuffer are equal "+buffer.equals(buffer2));
		System.out.println("both stringbuffer are equal "+buffer.compareTo(buffer2));
		
		System.out.println(" "+7+2+" ");
	}
	
}

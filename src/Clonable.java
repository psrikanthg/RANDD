import java.util.Date;


public class Clonable implements Cloneable {
	
	
	 public static void main(String[] args)   throws CloneNotSupportedException{
		
		Clonable clonable = new Clonable();
		clonable.clone();
		Integer integer[] =  new Integer[10];
		
		
		String s ="ROOT_PDSF_CDOO";
		String value = "-30";
		int down = Integer.valueOf(value);
		System.out.println(" down "+down);
		
		System.out.println(s.substring(0, 14));
		System.out.println(daysBetween(new Date("16-July-2016"), new Date()));
		
	}
	 
	 
	 private static long daysBetween(Date one, Date two) 
	 { 
		 
		 long difference = (one.getTime()-two.getTime())/86400000; 
		 return Math.abs(-12); 
	 
	 }

	

}



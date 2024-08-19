import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class TestDate {
	
	public static void main(String arg[]){
		SimpleDateFormat format= new SimpleDateFormat("MM/dd/yyyy");
		
		Calendar when = Calendar.getInstance();
		Calendar nw = Calendar.getInstance ();
		when.set (Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		when.set (Calendar.MONTH, Calendar.MAY);
		when.set(Calendar.HOUR_OF_DAY, 0);
		when.set(Calendar.MINUTE, 0);
		when.set(Calendar.SECOND, 0);
		when.set(Calendar.MILLISECOND, 0);
		
		
		
		System.out.println(" Second Monday is  "+when.getTime());
		
		int a = 1;
		
		a|=5;
		
		 System.out.println(a+" a|=5");
	   
		Calendar calendar =  Calendar.getInstance();
		//format.format(calendar.getTime());
		System.out.println("current date is      "+calendar.getTime());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		  calendar.set(Calendar.MINUTE, 0);
		  calendar.set(Calendar.SECOND, 0);
		  calendar.set(Calendar.MILLISECOND, 0);
		// current Date < Dute Date
		if(calendar.before(when)){
			
			System.out.println("when1234 "+when.getTime()+" today Date "+calendar.getTime());
			
		} 
		 // CurretnDate > Due Date
		if(calendar.after(when)) {
			
			System.out.println("when "+when.getTime()+" today Date "+calendar.getTime());
		}
		
		
		Locale locale=Locale.getDefault();  
		//Locale locale=new Locale("fr","fr");//for the specific locale  
		  
		System.out.println(locale.getDisplayCountry());  
		System.out.println(locale.getDisplayLanguage());  
		System.out.println(locale.getDisplayName());  
		System.out.println(locale.getISO3Country());  
		System.out.println(locale.getISO3Language());  
		System.out.println(locale.getLanguage());  
		System.out.println(locale.getCountry());  
		
		
		String s = "\"" + "srikanht"+ "\""; 
		System.out.println(s);
		
	
	}

}

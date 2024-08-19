import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class StringDemo {
	
	public static void main(String args[]){
		
		/*String s ="ROOT_NANL_OPRT";
		
		System.out.println(s.contains("ROOT_NANL"));
		
		
		String[][] a1= new String[][] {{"Grape", "Apple",  "Mango"}, {"Fresh", "Not Fresh", "Too Old"}, {"Banana", "Orange", "Chikku"}}; 
		String str[]=new String[3];


		
		for(int j=0; j<a1.length;j++)
		 {
		     for (int i=0 ; i<3; i++)
		     {
		         str[i]=a1[j][i];
		     }
		 for(int i=0;i<str.length;i++)
		 {
		     for(int k=i+1;k<str.length;k++)
		     {
		         if(str[i].compareTo(str[k])>0)
		         {
		             String temp= str[i];
		             str[i]=str[k];
		             str[k]=temp;
		         }

		         }
		     System.out.print(str[i]+ " ");
		  }
		 System.out.println();
		 }*/

		  Calendar calendar= Calendar.getInstance();
		  
		  calendar.set (Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		  calendar.set (Calendar.DAY_OF_WEEK_IN_MONTH, 2);
		  calendar.set(Calendar.HOUR_OF_DAY, 0);
		  calendar.set(Calendar.MINUTE, 0);
		  calendar.set(Calendar.SECOND, 0);
		  calendar.set(Calendar.MILLISECOND, 0);
		  
		  System.out.println("Current Date is"+calendar.getTime()+" calendar2 ");
		  
		  Calendar calendar2 = Calendar.getInstance();
		  System.out.println("Current Date is"+calendar2.getTime()); 
		  
		  calendar2.set(Calendar.HOUR_OF_DAY, 0);
		  calendar2.set(Calendar.MINUTE, 0);
		  calendar2.set(Calendar.SECOND, 0);
		  calendar2.set(Calendar.MILLISECOND, 0);
		  
		  if(calendar.getTime().compareTo(calendar2.getTime()) == 0){
			  
			  
			  System.out.println("Both are equall");
		  } else{
			  
			  System.out.println("Not equall..");
		  }
		  
		  
		  String s = "ROOT_0001";
		  String []ar = s.split("_");
		  for(String list: ar){
			  System.out.println(list);
		  }
		  System.out.println("sdfsdfsdfds"+s.length());
		  System.out.println("sdfsdfsdfds->"+ar);
		  
		  System.out.println("sdfsdfsdfds->"+s.split("_").length);
		  if(2>=2){
			  
			  System.out.println(" both are true..");
		  }
		  
		  String value ="java";
		  System.out.println("before change"+value);
		  change(value);
		  System.out.println("after change the value"+value);

		
	}
	
	public static void change(String value){
		
		value="c++";
	}

}

package com.ness;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StoreData {

	
	public static void main(String args[]){
		
		 SimpleDateFormat dateFormat 						= new SimpleDateFormat("MM/dd/yyyy");
		 Date date = dateFormat.format(dateFormat.parse("2013-09-18"));
		 System.out.println(date);
		 
		 
		/*Configuration configuration = new Configuration();
		
		configuration.configure("Employee.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e = new Employee();
		
		e.setFirstName("pamangundla");
		e.setLastName("Srikanth");
		
		session.persist(e);
		transaction.commit();
		session.close();*/
		
		Calendar calendar = Calendar.getInstance();
	
		
		System.out.println("Calendar Date is"+calendar.getTime());
		calendar.add(Calendar.DATE, -1);
		
		System.out.println("after -1 days "+calendar.getTime());
	}
		
}

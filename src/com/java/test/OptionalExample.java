package com.java.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {
	
	public static void main(String args[]) {
		//optional methods
		//Optional.of();
		//Optional.ofNullable();
		//Optional.isPresent();
		//Optioanal.get();
		//Optonal.empty();
		//orElse
		//orElseGet();
		//orElseThrow();
		//ifPresent();
		//filter
		//map
		//flapmap
		//
		
		User user =null;
		Optional<User> optionalCheck = Optional.ofNullable(user); 
		
		if(optionalCheck.isPresent()){  // check for value is present or not  
            System.out.print("user is available");
        }else  
            System.out.println("user value is not present");  
		
		List<User> user1 = new ArrayList<>();
		User user2 = new User("Paman", "Sreekanht");
		User user3 = new User("Bhupathi", null);
		User user4 = new User("Paman", null);
		user1.add(user2);
		user1.add(user3);
		user1.add(user4);
		
		System.out.println("original user list "+user1.size());
		user1.forEach(u -> System.out.println(u.firstName+"  "+u.getLastName()));
		
		List<User> l2=user1.stream().map(t->{
            t.setLastName("bhavani");
            return t;
        }
    ).collect(Collectors.toList());
		l2.forEach(u -> System.out.println(u.firstName+"  "+u.getLastName()));
		
		List<User> emptyList = user1.stream().filter(u -> u.getLastName() !=null).collect(Collectors.toList());
		System.out.println("only Empty List: "+emptyList.size());
		emptyList.forEach(u -> System.out.println(u.firstName+"  "+u.getLastName()));
		
		emptyList.forEach( u1 -> {
			
			switch(u1.getFirstName()) {
			case "Paman":
				u1.setFirstName("Pamangundla");
			   break;
			   
			default:
				break;
				
			}
			
		});
		
		System.out.println("=============================");
		System.out.println("After Backward compatability");
		emptyList.forEach(u -> System.out.println(u.firstName+"  "+u.getLastName()));
		
		
		
    }  

}

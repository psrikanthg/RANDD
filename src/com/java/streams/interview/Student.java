package com.java.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Student {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String gender;
	
	private String departmantName;
	
	private int joinedYear;
	
	private String city;
	
	private int rank;
	
	public Student(int id, String firstName, String lastName, int age, String gender, String departmantName, int joinedYear, String city, int rank) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.gender =gender;
		this.departmantName = departmantName;
		this.joinedYear = joinedYear;
		this.city =city;
		this.rank =rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartmantName() {
		return departmantName;
	}

	public void setDepartmantName(String departmantName) {
		this.departmantName = departmantName;
	}

	public int getJoinedYear() {
		return joinedYear;
	}

	public void setJoinedYear(int joinedYear) {
		this.joinedYear = joinedYear;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		
		return "Employee [id="+id+", firstName ="+firstName+",  lastName ="+lastName+" , age ="+age+" , gender ="+gender+" ,  "
				+ "departmantName="+departmantName+" , joinedYear="+joinedYear+" , city="+city+" , rank="+rank;
	}
	
	public static void main(String args[]) {
		
		List<Student> list = Arrays.asList(
			    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
	
	    
		//find list of students whose first name starts with alphabet A
		List<Student> aStudentNames = list.stream().filter(s -> s.getFirstName().startsWith("A")).collect(Collectors.toList());
		System.out.println("List of Students whose name starts with Alphabet A");
		aStudentNames.forEach(s -> System.out.println(s.getFirstName()));
		
		Map<String, List<Student>> groupStdByDepar = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
	    System.out.println("Students by Group Department"+groupStdByDepar);
	    
	    //total count of students
	    Long totalSt = list.stream().count();
	    System.out.println("Total Count of Students "+totalSt);
	    
	    //Max Age of Students
	     OptionalInt  maxAgeSt = list.stream().mapToInt(s -> s.getAge()).max();
	       System.out.println("Max Age of Student: "+maxAgeSt.getAsInt());         
	    
	      //Find all department names
	      List<String> departmentNames = list.stream().map(s -> s.getDepartmantName()).distinct().collect(Collectors.toList());
	      System.out.println("List of Department Names"+departmentNames);
	      
	      //find the count of student in each department
	      Map<String, Long> departStdCount = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
	      System.out.println("Department Student Count");
	      System.out.println(departStdCount);
	      
	      //avg age of male n female students
	      Map<String, Double> avgAgeOfMF = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
	      System.out.println("Avg Age of Male n FeMale");
	      System.out.println(avgAgeOfMF);
	      
	      //find the department who having maximu no of students
	      Entry<String, Long> maxStu = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream().max(Entry.comparingByValue()).get();
	      System.out.println("dept having Maximu No Of Students");
	      System.out.println(maxStu);
	      
	      //find the highest rank in each dept
	      Map<String, Optional<Student>> higestRank = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparing(Student::getRank))));
	      System.out.println("find higest rank in each dept");
	     // System.out.println(higestRank);
	      for (Entry<String, Optional<Student>> x : higestRank.entrySet()) {
	    	  Optional<Student> v = x.getValue();
	    	    System.out.println(x.getKey()+" :: "+v.get().getFirstName()+" - "+v.get().getRank());
	    	}
	      
	      
	      //list of students n sort them by their rank
	      List<Student>  sortByRank = list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
	      
	      System.out.println("Sort students by their Rank");
	      sortByRank.forEach(t -> System.out.println(t.getFirstName()+" "+t.getRank()));
	      
	      //find the student who has second rank
	      Student secRank =  list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
	      System.out.println("2nd Higest Rank");
      	System.out.println(" is Palindrom num ");
        
	      System.out.println(secRank.getFirstName()+" "+secRank.getRank());
	      
	      //sort by name n rank
	      List<Student> sortByNameRank = list.stream().sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getRank)).collect(Collectors.toList());
	      System.out.println("Sort by Name n Rank");
	      sortByNameRank.forEach(s -> System.out.println(s.getFirstName()+"  "+s.getRank()));
	      
	       OptionalInt maxRank =    list.stream().mapToInt(s -> s.getRank()).max();
	       System.out.println("Max Rank "+maxRank.getAsInt());
	       
	       OptionalInt minRank = list.stream().mapToInt(s -> s.getRank()).min();
	       System.out.println("Min Rank "+minRank.getAsInt());
	       
	       List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	       //find duplicates using streams
	       Set<Integer> hahSet = new HashSet<>();
	       Set<Integer> setList = myList.stream().filter(s -> !hahSet.add(s)).collect(Collectors.toSet());
	       System.out.println(setList);
	       //find first elements of Array
	        Integer firstEle =myList.stream().findFirst().get();
	        System.out.println(firstEle);
	        //count no of elements in list of Integer
	        Long listC = myList.stream().count();
	        System.out.println("Total Elements in List "+listC);
	      
	        //find max elements in list of Integers
	        OptionalInt maxEle = myList.stream().mapToInt(n -> n).max();
	        Integer     maxElm = myList.stream().max(Integer::compare).get();
	        System.out.println("Max Element is "+maxEle.getAsInt());
	        System.out.println("Max Element is "+maxElm);
	        
	        //find first repeated character in string
	        String input = "Java Articles are Awesome";
	        Character  firstRe =    input.chars().mapToObj(s  -> Character.toLowerCase(Character.valueOf((char)s)))
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,  Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() >1L).map(entry -> entry.getKey()).findFirst().get();
	        System.out.println(firstRe);
	        
	        System.out.println("Sort List of Integer in Descending Order");
	        List<Integer>  descOrder =  myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	        System.out.println(descOrder);
	        
	        //return true if at least elements appears twice in the array
	        //return false if every element is distinct
	        int[] nums = new int[] {1,2,3,1};
	         
	        List<Integer>  listNos = Arrays.stream(nums).boxed().collect(Collectors.toList());
	        Set<Integer> uniSet = new HashSet<>(listNos);
	        if(listNos.size() ==uniSet.size()) {
	        	System.out.println(false);
	        }else {
	        	System.out.println(true);
	        }
	        
	        
	        System.out.println("Current Local Date: "+java.time.LocalDate.now());
	        System.out.println("Current Local Time: "+java.time.LocalTime.now());
	        
	        //concate two list of strings
	        List<String> list1 = Arrays.asList("Java", "8");
	        List<String> list2 = Arrays.asList("explained", "through", "programs");
	        
	        List<String> list3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	        System.out.println("Concate two strings");
	        System.out.println(list3);
	        
	        //find cube of number n filter greater than 50
	        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	        List<Integer>  greter50= integerList.stream().map(n -> n*n*n).filter(n -> n>50).collect(Collectors.toList());
	        System.out.println("Cube of Number n greater than 50"+greter50);
	        
	        //sorte the array, then convert into stream
	        int arr[] = new int[] {99, 55, 203, 99, 4, 91};
	        
	        System.out.println("Sort array n stream array");
	        Arrays.sort(arr);
	        Arrays.stream(arr).forEach(System.out::println);
	        
	        //Count each word from String ArrayList
	        List<String> names = Arrays.asList("AA", "BB", "BB",  "AA", "CC");
	        Map<String, Long> wordCountMap = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println("Each word count in string array List");
	        System.out.println(wordCountMap);
	       
	        Map<String, Long>   dupWords = names.stream().filter(s -> Collections.frequency(names, s)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println("Duplicate words");
	        System.out.println(dupWords);
	        
	        //Find the max element of array
	        int arry[] = new int[] {12,19,20,88,1,9};
	       
	        int mxEle = Arrays.stream(arry).max().getAsInt();
	        System.out.println("mxElement "+mxEle);
	        int mnElem =  Arrays.stream(arry).min().getAsInt();
	        System.out.println("Min Elem: "+mnElem);
	        
	        //count of each character in a string
	        String s = "string data to count each character";
	        LinkedHashMap<String, Long> linkedMap =       Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	        System.out.println("Count of Each Character in String");
	        System.out.println(linkedMap);
	        
	        System.out.println("Fibonacci Series");
	        //0, 1, 1, 2, 3
	        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
	        System.out.println("Prime Number");
	        //prime dived by itself or 1
	        int isPrime = 38;
	        boolean primeOrNot = IntStream.rangeClosed(2, isPrime/2).noneMatch(n -> isPrime%n ==0);
	        System.out.println(isPrime+" is Prime or Not "+primeOrNot);
	        
	        //write a program to check number is Palindrom or not
	        //reverse number is called Palindrom 
	        int num = 545;
	        int palin = IntStream.iterate(num, i->i!=0, i->i/10).map(n -> n%10).reduce(0,(a, b)-> a*10+b );
	        if(num == palin) {
	        	System.out.println(" is Palindrom num ");
	        }else {
	        	System.out.println("is not a palindrom Number");
	        }
	        
	         //Write a program to Armstrong number 
	         int isArm =  153;
	         int lgth = String.valueOf(isArm).length();
	         int isResult =IntStream.iterate(isArm, i->i!=0, i ->i/10).limit(lgth).map( n -> (int)Math.pow(n%10, lgth)).sum();
	         System.out.println(isArm==isResult);     
	         
	         
	         //write a program palindrom
	         //Reverse of a number is called palindrom
	         int number = 546;
	          int palind = IntStream.iterate(number, i->i!=0, i -> i/10).map(n -> n%10).reduce(0, (a, b)-> a*10+b);
	          if(number == palind) {
	        	  System.out.println("Palindrom Number");
	          }
	          
	          int numberSum =145;
	           
	          int sumNum=  Arrays.stream(String.valueOf(numberSum).split("")).mapToInt(n ->Integer.valueOf(n)).sum();
	             System.out.println(numberSum+" sum is "+sumNum);  
	             
	            //factorial number
	           int fact =5;
	           int factResult = IntStream.rangeClosed(2, fact).map(n ->n).reduce(1, (a, b)->a*b);
	           System.out.println("5 Factorial is"+factResult);
	           
	           armstrongNumber();
	           fibonacciSeris();
	           
	        
	}
	
	public static void armstrongNumber() {
		System.out.println("ArmStrong Number Result: ");
		//write a program for Armstrong number
		//square root of their length is Armstrong number
        int isArm =  153;
        int numLength = String.valueOf(isArm).length();
        int result =IntStream.iterate(isArm, i->i!=0, i->i/10).peek(p -> System.out.println("p ->>"+p)).limit(numLength).map(n -> (int)Math.pow(n%10, numLength)).peek(p -> System.out.println("after map: p"+p)).sum();
        System.out.println(result);
	}
	
	public static void fibonacciSeris() {
		System.out.println("inside the Fibonaci Series..");
        //wrtie a program to print 10 fibonacci series
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
	}

}

package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;



public class Student {
	
	int id;
	String firstName;
	String departmentName;
	int age;
	String gender;
	String city;
	int rank;
	
	public Student() {
		
	}
	
	List<Address> address;
	
	
	

	public Student(int id, String firstName, String departmentName, int age, String gender, String city, int rank, List<Address> address){
		this.id =id;
		this.firstName = firstName;
		this.departmentName = departmentName;
		this.age =age;
		this.gender =gender;
		this.city =city;
		this.rank = rank;
		this.address=address;
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



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
	
	public List<Address> getAddress() {
		return address;
	}



	public void setAddress(List<Address> address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [id="+id+", firstName="+firstName+",  departmentName="+departmentName+", age="+age+
				", gender="+gender+", city="+city+", rank="+rank;
	}
	
	public static void main(String args[]) {
		
		Student  s1=  new Student();
		s1.setFirstName("srikanth");
		
		Student  s2= s1;
		s2.setFirstName("bhavani");
		Student s3 = s2;
		s3.setFirstName("Tapas");
		System.out.println(s1.getFirstName()+" "+s2.getFirstName()+" "+s3.getFirstName());
		
		String s5 ="test";
		String s6 = "test";
		if(s5 == s6) {
			System.out.println("both are same");
		}
		
		List<Address> address1 = new ArrayList<Address>();
		Address perAdd = new Address("Nalgond", "TS",  "508205", "3-62");
		Address currAdd = new Address("BrickFields", "KL", "50470", "D805");
		address1.add(perAdd);
		address1.add(currAdd);
		
		List<Address> address2 = new ArrayList<Address>();
		
		
		
		List<Address> address3 = new ArrayList<Address>();
		
		Address perAdd3 = new Address("Nakrekal", "TS",  "508210", "4-62");
		Address currAdd3 = new Address("BrickFields", "KL", "50470", "D805");
		address3.add(perAdd3);
		address3.add(currAdd3);
		
		List<Address> address4 = new ArrayList<Address>();
		List<Address> address5 = new ArrayList<Address>();
		List<Address> address6 = new ArrayList<Address>();
		List<Address> address7 = new ArrayList<Address>();
		List<Address> address8 = new ArrayList<Address>();
		List<Address> address9 = new ArrayList<Address>();
		List<Address> address10 = new ArrayList<Address>();
		List<Address> address11 = new ArrayList<Address>();
		
		List<Student> studentList = Arrays.asList(
				new Student(1, "Rohit", "Mechanical Engineering", 25, "Male", "Mumbai", 122, address1 ),
				new Student(2, "Rohit", "Mechanical Engineering", 25, "Male", "Delhi", 6, address2),
				new Student(3, "Pulkit", "Computer Engineering", 26, "Female", "Kerala", 8, address3),
				new Student(4, "Ankit", "Mechanical Engineering", 25, "Male", "Kerala", 9, address4),
				new Student(5, "Satish Ray", "Mechanical Engineering", 25, "Male", "Mumbai", 10, address5),
				new Student(6, "Roshan", "Biotech Engineering", 20, "Male", "Mumbai", 122, address6),
				new Student(7, "Chetan", "Mechanical Engineering", 35, "Male", "Karnataka", 55, address7),
				new Student(8, "Arun", "Electronics Engineering", 27, "Male", "Karnataka", 12, address8),
				new Student(9, "Nam", "Computer Engineering", 29, "Male", "Mumbai", 23, address9),
				new Student(10, "Sonu", "Mechanical Engineering", 22, "Female", "Delhi", 23, address10),
				new Student(11, "Shubham", "Instrumentation Engineering", 23, "Male", "Mumbai", 24, address11));
		
		
		List<Student> students =studentList.stream().filter(st-> st.firstName.startsWith("A")).collect(Collectors.toList());
		
		System.out.println("List of Student name starts with: "+students);
		
		Map<String, List<Student>> mapDate = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName));
		System.out.println("==============================================");
		System.out.println("Department student List"+mapDate);
		
		Map<String, Long> countMap = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
		System.out.println("==============================================");
		System.out.println("Department student Count"+countMap);
		System.out.println("==============================================");
		Long studentCount =  studentList.stream().count();
		System.out.println("Total Student Count: "+studentCount);
		System.out.println("==============================================");
		OptionalInt  maxAge =  studentList.stream().mapToInt(st -> st.getAge()).max();
		System.out.println("student Max age: "+maxAge.getAsInt());
		
		List<String> departName =  studentList.stream().map(st -> st.getDepartmentName()).distinct().collect(Collectors.toList());
		System.out.println("==============================================");
		System.out.println("DepartMent Name "+departName);
		
		List<Student> ageLess = studentList.stream().filter(st -> st.getAge() <30).collect(Collectors.toList());
		System.out.println("==============================================");
		System.out.println("Student Age lesser than 30"+ageLess);
		
		List<Student> lstStu = studentList.stream().filter(st -> st.getRank()>50 && st.getRank()<100).collect(Collectors.toList());
		System.out.println("==============================================");
		System.out.println("Student Rank 50 to 100"+lstStu);
		
		Map<String, Double> mapAvAge = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
		System.out.println("==============================================");
		System.out.println("Student Gender Avg Age"+mapAvAge);
		
		Entry<String, Long> entry = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("==============================================");
		System.out.println("Dept Having Max No of Students"+entry);
		
		List<Student> isDelhi = studentList.stream().filter(st -> st.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
		System.out.println("==============================================");
		System.out.println("List of students who stays in Delhi sort by their names"+isDelhi);
		
		Map<String, Double> avgRank = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingInt(Student::getRank)));
		System.out.println("==============================================");
		System.out.println("Avg Rank by Department Name:"+avgRank);
		
		Map<String, Optional<Student>> highestRank = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.minBy(Comparator.comparing(Student::getRank))));
		System.out.println("==============================================");
		System.out.println("Highrest Rank in Each Depart:"+highestRank);
		
		List<Student> sortByRank =  studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
		System.out.println("==============================================");
		System.out.println("List of Students Sort by Rank:"+sortByRank);
		
		Student secondRank =  studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
		System.out.println("==============================================");
		System.out.println("List of Students 2nd Rank by Rank:"+secondRank);
		System.out.println("==============================================");
	      // Converting Product List into a Map  
        Map<Integer,String> productPriceMap =   
        		studentList.stream()  
                        .collect(Collectors.toMap(p->p.getId(), p->p.getFirstName()));  
        
        System.out.println(productPriceMap);  
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 10);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("==============================================");
        System.out.println("Higest Number "+intSummaryStatistics);
        System.out.println("Lowest number in List : " + intSummaryStatistics.getMin());
        System.out.println("Higesht number in List : " + intSummaryStatistics.getMax());
        
        List<Student> emptyList = new ArrayList<Student>();
        
        Map<String, Long> stCount = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        System.out.println("Student Count in Each Depart: "+stCount);
        
        Map<String, Double> avgAge = studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
        System.out.println("Avg age of Students in each department: "+avgAge);
        
        Entry<String, Long> maxNoStud =  studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).entrySet().stream().max(Entry.comparingByValue()).get();
        System.out.println("Find Dept who is having maxi No.of Std: "+maxNoStud.getKey());
        
        List<Student> delhiSt =  studentList.stream().filter(f -> f.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println("Delhi Students: "+delhiSt);
        
        Map<String, Double> avgRank1 = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingDouble(Student::getRank)));
        System.out.println("Dept Avg Rank "+avgRank1);
        
        Map<String, Optional<Student>> stDate = studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Highest rank in each department "+stDate);
        
        List<Student> srtByRank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        System.out.println("Sort By Rank:: "+srtByRank);
        
        List<Student> descRank = studentList.stream().sorted(Comparator.comparing(Student::getRank).reversed()).collect(Collectors.toList());
        
        System.out.println("Descending order by rank::: ");
        descRank.forEach(rank -> System.out.println(rank.getFirstName()+ " "+rank.getRank()));
        
        List<Student> ascRank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        
        System.out.println("Ascending order by rank::: ");
        ascRank.forEach(rank -> System.out.println(rank.getFirstName()+ " "+rank.getRank()));
        
        Student secRank =  studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findAny().get();
        System.out.println("2nd Rank student:: "+secRank.getFirstName()+"  "+secRank.getRank());
        
        
        System.out.println("Find the Highest No of Students in each department");
        
        Entry<String, Long> higestStudent =  studentList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(higestStudent);
        
        
         System.out.println("Sort by Student Name n Rank");
         
         studentList.stream().sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getRank)).collect(Collectors.toList())
         .forEach(std -> System.out.println(std.getFirstName()+"  "+std.getRank()));
         
         System.out.println("Sort students based on Gender and age above 30");
         
         studentList.stream().filter(st -> st.getAge()> 30).sorted(Comparator.comparing(Student::getGender)).collect(Collectors.toList()).forEach(sd -> System.out.println(sd.getAge()+"  "+sd.getFirstName()+" "+sd.getGender()));
         
         
         studentList.stream().filter(sAdd -> sAdd.getAddress().size()>1).collect(Collectors.toList()).forEach(sd -> System.out.println(sd.getFirstName()+" "+sd.getAddress()));
         
         
         Student minRank = studentList.stream().sorted(Comparator.comparing(Student::getRank)).findFirst().get();
         System.out.println("Minumu Rank Student: "+minRank.getFirstName()+" "+minRank.getRank());
         
         Student maxRank = studentList.stream().sorted(Comparator.comparing(Student::getRank).reversed()).findFirst().get();
         System.out.println("Minumu Rank Student: "+maxRank.getFirstName()+" "+maxRank.getRank());
         
 
// @formatter:on

 

         // @formatter:on

        //Optional.ofNullable(studentList).orElseGet(emptyList).stream()
        
       // Optional.ofNullable(studentList)
       //  .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
       // .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
       // .map(note -> Student::getFirstName) // method reference, consider only tag name
       // .forEach(System.out::println); // it will print tag names
        
        try {
        	 //System.exit(0);
        }catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("Hello Finally...");
		} System.out.println("");
		 
	}

}

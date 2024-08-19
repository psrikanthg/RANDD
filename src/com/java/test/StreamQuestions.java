package com.java.test;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;;

public class StreamQuestions {
	
	
	public static void main(String args[]) {
		//Reverse Words of String
		String str = "Welcome to Streams";
		String result = Arrays.stream(str.split(" "))
		.map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		System.out.println("Result:: "+result);
		//Sum of 1 to 10 numbers
		System.out.println("Sum of 10 Numbers: "+IntStream.range(1, 10).sum());
		//Fibanonci Serias
		Stream.iterate(new int[] {0, 1}, f-> new int[] {f[1], f[0]+f[1]}).limit(10).map( f -> f[0]).forEach(i-> System.out.println(i));
		
		// check two strings are Anagram.
		String stg ="RaceCar", str2 =  "CarRace";
		
		String s1 =  Stream.of(stg.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		String s2 =  Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2)) {
			System.out.println("Anagram String  "+s1+"  "+s2);
		}
		//2nd Highest Number in List of Integers
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		int secLargest =  nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("2nd Larst Number: "+secLargest);
		
		//Sort words by their length in List of Strings
		List<String> strgs =  Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		
		strgs.stream().sorted(Comparator.comparing(String::length)).forEach(str1 -> System.out.println(str1));
		
		//Common Elements in two List
		List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> nums2 = Arrays.asList(10, 2, 13, 44, 5, 16);
		
		nums1.stream().filter(nums2::contains).collect(Collectors.toList()).forEach(n -> System.out.println(n));
		
		//Reverse Array Example
		 int reveArr[] = new int[] {5, 1, 7, 3, 9, 6};
		 
		 int[] resultArray = IntStream.rangeClosed(1, reveArr.length-1).map(num -> reveArr[reveArr.length-num]).toArray();
		
		  System.out.println(Arrays.toString(resultArray));
		  
		  //First 10 Even Numbers		  
		  IntStream.rangeClosed(1,  10).filter( i -> i%2 ==0).forEach(n -> System.out.println(n));
		  
		  //Find most Repeated words in List of Strings
		  List<String> repeatedList =  Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		  Entry<String, Long> mostRepeatedString = repeatedList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
		  entrySet().stream().max(Map.Entry.comparingByValue()).get();
		  System.out.println("Most Repeated String:"+mostRepeatedString.getKey()+"  "+mostRepeatedString.getValue());
		  
		  //palindrom String
		  String palindromString = "ROTATOR";
		  boolean isPalindrom =  IntStream.rangeClosed(1, palindromString.length()/2).noneMatch(i -> palindromString.charAt(i)!=palindromString.charAt(palindromString.length()-i-1));
		  if(isPalindrom) {
			  System.out.println("String is Palindrom String");
		  }else {
			  System.out.println("Not A Palindrom String");
		  }
		  
		  Stream<String> stream1 = Stream.of("CSE", "C++", "Java", "DS");
		  System.out.println("Non Match Example: "+stream1.noneMatch(str3 -> (str3.length() == 2)));
		  
		  //less than zero
		  List<Integer> list = Arrays.asList(4, 1, 6, 2);
		  System.out.println("Less than zero exists or not "+list.stream().noneMatch(n -> n<0));
		  
		  
		  //List of Strings, find out those strings, which stars with number
		  List<String> numString = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Sxi");
		  
		  numString.stream().filter(nuSt -> Character.isDigit(nuSt.charAt(0))).forEach(numStr -> System.out.println(numStr));
		  
		  //Extract duplicate elements from an array
		  List<Integer> dupEle = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		  Set<Integer> dupSet = new HashSet<>();
		  dupEle.stream().filter(num -> !dupSet.add(num)).collect(Collectors.toList()).forEach(System.out::println);
		  
		  //Extract duplicate characters in string
		  String dupChar = "Java Concept of The Day".replaceAll("\\s+", "").toLowerCase();
		  Set<String> dupCh = new HashSet<>();
		  Arrays.stream(dupChar.split("")).filter(ch -> !dupCh.add(ch)).collect(Collectors.toSet()).forEach(c -> System.out.println(c));
		   
		   
		   //Sum of all digits of given number
		   int i =153;
		   int sum =   Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		   System.out.println("Sum of "+i+"  "+sum);
		  
		   //Three Maximum, Three Minimum Numbers of Array
		   List<Integer> listOfNum = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		   
		    System.out.println("Three Minimum Numbers:::");
		    listOfNum.stream().sorted().limit(3).forEach(System.out::println);
		    System.out.println("Three Maximum Numbers:::");
		    listOfNum.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
		    
		    //Merge two unsorted array, sort new array
		    int arr1[] = new int[] {4, 2, 7, 1};
		    int arr2[] = new int[] {8, 3, 9, 5};
		    
		    int finalArr[] =  IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		    System.out.println("Sorted Array: "+Arrays.toString(finalArr));
		    
		    
		    //Merge two unsorted array, sort new array without duplicate elements
		    int arr3[] = new int[] {4, 2, 5, 1};
		    int arr4[] = new int[] {8, 1, 9, 5};
		    
		    int noDupArra[] = IntStream.concat(Arrays.stream(arr3), Arrays.stream(arr4)).sorted().distinct().toArray();
		    System.out.println("Sorted Array without Duplicate: "+Arrays.toString(noDupArra));
		    
		    
		    //2nd largest number in Array
		    List<Integer> listOfN = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		    Integer ndLarg= listOfN.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		    System.out.println("2nd Largest Number: "+ndLarg);
		    
		    //sum n avg of int array
		    int av[] = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		    
		    int sums = Arrays.stream(av).sum();
		    OptionalDouble avg = Arrays.stream(av).average();
		    System.out.println("Sum of Array: "+sums+" "+avg.getAsDouble());
		    
		    //Reverse Each word of a String using stream
		    String revStr = "Welcome to Java";
		    String revResult = Arrays.stream(revStr.split(" ")).map( word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		    System.out.println("Reverse String: "+revResult);
		    
		    //sum of first 10 natural numbers
		    System.out.println(IntStream.range(1, 10).sum());
		    System.out.println(IntStream.rangeClosed(1, 10).sum());
		    
		    //Reverse int array
		    int reverArr[] =  new int[] {5, 1, 7, 3, 9, 6};
		    IntStream.range(1, reverArr.length-1).map(j -> reverArr[reverArr.length -j]).forEach(System.out::println);
		    
		    //First 10 Even Numbers
		    System.out.println("First 10 Even Numbers");
		    IntStream.range(1, 10).filter(evn -> evn%2==0).forEach(System.out::println);
		    
		    //Most Repeated Element in Array
		    List<String> mstRep = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		    //mstRep.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entr ->entr.getValue()>1).map(entry -> entry.getKey()).forEach(System.out::println);
		    
		    Entry<String, Long> mostRep = mstRep.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
		    
		    System.out.println("Most Repeated Element"+mostRep.getKey()+ "  "+mostRep.getValue());
		    
		    System.out.println("Palindrom Number");
		    String palinDrom = "ROTATOR";
		    
		    boolean isPal =  IntStream.range(0, palinDrom.length()/2).noneMatch(ch -> palinDrom.charAt(ch)!=palinDrom.charAt(palinDrom.length()-1-ch));
		    System.out.println("isPal or Not: "+isPal);
		    
		    System.out.println("find out strings who starts with number");
		    List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		    listOfStrings.stream().filter(s ->Character.isDigit(s.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);
		    
		    System.out.println("Extract Duplicate Elements in Array");
		    Set<Integer> exDup = new HashSet<Integer>();
		    Arrays.stream(new int[] {111, 222, 333, 111, 555, 333, 777, 222}).boxed().filter(nu -> !exDup.add(nu)).collect(Collectors.toSet()).forEach(System.out::println);
		    
		    System.out.println("Duplicate Characters In A String:: ");
		    
		    String dupChar2 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		    Set<String> dupChars = new HashSet<String>();
		    
		    Arrays.stream(dupChar2.split("")).filter(ch ->  !dupChars.add(ch)).collect(Collectors.toSet()).forEach(System.out::println);
		   
		    System.out.println("Fibonacci Series ");
		    Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
		    
		    System.out.println("First 10 odd numbers");
		    
            Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2}).limit(10).map(f -> f[0]).forEach(System.out::println);
		    
            System.out.println("Last Element of Array");
            
            List<String> lastElm = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
            
            String lastElement = lastElm.stream().skip(lastElm.size()-1).findFirst().get();
            System.out.println(lastElement);
            //Find Person Age if person dob is given
            LocalDate birthDay = LocalDate.of(1987, 11, 22);
            LocalDate today = LocalDate.now();
            System.out.println(ChronoUnit.YEARS.between(birthDay, today));
            
            //sum of list of Integers
            List<Integer> listSum = Arrays.asList(10, 20, 30, 40, 50);
            
            System.out.println("Sum of List:: "+listSum.stream().mapToInt(d -> d).sum());
             
            System.out.println("Convert String to int ");
            List<String> listOfStr = Arrays.asList("1", "2", "3", "4", "5");
             
            listOfStr.stream().map(Integer::valueOf).collect(Collectors.toList()).forEach(System.out::println);
            
            
            System.out.println(" Convert elements of string into invidueal strings");
            List<String> eleStr = Arrays.asList("apple", "banana", "cherry");
            eleStr.stream().flatMap(word -> word.chars().mapToObj(cr ->(char)cr)).collect(Collectors.toList()).forEach(System.out::println);
            
		    //Find Maximu element of List
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
            int max = myList.stream().sorted(Collections.reverseOrder()).findFirst().get();
            System.out.println("Max element of Array is"+max);
            
            //Count each word of String
            List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
             Map<String, Long> dupli = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println("count of words: "+dupli);
            Map<String, Long> dupli1 = names.stream().filter(word -> Collections.frequency(names, word)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));    
	        System.out.println("Only Duplicate words: "+dupli1);
	        
	        String s = "string data to count each character";
	        Map<String, Long> count = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println("Count of Each character: "+count);
	        
	        System.out.println("Fruits with their length");
	        //List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Apple", "Banana");
	        //java 9 version factory method List factory method List.of, instead of list.add() method
	        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Apple", "Banana");
	        List<Integer> fruitLengths = fruits.stream()
	                .collect(Collectors.mapping(String::length, toList()));
	        fruitLengths.forEach(System.out::println);
	        
	        System.out.println("Take while example");
	        Stream.iterate(1, k -> k + 1)
            .takeWhile(n -> n <= 10)
            .map(x -> x * x)
            .forEach(System.out::println);
	        
	        //take while example
	        //the order of course is nondeterministic because the stream is unordered
	        System.out.println("===========Take While ======================");
	        Set<Integer> numbers = Set.of(2, 4, 6, 8);
	        numbers.stream()
	            .takeWhile(n -> n % 2 == 0)
	            .forEach(System.out::println);
	        
	        System.out.println("========== Drop While Example =================");
	        //dropwhile example if no match is found
	        Stream.of(2, 4, 6, 8)
	        .dropWhile(n -> n % 2 != 0)
	        .forEach(System.out::println);
	        
	        List<String> emptyStr = List.of("Apple", "", "", "", "Apple", "Banana");
	        System.out.println("==========Non Empty Checking =============================");
	        emptyStr.stream().filter(word -> !word.isEmpty()).collect(toList()).forEach(System.out::println);
	        
	        List<Integer> listNegate = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        
	        Predicate<Integer> isEven = p -> p % 2 == 0;
	         
	        Predicate<Integer> isOdd = Predicate.not( isEven );
           System.out.println("Even Numbers");
	       listNegate.stream()
	              .filter(isEven)
	              .collect(toList()).forEach(System.out::println);
	         
	       System.out.println("Odd Numbers");
	        listNegate.stream()
	            .filter(isOdd)
	            .collect(toList()).forEach(System.out::println);
	        
	        
	        int sumOfEven = listNegate.stream().filter(n -> n%2 ==0).mapToInt(num -> num).sum();
	        System.out.println("Sum of Even Numbers: "+sumOfEven);
	        
	        
	        //Separate Odd n Even numbers
	        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
	        Map<Boolean, List<Integer>> oddOrEvn = listOfIntegers.stream().collect(Collectors.partitioningBy(j-> j%2==0));
	        
	        Set<Entry<Boolean, List<Integer>>> oddEvMap =  oddOrEvn.entrySet();
	        
	        for(Entry<Boolean, List<Integer>> entry : oddEvMap) {
	        	if(entry.getKey()) {
	        		System.out.println("Even Number");
	        	}else {
	        		System.out.println("Odd Number");
	        	}
	        	
	        	entry.getValue().forEach(System.out::println);
	        	
	        }
	        
	        
	        //Remove Duplicate Elements in Array
	        List<String> listOfStrings1 = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
	        System.out.println("Remove Duplicate Elements "+listOfStrings1);
	        listOfStrings1.stream().distinct().forEach(System.out::println);
	        
	        //Frequence of Each character in string
	        String inputString = "Java Concept Of The Day";
	        System.out.println("Frequence of Each character in string");
	        Map<Character, Long> freqCh= inputString.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println(freqCh);
	        
	        
	        //Find Frequence of each word in Array
	        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
	        System.out.println("Frequence of Each Word in String arr");
	        Map<String, Long> freqWord = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println(freqWord);
	        
	        //Sort list of decimals in reverse order
	        System.out.println("Sort List of Decimals in Reverse Order");
	        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
	        decimalList.stream().sorted(Comparator.comparing(Double::doubleValue).reversed()).forEach(System.out::println);
	        
	        
	        //Prefix n suffix to String array
	        List<String> listOfFStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
	        String sufPrfSting = listOfFStrings.stream().collect(Collectors.joining(", ", "[", "]"));
	        System.out.println(sufPrfSting);
	        
	        
	        //print number which are multple by 5
	        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 25, 56, 15, 24, 75, 31, 89);
	        System.out.println("Number which are Multple by 5");
	        listOfIntegers1.stream().filter(n -> n%5==0).forEach(System.out::println);
	        
	        //Find Maxi n minu of list of nums
	        System.out.println("Find Max n mini of List of Nums");
	        List<Integer> mMnums = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	        Optional<Integer> min = mMnums.stream().min(Integer::compare);
	        Optional<Integer> maxNum = mMnums.stream().max(Integer::compare);
	        
	        mMnums.stream().min(Comparator.naturalOrder()).get();
	        mMnums.stream().max(Comparator.reverseOrder()).get();
	        
	        if(min.isPresent()) {
	        	System.out.println(" Min "+min.get());
	        }
	        
	        if(maxNum.isPresent()) {
	        	System.out.println("Max: "+maxNum.get());
	        }
	        
	        
	        //how to merge two unsorted array into sorted array
	        System.out.println("how to merge two unsorted array into sorted array");
	        int []a = new int[] {4,2,7, 1};
	        int []b = new int[] {8, 3, 9, 5};
	        
	        int []merArra = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	        System.out.println("sorted array"+Arrays.toString(merArra));
	        
	        //how to merge two unsorted array into sorted array wihtout duplicate
	        int []c = new int[] {4, 2, 5, 1};
	        int []d = new int[] {8, 1, 9, 5};
	        int []f = IntStream.concat(Arrays.stream(c), Arrays.stream(d)).distinct().sorted().toArray();
	        System.out.println("sorted array without duplicate"+Arrays.toString(f));
	        
	        //how to get three min, three max numbers of list of integers
	        System.out.println("Three Min, Max numbers of List of Integers");
	        List<Integer> threeMinMax = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	        System.out.println("Three Min");
	        threeMinMax.stream().sorted().limit(3).forEach(System.out::println);
	        System.out.println("Three Max");
	        threeMinMax.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	        
	        //check two strings are anagrams, sorting of two string equal then it is Anagram string
	        System.out.println("Check two strings are Anagrams");
	        String a1 = "RaceCar";
	        String a2 = "CarRace";
	        
	        s1 = Stream.of(a1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	        s2 = Stream.of(a2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	        if(s1.equals(s2)) {
	        	System.out.println("Anagram string");
	        }else {
	        	System.out.println("Not A Anagram String");
	        }
	        
	        
	        //find sume of all digits in a number
	        System.out.println("Sum of All Digits In A num");
	        int j = 15623;
	         long totalSum =   Stream.of(String.valueOf(j).split("")).collect(Collectors.summingInt(Integer::parseInt));
	        System.out.println("sum of num"+totalSum);
	         
	        //find 2nd largest num in Array
	        List<Integer> largestNum = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	        System.out.println("2nd largest Number");
	        int secLar= largestNum.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	        System.out.println(secLar);
	        
	        //sort string according their increasing number of length
	        List<String> sortString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	        System.out.println("sort the string according to their length");
	        sortString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	        
	        //common elements between two arrays
	        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	        
	        System.out.println("Commont Arrays between two arrays");
	        list1.stream().filter(list2::contains).forEach(System.out::println);
	        
	        //Reverse each word of a String
	        String revString = "Java Concept Of The Day";
	        System.out.println("========Reverse Each Word of A String============");
	        String revString1 = Stream.of(revString.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
	        System.out.println(revString1);
	        
	        
	        //Revese Integer Array
	        int[] array = new int[] {5, 1, 7, 3, 9, 6};
	        int rever[] =IntStream.rangeClosed(1, array.length).map(r -> array[array.length-r]).toArray();
	        System.out.println("=====Reverse Array============"+Arrays.toString(rever));
	        
	        //print 1st 10 even numbers
	        IntStream.rangeClosed(1, 10).map(k -> k*2).forEach(System.out::println);
	        
	        //Most Repeated Element in Array
	        List<String> repeatedString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
	        System.out.println("========Find Most Repeated Element===========");
	        repeatedString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()).forEach(System.out::println);
	        
	        Map.Entry<String, Long> mostRep1 = repeatedString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
	        System.out.println("Most Repeated String "+mostRep1.getKey());
	        System.out.println("Most Repeated String "+mostRep1.getValue());
	        
	        //Palindrom program
	        String palString = "ROTATOR";
	        
	        boolean isPals = IntStream.range(0, palString.length()/2).noneMatch(g -> palString.charAt(g)!=palString.charAt(palString.length()-g-1));
	        if(isPals) {
	        	System.out.println("Palindrom String");
	        }
	        
	        //duplicate characters in string
	        String dupliChar = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
	        Set<Character> duSet = new HashSet<Character>();
	        dupliChar.chars().mapToObj(ch -> (char)ch).filter(ch -> !duSet.add(ch)).collect(Collectors.toSet()).forEach(System.out::println);
	        
	        Character firstRep = dupliChar.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()>1).map(entry ->entry.getKey()).findFirst().get();
	        System.out.println("First Repeated String :: "+firstRep);
	        
	        
	        //Finbonacci series
	        Stream.iterate(new int[] {0, 1}, h -> new int[] {h[1], h[0]+h[1]}).limit(10).map(k -> k[0]).forEach(System.out::println);
	        
	        //how to get Last Element of Array
	        List<String> lastEleme = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
	        String lastEle = lastEleme.stream().skip(lastEleme.size()-1).findFirst().get();
	        System.out.println("Last Element "+lastEle);
	        
	        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
	        String countVowls = "dddau";    
	        long vCount = Arrays.stream(countVowls.split(""))  // generate stream from an String[] of single character strings
	        .filter(vowels::contains)  // remove all non-vowels
	        .count(); 
	        
	        System.out.println("vowls Count: "+vCount);
	        
	        //find smallest n longest word in string
	        System.out.println("Find smallest n longest word in string");
	        String string = "This is a long sentence";
	        String maxWord = Arrays.stream(string.split(" ")).max(Comparator.comparing(String::length)).get();
	        System.out.println("Max Length word is: "+maxWord);
	        
	        String smalWord = Arrays.stream(string.split(" ")).min(Comparator.comparing(String::length)).get();
	        System.out.println("Min Length word is: "+smalWord);
	        
	        
	        String ra = "abcde";
	        String rb = "cdeab";
	                   
	        boolean rresult = ra.length() == rb.length() && (ra + ra).contains(rb);
	        System.out.println("===Rotaion of A==="+rresult);
	        
	        long noWords= Arrays.stream(string.split(" ")).count();
	        System.out.println("No of words in String "+noWords);
	        
	        
	        String capFirstLet = "my name is srikanth";
	        //we can throw exceptions in lambda exceptions
	        List<Integer> list12 = Arrays.asList(2,3,5,10,20);
	        list12.forEach(l -> {
	            if (l < 0) {
	                throw new IllegalArgumentException("Negative numbers are not allowed.");
	            }
	            System.out.println(i);
	        });
	        
	        //Merge Two maps using stream, keeps same key add values to same keys
	        HashMap<String, Integer> studentToStudent1 = new HashMap<>();
	        studentToStudent1.put("Maths", 45);
	        studentToStudent1.put("Physics", 57);
	        studentToStudent1.put("Chemistry", 52);
	        studentToStudent1.put("History", 41);
	        
	        HashMap<String, Integer> studentToStudent2 = new HashMap<>();
	        studentToStudent2.put("Maths", 45);
	        studentToStudent2.put("Physics", 57);
	        studentToStudent2.put("Chemistry", 52);
	        studentToStudent2.put("History", 41);
	        
	        HashMap<String, Integer> studentToStudent3 = new HashMap<String, Integer>(studentToStudent1);
	        
	        studentToStudent2.forEach((key, value) -> studentToStudent3.merge(key, value, (v1, v2)-> v1+v2));
	        
	        System.out.println("Map 1: "+studentToStudent1);
	        System.out.println("Map 2: "+studentToStudent2);
	        System.out.println("Map 3: "+studentToStudent3);
	        
	        //Sort HashMap Keys using stream
	        Map<String, Integer> studentMap = new HashMap<>();
	        studentMap.put("Jyous", 87);
	        studentMap.put("Klusener", 82);
	        studentMap.put("Xiangh", 91);
	        studentMap.put("Lisa", 89);
	        studentMap.put("Narayan", 95);
	        studentMap.put("Arunkumar", 86);
	        
	        Map<String, Integer> sortedStudentMap = new TreeMap<>(studentMap);
	        System.out.println("Before Sorting ");
	        System.out.println(studentMap);
	        System.out.println("After Sorting");
	        System.out.println(sortedStudentMap);
	        
	        Map<String, Integer> sortedStdRev = new TreeMap<>(Collections.reverseOrder());
	        sortedStdRev.putAll(studentMap);
	        
	        System.out.println("Reverse Order");
	        System.out.println(sortedStdRev);
	        
	        //sort keys in increasing order of their length
	        Map<String, Integer> sortByLength = new TreeMap<>(new Comparator<String>() {
	        	public int compare(String o1, String o2) {
	        		return o1.length() - o2.length();
	        	}
	        });
	        sortByLength.putAll(studentMap);
	        
	        System.out.println("Sort keys by their Length");
	        System.out.println(sortByLength);
	        
	        //sort names in increasing order of length
	        Map<String, Integer> sortByRev = new TreeMap<>(new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					return arg1.length() -  arg0.length();
				}
	        	
	        	
			});
	        
	        sortByRev.putAll(studentMap);
	        System.out.println("Sort names by their length descreasing order");
	        System.out.println(sortByRev);
	        
	        //Sort hashMap Keys using Java 8 comparingByKey()
	        Map<String, Integer> sortStMap = studentMap.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue,
	        		(e1, e2)->e2, LinkedHashMap::new));
	        sortStMap.forEach((key, value)-> System.out.println(key+" "+value));
	        
	        
	        //how to convert Map to List 
	        Map<Integer, String> idNamesMap = new HashMap<Integer, String>();
	        idNamesMap.put(111, "Lisa");
	        idNamesMap.put(222, "Narayan");
	        idNamesMap.put(333, "Xiangh");
	        idNamesMap.put(444, "Arunkumar");
	        idNamesMap.put(555, "Jyous");
	        idNamesMap.put(666, "Klusener");
	        
	        List<Entry<Integer, String>> listOfEntry = new LinkedList<>(idNamesMap.entrySet());
	        
	        Collections.sort(listOfEntry, new Comparator<Entry<Integer, String>>() {

				@Override
				public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
					return arg0.getValue().compareTo(arg1.getValue());
				}
	        	
			});
	        
	        
	        Map<Integer, String> sortedHashMap = new LinkedHashMap<>();
	        
	        for(Entry<Integer, String> sortedMap :listOfEntry) {
	        	
	        	sortedHashMap.put(sortedMap.getKey(), sortedMap.getValue());
	        }
	        
	        
	        System.out.println("Before Sorting Map Values");
	        System.out.println(idNamesMap);
	        System.out.println("After sorting Map Values");
	        System.out.println(sortedHashMap);
	        
	        //sort hashMap values using stream API
	       Map<Integer, String> streamSortMap = idNamesMap.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2)-> e1, LinkedHashMap::new));
	       System.out.println("sorting using stream API");
	       System.out.println(streamSortMap); 
	       
	       System.out.println("Sorting using stream API in reverse Order");
	       Map<Integer, String> streamSortMapRev = idNamesMap.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));
	       System.out.println(streamSortMapRev);
	       
	       mergeTwoMaps();
	       
	       hashMapToList();
	       
	}
	
	public static void hashMapToList() {
		System.out.println("==============HashMap to list=======================");
		HashMap<String, String> map = new HashMap<String, String>();
		
		    map.put("John Kevin", "Average"); 
         
		    map.put("Rakesh Sharma", "Good"); 
	         
		    map.put("Prachi D", "Very Good"); 
	         
		    map.put("Ivan Jose", "Very Bad"); 
	         
		    map.put("Smith Jacob", "Very Good"); 
	         
		    map.put("Anjali N", "Bad"); 
		   // map.forEach((k, v) -> System.out.println());
		
		   List<Entry<String, String>>  list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
		   for(Entry<String, String> li: list) {
			   System.out.println(li.getKey()+" "+li.getValue());
		   }
		
	}
	
	
	public static void mergeTwoMaps() {
		    System.out.println("==========Merging Two Maps =====================");
		
		    HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<String, Integer>();
		    subjectToStudentCountMap1.put("Maths", 45);
	        subjectToStudentCountMap1.put("Physics", 57);
	        subjectToStudentCountMap1.put("Chemistry", 52);
	        subjectToStudentCountMap1.put("History", 41);
	        
	        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();
	        subjectToStudentCountMap2.put("Economics", 49);
	        subjectToStudentCountMap2.put("Maths", 42);
	        subjectToStudentCountMap2.put("Biology", 41);
	        subjectToStudentCountMap2.put("History", 55);
	        
	        
	        
	        HashMap<String, Integer>  map3 = Stream.of(subjectToStudentCountMap1, subjectToStudentCountMap2).flatMap(map -> map.entrySet().stream()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::sum, HashMap::new));
	        System.out.println(map3);
	        
	        System.out.println("============= Using Stream ================");
	        HashMap<String, Integer>  map4 = subjectToStudentCountMap1.entrySet().stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1<v2?v1:v2, () -> new HashMap<>(subjectToStudentCountMap2)));
	        System.out.println(map4);
	        
	        
	        
	        
	        
	        
		
	}

}

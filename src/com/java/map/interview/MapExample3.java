package com.java.map.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.java.designpatterns.Circle;

import java.util.Spliterator;
import java.util.StringJoiner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MapExample3 {
	
	public static void main(String args[]) {
		
		Map<Integer, String> map = new HashMap<>();
		 map.put(100,"Amit");    
	      map.put(102,"Rahul");    
	      map.put(101,"Vijay");  
	      
	      
	      
	      //loop map values
	      for(Map.Entry<Integer, String> loop: map.entrySet()) {
	    	  System.out.println(loop.getKey()+"  "+loop.getValue());
	      }
	      
	      System.out.println("Comparing by Key() asending order");
	      map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
	      System.out.println("Comparing by key() descending order");
	      map.entrySet().stream().sorted(Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);
	      
	      System.out.println("Comparing by Value asending order");
	      
	      map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
	      
	      System.out.println("Comparing by value desending order");
	      
	      map.entrySet().stream().sorted(Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println);
		  
	      
	      //java hashMap contains only unique keys
	      //java hashMap may have only null key n multiple null values
	      //java hashMap is not syncronized
	      //java HashMap maintains no order
	      
	      
	      //java linkedHashMap contains values based on the key
	      //Java LinkedHashMap contains unique elements
	      //Java LinkedHashMap may have one null key n multiple null values
	      // Java LinkedHashMap is non synchronized
	      //Java LinkedHashMap maintains insertion order
	      
	      //Java HashTable is synchronized , it is thread safe can be shared with multple threads
	      //Java HashTable does not allow any null keys or null values
	      //Java HashTable is legacy class
	      //Java HashTable is traversed by enumertion n iterator
	      //Java HashTable extends Dictionary class.
	      
	      
	      
	      //Java TreeMap is based Red-Black Tree based implementation
	      //Java TreeMap can not have a null key but can have multiple null values
	      //Java TreeMap is non synchronized
	      //Java TreeMap maintains ascending order
	      
	      
	      //ArrayList maintains insertion order, implement list interface
	      //ArrayList is not synchronized
	      
	      
	      //Vector is synchronized
	      //vector maintains insertion order
	      //vector is legacy class
	      //A Vector can use the Iterator interface or Enumeration
	      
	      
	      //Set allows atmost one null value
	      
	      //linkedHastSet maintains the insertion order ,  permits null elements
	      
	      //TreeSet uses red-black tree 
	      //TreeSet O(long n) for add, remove contains.
	      //Does not allow null values
	      
	      //HashSet uses hashtable
	      //HashSet does not allow duplicates
	      //HashSet allow one null keys
	      
	      //Enumeration, Iterator, ListIterator till java 7
	      //SplitIterator added in java 1.8
	      //SplitIterator can be used to Iterate collections, arrays
	      //SplitIterator is an interface added in java.util.package
	      //SplitIterator is used for both, partitioning as well iterating
	      //it can be used for traverse elements one by one(tryAdvance() method or in bulk(forEachRemaining)
	      //it is most suitable for parallel programming
	      //SplitIterator provides you the exact size or at least an estimate size of the source, this not possible for other iterators
	      //SplitIterator are fail-fast in nature, they throw exception if the source is modified after the creation of SplitIterator
	      //SplitIterator u can extract some characteristics of iterating elements like ordered, distinct, immutable, concurrent,nonnull , sized
	      
	      //Map it process stream of values
	      //it does only mapping
	      //it's mapper function produces single value for each input value
	      //it is one to one mapping
	      //Data Transformation from stream<T> to Stream<R>
	      //Use this method when the mapper function is producing a single value for each input value
	      
	      //FlatMap
	      //it process stream of stream of values
	      //it performs mapping as well as flattening
	      //it's mapper function produces multiple values for each input value
	      //it is one to many mapping
	      //Data Transformation: From Stream<Stream<T> to Stream<R>
	      //Use this method when the mapper function is producing multiple 	values for each input value
	      
	      
	      //how to merge two maps with same keys
	      //there are four different java 8 methods u can use for this problem
	      //Map.merge()
	      //Stream.concate()
	      //Stream.of() n flatMap();
	      //using Stream() pipeline
	      
	      //what is difference between StringJoiner, String.Join, Collectors.joining()
	      //StringJoiner class internally uses StringBuilder class to join the strings.
	      //StringJoiner placed in java.util package.
	      //StringJoiner can only join the strings, not the array of strings or list of strings
	      
	      
	      StringJoiner sj = new StringJoiner(" | ");
	      
	      sj.add("Facebook");
	      sj.add("Twitter");
	      sj.add("YouTube");
	      sj.add("WhatsApp");
	      sj.add("LinkedIn");
	      System.out.println("===========StringJoiner Example ===============");
	      System.out.println(sj);
	      
	      //String.join() method internally uses StringJoiner class.
	      //String.join() can used to join strings or array of strings or list of strings but only with
	      //delimiter not with prefix n suffex
	      //java 1.8
	      
	      String joinedString = String.join(" | ", "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
	      System.out.println("===============String Join Exmaple ==================");
	      System.out.println(joinedString);
	        
	     //In the case of using null as a delimiter, we get the null pointer exception. 
	      //The following example confirms the same.
	      
	      String str = null;  
	      str = String.join(null, "abc", "bcd", "apple");  
	      System.out.println(str);  
	      
	      //String str1 = null;  
	      //str = String.join("India", null);  
	     //System.out.println(str);  
	      //StringJoinExample4.java:7: error: reference to join is ambiguous
	      //str = String.join("India", null);
	      
	     
	      
	     // one of the element is null however it will be treated as normal string  
	      	//str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
	       //System.out.println(str);  
	      
	      LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
	      hm.put(10,"Amit");  
	      hm.put(20,"Vijay");  
	      hm.put(15,"Rahul");  
	      System.out.println("LinkedHashMap examples");
	      hm.forEach((key, value) -> System.out.println(key+"  "+value));
	      
	      //SplitIterator from an array
	      String[] languageArray = new String[] {"Java", "C", "C++", "Python", "Scala", "Kotlin"};
	      Spliterator<String> split = Arrays.spliterator(languageArray);
	      //traverse on next element tryAdvance()
	      System.out.println("============String Array Split try Advance==================");
	      split.tryAdvance(System.out::println);
	      //for remaining elements
	      System.out.println("========== traverse Elements in Bulk ==========================");
	      split.forEachRemaining(System.out::println);
	      
	      //SplitIterator from an List
	      List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
	      Spliterator<String> listSplit = languageList.spliterator();
	      Spliterator<String> secondSplit  = listSplit.trySplit();
	      System.out.println("======From 1st SplitIterator================");
	      listSplit.forEachRemaining(System.out::println);
	      
	      System.out.println("==========From 2nd SplitIterator ================");
	      secondSplit.forEachRemaining(System.out::println);
	      
	      
	      
	      //SplitIterator from a Stream
	      Stream<String> languageStream = Stream.of("Java", "C", "C++", "Python", "Scala", "Kotlin");
	      Spliterator<String>   streamSplit =languageStream.spliterator();
	      System.out.println("=========Function Example ===================");
	      Function<String, String> fn =(String s ) -> s.toLowerCase();
	      
	      Function<String, String> fun =String::toLowerCase;
	      System.out.println(fun.apply("ORACLE"));
	      System.out.println(fn.apply("JAVA"));
	      
	      
	      System.out.println("=============Supplier Example =========================");
	      Supplier<Circle>  cr = Circle::new;
	      Circle c = cr.get();
	      System.out.println(c.getX());
	      
	      //This represents a function that accepts one argument and produces a result.
	      //Abstract method: R apply(T t)
	      //It is commonly used for mapping or transforming input to output.
	      Function<String, Integer> fn1 = Integer::parseInt;
	      System.out.println("==============String to Int using Pasent=================");
	      System.out.println(fn1.apply("12"));
	      
	      System.out.println("==========Predicate Example ================================");
	      Predicate<Integer> noGreatherThan5 = x-> x>5;
	      System.out.println(noGreatherThan5.test(10));
	      
	      Consumer<String> con = (String s) -> System.out.println(s);
	      System.out.println("============Consuerm Example =======================");
	      con.accept("Hello Consumer!!");      
	      
	      System.out.println("===========Predicate with Negate Example ================");
	      Predicate<String> startsWithA = (String s) -> s.startsWith("A");
	      List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
	      list.stream().filter(startsWithA.negate()).collect(Collectors.toList()).forEach(System.out::println);
	      
	      System.out.println("================Unary Operator Example =======================");
	      //Abstract method: T apply(T t)
	      //This is a special case of the Function interface where the input and output types are the same
	      UnaryOperator<Integer> func2 = x -> x*2;
	      System.out.println(func2.apply(2));
	      
	      //BinaryOperator takes two arguments of the same type and returns of the same type
	      System.out.println("==============Binary Operator Example =========================");
	      BinaryOperator<Integer> bin = (x, y) -> x*y;
	      System.out.println(bin.apply(2, 4));
	      
	     
	      
	      
	      
	      
	
	}

}

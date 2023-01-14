import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

public class LocalDates {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Object o1 = new Object(); // direct referencing
	ArrayList<Object> list1 = new ArrayList<Object>(); // worked fine
	Object o2 = new String("Aniket"); // works  fine because String IS-A object
	ArrayList<Object> list2 = new ArrayList<String>(); // javac error though String IS-A Object why?
	// because ArrayList<String> is not a ArrayList<Object>
	
	
//		LocalTime tm = LocalTime.now();
//		System.out.println(tm.getHour()); // 21 (whatever hr it is)
//		LocalDate dt = LocalDate.now();
//		System.out.println(dt);
//		LocalDateTime ts=LocalDateTime.now();
//		System.out.println(ts);
		System.out.println("enter time :: "); // i/p -> 12:20:59
		LocalTime tm = LocalTime.parse(sc.next());
		System.out.println(tm); //o/p ->  12:20:59
		System.out.println(tm.isAfter(LocalTime.now()));
		// tm is 12:12:12
		System.out.println(tm.plusHours(2));  //14:12:12 
		System.out.println(tm);  // 12:12:12
		
		
		;
	}

}

package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import libraryManagement.core.com.Category;
import libraryManagement.core.com.Library;

public class UtilityClass {
	
	
	
	
	public static Map<String, Library> populatedmap()
	{
		HashMap<String , Library> map= new HashMap<>();
		//String title, Category catType, double price, LocalDate date, String auth_name, int quantity
		//TECHNOLOGY, FICTION,PROGRAMMING,SCIENCE
		map.put("sc-014", new  Library("sc-014", Category.valueOf("TECHNOLOGY"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		map.put("sc-03", new  Library("sc-03", Category.valueOf("PROGRAMMING"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		map.put("sc-03", new  Library("sc-03", Category.valueOf("SCIENCE"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		map.put("sc-010", new  Library("sc-010", Category.valueOf("FICTION"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		map.put("sc-08", new  Library("sc-08", Category.valueOf("PROGRAMMING"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		map.put("sc-03", new  Library("sc-03", Category.valueOf("FICTION"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		map.put("sc-05", new  Library("sc-05", Category.valueOf("SCIENCE"),1000, LocalDate.parse("1999-09-01"), "Aniket", 12));
		return map;
	
	
	
	
	
	
	}

}

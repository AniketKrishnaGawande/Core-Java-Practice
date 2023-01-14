package singleEnum;

import java.util.Scanner;

// if needed import enum HotelMenu file
public class TesterHotelMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Hotel Menu Card ");
		for(HotelMenu menu:HotelMenu.values()) // showing menu options to choose
		{
			System.out.println(menu);
		}
		
		System.out.println("Enter item to order :: ");
		HotelMenu choice = HotelMenu.valueOf(sc.next().toUpperCase()); // read order , string -- >HotelMenu 
				System.out.println("item ordered :: "+choice);
		
		

	}

}

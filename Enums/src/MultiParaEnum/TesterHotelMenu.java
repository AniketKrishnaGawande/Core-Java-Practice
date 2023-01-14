package MultiParaEnum;

import java.util.Scanner;

// if needed import enum HotelMenu file
public class TesterHotelMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
try {
		System.out.println("Hotel Menu Card ");
		for (HotelMenu menu : HotelMenu.values()) // showing menu options to choose
		{
			System.out.println(menu + " " + menu.getPrice()); // will print name and price --> override toString
		}

		System.out.println("Enter item to order :: ");
		
		HotelMenu choice = HotelMenu.valueOf(sc.next().toUpperCase()); // read order , string -- >HotelMenu
		
		System.out.println("item ordered :: " + choice);
		
		System.out.println("bill :: " + choice.getPrice());

	}catch(IllegalArgumentException arg)
{
		System.out.println("INVALID CHOICE. please choice from menu");}
	}

}

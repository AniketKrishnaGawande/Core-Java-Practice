package singleEnum;

import java.util.Scanner;

//as in same class where enum defined no need to import else import
public class TesterColor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		for (Color clr : Color.values()) // static method so called over enum name
			System.out.println(clr); // giving list of options
		
		
		System.out.println("Enter color of your vehicle :: ");
		Color choice = Color.valueOf(sc.next().toUpperCase()); // accepting string and converting into enum ir color
																// data type and saving it

		
		System.out.println(choice); // printing chosen option
		
		System.out.println(Color.WHITE); // calling overrided toString()
		}
		catch (IllegalArgumentException excp)
		{
			System.out.println(excp.getMessage());
		}
		}
}

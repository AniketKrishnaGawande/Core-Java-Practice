package list.arraylist.vehicle.utils;

import static list.arraylist.vehicle.utils.ValidationRules.parseAndValidateDate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import list.arraylist.vehicle.core.Color;
import list.arraylist.vehicle.core.Vehicle;
import list.arraylist.vehicle.custom_exceptions.ShowroomHandlingException;

public class ShowroomUtils {
//add a static method to ret populated list of vehicles
	public static List<Vehicle> populateShowroom() throws ParseException, ShowroomHandlingException {
		ArrayList<Vehicle> vehicles = new ArrayList<>(1000);
		// double basePrice, Date manufactureDate, String company
		vehicles.add(new Vehicle("abc-1234", Color.BLACK, 12345, parseAndValidateDate("2-5-2022"), "Honda"));
		vehicles.add(new Vehicle("abc-1237", Color.WHITE, 52345, parseAndValidateDate("12-5-2022"), "Maruti"));

		vehicles.add(new Vehicle("abc-1236", Color.WHITE, 72345, parseAndValidateDate("22-5-2022"), "Tata"));

		vehicles.add(new Vehicle("abc-1230", Color.RED, 32345, parseAndValidateDate("2-4-2022"), "Maruti"));

		vehicles.add(new Vehicle("abc-1238", Color.GREY, 19345, parseAndValidateDate("2-7-2022"), "Maurti"));

		vehicles.add(new Vehicle("abc-1232", Color.WHITE, 17345, parseAndValidateDate("20-8-2022"), "Mahindra"));
		return vehicles;
	}
}

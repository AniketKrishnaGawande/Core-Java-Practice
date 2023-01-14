package validation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import java.time.LocalDate.*;
import com.core.Customer;
import com.core.enums.ServicePlan;

import exception.CustomerException;

public class ValidationClass {
	private static final LocalDate minDob;
	static {
		minDob = LocalDate.parse("1995-01-01");
	}

	// checking format of email id -
	public static String validateEmail(String email, List<Customer> customerList) throws CustomerException {
		String format = "^[\\w-\\.]+@[\\w\\.](.com|.in)$";

		if (format.matches(email))
			return checkEmail(email, customerList);
		throw new CustomerException("Failed to add data. Email id not given properly");
	}

// checking duplicate mail id
	public static String checkEmail(String email, List<Customer> customerList) throws CustomerException {
		if (customerList.contains(email))
			throw new CustomerException("Duplicate email found");
		return email;

	}

	// validate password
	public static String validatePassword(String password) throws CustomerException {
		String format = "(?=.*\\d)(?=.*[A-Z])(?.*=[a-z])(?=.*[0-9])(?=.*[@#$%&]).[5,10]";
		if (password.matches(format))
			return password;
		throw new CustomerException("Enter valid password");

	}

	// validate dob should be before 1995-01-01
	public static LocalDate parsenValidateDate(String date) throws CustomerException {
		LocalDate dob = LocalDate.parse(date);
		if (dob.isBefore(minDob))
			return dob;
		throw new CustomerException("invalid dob should born before 01-01-1995");
	}

// validate plan choosen
	public static ServicePlan parsenValidatePlan(String plan) throws CustomerException {
		try {
			ServicePlan parsedPlan = ServicePlan.valueOf(plan);
			return parsedPlan;
		} catch (IllegalArgumentException excp) {
			throw new CustomerException("Invalid Plan choosen");
		}

	}

	// writing common method which will take user i/p and validate them if correct
	// return instance of class
	public static Customer validateAllDetails(List<Customer> list, String name, String email_id, String password,
			String dob, String plan) throws CustomerException {
		validateEmail(email_id, list);
		validatePassword(password);
		LocalDate date = parsenValidateDate(dob);
		ServicePlan validatedplan = parsenValidatePlan(plan);
		return new Customer(email_id, name, password, date, validatedplan);
	}

	
	public static List<Customer> populate()
	{
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("aniket19@gmail.com","Aniket","Aniket19@",LocalDate.parse("1994-09-01"),ServicePlan.SILVER));
		list.add(new Customer("aniket20@gmail.com","Aniket","Aniket19@",LocalDate.parse("1994-09-01"),ServicePlan.SILVER));
		list.add(new Customer("aniket30@gmail.com","Aniket","Aniket19@",LocalDate.parse("1994-09-02"),ServicePlan.SILVER));
		list.add(new Customer("aniket50@gmail.com","Aniket","Aniket19@",LocalDate.parse("1994-09-03"),ServicePlan.SILVER));
		list.add(new Customer("aniket60@gmail.com","Aniket","Aniket19@",LocalDate.parse("1994-09-05"),ServicePlan.SILVER));
		return list;
	
	}
	
	
	
	
	
}

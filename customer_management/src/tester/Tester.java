package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.core.Customer;
import com.core.enums.ServicePlan;

import exception.CustomerException;
import static validation.ValidationClass.*;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customers = new ArrayList<>(); // empty ArrayList created size = 0 capacity 10
// if we want to search customer using primary key use contains indexof
			customers =populate();
			System.out.println(customers);
				boolean exit = false;
				do {
					System.out.print(
							"1. Register Customer\n"
							+ "3. Customer login\n 4. Change Password\n5. Unsubscribe Customer\n"
							+ "6. Display name of customers having dob between specific dates \n"
							+ "7. Display all the customer details ,who have chosen specific plan\n8. Exit");
					try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter name, email id, password,dob,plan");
					      customers.add( validateAllDetails(customers, sc.next(), sc.next(), sc.next(),
									sc.next(), sc.next()));
					      break;
					case 2: System.out.println(customers);
						break;
					case 3:
					      // cust login
						System.out.println();
					     
					}//switch ends
					
					
					}// try ends
					
					catch (CustomerException excp) {
						System.out.println(excp.getMessage());
					}// catch ends
				} while (!exit);// so ends
			}
		} // try source ends

	}// main ends

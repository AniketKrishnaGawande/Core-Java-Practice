package com.core;

import java.util.Scanner;
import static utils.BankUtil.*;

public class BankTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {

			try {
				System.out.println(
						"1. Show All Accounts Menu\n2. Create New Account\n3. update Name email for specific BankAccount \n4. Delete"
								+ " BankAccount for specific BankAccount\n5. WithDraw Amount from specific"
								+ "BankAccount\n6: Deposite Amount for specific BankAccount\n7. "
								+ "MoneyTransfer from one account into another account.");

				switch (sc.nextInt()) {

				case 1:

					System.out.println("Bank Account Details");
					showAllData();
					break;

				case 2:
					System.out.println("Creating new Account :: ");
					System.out.println("Enter Bank Account number, customer name, Balance, EmailId ");
					System.out.println(
							addNewEntry(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next()) == 0 ? "data not added"
									: "data added");
					break;

				case 3:
					System.out.println("Enter account number to update:: ");
					int temp = sc.nextInt();
					System.out.println("Enter customer name, email ");
					System.out.println(
							updateDetails(temp, sc.next(), sc.next()) == 0 ? "invalid account number" : "data updated");
					break;

				case 4:
					System.out.println("delete data :: ");
					System.out.println("enter account number to delete :: ");
					System.out.println(deleteAccount(sc.nextInt()) == 0 ? "Invalid account number" : "data deleted");
					break;

				case 5:
					System.out.println("withdraw amount from bank");
					System.out.println("enter account number  and amount to withdraw ::");
					System.out.println(withdrawAmount(sc.nextInt(), sc.nextDouble()) == 0 ? "invalid account number"
							: "amount withdrawn");
					break;

				case 6:
					System.out.println("amount depositing");

					System.out.println("enter account number and amount to deposit");
					depositAmount(sc.nextInt(), sc.nextDouble());
					break;

				case 7:
					System.out
							.println("Enter sender's account number, receivers account no and amount to transfer ::  ");
					moneyTransfer(sc.nextInt(), sc.nextInt(), sc.nextDouble());
					break;
				case 8:
					exit = true;

				}// switch end

			} // try end
			catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		} // while end

	}

}

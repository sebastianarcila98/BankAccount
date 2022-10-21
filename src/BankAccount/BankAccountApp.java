package BankAccount;

import Util.CSV;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	public static void main(String[] args) throws IOException {

		List<Account> accounts = new LinkedList<Account>();

		/*
		BankAccount.Checking checking1 = new BankAccount.Checking("Sebastian Andre", "123456789", 1000);
		BankAccount.Saving saving1 = new BankAccount.Saving("Daniella Michelle", "987654321", 2000);

		checking1.showInfo();
		System.out.println("**********");
		saving1.showInfo();

		saving1.compound();
*/

		//read .csv file and store account information in data structure
		String file = "NewBankAccounts.csv";
		List<String[]> accountUsers = Util.CSV.read(file);

		for ( String[] user : accountUsers ) {
			String name = user[0];
			String ssn = user[1];
			String accountType = user[2];
			double initDeposit = Double.parseDouble(user[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Saving(name, ssn, initDeposit, accountType));
			}
			else if (accountType.equals("BankAccount.Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit, accountType));
			}
		}

		for (Account account : accounts ) {
			account.showInfo();
			System.out.println("\n***************\n");
		}

		//		Utilities.CSV.getByAccType(accounts, "BankAccount.Checking");

	}

}

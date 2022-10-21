package Util;

import BankAccount.Account;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	public static List<String[]> read(String file) throws IOException {

		List<String[]> data = new LinkedList<String[]>();
		BufferedReader br = new BufferedReader(new FileReader(file));

		String dataRow;
		while ((dataRow = br.readLine()) != null) {
			String[] dataRecord = dataRow.split(",");
			data.add(dataRecord);
		}
		return data;
	}

	public static void getByAccType(List<Account> accounts, String accType) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).accountType.equals(accType)) {
				accounts.get(i).showInfo();
			}
			else if (accounts.get(i).accountType.equals(accType)) {
				accounts.get(i).showInfo();
			}
			else {
				System.out.println("ERROR: account type doesn't exist");
			}
		}
	}

	//order by alphabetical order

	//

}

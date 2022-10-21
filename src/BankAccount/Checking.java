package BankAccount;

import BankAccount.Account;

public class Checking extends Account {
	//List properties specific to checking account
	private long debitCardNum;
	private int debitCardPin;

	//Constructor: initialize properties specific to checking account
	public Checking(String name, String ssn, double initDeposit, String accountType) {
		super(name, ssn, initDeposit, accountType);
		this.accountNum = "2" + accountNum;

		setDebitCard();
	}

	@Override
	public void setBaseRate() {
		rate = getBaseRate() * .15;
	}

	//List methods specific to checking account
	private void setDebitCard() {
		this.debitCardNum = (long) (Math.random() * Math.pow(10, 12));
		this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("CHECKING ACCOUNT" +
				"\n Debit card number: " + debitCardNum +
				"\n Debit Card PIN: " + debitCardPin +
				"\n Interest Rate: " + rate);
	}

}

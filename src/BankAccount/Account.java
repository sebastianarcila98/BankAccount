package BankAccount;

import BankAccount.IBaseRate;

//abstract: won't be able to create object from account class but will be able to create objects from classes that inherit the BankAccount.Account classes
public abstract class Account implements IBaseRate {
	//List properties that will be used by checking and savings account
	private String name;
	private String ssn;
	protected String accountNum;
	private double balance;
	protected double rate;
	private static int uniqueID = 10000;
	public String accountType;

	//Constructor: set properties and initialize the account
	public Account(String name, String ssn, double initDeposit, String accountType) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initDeposit;
		this.accountType = accountType;

		uniqueID++;
		this.accountNum = setAccountNum();

		setBaseRate();
	}

	public abstract void setBaseRate();

	public void compound() {
		double compoundInterest = balance * (Math.pow((1 + rate/100), 1)) - balance;
		balance += compoundInterest;
	}

	//List common methods
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Depositing $" + amount);
		getBalance();
	}

	public void withdraw(double amount) {
		this.balance -= amount;
		System.out.println("Withdrawing $" + amount);
		getBalance();
	}

	public void transfer(double amount, String externalAccount) {
		this.balance -= amount;
		System.out.println("Transfering $" + amount + " to " + externalAccount);
		getBalance();
	}

	public void getBalance() {
		System.out.println("Balance is now: " + balance);
	}

	private String setAccountNum() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2);
		int randomNums = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNums;
	}

	public void showInfo() {
		System.out.println("Name: " + name +
				"\nBankAccount.Account #: " + accountNum +
				"\nBalance: " + balance);
	}

}

package BankAccount;

public class Saving extends Account {
	//List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	//Constructor: initialize properties in savings account
	public Saving(String name, String ssn, double initDeposit, String accountType) {
		super(name, ssn, initDeposit, accountType);
		this.accountNum = "1" + accountNum;

		setSafetyDepositBox();
	}

	@Override
	public void setBaseRate() {
		rate = getBaseRate() - .25;
	}

	//List methods specific to savings account
	private void setSafetyDepositBox() {
		this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("SAVINGS ACCOUNT" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box PIN: " + safetyDepositBoxKey +
				"\n Interest Rate: " + rate);
	}
}

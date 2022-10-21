package BankAccount;

public interface IBaseRate {
	default double getBaseRate() {
		return 2.5D;
	}
}

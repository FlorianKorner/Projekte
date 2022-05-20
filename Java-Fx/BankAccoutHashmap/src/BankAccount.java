
public class BankAccount {
	private static int counter = 1;
	private int accountNumber;
	private int balance;// in Cents
	private boolean accountLocked;// true when locked
	private String customerID;

	public BankAccount(int startingBalance, boolean isLocked, String customerID) {
		setBalance(startingBalance);
		setAccountLocked(isLocked);
		setCustomerID(customerID);
		setAccountNumber(getCounter());
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	// May at most be -Customer.overdraft
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String toString() {
		return "accountNumber: " + getAccountNumber() + "\nbalance: " + (getBalance() / 100) + "EUR "
				+ (getBalance() - ((getBalance() / 100) * 100)) + "Cents\naccountLocked: " + isAccountLocked()
				+ "\ncustomerID: " + getCustomerID();
	}
}

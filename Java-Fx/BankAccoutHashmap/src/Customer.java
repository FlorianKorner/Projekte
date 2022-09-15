
public class Customer {
	private static int counter = 100000;
	private String customerID;
	private String lastName;
	private String firstName;
	private int overdraft;// limit in Cents
	// constructor

	public Customer(String lastName, String firstName, int overdraft) {
		setLastName(lastName);
		setFirstName(firstName);
		try {
			setOverdraft(overdraft);
		} catch (BankAccountException e) {
			this.overdraft = 0;
			e.printStackTrace();
		}
		if (lastName.length() >= 3) {
			setCustomerID(lastName.substring(0, 3).toUpperCase() + Customer.getCounter());
		} else {
			setCustomerID(lastName.toUpperCase() + Customer.getCounter());
		}
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getOverdraft() {
		return overdraft;
	}

	// makes sure the overdraft limit is never negative
	public void setOverdraft(int overdraft) throws BankAccountException {
		if (overdraft < 0) {
			throw new BankAccountException("No negative overdraft allowed: " + overdraft);
		} else {
			this.overdraft = overdraft;
		}
	}

	public String toString() {
		return "The Customer " + getFirstName() + " " + getLastName() + " has an overdraft limit of " + getOverdraft()
				+ " and his/her customerID is " + getCustomerID();
	}

}

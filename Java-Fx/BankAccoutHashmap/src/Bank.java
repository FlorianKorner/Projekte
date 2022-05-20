
import java.util.HashMap;
import java.util.Iterator;

public class Bank {
	private HashMap<Integer, BankAccount> bankAccounts;
	private HashMap<String, Customer> customers;

	public Bank() {
		bankAccounts = new HashMap<Integer, BankAccount>();
		customers = new HashMap<String, Customer>();
	}

	// Adds a bank account ba to the management HashMap bankAccounts The property
	// accountNumber is used as key
	public void addBankAccount(BankAccount ba) {
		bankAccounts.put(ba.getAccountNumber(), ba);
	}

	// Removes an account object from the administration and returns it as
	// reference - or returns null if that accountNumber is not managed through
	// bankAccounts
	public BankAccount removeBankAccount(int accountNumber) {
		return bankAccounts.remove(accountNumber);
	}

	// A list of all bank accounts managed by bank (Note: balance is displayed in EUR and cents)
	
	public void printBankAccounts() {
		Iterator<Integer> keySetIterator = bankAccounts.keySet().iterator();
		while (keySetIterator.hasNext()) {
			int key = keySetIterator.next();
			BankAccount ba = bankAccounts.get(key);
			System.out.println(ba.toString());
		}
	}

	// Returns the bank account corresponding to given accountNumber or
	// null if not available
	public BankAccount getBankAccount(int accountNumber) {
		return bankAccounts.get(accountNumber);
	}

	// unlocks a bank account (Bankkonto entsperren), or returns false if
	// accountNumber is not managed.
	public boolean unlockAccount(int accountNumber) {
		if (bankAccounts.containsKey(accountNumber) == false) {
			return false;
		} else {
			bankAccounts.get(accountNumber).setAccountLocked(false);
			return true;
		}
	}
	// locks a bank account (Bankkonto sperren) or returns false if accountNumber is
	// not managed.

	public boolean lockAccount(int accountNumber) {
		if (bankAccounts.containsKey(accountNumber) == false) {
			return false;
		} else {
			bankAccounts.get(accountNumber).setAccountLocked(true);
			return true;
		}
	}

	// Withdraw an amount amount (in Eurocents) from an account
	// with a given accountNumber. It must be checked if the account is a) covered
	// and b) not locked. If this is not the
	// case, or the given account accountNumber is unknown to system, a
	// BankAccountException is thrown
	public void withdraw(int accountNumber, int amount) throws BankAccountException {
		if (bankAccounts.containsKey(accountNumber)) {
			BankAccount ba = bankAccounts.get(accountNumber);
			if (ba.isAccountLocked() == true
					|| ba.getBalance() + customers.get(ba.getCustomerID()).getOverdraft() - amount < 0) {
				throw new BankAccountException(
						"Customer cannot overdraft by this much or his/her account is locked. He/She is missing "
								+ Math.abs(ba.getBalance() + customers.get(ba.getCustomerID()).getOverdraft() - amount)
								+ "Cents.");
			} else {
				ba.setBalance(ba.getBalance() - amount);
			}
		}
	}

	// : Deposit an amount (in Eurocents) to an account with a given
	// accountNumber. It must be checked that the account is not locked. If an
	// account is locked, a corresponding BankAccountException will be thrown.
	public void deposit(int accountNumber, int amount) throws BankAccountException {
		if (bankAccounts.containsKey(accountNumber)) {
			BankAccount ba = bankAccounts.get(accountNumber);
			if (ba.isAccountLocked() == true) {
				throw new BankAccountException("Customer's account is locked.");
			} else {
				ba.setBalance(ba.getBalance() + amount);
			}
		}
	}

	// Transfer an amount from one account to another. The "transferring" account
	// must be
	// covered (i.e. have anough money to perform this transaction). Also, both
	// accounts must not be in locked-state. If
	// any of the corresponding accounts is locked, or the transaction can not be
	// performed due to lack of funding, corresponding BankAccountException is
	// thrown
	public void internalBankTransfer(int from, int to, int amount) {
		try {
			withdraw(from, amount);
		} catch (BankAccountException e) {
			e.printStackTrace();
		}
		try {
			deposit(to, amount);
		} catch (BankAccountException e) {
			e.printStackTrace();
		}
	}

	// -------------------------------------------------
	// Adds a customer c to the administration HashMap customers. The property
	// customerId is used as key. The method returns false if customer c is already
	// managed through customers
	public boolean addCustomer(Customer c) {
		if (customers.put(c.getCustomerID(), c) == null) {
			return true;
		} else {
			return false;
		}
	}

	// Returns the customer for a given customer ID.
	public Customer getCustomer(String customerID) {
		return customers.get(customerID);
	}

	// prints Customer Data and all Bank Accounts associated with the customer
	public void printCustomer(String customerID) {
		Customer c = customers.get(customerID);
		System.out.println(c.toString());
		Iterator<Integer> keySetIterator = bankAccounts.keySet().iterator();
		while (keySetIterator.hasNext()) {
			int key = keySetIterator.next();
			BankAccount ba = bankAccounts.get(key);
			if (ba.getCustomerID().equals(customerID)) {
				System.out.println(ba.toString());
			}
		}
	}

	public void removeCustomer(String customerID) {
		customers.remove(customerID);
		Iterator<Integer> keySetIterator = bankAccounts.keySet().iterator();
		while (keySetIterator.hasNext()) {
			int key = keySetIterator.next();
			BankAccount ba = bankAccounts.get(key);
			if (ba.getCustomerID().equals(customerID)) {
				bankAccounts.remove(key);
			}
		}
	}
}

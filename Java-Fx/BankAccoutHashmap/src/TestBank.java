
public class TestBank {

	public static void main(String[] args) {
		Customer c1 = new Customer("Williams", "Serena", 500);
		Customer c2 = new Customer("Hamilton", "Lewis", 400);
		Customer c3 = new Customer("Noah", "Trevor", 700);
		Customer c4 = new Customer("Oliver", "John", 600);

		BankAccount ba1 = new BankAccount(9000, false, "WIL100000");
		BankAccount ba2 = new BankAccount(10000, true, "HAM100001");
		BankAccount ba3 = new BankAccount(2000, false, "NOA100002");
		BankAccount ba4 = new BankAccount(3000, false, "OLI100003");

		Bank b = new Bank();

		b.addCustomer(c1);
		b.addCustomer(c2);
		b.addCustomer(c3);
		b.addCustomer(c4);

		b.addBankAccount(ba1);
		b.addBankAccount(ba2);
		b.addBankAccount(ba3);
		b.addBankAccount(ba4);

		b.unlockAccount(2);
		b.internalBankTransfer(2, 1, 10400);
		b.printBankAccounts();

		b.lockAccount(1);
		try {
			b.withdraw(1, 100);
		} catch (BankAccountException e) {
			System.out.println("\ncorrect 1\n");
		}

		b.removeBankAccount(2);
		b.printBankAccounts();

		b.removeCustomer("OLI100003");
		System.out.println();
		b.printBankAccounts();
	}
}

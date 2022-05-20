
/**
 * Beschreiben Sie hier die Klasse Bank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bank
{
    private Account account0;
    private Account account1;
    private Account account2;
    
    public Account getAccount(int i) {
        if(i == 0) {
            return account0;
        }
        else if(i == 1) {
            return account1;
        }
        else if(i == 2) {
            return account2;
        }
        else {
            return null;
        }
    }
    
    public Account addAccount(Account a) {
        Account accountAdded = null;
        
        if(a == null || a == this.account0 || a == this.account1 || a == this.account2){ 
            accountAdded = null; 
            return accountAdded;
        }
        
        else if(this.account0 == null) {
            accountAdded = a;
            return accountAdded;
        }
        else if(this.account1 == null) {
            accountAdded = a;
            return accountAdded;
        }
        else if(this.account2 == null) {
            accountAdded = a;
            return accountAdded;
        }
        else {
        
            return null;
        }
        
    }
    
    public Account removeAccount(int num) {
        Account removedAccount = null;
        
        if(this.account0 != null && num == this.account0.getNumber()) {
            removedAccount = this.account0;
            this.account0 = null;
            return removedAccount;
        }
        else if(this.account1 != null && num == this.account1.getNumber()) {
            removedAccount = this.account1;
            this.account1 = null;
            return removedAccount;
        }
        else if(this.account2 != null && num == this.account2.getNumber()) {
            removedAccount = this.account2;
            this.account2 = null;
            return removedAccount;
        }
        else {
            return null;
        }
    }
    
    public int numberOfAccounts() {
        int accNumberOfAccounts = 0;
        if(this.account0 != null) {
            accNumberOfAccounts += 1;
        }
        if(this.account1 != null) {
            accNumberOfAccounts += 1;
        }
        if(this.account2 != null) {
            accNumberOfAccounts += 1;
        }
        return accNumberOfAccounts;
    }
    
    public int sumAccount() {
        int accSumAccount = 0;
        if(this.account0 != null) {
            accSumAccount += this.account0.getBalance();
        }
        if(this.account1 != null) {
            accSumAccount += this.account1.getBalance();
        }
        if(this.account2 != null) {
            accSumAccount += this.account2.getBalance();
        }
        return accSumAccount;
    }
    
    public void print() {
        
            if(this.account0 != null) {
                this.account0.print();
           
            }
            else {
                System.out.println("account Empty");
            }
            if(this.account0 != null) {
                this.account0.print();
           
            }
            else {
                System.out.println("account Empty");
            }
            if(this.account0 != null) {
                this.account0.print();
            }
            else {
                System.out.println("account Empty");
            }
            
            System.out.println("number Of Accounts: " + numberOfAccounts());
            System.out.println("sum Of balance of Accounts: " + sumAccount());
    }
    
    public int countDbldWith(String str) {
        int accCountDbldWith = 0;
        
        if(this.account0 != null && this.account0.getDatabaseld() == str) {
            accCountDbldWith += accCountDbldWith + 1;
        }
        if(this.account1 != null && this.account1.getDatabaseld() == str) {
            accCountDbldWith += accCountDbldWith + 1;
        }
        if(this.account2 != null && this.account2.getDatabaseld() == str) {
            accCountDbldWith += accCountDbldWith + 1;
        }
        
        return accCountDbldWith;
    }
}

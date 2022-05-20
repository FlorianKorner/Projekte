
/**
 * Beschreiben Sie hier die Klasse Account.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Account
{
    private int number; // account number
    private String owner;
    private int balance; //in cents
    private int overdraftLimit;
    
    
    
    public Account(int number, String owner, int balance, int overdraftLimit) {
        if(checkConsistency(number, owner, balance, overdraftLimit)) {
            this.number = number;
            this.owner = owner;
            this.balance = balance;
            this.overdraftLimit = overdraftLimit;
        }
        else {
            this.number = 1;
            this.owner = "John Doe";
            this.balance = 0;
            this.overdraftLimit = -1000;
        }
    }
    public Account() {
        this(1, "John Doe", 0, -1000);
    }
    
    //maybe that nothing cant be null
    
    public boolean checkConsistency(int number, String owner, int balance, int overdraftLimit) {
        
        
        if(!(number > 0)) {
            System.out.println("number cant be smaler then 0");
            return false;
        }
         
        if(!(owner != null)){
            System.out.println("owner cant be null");
            return false;
        }
        if(!(owner.length() >= 2)){
            System.out.println("owner cant be only 1 character");
            return false;
        } 
        
        
        if(!(balance >= overdraftLimit)) {
            System.out.println("balance cant be smaler then overdraft");
            return false;
        }
        
        if(!(overdraftLimit <= 0)) {
            System.out.println("overdraft cant be smaler then 0"); 
            return false;
        }
        
        return true;
    }
    
    public int getNumber() {
        return this.number;
    }
    public String getOwner() {
        return this.owner;
    }
    public int getBalance() {
        return this.balance;
    }
    public int getOverdraftLimit() {
        return this.overdraftLimit;
    }
    
    public void setNumber(int number) {
        if(checkConsistency(number, owner, balance, overdraftLimit)) {
            this.number = number;
        }
    }
    public void setBalance(int balance) {
        if(checkConsistency(number, owner, balance, overdraftLimit)) {
            this.balance = balance;
        }
    }
    public void setOwner(String owner) {
        if(checkConsistency(number, owner, balance, overdraftLimit)) {
            this.owner = owner;
        }
    }
    public void setOverdraft(int overdraft) {
        if(checkConsistency(number, owner, balance, overdraftLimit)) {
            this.overdraftLimit = overdraftLimit;
        }
    }
    
    public int deposit(int amount) {
        int newBalance = 0;
        
        if(checkConsistency(number, owner, balance, overdraftLimit) && amount > 0) {
            newBalance = this.balance + amount;
            this.balance = newBalance;
            return newBalance;
        }
        else {
            System.out.println("amount cant be smaller 0");
            return this.balance;
        }
    }
    
    public int withDraw(int amount) {
        int actWithDrawn = 0;
        
        if(checkConsistency(number, owner, balance, overdraftLimit) && amount > 0) {
            if(amount <= this.overdraftLimit) {
                actWithDrawn = amount;
                this.balance = this.balance - actWithDrawn;
                return actWithDrawn;
            }
            else {
                actWithDrawn = this. overdraftLimit - this.balance;
                this.balance = this.balance - actWithDrawn;
                return actWithDrawn;
            }
        }
        else {
            System.out.println("amount cant be smaller 0");
            return 0;
        }
    }
    
    public String getDatabaseld() {
        
        String dataBaseld = null;
        
        dataBaseld = this.owner.toUpperCase() + " " + this.number;
        dataBaseld = dataBaseld.replace(" ", "_") ;
        
        return dataBaseld;
    }
    
    
    public void print() {
        System.out.println("number: " + this.number);
        System.out.println("owner: "  + this.owner);
        System.out.println("balance: "  + this.balance);
        System.out.println("overdraftLimit: "  + this.overdraftLimit);
    }
}

public class Account
{
    private int number;
    private String owner;
    private int balance; // in cents
    private int overdraftLimit;
    
    public Account(int number, String owner, int balance, int overdraftLimit)
    {
        if (check( number, owner, balance, overdraftLimit))
        {
        setNumber(number);
        setOwner(owner);
        setBalance(balance);
        setOverdraftLimit(overdraftLimit);
    }
    }
    
    public Account()
    {
        setNumber(1);
        setOwner("John Doe");
        setBalance(0);
        setOverDraftLimit(1000);
    }
    
    public void check(int number, String owner, int balance, int overdraftLimit)
    {
        if (number > 0) {return true;}
        if (owner != null) {return true;} //if name has min 2 characters missing
        if (balance >= (overdraftLimit - overdraftLimit*2)) { return true;}
        if (overdraftLimit >= 0) { return true;}
        else {return false;}
    }
    
    public void setNumber(int number)
    {
        if (check(number)) {this.number = setNumber;}
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setOwner(String owner)
    {
        if (check(owner)) {this.owner = setOwner;}
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public void setBalance(int balance)
    {
        if (check(balance)) {this.balance = setBalance;}
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void setOverdraftLimit(int overdraftLimit)
    {
        if (check(overdraftLimit)) {this.overdraftLimit = setOverdraftLimit;}
    }
    
    public int getOverdraftLimit()
    {
        return overdraftLimit;
    }
    
    public int deposit(int amount)
    {
        if (amount > 0) {balance = balance + amount; return balance;}
        else {System.out.println("Error: You can't add 0 money!");}
    }
    
    public int withdraw(int amount)
    {
        if (amount > 0 && balance-amount >= overdraftLimit-overdraftLimit*2) {balance = balance - amount; return amount;}
        else if (amount > 0 && balance-amount < overdraftLimit-overdraftLimit*2) {balance = overdraftLimit-overdraftLimit*2; return overdraftLimit+balance;}
    }
    
    public String getDatabaseId()
    {
        String d;
        if (owner != null) {d = getOwner(); d.toUpperCase(); d.replace(" ","_"); d = d+getBalance(String); return d;}
    }
    
    public void print()
    {
        System.out.println("Account number: " + getNumber());
        System.out.println("Owner: " + getOwner());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + getOverdraftLimit());
    }
}
        
            
            
        
    
    
    
    
public class Account
{
    private String owner;
    private double balance;
    private double rate;
    private boolean locked;
    
    public Account(String newOwner, double newBalance, double newRate, boolean newLocked)
    {
        setOwner(newOwner);
        deposit(newBalance);
        setRate(newRate);
        setLocked(newLocked);
    }
    public Account()
    {
        setOwner("unknown");
        deposit(0.0);
        setRate(2.0);
        setLocked(false);
    }
    public Account(String newOwner, double newBalance)
    {
        setOwner(newOwner);
        deposit(newBalance);
        setRate(2.5);
        setLocked(false);
    }
    public void setOwner(String newOwner)
    {
        if (newOwner != null && newOwner.length() > 0)
            owner = newOwner;
        else
        {
            System.out.println("Error in setOwner: " + newOwner);
            owner = "unknown";
        }
    }
    public void setRate(double newRate)
    {
        if (newRate > 0.0 && newRate <= 10.0)
            rate = newRate;
        else
        {
            System.out.println("Error in setRate: " + newRate);
            rate = 0.1;
        }
    }
    public void setLocked(boolean newLocked)
    {
        locked = newLocked;
    }
    public String getOwner()
    {
        return owner;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getRate()
    {
        return rate;
    }
    public boolean getLocked()
    {
        return locked;
    }
    public void deposit(double amount)
    {
        if (amount > 0.0)
            balance = balance + amount;
        else
        {
            System.out.println("wrong amount in deposit: "+amount);
        }
    }
    public double withdraw(double amount)
    {
        if (amount <= balance && amount > 0 && !locked)
        {
            balance = balance - amount;
            return amount;
        }
        else
        {
            System.out.println("Unable to withdraw: " + amount);
            return 0;
        }
    }
    public double withdraw2(double amount)
    {
        if (locked)
        {
            System.out.println("Account is locked: ");
            return 0;            
        }
        else if (amount <= balance)
        {
            balance = balance - amount;
            return amount;
        }
        else if (amount > balance && amount > 0)
        {
            double result = balance;
            balance = 0;
            return result;
        }
        else return 0;
    }
    public void print()
    {
        System.out.println("account owner: " + getOwner());
        System.out.println("balance: " + getBalance() + "EUR");
        System.out.println("rate: " + getRate() + "%");
        if (getLocked())
            System.out.println("the account is locked");
        else
            System.out.println("the account is open");
    }
}

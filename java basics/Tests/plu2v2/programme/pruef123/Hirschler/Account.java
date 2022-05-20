public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overdraftLimit;
    
    public Account()
    {
        setNumber(1);
        setOwner("John Doe");
        setBalance(0);
        setOverdarftLimit(1000);
    }
    public Account(int newNumber, String newOwner, int newBalance, int newOverdarftLimit)
    {
        setNumber(newNumber);
        setOwner(newOwner);
        setBalance(newBalance);
        setOverdarftLimit(newOverdarftLimit);
    }
    
    public void setNumber(int newNumber)
    {
        if(newNumber > 1)
        {
            this.number = newNumber;
        }
        else
        {
            this.number = 0; // default
        }
    }
    public int getNumber()
    {
        return number;
    }
    
    public void setOwner(String newOwner)
    {
        if(newOwner != null && newOwner > 2)
        {
            this.owner = newOwner;
        }
        else
        {
            this.owner = "John Doe";
        }
    }
    public String getOwner()
    {
        return owner;
    }
    
    public void setBalance(int newBalance)
    {
        if(newBalance >= overdraftLimit)
        {
            this.balance = newBalance;
        }
        else
        {
            this.balance = 0;
        }
    }
    public int getBalance()
    {
        return balance;
    }
    
    public void setOverdarftLimit(int newOverdraftLimit)
    {
        if(newOverdraftLimit >= 0)
        {
            this.overdraftLimit = newOverdraftLimit;
        }
        else
        {
            this.overdraftLimit = 1000;
        }
    }
    public int getOverdarftLimit()
    {
        return overdraftLimit;
    }
    
    public int deposit(int amount)
    {
        int dep = 0;
        if(amount > 0)
        {
            dep = balance + amount;
        }
        else
        {
            System.out.println("fehler in deposit");
        }
        return dep;
    }
    
    public int withdraw(int amount)
    {
        int wit = 0;
        if(amount > 0 && amount <= overdraftLimit)
        {
            wit = balance - amount;
        }
        else
        {
            System.out.println("fehler in withdraw");
        }
        return wit;
    }
    
    public String getDatabaseId()
    {
        String s = owner.toUpperCase();
        
        
        if(owner.replaceAll(" ", " _ "))
        
        return s+ "_" + number;
        
    }
    
    public void print()
    {
        System.out.println("number: " + getNumber());
        System.out.println("=======================");
        System.out.println("owner: " + getOwner());
        System.out.println("=======================");
        System.out.println("balance: " + getBalance());
        System.out.println("=======================");
        System.out.println("overdraftLimit: " + getOverdarftLimit());
        System.out.println("=======================");
    }
}
public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overdraftLimit;

    public boolean check(int number, String owner, int balance, int overdraftLimit)
    {
        if(number < 0)return false;
        if(owner == null) return false;
        if(owner.length() < 2 )return false;        
        if(balance <  -overdraftLimit)return false;
        if(overdraftLimit < 0)return false;
        return true;
    }

    public Account(int number, String owner, int balance, int overdraftLimit)
    {
        if(check(number, owner, balance, overdraftLimit))
        {
            this.number = number;
            this.owner = owner;
            this.balance = balance;
            this.overdraftLimit = overdraftLimit;
        }
        else
        {
            this.number = 1;
            this.owner = "John Doe";
            this.balance = 0;
            this.overdraftLimit = 1000;            
        }
    }

    public Account()
    {
        this(1, "John Doe", 0, 1000);
    }

    public void setNumber(int number)
    {
        if(check(number,owner, balance, overdraftLimit))
        {
            this.number = number;
        }
        else
        {
            System.out.println("False input in setNumber.");
            this.number = 1;
        }
    }

    public void setOwner(String owner)
    {
        if(check(number,owner, balance, overdraftLimit))
        {
            this.owner = owner;
        }
        else
        {
            System.out.println("False input in setOwner.");
            this.owner = "John Doe";
        }
    }

    public void setBalance(int balance)
    {
        if(check(number,owner, balance, overdraftLimit))
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("False input in setBalance.");
            this.balance = 0;
        }
    }

    public void setOverDraftLimit(int overdraftLimit)
    {
        if(check(number,owner, balance, overdraftLimit))
        {
            this.overdraftLimit = overdraftLimit;
        }
        else
        {
            System.out.println("False input in setOverDraftLimit.");
            this.overdraftLimit = 1000;
        }
    }

    public int getNumber()
    {
        return number;
    }

    public String getOwner()
    {
        return owner;
    }

    public int getBalance()
    {
        return balance;
    }

    public int getOverDraftLimit()
    {
        return overdraftLimit;
    }

    public int deposit(int amount)
    {
        if(amount > 0)
        {
            balance += amount;
            return balance;        
        }
        else{
            System.out.println("You aren't adding any money.");
            return 0;
        }        
    }

    public int withdraw(int amount)
    {
        if(amount > 0){
            balance -= amount;
            return balance;
        }
        else
        {
            System.out.println("You aren't withdrawing any money");
            return 0;
        }
    }
    
    public String getDatabaseId()
    {
        String result;
        result = owner.toUpperCase();
        result = result.replace(" ", "_");
        result = result + "_" + number;
        return result;
    }
    
    public void print()
    {
        System.out.println("Account Owner: " + getOwner());
        System.out.println("Account Number: " + getNumber());
        System.out.println();
        System.out.println("Account Balance:" + getBalance());
        System.out.println("Maximal Account Overdraft: " + getOverDraftLimit());
    }
}
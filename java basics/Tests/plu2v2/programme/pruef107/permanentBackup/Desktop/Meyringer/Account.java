public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overDraftLimit;

    public boolean check(int number, String owner, int balance, int overDraftLimit)
    {
        if(number<0) return false;
        if(owner.length()<2 || owner == null) return false;
        if(balance < -overDraftLimit) return false;
        if(overDraftLimit < 0) return false;
        return true;
    }

    public Account(int number, String owner, int balance, int overDraftLimit)
    {
        if(check(number, owner, balance, overDraftLimit))
        {
            this.number = number;
            this.owner = owner; 
            this.balance = balance;
            this.overDraftLimit = overDraftLimit;
        }
        else
        {
            number = 1;
            owner = "John Doe";
            balance = 0;
            overDraftLimit = 1000;
        }
    }

    public Account()
    {
        this.number = 1;
        this.owner = "John Doe";
        this.balance = 0;
        this.overDraftLimit = 1000;
    }

    public void setNumber(int number)
    {
        if(check(number, owner, balance, overDraftLimit))
        {
            this.number = number;
        }
        else
        {
            System.out.println("Error in value");
            number = 1;
        }
    }

    public int getNumber()
    {
        return number;
    }

    public void setOwner(String owner)
    {
        if(check(number, owner, balance, overDraftLimit))
        {
            this.owner = owner;
        }
        else
        {
            System.out.println("Error in value 1");
            owner = "John Doe";
        }
    }

    public String getOwner()
    {
        return owner;
    }

    public void setBalance(int balance)
    {
        if(check(number, owner, balance, overDraftLimit))
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("Error in value 2");
            balance = 0;
        }            
    }

    public int getBalance()
    {
        return balance;
    }

    public void setOverdraftLimit(int overDraftLimit)
    {
        if(check(number, owner, balance, overDraftLimit))
        {
            this.overDraftLimit = overDraftLimit;
        }
        else
        {
            System.out.println("Error in value 3");
            overDraftLimit = 1000;
        }
    }
    
    public int getOverDraftLimit()
    {
        return overDraftLimit;
    }
    
    public int deposit(int amount)
    {
        if(amount > 0)
        {
            balance += amount;
            return balance;
        }
        else
        {
            System.out.println("Error, wrong number");
            return 0;
        }
    }
    
    public int withdraw(int amount)
    {
        if(amount > 0 && amount <= (balance + overDraftLimit))
        {
            balance -= amount;          
            return amount;
        }
        else if(amount > 0 && amount > (balance+overDraftLimit))
        {
            int result = 0;
            result = (balance + overDraftLimit);
            return result;
        }
        else
        {
            System.out.println("Error, wrong number");
            return 0;
        }
    }
    
    public String getDatabase()
    {
        String ownerUC=getOwner().toUpperCase()+getNumber();
        return ownerUC.replace(" ","_" );
    }
    
    public void print()
    {
        System.out.println("Number: "+getNumber());
        System.out.println("Owner: "+getOwner());
        System.out.println("Balance: "+getBalance());
        System.out.println("OverDraftLimit: "+getOverDraftLimit());
    }
}
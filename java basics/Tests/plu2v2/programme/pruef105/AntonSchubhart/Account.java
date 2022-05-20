
public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int limit;

    public boolean check(int number, String owner, int balance, int limit)
    {
        if(number < 0 || owner == null || owner.length() <= 2 || limit < 0  ) return false;
        if(balance < -limit) return false;
        return true;
    }

    public Account(int number, String owner, int balance, int limit)
    {
        if(check(number, owner, balance, limit))
        {
            this.number = number;
            this.owner = owner;
            this.balance = balance;
            this.limit=limit;

        }
        else
        {
            this.number=1;
            this.owner="John Doe";
            this.balance=0;
            this.limit=1000;
        }
    }

    public Account()
    {
        this(1, "John Doe", 0, 1000);
    }

    public void setNumber(int number)
    {
        if(check(number, owner, balance, limit))
        {
            this.number=number;
        }
    }

    public void setOwner(String Owner)
    {
        if(check(number, owner, balance, limit))
        {
            this.owner=owner;
        }
    }
    public void setBalance(int balance)
    {
        if(check(number, owner, balance, limit))
        {
            this.balance=balance;
        }
    }
     public void setLimit(int limit)
    {
        if(check(number, owner, balance, limit))
        {
            this.number=number;
        }
    }
    public int getLimit()
    {
        return limit;
    }
    public String getOwner()
    {
        return owner;
    }
    public int getBalance()
    {
        return balance;
    }
    public int getNumber()
    {
        return number;
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
            System.out.println("Error");
            return 0;
        }
        
    }
    public int withdraw(int amount)
    {
        if(amount > 0 && amount < limit)
        {
            balance -= amount;
            return amount;
            
        }
        else if(amount > 0 && amount < limit)
        {
            int result = 0;
            result = (limit);
            return result;
        }
        return 0;
    }
    
    public void print()
    {
        System.out.println("Balance = "+ getBalance());
        System.out.println("Number = "+ getNumber());
        System.out.println(" overdraw Limit = "+ getLimit());
        System.out.println("Owner = " +getOwner());
        
    }
}
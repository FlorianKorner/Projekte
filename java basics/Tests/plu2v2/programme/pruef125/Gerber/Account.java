public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overdraftLimit;
    
    public Account()
    {
        this.number = 1;
        this.owner = "John Doe";
        this.balance = 0;
        this.overdraftLimit = 1000;
    } 
    
    public Account(int number, String owner ,int balance, int overdraftLimit)
    {
        if(checkConsistency(number,owner,balance,overdraftLimit))
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

    

    public boolean checkConsistency(int number, String owner, int balance, int overdraftLimit)
    {
        if( number>=0 && owner!=null && owner.length()>2 &&  balance <= overdraftLimit
        && overdraftLimit>= 0 ){return true;}
        return false;
    }

    public void setNumber(int newNumber)
    {
        if(checkConsistency(number,owner,balance,overdraftLimit))
        {
            this.number = newNumber;
        }
        else 
        {
            this.number = 1;
        }
    }

    public void setOwner(String newOwner)
    {
        if(checkConsistency(number,owner,balance,overdraftLimit))
        {
            this.owner = newOwner;
        }
        else 
        {
            this.owner = "John Doe";
        }
    }

    public void setBalance(int newBalance)
    {
        if(checkConsistency(number,owner,balance,overdraftLimit))
        {
            this.balance = newBalance;
        }
        else 
        {
            this.balance = 0;
        }
    }

    public void setOverdraftLimit(int newOverdraftLimit)
    {
        if(checkConsistency(number,owner,balance,overdraftLimit))
        {
            this.overdraftLimit = newOverdraftLimit;
        }
        else 
        {
            this.overdraftLimit = 1000;
        }
    }

    public int getNumber(){return this.number;}

    public String getOwner(){return this.owner;}

    public int getBalance(){return this.balance;}

    public int getOverdraftLimit(){return this.overdraftLimit;}
    
    public int deposit(int amount)
    {
    if(amount>0)
    {
    setBalance(getBalance()+amount);
    }
    return getBalance();
    }
    
    public int withdraw(int amount)//!!!!!!!!!
    {
    if(amount>0)
    {
    if (getBalance()-amount< getOverdraftLimit())
    {
    setBalance(getBalance()-amount);
    return amount;
    }
    else
    {
    int a = getBalance();
    setBalance(getOverdraftLimit());
    return a-getOverdraftLimit();
    }
    }
    return 0;
    }
    
    public String getDatabaseId()
    {
        String result = null;
    result = getOwner().toUpperCase().replace(" ","_")+"_"+getNumber();
    return result;
    }
    
    public void print()
    {
    System.out.println("The number:" + getNumber());
    System.out.println("The owner:" + getOwner());
    System.out.println("The balance:" + getBalance());
    System.out.println("The overdraftLimit:" + getOverdraftLimit());
    }

}

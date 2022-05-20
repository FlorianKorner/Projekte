
/**
 * Beschreiben Sie hier die Klasse Account.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overDraft;

    public Account(int number, String owner, int balance,int overDraft )
    {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
        this.overDraft = overDraft;
    }

    public Account()
    {
        this.number = 1;
        this.owner = "John Doe ";
        this.balance = 0;
        this.overDraft = 1000;
    }

    public boolean check(int number, String owner, int balance,int overDraft)
    {
        if(number >= 0)
        {
            return true;
        }
        if(owner != null && owner.length() >= 2)
        {
            return true;   
        }
        if(balance >= -overDraft)
        {
            return true;   
        }
        if(overDraft >= 0)
        {
            return true;   
        }
        return false;
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

    public int getOverDraft()
    {
        return overDraft;
    }

    public void setNumber (int number)
    {
        if(check(number, getOwner(), getBalance(),getOverDraft()))
        {
            this.number = number;
        }
    }

    public void setOwner (String owner)
    {
        if(check(getNumber(), owner, getBalance(),getOverDraft()))
        {
            this.owner = owner;
        }
    }

    public void setBalance (int balance)
    {
        if(check(getNumber(), getOwner(), balance,getOverDraft()))
        {
            this.balance = balance;
        }
    }

    public void setOverDraft(int overDraft)
    {
        if(check(getNumber(), getOwner(), getBalance(),overDraft))
        {
            this.balance = balance;
        }
    }

    public int deposit(int amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;   
        }
        return balance;
    }
    // work in progress...
    public int withdraw(int amount)
    {
        if(amount > 0 && amount < overDraft)
        {
            balance = balance - amount;
        }
        return amount;
    }
    // work in progress...
    public String getDatabaseld()
    {
        String a = getOwner().toUpperCase().replace(' ','_');

        return a;
    }

    public void print()
    {
        System.out.println("Account number: " + getNumber());
        System.out.println("Name of the owner: " + getOwner());
        System.out.println("Money in the account: " + getBalance());
        System.out.println("Over draft limit: " + getOverDraft());
    }

}

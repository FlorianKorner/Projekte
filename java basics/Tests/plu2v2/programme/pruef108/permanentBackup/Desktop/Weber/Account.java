
public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overDraftLimit;

    public boolean check(int number,String owner,int balance,int overDraftLimit)
    {
        if(number<1)return false;
        if(owner==null)return false;
        if(owner.length() <2)return false;
        if(balance < overDraftLimit)return false;
        if(overDraftLimit <0)return false;
        return true;

    }

    public Account()
    {
        this(1, "John Doe", 0, 1000);
    }

    public Account(int number,String owner,int balance,int overDraftLimit)
    {
        if(check(number, owner, balance, overDraftLimit))
        {
            this.owner=owner;
            this.number=number;
            this.balance=balance;
            this.overDraftLimit=overDraftLimit;
        }
        else
        {
            this.number=1;
            this.owner="John Doe";            
            this.balance=0;
            this.overDraftLimit=1000;
        }
    }

    public void setNumber(int number)
    {
        if(check(number, owner, balance, overDraftLimit))        
            this.number=number;
        else
            this.number=1;

    }

    public void setOwner(String owner)
    {
        if(check(number, owner, balance, overDraftLimit))        
            this.owner=owner;
        else
            this.owner="John Doe";

    }

    public void setBalance(int balance)
    {
        if(check(number, owner, balance, overDraftLimit))        
            this.balance=balance;
        else
            this.balance=0;

    }

    public void setOverDraftLimit(int overDraftLimit)
    {
        if(check(number, owner, balance, overDraftLimit))        
            this.overDraftLimit=overDraftLimit;
        else
            this.overDraftLimit=1000;

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
        return overDraftLimit;
    }

    public int deposit(int amount)
    {
        int newB=0;
        if(amount<0)
            System.out.println("Error in method deposit");
        
        else
        {
            newB=balance+amount;
            return newB;
        }
        return newB;
    }

    public int withdraw(int amount)
    {
        int newB=0;
        if(amount<0)
        {
            System.out.println("Error in method deposit");
        }
        else
        {
            newB=balance-amount;
            return newB;
        }
        return newB;
    }
    
    public String getDatabaseId()
    {
        String o="";
        if(owner.contains(" "))
        owner.replace(" ","_");
        owner.toUpperCase();
        o=o+getOwner()+ "_" +getNumber();
        return o;
    }
    
    public void print()
    {
        System.out.println("****************");
        System.out.println("The number is: "+getNumber());
        System.out.println("The balance is: "+getBalance());
        System.out.println("The owner is: "+getOwner());
        System.out.println("over draft limit is: "+getOverDraftLimit());
        System.out.println("****************");
    }
}
 

/**
 * Beschreiben Sie hier die Klasse Account.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Account
{
    private String owner;
    private int accountNumber;
    
    private int balance;
    private int overDraftLimit;
    
    public boolean checkConsistency(String owner,int accountNumber,int balance,int overDraftLimit)
    {
        if(accountNumber < 0 ) return false;
        if(owner == null ) return false;
        if(owner.length() < 2)return false;
        if(balance < overDraftLimit )return false;
        if(overDraftLimit < 0)return false;
        
        return true;
    }
    
    public Account(String owner,int accountNumber,int balance,int overDraftLimit)
    {
        if(checkConsistency(owner, accountNumber, balance, overDraftLimit))
        {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overDraftLimit = overDraftLimit;
       }
       else
       {
        this.owner = "John Doe";
        this.accountNumber = 1;
        this.balance = 0;
        this.overDraftLimit = 1000; 
           
       }
    }
    
    
    public Account()
    {
        
       
        this.owner = "John Doe";
        this.accountNumber = 1;
        this.balance = 0;
        this.overDraftLimit = 1000; 
           

    }
    
    public void setOwner(String Owner)
    {
        if(checkConsistency(owner, this.accountNumber, this.balance, this.overDraftLimit))
        this.owner= owner;
        else
        this.owner = "John Doe";
        
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public void setAccountNumber(int accountNumber)
    {
      if(checkConsistency(this.owner, accountNumber, this.balance, this.overDraftLimit)) 
      this.accountNumber = accountNumber;
      else 
      this.accountNumber = 1;
    }
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public void setBalance(int balance)
    {
        if(checkConsistency(this.owner, this.accountNumber, balance, this.overDraftLimit))    
        this.balance = balance;
        else
        this.balance = 0;
    }
    
    public int getBalance()
    {
        return balance;
    }
    
    public void setOverDraftLimit(int overDraftLimit)
    {
      if(checkConsistency(this.owner, this.accountNumber, this.balance, overDraftLimit))  
      this.overDraftLimit = overDraftLimit;
      else
      this.overDraftLimit = 1000;
    }
    
    public int getOverDraftLimit()
    {
        return overDraftLimit;
    }
    
    public int deposit(int amount)
    {
        
        if(amount < 0 )
        {
        System.out.println("Error amount is smaller than 0");
        }
        else
        {
        balance = balance + amount ;
        return balance;
        }
        return balance;
    }
    
    public int withdraw(int amount)
    {
        
        if(amount < 0 )
        {
         System.out.println("Error amount is smaller than 0");   
        }
        
        else
        {
           
            balance = balance - amount ;
            return amount;
        }
        return amount;
    }
    
    public String getDatabaseId()
    {
        String newOwner = "";
        owner.toUpperCase();
        if(owner.contains(" "))
         newOwner = owner.replace(" ","_");
        newOwner = newOwner + "_" + getAccountNumber();
        return newOwner;
    }
    
   
    
    public void print()
    {
        System.out.println("******Account******");
        System.out.println("Owner : " +  getOwner());
        System.out.println("AccountNumber : " + getAccountNumber());
        System.out.println("Current Balance : " +  getBalance());
        System.out.println("OverDraftLimit :  " + getOverDraftLimit());
        System.out.println("Database Id : " +  getDatabaseId());
        System.out.println("*******************");
    }
}

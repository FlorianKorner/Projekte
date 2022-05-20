public class Account
{
    private int number;
    private String Owner;
    private int balance;
    private int overDraftLimit;
    
    public boolean check(int number, String Owner, int balance, int overDraftLimit)
    {
        if(number < 0 && Owner == null && balance >= balance - overDraftLimit && overDraftLimit < 0) return false;
        if(Owner.length() < 2) return false;
        return true;
    }
    
    public Account(int number, String Owner, int balance, int overDraftLimit)
    {
        if(check(number, Owner, balance, overDraftLimit)){
           this.number = number;
           this.Owner = Owner;
           this.balance =balance;
           this.overDraftLimit = overDraftLimit;
        }
        else
         {
             number = 1;
             Owner = "John Doe";
             balance = 0;
             overDraftLimit = 1000;
            }
    }
    public Account()
    {
        this(1,"John Doe", 0, 1000);
    }
    public void setNumber(int number)
    {
      if(check(number, Owner, balance, overDraftLimit)){
         this.number = number;  }
      else
       System.out.println("Error in setting account number");
    }
    public void setOwner(String Owner)
    {
      if(check(number, Owner, balance, overDraftLimit)){
         this.Owner = Owner;  }
      else
       System.out.println("Error in setting Owner");
    }
    public void setBalance(int balance)
    {
      if(check(number, Owner, balance, overDraftLimit)){
         this.balance = balance;  }
      else
       System.out.println("Error in setting balance");
    }
    public void setOverDraftLimit(int overDraftLimit)
    {
      if(check(number, Owner, balance, overDraftLimit)){
         this.overDraftLimit= overDraftLimit;  }
      else
       System.out.println("Error in setting overDratLimit");
    }
    public int getNumber()
    {
        return number;
    }
    public String getOwner()
    {
        return Owner;
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
        if(amount > 0) 
        
        {   
            
            balance = balance + amount;
            return balance;
        }
        else
         return amount;
    }
    public int withdraw(int amount)
    {
        if(amount < 0) return 0;
        if(amount <= overDraftLimit && balance < overDraftLimit - balance){
         balance = balance - amount;
         return amount;
        }
        else
        return amount;
    }
    public String getDatabaseId()
    {
        if(Owner.contains(" ")){
         Owner.toUpperCase();   
         Owner.replace(" ", "_");
         Owner = Owner + "_" + number;
         return Owner;
        }
        else
         return Owner;
    }
    public void print()
    {
        System.out.println("AccountNumber: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("Owner: " + Owner);
        System.out.println("OverDrafLimit: " + overDraftLimit);
    }
    
}

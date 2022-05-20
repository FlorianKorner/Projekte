public class Account
{
    private int number;
    private String owner;
    private int balance;
    
   public Account (int newnumber, String newowner, int newbalance)
   {     
        this.number = newNumbe(1);
        this.owner = newOwner("John Doe"); 
        this.balance = newbalance(500);
   }
     
   public int getNumber()
   {
      return number;
   }
   
   public void setNumber()
   {
       if (checkConsistancy(number, owner, balance))
       {
          this.number = number; 
       }
       else
       {
           this.number = 0;
       }
   }
   
   public String getOwner()
   {
      return owner;
   }
   
   public void setOwner()
   {
       if (checkConsistancy(getNumber(), owner, getBalance())
       {
          this.owner = owner; 
       }
       else
       {
           this.owner = "John Doe";
       }
   }
   
   public int getbalance()
   {
      return balance;
   }
   
   public void setBalnce()
   {
       if (checkConsistancy(getnumber, getowner, balance))
       {
          this.balance = balance; 
       }
       else
       {
           this.balance = 500;
       }
   }
   
   public Account(int newnumber, String newowner, int newbalance)
      {
       if(checkConsistency2)
       {
       }       
     }
   public int deposite(int amount) //adds amount to balance
   { 
     if(amount > 0)
     {
         amount = this.amount += balance;
     }              
     return amount;     
   }  
   
   public int withdraw(int amount) //subtracs amount to balance
   {
       if (amount > 0)
       {
           amount = this.amount -= balance;
       }
       return amount;
   }
   
   public String getDatabaseld()
   {
       
   }
}

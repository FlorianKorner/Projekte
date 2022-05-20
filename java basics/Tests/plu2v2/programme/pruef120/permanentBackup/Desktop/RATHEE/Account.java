public class Account
{

   private int number; //account number
   private String owner; // name of the owner
   private int balance; // money in account
   private int odl; // over draft limit Überziehungsrahmen wieviel das maximal sein lann in plus und minus
    public Account(int number, String owner, int balance, int odl)
    {
    if(check(number,owner,balance,odl))
    {this.number=number;
    this.owner= owner;
    this.balance= balance;
    this.odl=odl;}
    }
    
  
        public Account()
    {
    if(check(number,owner,balance,odl))
    {this.number=1;
    this.owner= "John Dow";
    this.balance= 0;
    this.odl=1000;}
    }
    
   
   
   public boolean check(int number,String owner, int balance, int odl)
   {if(!(number>0))return false;
    if(!(owner.length()>2))return false;
    if(!(getOwner()!=null))return false;
    if(!(balance>= odl))return false;
    if(!(odl>=0))return false;
    else return true;
    
    
    }
    

    public void setNumber(int number)
    {if(check(number,owner,balance,odl))
        {this.number=number;}
        else{System.out.println("Wrong amoung in setNumber");
        number=1;
    }
    
    
    
    }
    
    
    public void setOwner(String owner)
    {if(check(number,owner,balance,odl))
        {this.owner=owner;}
        else{System.out.println("Wrong amoung in setOwner");
        owner="John Doe";
    }
    
    
    
    }
    
    
    public void setBalance(int balance)
    {if(check(number,owner,balance,odl))
        {this.balance=balance;}
        else{System.out.println("Wrong amoung in setNumber");
       balance=0;
    }
    
    
    
    }
    
    
    public void setOdl(int odl)
    {if(check(number,owner,balance,odl))
        {this.odl=odl;}
        else{System.out.println("Wrong amoung in setNumber");
        number=odl;
    }
    
    
    
    }
    
    public int getNumber()
    {return number ;}
    
     public int getBalance()
    {return balance;}
    
     public int getOdl()
    {return odl ;}
    
     public String getOwner()
    {return owner;}

    
    int deposit(int amount)
    {if(!(balance>0))return 0;
    
        else
        {setBalance(balance+amount);
        return balance;}
   
    }
    
    int withdraw(int amount)
    {
    if(!(amount>0))return 0;
    if(!(amount<= odl))return 0;
    if(!(amount<=balance))return 0;
    
    int save=0;
    if(balance>= amount)
    {
    save= amount;
    setBalance(balance-amount);
    return save;
    }
    else
    {save = odl;
    setBalance(0);
    return save;}
    
    
    }
    
    public String getDatabaseld()
    {
    getOwner().replace(" ", "_");
    getOwner().toUpperCase();
    getDatabaseld= owner+ number;
    return databaseld;
    
    }
    
    public void print()
    {
    System.out.println("The account has" + getBalance() + "balance");
    System.out.println("The account's owner is" + getOwner() );
    System.out.println("The limit is" + getOdl() );
    
    }

}

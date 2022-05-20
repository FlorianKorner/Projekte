

public class Bank
{
   private Account a0;
   private Account a1;
   private Account a2;
   
   public Account getAccount(int i)
   {
       if(i == 0 && a0 != null)
       {
           return a0;
        }
        if(i == 1 && a1 != null)
       {
           return a1;
        }
        if(i == 2 && a2 != null)
       {
           return a2;
        }
       else
       {
           System.out.println("Error, try again");
           return null;
        }
    }
   public Account addAccount(Account a)
   {
       if(a != null)
    {
       if( a0 == null)
      {
          a0 =a;
          return a0;
        }
     if(a1 == null)
      {
          a1 =a;
          return a1;
        }
        if( a2 == null)
      {
          a2 =a;
          return a2;
        }
      
    }
    else
    {
        return null;
    }
    return null;
}
    public Account removeAccount(int num)
    {
        if(a1 != null && a1.getNumber() == num)
     
        {
            Account y = a1;
            a1 = null;
            return y;
            
        }
        if(a2 != null && a2.getNumber() == num)
     
        {
            Account y = a2;
            a2 = null;
            return y;
            
        }
        if(a0 != null && a0.getNumber() == num)
     
        {
            Account y = a0;
            a0 = null;
            return y;
            
        }
        else
        {
            return null;
        }
    }
    public int sumAccounts()
    {
        int counter= 0;
        if(a0 != null)counter += a0.getBalance();
        if(a1 != null)counter += a1.getBalance();
        if(a2 != null)counter += a2.getBalance();
        return counter;
    }
    public int numberOfAccounts()
    {
        int result= 0;
        if(a0 != null)result += 1;
        if(a1 != null)result += 1;
        if(a2 != null)result += 1;
        return result;
    }
    public void print()
    {
        if(a0 != null)
        {
            a0.print();
        
        }
        else
        {
            System.out.println("Empty");
        
        }
        if(a1 != null) 
        {
            a1.print();
        }
        else
        {
            System.out.println("Empty");
        
        }
        if(a2 != null)
        {
            a2.print();
        }
        else
        {
            System.out.println("Empty");
        
        }
    }
}

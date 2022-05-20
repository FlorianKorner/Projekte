
/**
 * Beschreiben Sie hier die Klasse Bank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
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
        else if(i == 1 && a0 != null)
        {
            return a1;
        }
        else if(i == 2 && a0 != null)
        {
            return a2;
        }
        else
        return null;
    }
    
    public Account addAccount(Account a)
    {
        if(a0 == null && a0 != a && a1 != a && a2 != a )
        {
        a0 = a;
        return a0;
        }
        else if(a1 == null && a0 != a && a1 != a && a2 != a)
        {
        a1 = a;
        return a1;
        }
        else if(a2 == null && a0 != a && a1 != a && a2 != a)
        {
        a2 = a;
        return a2;
        }
        else{
        System.out.println("No account could be added or it is already added :( ");
        return null;
    
        }   

    }
    
     public Account removeAccount(int num)
     {
     if(a0 != null && num == a0.getAccountNumber())
     {
         Account r = a0;
         a0 = null;
         return r;
        }
     else if(a1 != null && num == a1.getAccountNumber())
     {
         Account r = a1;
         a1 = null;
         return r;
        }
     else if(a2 != null && num == a2.getAccountNumber())
     {
         Account r = a2;
         a2 = null;
         return r;
        }
     else 
     {
      System.out.println("We could not remove an account, thats why we return null");
      return null;
        }
         
   
    }
    
    
    public int numberOfAccounts()
    {
        int num = 0 ;
        if(a0 != null )
            num += 1;
        if(a1 != null)
            num += 1;
        if(a2 != null)
            num += 1;
        return num;   
    }
    
    public int sumAccount()
    {
        int sum = 0;
        if(a0 != null)
           sum = sum + a0.getBalance();
        if(a1 != null)
           sum = sum + a1.getBalance();
        if(a2 != null)
           sum = sum +a2.getBalance(); 
        return sum;       
    }
    
    public int countDbldWith(String str)
    {
        int num = 0;
        if(a0.getOwner().contains(str))
        num += 1;
        if(a0.getOwner().contains(str))
        num += 1;
        if(a0.getOwner().contains(str))
        num += 1;
        
        
        return num;
    }
    
    public void print()
    {
      System.out.println("*-------Euro Bank---------");  
      System.out.println("Num. of account in Banks : " + numberOfAccounts());  
      System.out.println("Sum. of all accounts : " + sumAccount());  
      if(a0 != null){
        a0.print();
        }else{
      System.out.println("******Account******");
      System.out.println("Account Empty");  
      System.out.println("******************");
    }
      if(a1 != null){
        a1.print();
        }else{
      System.out.println("******Account******");
      System.out.println("Account Empty");  
      System.out.println("******************");
    }
      if(a2 != null){
        a2.print();
    }else{
      System.out.println("******Account******");
      System.out.println("Account Empty");  
      System.out.println("******************");
    }
      
      System.out.println("---------------------");  
        
    }
    
}

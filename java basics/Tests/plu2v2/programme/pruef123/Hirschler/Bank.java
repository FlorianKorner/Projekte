public class Bank
{
    private Account account0;
    private Account account1;
    private Account account2;
    
    public Account getAccount(int i)
    {
        if(i == 0) {return account0;}
        else if(i == 1) {return account1;}
        else if(i == 2) {return account2;}
        
    }
    
    public Account addAccount(Account a)
    {
        if(account0 == null)
        {
            a = account0;
            return a;
        }
        else if(account1 == null)
        {
            a = account1;
            return a;
        }
        else if(account2 == null)
        {
            a = account2;
            return a;
        }
        if(account0 != null || account1 != null || account2 != null || a == account0 || a == account1 || a == account2)
        {
            return null;
        }
        
    }
    
    public Account removeAccount(int num)
    {
        
        if(account0 != null)
        {
            
            
        }
        else if(account1 != null)
        {
        }
        else if(account2 != null)
        {
        }
        else
        {
            return null;
        }
        
    }
    
    public int numberOfAccounts()
    {
        int ergebnis = 0;
        if(account0 != null) ergebnis += account0;
        if(account1 != null) ergebnis += account1;
        if(account2 != null) ergebnis += account2;
        return ergebnis;
    }
    
    public int sumAccount()
    {
        int ergebnis1 = 0;
        if(account0 != null) ergebnis1 += account0.getBalance();
        if(account1 != null) ergebnis1 += account1.getBalance();
        if(account2 != null) ergebnis1 += account2.getBalance();
        return ergebnis1;
    }
    
    public void print()
    {
        if(account0 != null) account0.print();
        if(account1 != null) account1.print();
        if(account2 != null) account2.print();
        if(account0 == null)
        {
            System.out.println("account0 empty");
        }
        else if(account1 == null)
        {
            System.out.println("account1 empty");
        }
        else if(account2 == null)
        {
            System.out.println("account2 empty");
        }
        else
        {
            System.out.println("NO accounts are empty!!");
        }
    }
    
    public int countDbldWith(String str)
    {
        int ergebnis = 0;
        if(account0.getDatabase().contains(str)) ergebnis = ergebnis + account0;
        if(account1.getDatabase().contains(str)) ergebnis = ergebnis + account1;
        if(account2.getDatabase().contains(str)) ergebnis = ergebnis + account2;
        return ergebnis;
    }
}
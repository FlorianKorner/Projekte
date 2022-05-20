public class Bank
{
    private Account a0;
    private Account a1;
    private Account a2;
    
   public Account getAccount(int i)
   {
       if(i == 0) return a0;
       if(i == 1) return a1;
       if(i == 2) return a2;
       return null;
   }
   
   public Account addAccount(Account a)
   {
       Account addedAcc;
       if(a == null || a == a0 || a == a1 || a == a2) return null;
       if(a0 == null)
       {
           a0 = a;
           return a0;
       }
       else if(a1 == null)
       {
           a1 = a;
           return a1;
        }
       else if(a2 == null)
       {
           a2 = a;
           return a2;
        }
       return null;
    }
    
   public Account removeAccount(int num)
   {
       Account save;       
       if(a0 != null && num == a0.getNumber())
       {
           save = a0;
           a0 = null;
           return save;
        }
       else if(a1 != null && num == a1.getNumber())
       {
           save = a1;
           a1 = null;
           return save;
        }
        else if(a2 != null && num == a2.getNumber())
        {
            save = a2;
            a2 = null;
            return save;
        }
       return null;
    }
    
   public int numberOfAccounts()
   {
       int result = 0;
       if(a0 != null)result ++;
       if(a1 != null)result ++;
       if(a2 != null)result ++;
       return result;
    }
    
   public int sumAccount()
    {
        int result = 0;
        if(a0 != null) result += a0.getBalance();
        if(a1 != null) result += a1.getBalance();
        if(a2 != null) result += a2.getBalance();
        return result;
    }
    
   public void print()
   {
       if(a0!= null) a0.print();
       else System.out.println("Account Empty");
       if(a1!= null) a1.print();
       System.out.println("Account Empty");
       if(a2!= null) a2.print();
       System.out.println("Account Empty");
    }
    
    public int countDbldWith(String str)
    {
        if(str == null) return 0;
        int result = 0;
        if(a0 != null && a0.getOwner().contains(str)) result ++;
        if(a1 != null && a1.getOwner().contains(str)) result ++;
        if(a2 != null && a2.getOwner().contains(str)) result ++;
        return result;
    }
}
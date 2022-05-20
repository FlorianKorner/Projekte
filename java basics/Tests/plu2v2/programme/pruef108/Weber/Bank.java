public class Bank
{
    private Account a0;
    private Account a1;
    private Account a2;
    
    public Account getAccount(int i)
    {
        if(i==0)
        return a0;
        else if(i==1)
        return a1;
        else if(i==2)
        return a2;
        else
        return null;
    }
    
    public Account addAccount(Account a)
    {
        if(a==null || a==a0 || a==a1 || a==a2)       
            System.out.println("Error in add");
        if(a0==null)
        {
            a0=a;
            return a;
        }
        else if(a1==null)
        {
            a1=a;
            return a;
        }
        if(a1==null)
        {
            a1=a;
            return a;
        }
        if(a2==null)
        {
            a2=a;
            return a;
        }
        return a;
    }
    
    public Account removeAccount(int num)
    {
        Account a=null;
        if(num==0 && a0!=null)
        {
            a=a0;
            a0=null;
            return a;
        }
        else if(num==1 && a1!=null)
        {
            a=a1;
            a1=null;
            return a;
        }
        else if(num==2 && a2!=null)
        {
            a=a2;
            a2=null;
            return a;
        }
        return a;
    }
    
    public int numberOfAccounts()
    {
        int n=0;
        if(a0!=null)
        n+=1;
        if(a1!=null)
        n+=1;
        return n;
    }
    
    public int sumAccounts()
    {
        int n=0;
        if(a0!=null)
        n=n+a0.getBalance();
        if(a1!=null)
        n=n+a1.getBalance();
        if(a2!=null)
        n=n+a2.getBalance();
        return n;
    }
    
    public void print()
    {        
        System.out.println("**************");
        System.out.println("The number of accounts are: "+numberOfAccounts());
        System.out.println("The sum of the accounts is: "+sumAccounts());
        if(a0==null)
        System.out.println("Account empty");
        else
        a0.print();
        if(a1==null)
        System.out.println("Account empty");
        else
        a1.print();
        if(a2==null)
        System.out.println("Account empty");
        else
        a2.print();
        System.out.println("**************");
    }
    public int countDbId(String str)
    {
        int c=0;
        if(a0.getOwner().contains(str))
        c +=1;
        if(a1.getOwner().contains(str))
        c +=1;
        if(a2.getOwner().contains(str))
        c +=1;
        return c;
    }
   
}
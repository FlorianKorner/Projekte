
/**
 * Beschreiben Sie hier die Klasse Bank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bank
{
    private Account acc0;
    private Account acc1;
    private Account acc2;

    public Account getAccount(int i)
    {
        if(i <= 2)
        {
            if(i == 0 && acc0 != null)
            {
                return acc0;
            }
            else
            if(i == 1 && acc1 != null)
            {
                return acc1;

            }
            else if(i == 1 && acc2 != null)
            {
                return acc2;
            }
        }

        return null;
    }
    
    public Account addAccount(Account a)
    {
        if(a!= null && acc0 == null)
        {
            acc0 = a;
            return a;
        }else
        if(a != null && acc1 == null)
        {

            acc1 = a;
            return a;
        }
        else
        if(a != null && acc2 == null)
        {
            acc2 = a;
            return a;
        }
        else
        {
            return null;   
        }
    }

    public Account removeAccount(int num)
    {
Account b = null;
        if( acc0 != null && num > 0 )
        {
         b = null;   
        acc0 = b;
        return b;
        }else
        if( acc1 != null && num > 0 )
        {
         b = null;   
        acc0 = b;
        return b;
        }
        else
        if( acc2 != null && num > 0 )
        {
         b = null;   
        acc0 = b;
        return b;
        }
        else
        {
        return null;   
    }
}

    public int numberOfAccounts()
    {

    
        return 0;

    }

    public int sumAccount()
    {
        int a;
        a = acc0.getBalance() + acc1.getBalance() + acc2.getBalance() ;
        return a;
    }

    public void print()
    {
        System.out.println("Summ of all account balance:" +  sumAccount());

        // if(acc0 != null && acc1 != null && acc2 != null)
        // {
            // System.out.println("information:" + acc0);

        // }
        // else if(acc0 == null && acc1 == null && acc2 == null)
        // {
            // System.out.println("information: account empty" + acc0);
            // System.out.println("information: account empty" + acc1);
            // System.out.println("information: account empty" + acc2);
        // }
    }
    
    // public int countDbldWith(String str)
    // {
        // String a = acc0.getNumber().contains(str);
        
    // }
}



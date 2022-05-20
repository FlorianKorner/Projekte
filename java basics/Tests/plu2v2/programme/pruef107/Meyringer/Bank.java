public class Bank
{
    private Account acc0;
    private Account acc1;
    private Account acc2;
    
    public Account getAccount(int i)
    {
        if(i == 0 && acc0 != null)
        {
            return acc0;
        }
        else if(i == 1 && acc1 != null)
        {
            return acc1;
        }
        else if(i == 2 && acc2 != null)
        {
            return acc2;
        }
        else
        {
            return null;
        }
    }
    
    public Account addAcc(Account a)
    {
        if(a != null)
        {
            if(acc0 == null)
            {
                acc0 = a;
                return acc0;
            }
            else if(acc1 == null)
            {
                acc1 = a;
                return acc1;
            }
            else if(acc2 == null)
            {
                acc2 = a;
                return acc2;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
    
    public Account removeAcc(int num)
    {
        if(acc0 != null&&num == acc0.getNumber())
        {
            Account xyz = acc0;
            acc0= null;
            return xyz;
        }
        else if(acc1 != null && num == acc1.getNumber())
        {
            Account xyz = acc1;
            acc1= null;
            return xyz;
        }
        else if(acc2 != null && num == acc2.getNumber())
        {
            Account xyz = acc2;
            acc2= null;
            return xyz;
        }
        else
        {
            return null;
        }
    }
    
    public int numberOFAccounts()
    {
        int counter = 0;
        if(acc0 != null) counter += 1;
        if(acc1 != null) counter += 1;
        if(acc2 != null) counter += 1;
        return counter;
    }
    public int sumAccount()
    {
        int counter1 = 0;
        if(acc0 != null) counter1 += acc0.getBalance();
        if(acc1 != null) counter1 += acc1.getBalance();
        if(acc2 != null) counter1 += acc2.getBalance();
        return counter1;
    }
    
    public void print()
    {
        System.out.println("Number of Accounts: "+numberOFAccounts());
        System.out.println("Sum of Accounts: "+sumAccount());
        if(acc0 != null)
        {
            acc0.print();
        }
        else
        {
            System.out.println("Account Empty");
        }
        if(acc1 != null)
        {
            acc1.print();
        }
        else
        {
            System.out.println("Account Empty");
        }
        if(acc2 != null)
        {
            acc2.print();
        }
        else
        {
            System.out.println("Account Empty");
        }
    }
    public int countDbIdWith(String str)
    {
        int counter2=0;
        if(acc0 != null && acc0.getDatabase().contains(str))counter2 += 1;
        if(acc1 != null && acc1.getDatabase().contains(str))counter2 += 1;
        if(acc2 != null && acc2.getDatabase().contains(str))counter2 += 1;
        return counter2;
    }
}
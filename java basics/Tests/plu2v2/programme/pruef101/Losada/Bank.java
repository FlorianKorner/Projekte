
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
        if(!(i==0 || i==1 || i==2))return null;
        int i0=0;
        int i1=0;
        int i2=0;
        if(i0>i1 && i0>i2)return acc0;
        else if(i1>i0 && i1>i2)return acc1;
        else return acc2;
    }

    public Account addAccount(Account a)
    {
        if(a==null)return a;
        if(acc0==null){
            a=acc0;
            return acc0;
        }else if(acc1==null){
            a=acc1;
            return acc1;
        }else if(acc2==null){
            a=acc2;
            return acc2;
        }else return null;
    }

    public Account removeAccount(int num)
    {
        if(acc0!=null){
            acc0=null;
            return acc0;
        }else if(acc1!=null){
            acc1=null;
            return acc1;
        } else if(acc2!=null){
            acc2=null;
            return acc2;
        }else return null;
    }

    public int numberOfAccounts()
    {
        int result=0;
        if(acc0!=null)result+=1;
        if(acc1!=null)result+=1;
        if(acc2!=null)result+=1;
        return result;
    }

    public int sumAccount()
    {
        int result=0;
        if(acc0!=null)result+=acc0.getBalance();
        if(acc1!=null)result+=acc1.getBalance();
        if(acc2!=null)result+=acc2.getBalance();
        return result;
    }

    public void print()
    {
        System.out.println("");
        System.out.println("sum of all account balances"+sumAccount());
        System.out.println("acc0:");
        System.out.println("number"+acc0.getNumber());
        System.out.println("owner"+acc0.getOwner());
        System.out.println("balance"+acc0.getBalance());
        System.out.println("Over with drawl limit"+acc0.getOverDraftLimit());
        System.out.println("");
        System.out.println("acc1:");
        System.out.println("number"+acc1.getNumber());
        System.out.println("owner"+acc1.getOwner());
        System.out.println("balance"+acc1.getBalance());
        System.out.println("Over with drawl limit"+acc1.getOverDraftLimit());
        System.out.println("");
        System.out.println("acc2:");
        System.out.println("number"+acc2.getNumber());
        System.out.println("owner"+acc2.getOwner());
        System.out.println("balance"+acc2.getBalance());
        System.out.println("Over with drawl limit"+acc2.getOverDraftLimit());
    }
    
    public int countDbldWith(String str)
    {
    int result=0;
    if(acc0!=null)if(acc0.getDatabase().contains(str))result+=1;
    if(acc1!=null)if(acc1.getDatabase().contains(str))result+=1;
    if(acc2!=null)if(acc2.getDatabase().contains(str))result+=1;
    return result;
    }
}

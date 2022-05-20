
/**
 * Beschreiben Sie hier die Klasse Account.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int OverDraftLimit;

    public boolean check(int number, String owner, int balance, int OverDraftLimit)
    {
        if(!(number>0))return false;
        if(!(balance>-OverDraftLimit))return false;
        if(!(OverDraftLimit>=0))return false;
        if(owner==null)return false;
        return true;
    }

    public Account(int number, String owner, int balance, int OverDraftLimit)
    {
        if(check(number, owner, balance, OverDraftLimit))
        {
            this.number=number;
            this.owner=owner;
            this.balance=balance;
            this.OverDraftLimit=OverDraftLimit;
        }else{
            this.number=1;
            this.owner="John Doe";
            this.balance=0;
            this.OverDraftLimit=1000;
        }
    }

    public Account()
    {
        this(1, "John Doe", 0, 1000);
    }

    public void setNumber(int n)
    {
        if(check(number, owner, balance, OverDraftLimit))
        {
            this.number=n;
        }
    }

    public void setOwner(String o)
    {
        if(check(number, owner, balance, OverDraftLimit))
        {
            this.owner=o;
        }
    }

    public void setBalance(int b)
    {
        if(check(number, owner, balance, OverDraftLimit))
        {
            this.balance=b;
        }
    }

    public void setOverDraftLimit(int o)
    {
        if(check(number, owner, balance, OverDraftLimit))
        {
            this.OverDraftLimit=o;
        }
    }

    public int getNumber()
    {
        return number;
    }

    public String getOwner()
    {
        return owner;
    }

    public int getBalance()
    {
        return balance;
    }

    public int getOverDraftLimit()
    {
        return OverDraftLimit;
    }

    public int deposit(int amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            return balance;
        }else{
            return  balance;
        }
    }

    public int withdraw(int amount)
    {
        if(amount<0)return 0;
        if(amount<=OverDraftLimit && balance>OverDraftLimit)
        {
            balance=balance-amount;
            return amount;
        }else{
            return 0;
        }
    }

    public String getDatabase()
    {
        if(owner.contains(" ")){
            owner.toUpperCase();
            owner.replace(" ","_");
            owner= owner+"_"+number;
            return owner;
        }else{
            return owner;
        }
    }

    public void print()
    {
        System.out.println("Number of account"+number);
        System.out.println("Balance"+balance);
        System.out.println("Owner"+owner);
        System.out.println("Over with drawl limit"+OverDraftLimit);
    }
}

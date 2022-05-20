public class Bank
{
    private Account acc0;
    private Account acc1;
    private Account acc2;

    public Account getAccount(int i)
    {if(i>=0 && i<=2)
        {
            if(this.acc0!=null && i == 0){return this.acc0;}
            if(this.acc1!=null && i == 1){return this.acc1;}
            if(this.acc2!=null && i == 2){return this.acc2;}
        }
        return null;
    }

    public Account addAccount(Account a)
    {
        Account result = null;
        if(a!=null && a!=this.acc0 && a!=this.acc1 && a!=this.acc2)
        {
            if(this.acc0!=a && this.acc0==null){result = this.acc0;this.acc0=a;return result;}
            else if(this.acc1!=a&& this.acc1==null){result = this.acc1;this.acc1=a;return result;}
            else if(this.acc2!=a && this.acc2==null){result = this.acc2;this.acc2=a;return result;}
            return null;
        }
        return null;
    }

    public Account removeAcc(int num)
    {
        Account result = null;
        if(this.acc0!=null && num == 0) {result = this.acc0; this.acc0 = null;return result;}
        if(this.acc1!=null && num == 1) {result = this.acc1; this.acc1 = null;return result;}
        if(this.acc2!=null && num == 2) {result = this.acc2; this.acc2 = null;return result;}
        return null;
    }

    public int numberOfAcc()
    {
        int result = 0;
        if(this.acc0!=null){result+=1;}
        if(this.acc1!=null){result+=1;}
        if(this.acc2!=null){result+=1;}
        return result;
    }

    public int sumAccount()
    {
        int result = 0;
        if(this.acc0!=null){result+=this.acc0.getBalance();}
        if(this.acc1!=null){result+=this.acc1.getBalance();}
        if(this.acc2!=null){result+=this.acc2.getBalance();}
        return result;
    }

    public void print()
    {
        System.out.println("The number of acc= " + numberOfAcc());
        System.out.println("The sum of acc= " + sumAccount());
        System.out.println("+++++++++++++++");
        if(this.acc0!=null) {
            System.out.println("acc0:");
            System.out.println("number" + this.acc0.getNumber());
            System.out.println("owner: " + this.acc0.getOwner());
            System.out.println("balance" + this.acc0.getBalance());
            System.out.println("overdrafLimit" + this.acc0.getOverdraftLimit());
        }
        else
        {
            System.out.println("ACCOUNT EMPTY");
        }
        if(this.acc0!=null) {
            System.out.println("+++++++++++++++");
            System.out.println("acc1:");
            System.out.println("number" + this.acc1.getNumber());
            System.out.println("owner: " + this.acc1.getOwner());
            System.out.println("balance" + this.acc1.getBalance());
            System.out.println("overdrafLimit" + this.acc1.getOverdraftLimit());
        }
        else
        {
            System.out.println("ACCOUNT EMPTY");
        }
        if(this.acc0!=null) {
            System.out.println("+++++++++++++++");
            System.out.println("acc2:");
            System.out.println("number" + this.acc2.getNumber());
            System.out.println("owner: " + this.acc2.getOwner());
            System.out.println("balance" + this.acc2.getBalance());
            System.out.println("overdrafLimit" + this.acc2.getOverdraftLimit());
        }
        else
        {
            System.out.println("ACCOUNT EMPTY");
        }
        //System.out.println("");
    }

    public int countDbIdWith(String str)
    {
        int result = 0;
        if(this.acc0!=null && str.indexOf(this.acc0.getDatabaseId())!=-1){result+=1;}
        if(this.acc1!=null &&str.indexOf(this.acc1.getDatabaseId())!=-1){result+=1;}
        if(this.acc2!=null &&str.indexOf(this.acc2.getDatabaseId())!=-1){result+=1;}
        return result;
    }
}


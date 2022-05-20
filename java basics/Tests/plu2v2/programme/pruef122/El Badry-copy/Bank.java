public class Bank
{
    private Account account0;
    private Account account1;
    private Account account2;
    
    public Account getAccount(int i)
    {
        if (this.account0 != null) {i = 0; return i;}
        if (this.account1 != null) {i = 1; return i;}
        if (this.account2 != null) {i = 2; return i;}
        else {return false;}
    }
    
    public Account addAccount(Account a)
    {
        pos(0, 1, 2);
        if (pos(0) = null) {pos(0) = a; if (a != null) {return a;} else {return null;}}
        if (pos(1) = null) {pos(1) = a; if (pos(0) != a) {return a;} else {return null;}}
        if (pos(2) = null) {pos(2) = a; if (pos(1) != a) {return a;} else {return null;}}
        else {return null;}
    }
    
    public Account removeAccount(int num)
    {
        if (this.account0.number == num && this.account0 != null) {return this.account0;}
        else if (this.account0.number == num && this.account0 == null) {return null;}
        if (this.account1.number == num && this.account1 != null) {return this.account1;}
        else if (this.account1.number == num && this.account1 == null) {return null;}
        if (this.account2.number == num && this.account2 != null) {return this.account2;}
        if (this.account2.number == num && this.account2 == null) {return null;}
    }
    
    public int numberOfAccounts()
    {
        int n = 0;
        if (this.account0 != null) {n = n+1;}
        if (this.account1 != null) {n = n+1;}
        if (this.account2 != null) {n = n+1;}
        return n;
    }
    
    public int sumAccount()
    {
        int s = 0;
        if (this.account0 != null) {s = s+this.account0.balance;}
        if (this.account1 != null) {s = s+this.account1.balance;}
        if (this.account2 != null) {s = s+this.account2.balance;}
        return s;
    }
    
    public void print()
    {
        System.out.println("Number of Accounts: " + numberOfAccounts());
        System.out.println("Sum of Accounts: " + sumAccount());
        if (this.account0 != null) {return this.account0.print();}
        else {System.out.println("account empty");}
        if (this.account1 != null) {return this.account1.print();}
        else {System.out.println("account empty");}
        if (this.account2 != null) {return this.account2.print();}
        else {System.out.println("account empty");}
    }
    
    public int countDbIdWith(String str)
    {
        int a = 0;
        if (str.indexOf(this.account0.getDatabaseId())) {a = a+1;}
        if (str.indexOf(this.account1.getDatabaseId())) {a = a+1;}
        if (str.indexOf(this.account2.getDatabaseId())) {a = a+1;}
        return a;
    }
}
        
 
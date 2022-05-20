public class Bank
{
    private Account a0;
    private Account a1;
    private Account a2;
    
    public Account getAccount(int i)
    {
        if(i < 0 || i > 2) return null;
        if(i == 0) return a0;
        if(i == 1) return a1;
        if(i == 2) return a2;
        return null;
    }
    public Account addAccount(Account a)
    {
        if(a0 == null){
         Account s = a0;
         a0 = a;
         return s;
        }
        else if(a1 == null){
         Account s = a1;
         a1 = a;
         return s;
        }
        else if(a2 == null){
         Account s = a2;
         a2 = a;
         return s;
        }
        return null;
    }
    public Account removeAccount(int num)
    {
        if(num < 0) return null;
        if(a0 != null && num == a0.getNumber())
         {
             Account a = a0;
             a0 = null;
             return a;
            }
        else if(a1 != null && num == a1.getNumber())
         {
             Account a = a1;
             a1 = null;
             return a;
            }
        else if(a2 != null && num == a2.getNumber())
         {
             Account a = a2;
             a2 = null;
             return a;
            }
        else    return null;
        
    }
    public int numberOfAccounts()
    {
        int result = 0;
        if(a0 != null) result += 1;
        if(a1 != null) result += 1;
        if(a2 != null) result += 1;
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
        if(a0 != null) a0.print();
        if(a1 != null) a1.print();
        if(a2 != null) a2.print();
    }
    public int countDbldWith(String str)
    {
      int result = 0;
      if(a0 != null && a0.getDatabaseId().contains(str)) result += 1;
      if(a1 != null && a1.getDatabaseId().contains(str)) result += 1;
      if(a2 != null && a2.getDatabaseId().contains(str)) result += 1;
      return result;
    }
}

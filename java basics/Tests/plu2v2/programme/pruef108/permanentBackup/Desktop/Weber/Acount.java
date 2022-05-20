public class Acount
{
    private int number;
    private String owner;
    private int balance;
    private int overdraftLimit;
    
    public boolean check(int number,String owner,int balance,int overdraftLimit)
    {
        if(number<1)return false;
        if(owner==null)return false;
        if(owner.length <2)return false;
        if(balance < overDraftLimit)return false;
        if(overDraftLimit <0)return false;
        return true;
        
    }
    
    public Account(int number,String owner,int balance,int overdraftLimit)
    {
        if(check(owner, number, balance, overDraftLimit)
        {
            this.owner=owner;
            this.number=number;
            this.balance=balance;
            this.overDraftLimit=overDraftLimit;
        }
        else
        {
            this.owner=owner;
            this.number=number;
            this.balance=balance;
            this.overDraftLimit=overDraftLimit;
        }
    }
}

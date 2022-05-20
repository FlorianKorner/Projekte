
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
    private int overDraftLimit;
    
    public Account(){
     this(1,"John Doe", 0, 1000);   
    }
  
    public Account(int number, String owner, int balance,int overDraftLimit ){
     this.number=number;
     this.owner=owner;
     this.balance=balance;
     this.overDraftLimit=overDraftLimit;
    }
    public void setNumber(int number){
     if(number >= 0){
     this.number=number;
    }
     else{
         this.number=1;
        }
    }
    public int getNumber(){
     return this.number;   
    }
    public void setOwner(String owner){
     if(owner != null ){
         this.owner=owner;
        }
        else{
         this.owner="John Doe";   
        }
    }
    public String getOwner(){
     return this.owner;   
    }
    public void setBalance(int balance){
     if(balance >= overDraftLimit){
         this.balance=balance;
        }
        else{
            this.balance=0;
        }
    }
    public int getBalance(){
     return this.balance;   
    }
    public void setOverDdraftLimit(int overDraftLimit){
        if(overDraftLimit >= 0 ){
     this.overDraftLimit=overDraftLimit;
    }
    else {
     this.overDraftLimit=1000;   
    }
    }
    public int getOverDraftLimit(){
        return this.overDraftLimit;
       
    }
    public int deposit(int amount){
         int newBalance=0;
        if(amount > 0 ){
            newBalance=amount+balance;
        }
        return newBalance;
    
    }
    public int withdraw(int amount){
     int withdrawnAmount=0;
     if(amount > 0 && balance >= overDraftLimit ){
         withdrawnAmount=balance-amount;
        }
         return withdrawnAmount;
      
        }
    
    public void Print(){
     System.out.println("Account with " + getNumber() +  " as number " + getOwner() + " as owner " + 
     getBalance() + " as balance " + " and the overdraftlimit is : " + getOverDraftLimit());   
    }
}

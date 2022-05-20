

public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overDraftLimit;
    public Account(){
        this.number = 1;
        this.owner = "John Doe";
        this.balance = 0;
        this.overDraftLimit = 1000;
    }
    public Account(int number ,String owner,int balance,int overDraftLimit){
        if (check( number ,owner, balance, overDraftLimit)){
            this.number = number;
            this.owner =owner;
            this.balance = balance;
            this.overDraftLimit = overDraftLimit;
        }
        else{
             this.number = 1;
             this.owner = "John Doe";
             this.balance = 0;
             this.overDraftLimit = 1000;
        }
    }
    public boolean check(int number ,String owner,int balance,int overDraftLimit){ 
        if (owner == " ")return false;
        if (owner == null)return false;
        if (owner.length()  <3) return false;
        if (balance < overDraftLimit * -1) return false;
        if (number<0)return false;
        if (overDraftLimit < 0) return false;
        return true;
    }
    public int getNumber(){
        return this.number;
    }
    public String getOwner(){
        return this.owner;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getOverDraftLimit(){
        return this.overDraftLimit;
    }
    public void setNumber(int number){
        if(check(number,this.owner,this.balance,this.overDraftLimit)){
            this.number = number;
        }
        else{
        this.number = 1;
    }
}
    public void setOwner(String number){
        if(check(this.number,owner,this.balance,this.overDraftLimit)){
            this.owner = owner;
        }
        else{
        this.owner  = "John Doe";
    }
}
    public void setOverDraftLimit(int overDraftLimit){
        if(check(number,this.owner,this.balance,overDraftLimit)){
            this.overDraftLimit = overDraftLimit;
        }
        else{
        this.overDraftLimit = 1000;
    }
}
    public void setBalance(int balance){
        if(check(this.number,this.owner,balance,this.overDraftLimit)){
            this.balance = balance;
        }
        else{
        this.balance = 1;
    }
   }
   public int deposite(int amount){
       if (amount >0){
           this.balance = this.balance + amount;
        }
       return this.balance;
    }
    public int withdraw(int amount){
        int all = this.balance + this.overDraftLimit;
        if (amount > 0){
            if(this.balance - amount > overDraftLimit*-1){
                this.balance = this.balance-amount;
                return all-amount;
            }
            else{this.balance = overDraftLimit*-1;return all;}
        }
        else{   
            return 0;
        }
    }
    public String getDatabase(){
        this.owner = owner.toUpperCase();
        this.owner = owner.replace(" ","_") +"_"+this.number;
        return this.owner;
        
    }
    public void Print(){
        System.out.println(this.owner + this.balance + this.number + this.overDraftLimit);
    }
    
}

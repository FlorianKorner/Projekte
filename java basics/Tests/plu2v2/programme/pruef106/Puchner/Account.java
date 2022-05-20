public class Account{
    private int number;
    private int balance;
    private int overDraftLimit;
    private String owner;
    //constructor:
    public Account(int number, int balance, int overDraftLimit, String owner){
        if(check(number, balance, overDraftLimit, owner)){
            this.number=number;
            this.balance=balance;
            this.overDraftLimit=overDraftLimit;
            this.owner=owner;
        }
        else{
            number=1;
            balance=0;
            overDraftLimit=1000;
            owner="John Doe";
        }
    }
    public Account(){
        this(1, 0, 1000, "John Doe");
    }
    //check:
    public boolean check(int number, int balance, int overDraftLimit, String owner){
        if(number<0)return false;
        if(owner==null||owner.length()<=2)return false;
        if(overDraftLimit<0)return false;
        if(balance<-overDraftLimit)return false;
        return true;
    }
    //methods:
    public int deposit(int amount){
        if(amount>0){
            balance += amount;
            return balance;
        }
        else{
            System.out.print("Error, please try again!");
            return 0;
        }
    }
    public int withdraw(int amount){
        if(amount>0&&amount<=(balance+overDraftLimit)){
            balance -= amount;
            return amount;
        }
        else if(amount>0&&amount>(balance+overDraftLimit)){
            int result = 0;
            result = (balance+overDraftLimit);
            return result;
        }
        else{
            System.out.print("Error, please try again!");
            return 0;
        }
    }
    public String getDatabaseId(){
        String ownerUpperCase = getOwner().toUpperCase()+" "+getNumber();
        return ownerUpperCase.replace(" ", "_");
    }
    public void print(){
        System.out.println("--------------------");
        System.out.println("Owner = "+getOwner());
        System.out.println("Number = "+getNumber());
        System.out.println("Balance = "+getBalance());
        System.out.println("OverDraftLimit = "+getOverDraftLimit());
    }
    //setter and getters:
    public void setNumber(int number){
        if(check(number, balance, overDraftLimit, owner)){
            this.number=number;
        }
        else{
            number=1;
        }
    }
    public void setBalance(int balance){
        if(check(number, balance, overDraftLimit, owner)){
            this.balance=balance;
        }
        else{
            balance=0;
        }
    }
    public void setOverDraftLimit(int overDraftLimit){
        if(check(number, balance, overDraftLimit, owner)){
            this.overDraftLimit=overDraftLimit;
        }
        else{
            overDraftLimit=1000;
        }
    }
    public void setOwner(String owner){
        if(check(number, balance, overDraftLimit, owner)){
            this.owner=owner;
        }
        else{
            owner="John Doe";
        }
    }
    public int getNumber(){
        return number;
    }
    public int getBalance(){
        return balance;
    }
    public int getOverDraftLimit(){
        return overDraftLimit;
    }
    public String getOwner(){
        return owner;
    }
}
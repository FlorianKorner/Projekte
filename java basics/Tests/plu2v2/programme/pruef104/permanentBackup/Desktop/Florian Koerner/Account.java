public class Account
{
    private int number;
    private String owner;
    private int balance;
    private int overdraftLimit;
    public Account(int number,String owner, int balance, int overdraftlimit){
        if(checkConsiscency(number, owner, balance, overdraftLimit)==true){
            this.number=number;
            this.owner=owner;
            this.balance=balance;
            this.overdraftLimit=overdraftLimit;
        }
        else{
            this.number=1;
            this.owner="John Doe";
            this.balance=0;
            this.overdraftLimit=1000;
        }
    }

    public Account(){
        this(1,"John Doe",0,1000);
    }

    public boolean checkConsiscency(int number,String owner, int balance, int overdraftlimit){
        int i =0;
        i= 0-overdraftLimit;
        if(number<0||balance<=i||overdraftLimit<=0||owner==null)return false;
        if(owner.length()<2)return false;
        return true;
    }

    public void setNumber(int number){
        if(checkConsiscency(number, owner, balance, overdraftLimit)) this.number=number;
        else this.number=0;
    }

    public int getNumber(){
        return this.number;
    }

    public void setOwner(String owner){
        if(checkConsiscency(number, owner, balance, overdraftLimit)==true)this.owner=owner;
        else this.owner="John Doe";
    }

    public String getOwner(){
        return this.owner;
    }

    public void setbalance(int balance){
        if(checkConsiscency(number, owner, balance, overdraftLimit)==true) this.balance=balance;
        else this.balance=0;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setOverdraftLimit(int overdraftLimit){
        if(checkConsiscency(number, owner, balance, overdraftLimit)==true) this.overdraftLimit=overdraftLimit;
        else this.overdraftLimit=1000;
    }

    public int getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public int deposit(int number){
        if(number>0){
            int a;
            a= this.balance;
            this.balance=a+number;
            return a+number;
        }else{
            System.out.println("Please only try to add positive numbers. (;");
            return this.balance;
        }
    }
    public int withdraw(int amount){
        if(amount>0&&balance-amount>=0-overdraftLimit){
            this.balance=balance-amount;
            return amount;
        }else if(balance-amount<0-overdraftLimit){
            int a;
            a= balance+overdraftLimit;
            this.balance=0-overdraftLimit;
            return a;
        }else return 0;
    }
    public String getDatabaseId(){
        String ownerUpperCase=getOwner().toUpperCase();
        return ownerUpperCase.replace(" ", "_");
    }
    public void print(){
        System.out.println("The owner is "+getOwner()+".");
        System.out.println("The balance is "+getBalance()+".");
        System.out.println("The number is "+getNumber()+".");
        System.out.println("The overdraftLimit is "+getOverdraftLimit()+".");
        System.out.println("The data base ID is "+getDatabaseId()+".");
    }
}
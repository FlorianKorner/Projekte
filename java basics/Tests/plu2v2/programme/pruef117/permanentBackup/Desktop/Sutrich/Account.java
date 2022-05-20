public class Account{
    private int accountNumber;
    private String owner;
    private int balance;
    private int overdraftLimit;

    public boolean checkConsistency(int accountNumber, String owner, int balance, int overdraftLimit){
        if(accountNumber <= 0 || owner == null || owner.length() < 2 || overdraftLimit < 0)return false;
        else
            return true;
    }

    public Account(int accountNumber, String owner, int balance, int overdraftLimit){
        if(checkConsistency(accountNumber, owner, balance, overdraftLimit) == true){
            setAccountNumber(accountNumber);
            setOwner(owner);
            setBalance(balance);
            setOverdraftLimit(overdraftLimit);
        }
        else{
            setAccountNumber(1);
            setOwner("John Doe");
            setBalance(0);
            setOverdraftLimit(100);
        }
    }

    public Account(){
        setAccountNumber(1);
        setOwner("John Doe");
        setBalance(0);
        setOverdraftLimit(100);
    }

    public void setAccountNumber(int accountNumber){
        if(checkConsistency(accountNumber, owner, balance, overdraftLimit)==true)
            this.accountNumber = accountNumber;
        else{
            System.out.println("Error in setAccountNumber!");
            this.accountNumber = 1;
        }

    }

    public void setOwner(String Owner){
        if(checkConsistency(accountNumber, owner, balance, overdraftLimit)==true)
            this.owner = owner;
        else{
            System.out.println("Error in setOwner!");
            this.owner = "John Doe";
        }
    }

    public void setBalance(int balance){
        if(checkConsistency(accountNumber, owner, balance, overdraftLimit)==true)
            this.balance = balance;
        else{
            System.out.println("Error in setBalance!");
            this.balance = 0;
        }
    }

    public void setOverdraftLimit(int overdraftLimit){
        if(checkConsistency(accountNumber, owner, balance, overdraftLimit))
            this.overdraftLimit = overdraftLimit;
        else{
            System.out.println("Error in setOverDraftLimit!");
            this.overdraftLimit = 100;
        }   
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    public int getOverdraftLimit(){
        return overdraftLimit;
    }   

    public int deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            return balance;
        }
        else{
            System.out.println("You cant deposit 0 or a negative number!!");
            return balance;
        }
    }
    
    public int withdraw(int amount){
        if(amount > 0 && amount <= balance && amount <= overdraftLimit && balance > overdraftLimit){
            balance = balance - amount;
            return amount;
        }
        else
        return 0;
    }
    
    public String getDatabaseId(){
        String a = "null";
        a = owner.replace(" ", "_");
        a = a.toUpperCase();
        a = a + getAccountNumber();
        return a;
    }
    
    public void print(){
        System.out.println("+++++++ Data of Account +++++++");
        System.out.println("++ owner is : "+ getOwner());
        System.out.println("++ balance is : "+ getBalance());
        System.out.println("++ accountNumber is : " + getAccountNumber());
        System.out.println("++ overdraftLimit is : " + getOverdraftLimit());
    }
}
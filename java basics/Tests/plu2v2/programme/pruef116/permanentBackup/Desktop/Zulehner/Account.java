
public class Account {
    private int number;
    private String owner;
    private int balance;
    private int overdraftLimit;

    public Account (int number, String owner, int balance, int overdraftLimit){
        if(checkConsistency(number, owner, balance, overdraftLimit))
            setNumber(number);
        setOwner(owner);
        setBalance(balance);
        setOverdraftLimit(overdraftLimit);
    }

    public Account(){
       
    }

    public boolean checkConsistency( int number, String owner, int balance, int overdraftLimit){
        boolean allOk = false;
        boolean numOk = false;
        boolean ownOk = false;
        boolean balOk = false;
        boolean overdOk = false;

        if(number > 0){
            numOk = true;
        }
        if( owner != null && owner.length() > 2){
            ownOk = true;
        }
        if( balance >= 0  && balance >= overdraftLimit){
            balOk = true;
        }
        if( overdraftLimit >= 0){
            overdOk = true;
        }
        allOk = true;
        return allOk;
    }

    public void setNumber( int number){
        if(checkConsistency(number, owner, balance, overdraftLimit)){
            this.number = number;
        }
        else{
            this.number = 1;
        }
    }

    public int getNumber(){
        return this.number;
    }

    public void setOwner ( String owner){
        if(checkConsistency(number, owner, balance, overdraftLimit)){
            this.owner = owner;
        }
        else{
            this.owner = "John Doe"; 

        }
    }

    public String getOwner(){
        return this.owner;
    }

    public void setBalance( int balance){
      if(checkConsistency(number, owner, balance, overdraftLimit)){
            this.balance = balance;
    }
    else{
        this.balance =0;
    }
}

    public int getBalance(){
        return this.balance;
    }

    public void setOverdraftLimit( int overdraftLimit){
        if(checkConsistency(number, owner, balance, overdraftLimit)){
            this.overdraftLimit = overdraftLimit;
        }
        else{
            this.overdraftLimit = 1000;
        }
    }

    public int getOverdraftLimit(){
        return this.overdraftLimit;
    }

    public int deposit( int amount){
     
            if(amount > 0){
                setBalance(getBalance() + amount);
            }
        return getBalance();
    }

    public int withdraw(int amount){
        
            if(amount > 0 )
                if(amount - getBalance() < getOverdraftLimit()){
                    setBalance(getBalance() - amount);
                    return amount;
                }
                else{
                    int b = getBalance();
                    setBalance(getOverdraftLimit());
                    return getOverdraftLimit() - b;
                }
        return 0;
    }

    public String getDatabaseId(){
       
            getOwner().toUpperCase();
            getOwner().replace(" ", "_");
            setOwner(getOwner()+"_");
            return getOwner();
        }
        
        public  void print(){
            System.out.println("The number is:" +getNumber());
            System.out.println("The owner is: " + getOwner());
            System.out.println("The balance is:" +getBalance());
            System.out.println("The over draft limit is:" +getOverdraftLimit());
        }
    }

 
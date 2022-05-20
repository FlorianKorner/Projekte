public class Bank{
    private Account account0;
    private Account account1;
    private Account account2;
    
    

    public Account getAccount(int i){
        if(i == 0 || i == 1 || i == 2){
            if(i == 0)
                return account0;
            if(i == 1)
                return account1;
        }
        return account2;
    }
    
    public Account addAccount(Account a){
        if(a != null){
           if(account0 == null){
              Account x = a;
              account0 = a;
              return x;
           }
           if(account1 == null){
             Account x = a;
             account1 = a;
             return x;
            }
           if(account2 == null){
             Account x = a;
             account2 = a;
             return x; 
           }
        }
        return null;
    }
    
    public Account removeAccount(int num){
        if(num == 0 || num == 1 || num == 2){
           if(num == 0 && account0 != null){
           account0 = null;
           return account0;
        }
        if(num == 1 && account1 != null){
           account1 = null;
           return account1;
        }
        if(num == 2 && account2 != null){
           account2 = null;
           return account2;
        }
        }
        return null;
    }
    
    public int numberOfAccount(){
        int a = -1;
        
        if(account0 != null)
        a = a+1;
        if(account1 != null)
        a = a+1;
        if(account2 != null)
        a = a+1;
        return a + 1;
    }
    
    public int sumAccount(){
        int a = -1;
        
        if(account0 != null)
        a = a + account0.getBalance();
        if(account1 != null)
        a = a + account1.getBalance(); 
        if(account2 != null)
        a = a + account2.getBalance();
        return a + 1;
    }
    
    public void print(){
        System.out.println("+++++++ Data of Bank +++++++");
        System.out.println("accountNumbers: account0: " + account0.getAccountNumber() + " account1: " + account1.getAccountNumber() + "account2: " + account2.getAccountNumber());
        System.out.println("sum of the account: "+sumAccount());
        System.out.println("account0: number: " + account0.getAccountNumber() + "balance: " + account0.getBalance() + "owner: " + account0.getOwner() + "overdraftLimit: " + account0.getOverdraftLimit());
        System.out.println("account1: number: " + account1.getAccountNumber() + "balance: " + account1.getBalance() + "owner: " + account1.getOwner() + "overdraftLimit: " + account1.getOverdraftLimit());
        System.out.println("account2: number: " + account0.getAccountNumber() + "balance: " + account2.getBalance() + "owner: " + account2.getOwner() + "overdraftLimit: " + account2.getOverdraftLimit());
    }
    
    
}
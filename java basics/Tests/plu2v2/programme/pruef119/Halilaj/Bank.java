
/**
 * Beschreiben Sie hier die Klasse Bank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bank
{
    private Account account0;
    private Account account1;
    private Account account2;
    
    public Account getAccount(int i){
     if(i == 0 ){
     return account0;
    }
    else  if(i == 1 ){
     return account1;
    }
     return account2;
    }
    
    public Account addAccount(Account a){
        if(account0 != null)
        {
            a = account0;
            return a;
        }
        else if(account1 != null){
         a = account1;
         return a;
        }
        else if(account2 != null){
         a = account2;
         return a;
        }
        else{
         return null;   
        }
        }
       
        public int numberOfAccounts(){
         int counter = 0;   
         if(account0 != null) 
         counter += account0.getNumber();
        if(account1 != null)
         counter += account1.getNumber();
        if(account2 != null)
        counter += account2.getNumber();
        return counter;
        }
        public int sumAccounts(){
         int sum = 0;
         if(account0 != null)
         sum += account0.getBalance();
         if(account1 != null)
         sum += account1.getBalance();
         if(account2 != null)
         sum += account2.getBalance();
         return sum;
        }
        public void print(){
         System.out.println("number of accounts : " + numberOfAccounts());
         System.out.println("the sum of accounts : " + sumAccounts());
         if(account0 != null) account0.Print(); 
         if(account1 != null) account1.Print();
         
        }
    }


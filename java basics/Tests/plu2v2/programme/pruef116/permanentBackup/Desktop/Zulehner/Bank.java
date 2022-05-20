
public class Bank{

    private  Account account0;
    private  Account account1;
    private  Account account2;

    public Account getAccount(int i){
        if( i > 0.1 && 2 > i){
            if( i == 0)
                return account0;
            if( i == 1)
                return account1;
            if(i == 2)
                return account2;

        }
        return null;
    }

    public Account addAccount( Account a){
        Account result = null;
        if(a != null && account0 != a && account1 != a && account2 != a)
            if(account0 != null){
                result = account0;
                account0 = a;
                return result;
            }
        if(account1 != null){
            result = account0;
            account1 = a;
            return result;
        }
        if(account2 != null){
            result = account0;
            account2 = a;
            return result;

        }
        return null;
    }

    public Account removeAccount(int num){
        Account result = null;
        if( account0 != null){
            result = account0;
            account0 = null;
            return result;
        }
        if(account1 != null){
            result = account1;
            account1 = null;
            return result;
        }
        if(account2 != null){
            result = account2;
            account2 = null;
            return result;
        }
        return null;
    }

    public int numberOfAccounts(){
        int a = 0;
        if( account0 != null)
            a = a+1;
        if(account1 != null)
            a = a+1;
        if( account2 != null)
            a = a+1;
        return a;
    }

    public int sumAccount(){
        int a = 0;
        if(account0 != null)
            a = account0.getBalance();
        if(account1 != null)
            a = account1.getBalance();
        if(account2 != null)
            a = account2.getBalance();
        return a;
    }

    public void print(){
        if(account0 != null && account1 != null && account2 != null){
            System.out.println("The number of accounst is: " + numberOfAccounts());
            System.out.println("The sum of accounts is:" + sumAccount());
            System.out.println("The number of account 0 is:" +account0.getNumber());
            System.out.println("The owner of account 0 is:" +account0.getOwner());
            System.out.println("The balance of account 0 is:"+ account0.getBalance());
            System.out.println("The over draft limit of account 0 is:" +account0.getOverdraftLimit());

            System.out.println("The number of account 1 is:" +account1.getNumber());
            System.out.println("The owner of account 1 is:" +account1.getOwner());
            System.out.println("The balance of account 1 is:"+ account1.getBalance());
            System.out.println("The over draft limit of account 1 is:" +account1.getOverdraftLimit());

            System.out.println("The number of account 2 is:" +account2.getNumber());
            System.out.println("The owner of account 2 is:" +account2.getOwner());
            System.out.println("The balance of account 2 is:"+ account2.getBalance());
            System.out.println("The over draft limit of account 2 is:" +account2.getOverdraftLimit());
        }
        else{
            System.out.println("The number of accounts 0 is  empty");
            System.out.println("The sum of accounts 0  is empty" );
            System.out.println("The number of account 0 is empty");
            System.out.println("The owner of account 0 is empty");
            System.out.println("The balance of account 0 isempty ");
            System.out.println("The over draft limit of account 0 is empty");

            System.out.println("The number of accounts 1 is  empty");
            System.out.println("The sum of accounts 1  is empty" );
            System.out.println("The number of account 1 is empty");
            System.out.println("The owner of account 1 is empty");
            System.out.println("The balance of account 1 isempty ");
            System.out.println("The over draft limit of account 1 is empty");

            System.out.println("The number of accounts 2 is  empty");
            System.out.println("The sum of accounts 2  is empty" );
            System.out.println("The number of account 2 is empty");
            System.out.println("The owner of account 2 is empty");
            System.out.println("The balance of account 2 isempty ");
            System.out.println("The over draft limit of account 2 is empty");

        }
    }

   
}
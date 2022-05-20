public class Bank{
    private Account account1;
    private Account account2;
    private Account account3;
    //methods:
    public Account getAccount(int i){
        if(i==0&&account1!=null){
            return account1;
        }
        else if(i==1&&account2!=null){
            return account2;
        }
        else if(i==2&&account3!=null){
            return account3;
        }
        else{
            return null;
        }
    }
    public Account addAccount(Account a){
        if(a!=null){
            if(account1==null){
                account1 = a;
                return account1;
            }
            else if(account2==null){
                account2 = a;
                return account2;
            }
            else if(account3==null){
                account3 = a;
                return account3;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }       
    public Account removeAccount(int num){
        if(account1!=null&&account1.getNumber()==num){
            Account x = account1;
            account1=null;
            return x;
        }
        else if(account2!=null&&account2.getNumber()==num){
            Account y = account2;
            account2=null;
            return y;
        }
        else if(account3!=null&&account3.getNumber()==num){
            Account x = account3;
            account3=null;
            return x;
        }
        else{
            return null;
        }
    }
    public int numberOfAccount(){
        int result = 0;
        if(account1!=null)result+=1;
        if(account2!=null)result+=1;
        if(account3!=null)result+=1;
        return result;
    }
    public int sumAccount(){
        int result = 0;
        if(account1!=null)result+=account1.getBalance();
        if(account2!=null)result+=account2.getBalance();
        if(account3!=null)result+=account3.getBalance();
        return result;
    }
    public void print(){
        if(account1!=null){
            account1.print();
        }
        else{
            System.out.println("--------------------");
            System.out.println("account empty");
        }
        if(account2!=null){
            account2.print();
        }
        else{
            System.out.println("--------------------");
            System.out.println("account empty");
        }
        if(account3!=null){
            account3.print();
        }
        else{
            System.out.println("--------------------");
            System.out.println("account empty");
        }
    }
    public int countDbldWith(String str){
        int result = 0;
        if(account1!=null&&account1.getDatabaseId().contains(str)){
            result+=1;
        }
        if(account2!=null&&account2.getDatabaseId().contains(str)){
            result+=1;
        }
        if(account3!=null&&account3.getDatabaseId().contains(str)){
            result+=1;
        }
        return result;
    }
}   
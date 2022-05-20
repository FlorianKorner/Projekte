public class Bank
{
    private Account acc0;
    private Account acc1;
    private Account acc2;
    public Account getAccount(int i){
        if(i<3&&i>-1){
            if(i==0)return acc0;
            if(i==1)return acc1;
            if(i==2)return acc2;
        } return null;
    }

    public Account addAccount(Account a){
        if(acc0==null&&acc0!=a){acc0=a;return acc0;}
        else if(acc1==null&&acc1!=a){acc1=a;return acc1;}
        else if(acc2==null&&acc2!=a){acc2=a;return acc2;}
        else {System.out.println("All Accounts are allready taken, maybe remove one first.");
            return null;}
    }

    public Account removeAccount(int num){
        if(num>0){
            if(acc0.getNumber()==num){
                Account a=acc0;
                acc0=null;
                return a;
            }
            if(acc1.getNumber()==num){
                Account b=acc1;
                acc1=null;
                return b;
            }
            if(acc2.getNumber()==num) {
                Account c=acc2;
                acc2=null;
                return c;
            }
        }
        System.out.println("There is no Account in the place you wanted to remove one maybe try another one.");
        return null;
    }

    public int numberOfAccounts(){
        int counter=0;
        if(acc0!=null)counter+=1;
        if(acc1!=null)counter+=1;
        if(acc2!=null)counter+=1;
        return counter;
    }

    public int sumAccounts(){
        int summ=0;
        if(acc0!=null)summ+=acc0.getBalance();
        if(acc1!=null)summ+=acc1.getBalance();
        if(acc2!=null)summ+=acc2.getBalance();
        return summ;
    }

    public void print(){
        if(acc0!=null)acc0.print();
        if(acc1!=null)acc1.print();
        if(acc2!=null)acc2.print();
    }
}
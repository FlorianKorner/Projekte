public class Test
{
    public void test()
    {
        Bank b=new Bank();
        Account acc1=new Account(100,"Parry Hotter", 50000, 1000);
        Account acc2=new Account(101,"Germione Hranger", 80000, 1000);
        Account acc3=new Account(102,"Mraco Dalfoy", 70000, 1000);
        b.addAccount(acc1);
        b.addAccount(acc2);
        if(b.getAccount(0)!=acc1)System.out.println("Error 1");
        if(b.getAccount(1)!=acc2)System.out.println("Error 2");
        if(b.getAccount(2)!=null)System.out.println("Error 3");
        if(b.removeAccount(111)!=null)System.out.println("Error 4");
        if(b.removeAccount(101)!=acc2)System.out.println("Error 5");
        b.addAccount(acc3);
        if(b.getAccount(102)!=acc3)System.out.println("Error 6");
        
        if(b.sumAccounts()!=200000)System.out.println("Error 7");
        if(acc1.deposit(3000)!=53000)System.out.println("Error 8");
        if(acc3.withdraw(3000)!=67000)System.out.println("Error 9");
        if(b.sumAccounts()!=200000)System.out.println("Error 10");
        if(acc1.withdraw(100000)!=53000)System.out.println("Error 11");
        if(b.sumAccounts()!=150000)System.out.println("Error 12");
        
        b.print();
    }
}
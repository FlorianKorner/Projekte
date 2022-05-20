public class Test
{
    private  Bank b = new Bank();
    Account acc1 = new Account(100, "Parry Hotter", 5000, 100);
    Account acc2 = new Account(101, "Germione Hranger", 8000, 100);
    Account acc3 = new Account(102, "Mraco Dalfoy", 7000, 100);

    public void test()
    {
        b.addAccount(acc1);
        b.addAccount(acc2);

        if(b.getAccount(0) == acc1 && b.getAccount(1) == acc2 && b.getAccount(2) == null) System.out.println("correct 1");
        else System.out.println("error 1");

        if(b.removeAccount(111) == null) System.out.println("correct 2");
        else System.out.println("error 2");

        if(b.removeAccount(101) == acc2) System.out.println("correct 3");
        else System.out.println("error 3");
        
        b.addAccount(acc3);
        
        if(b.getAccount(0) == acc1 && b.getAccount(1) == acc3 && b.getAccount(2) == null)System.out.println("correct 4");
        else System.out.println("error 4");
        
        if(b.sumAccount() == 12000) System.out.println("correct 5");
        else System.out.println("error 5");
        
        acc1.deposit(3000);
        if(b.sumAccount() == 15000)System.out.println("correct 6");
        else System.out.println("error 6");
        
        acc3.withdraw(3000);
        if(b.sumAccount() == 12000)System.out.println("correct 7");
        else System.out.println("error 7");
        
        acc1.withdraw(10000);
        if(b.sumAccount() == 2000)System.out.println("correct 8");
        else System.out.println("error 8");
        
        if(acc1.getDatabaseId().equals("PARRY_HOTTER_100"))System.out.println("correct 9");
        else System.out.println("error 9");
        
        if(b.countDbldWith("ra") == 1)System.out.println("correct 10");
        else System.out.println("error 10");       
        
        b.print();
    }
}
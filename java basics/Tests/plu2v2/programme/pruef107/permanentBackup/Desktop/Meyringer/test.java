public class test
{
    public void test()
    {
        Bank b = new Bank();
        Account acc0 = new Account(100,"Parry Hotter",50000, 1000);
        Account acc1 = new Account(101,"Germoine Hranger",80000, 1000);
        Account acc2 = new Account(102,"Mraco Dalfoy",70000,1000);
        b.addAcc(acc0);
        b.addAcc(acc1);
        if(b.getAccount(0) ==acc0 && b.getAccount(1) == acc1 && b.getAccount(2) == null)
        {
            System.out.println("Correct 1");
        }
        else
        {
            System.out.println("Error 1");
        }
        if(b.removeAcc(111)==null)
        {
            System.out.println("Correct 2");
        }
        else
        {
            System.out.println("Error 2");
        }
        if(b.removeAcc(101)==acc1)
        {
            System.out.println("Correct 3");
        }
        else
        {
            System.out.println("Error 3");
        }
        b.addAcc(acc2);
        if(b.getAccount(0) ==acc0 && b.getAccount(1) == acc2 && b.getAccount(2) == null)
        {
            System.out.println("Correct 4");
        }
        else
        {
            System.out.println("Error 4");
        }
        if(b.sumAccount()==120000)
        {
            System.out.println("Correct 5");
        }
        else
        {
            System.out.println("Error 5");
        }
        acc0.deposit(3000);
        if(acc0.getBalance() == 53000)
        {
            System.out.println("Correct 6");
        }
        else
        {
            System.out.println("Error 6");
        }
        acc2.withdraw(3000);
        if(acc2.getBalance()==67000)
        {
            System.out.println("Correct 7");
        }
        else
        {
            System.out.println("Error 7");
        }
        if(b.sumAccount()==120000)
        {
            System.out.println("Correct 8");
        }
        else
        {
            System.out.println("Error 8");
        }
        
        if(acc0.withdraw(100000)==54000)
        {
            System.out.println("Correct 9");
        }
        else
        {
            System.out.println("Error 9");
        }
        if(acc0.getDatabase().equals("PARRY_HOTTER_100"))
        {
            System.out.println("Correct 10");
        }
        else
        {
            System.out.println("Correct 10");
        }
        if(b.countDbIdWith("RA")==1)
        {
            System.out.println("Correct 11");
        }
        else
        {
            System.out.println("Error 11");
        }
        b.print();
    }
}
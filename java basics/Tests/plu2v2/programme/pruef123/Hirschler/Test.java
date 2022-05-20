public class Test
{
    public void test()
    {
        Bank b1 = new Bank();
        Account acc1 = new Account(100, "Parry Hotter" , 50000, 1000);
        Account acc2 = new Account(101, "Germion Hranger" , 80000, 1000);
        Account acc3 = new Account(102, "Mraco Dalfoy" , 70000,1000);
        
        
        if(b1.getSumAccount() == 200000)
        {
            System.out.println("Correct1");
        }
        else
        {
            System.out.println("Error1");
        }
        if(acc1.getDataBaseId().equals("Parry_Hotter_100"))
        {
            System.out.println("Correct2");
        }
        else
        {
            System.out.println("Error2");
        }
        if(b1.sumAccount() == 3)
        {
            System.out.println("Correct3");
        }
        else
        {
            System.out.println("Error3");
        }
        if(acc1.withdraw() - 10000)
        {
            System.out.println("Correct4");
        }
        else
        {
            System.out.println("Error4");
        }
        
    }
}
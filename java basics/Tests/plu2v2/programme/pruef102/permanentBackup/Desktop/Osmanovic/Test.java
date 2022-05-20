public class Test
{
    public void test()
    {
        Bank b = new Bank();
        Account acc1 = new Account(100, "Parry Hotter", 0, 50000);
        Account acc2 = new Account(101, "Germione Hrager", 0, 80000);
        Account acc3 = new Account(102, "Mraco Dalfoy", 0, 80000);
        b.addAccount(acc1);
        b.addAccount(acc2);
        if(b.getAccount(0) != acc1)
         System.out.println("wrong 1");
        if(b.getAccount(1) != acc2)
         System.out.println("wrong 2");
        if(b.getAccount(2) != null)
         System.out.println("wrong 3");
        b.removeAccount(111);
        b.removeAccount(101);
        b.addAccount(acc3);
        if(b.getAccount(0) != acc1)
         System.out.println("wrong 4");
        if(b.getAccount(1) != acc3)
         System.out.println("wrong 5");
        if(b.getAccount(2) != null)
         System.out.println("wrong 6");
        if(b.sumAccount() != 0)
         System.out.println("wrong 7");
        if(acc1.deposit(3000) != 3000)
         System.out.println("wrong 8");
        if(acc3.withdraw(3000) != 3000)
         System.out.println("wrong 9");
        if(b.sumAccount() != 0)
         System.out.println("wrong 10"); 
        if(acc1.withdraw(100000) != 100000)
         System.out.println("wrong 11");
        if(b.sumAccount() != 0)
         System.out.println("wrong 12");
        if(acc1.getDatabaseId().equals("Parry Hotter"))
         System.out.println("wrong 13");
        if(b.countDbldWith("ra") != 1)//i put one because we removed the other account that has a "ra" in it.
         System.out.println("wrong 14");
        b.print();
        System.out.println("----------------------------------------------");
        System.out.println("If you see only the message above, this message and nullExeptionPointer(nevermind, the nullExeption got fixed somehow), that means youre are cool.");
        System.out.println("Done by: Osmanovic Ruben 1EHIF!");
    }
}

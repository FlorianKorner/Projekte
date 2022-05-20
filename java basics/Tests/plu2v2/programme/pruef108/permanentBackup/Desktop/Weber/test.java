public class Test
{
    
        Bank b=new Bank();
        Account acc1=new Account(100,"Parry Hotter",50000,1000);
        Account acc2=new Account(101,"Germione Hranger",80000,2000);
        Account acc3=new Account(102,"Mraco Dalfoy",70000,3000);
         public void test()
    { 
        b.addAccount(acc1);
        if(!(b.getAccount(0)==acc1))
            System.out.println("Error 1");
        else
            System.out.println("Correct 1");
        b.addAccount(acc2);    
        if(!(b.getAccount(1)==acc2))
            System.out.println("Error 2");
        else
            System.out.println("Correct 2");
        b.addAccount(acc3);    
        if(!(b.getAccount(2)==acc3))
        System.out.println("Error 3");
        else
        System.out.println("Correct 3");
        
        if(b.sumAccounts()==200000)
        System.out.println("Correct4");
        else
        System.out.println("Error 4");
        if(acc1.deposit(3000)==53000)
        System.out.println("Correct 5");
        else
        System.out.println("Error 5");
        if(acc3.withdraw(3000)==67000)
        System.out.println("Correct 6");
        else
        System.out.println("Error 6");
        if(b.sumAccounts()==200000)
        System.out.println("Correct 7");
        else
        System.out.println("Error 7");
        if(acc1.getDatabaseId()=="Parry_Hotter_100")
        System.out.println("Correct 8");
        else
        System.out.println("Error 8");
        b.print();
    }
}

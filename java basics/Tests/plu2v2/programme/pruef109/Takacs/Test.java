
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    private Bank b  = new Bank(); 
    private  Account acc1 = new Account("Parry Hotter",100 , 50000 , 1000);
    private  Account acc2 = new Account("Germione Hranger" , 101 , 80000 , 1000);
    private  Account acc3 = new Account("Mraco Dalfoy" , 102 , 70000, 1000);
    
    public void test()
    {
       b.addAccount(acc1);
       
       if(b.getAccount(0) == acc1)
        System.out.println("True1");
       else
        System.out.println("False1");
        
       b.addAccount(acc2);
       
        if(b.getAccount(1) == acc2)
        System.out.println("True2");
       else
        System.out.println("False2");
       
        if(b.getAccount(2) == null)
       System.out.println("True3");
       else
        System.out.println("False3");
        
       if(b.removeAccount(111)== null)
       System.out.println("True4");
       else
        System.out.println("False4"); 
       
        if(b.removeAccount(101)== acc2)
       System.out.println("True5");
       else
        System.out.println("False5"); 
        
       b.addAccount(acc3);
       
       if(b.getAccount(0) == acc1)
        System.out.println("True6");
       else
        System.out.println("False6");
        
        if(b.getAccount(1) == acc3)
        System.out.println("True7");
       else
        System.out.println("False7");
        
        if(b.getAccount(2) == null)
        System.out.println("True8");
       else
        System.out.println("False8");
        
       if(b.sumAccount()== 120000)
       System.out.println("True9");
       else
        System.out.println("False9"); 
       
       if(acc1.deposit(3000)== 53000)
       System.out.println("True10");
       else
        System.out.println("False10"); 
        
       if(acc3.withdraw(3000)== 67000) 
       System.out.println("True11");
       else
        System.out.println("False11"); 
        
       if(b.sumAccount()== 120000)
       System.out.println("True12");
       else
        System.out.println("False12"); 
        
       if(acc1.getDatabaseId().equals("Parry_Hotter_100"))
       System.out.println("True13");
       else
        System.out.println("False13"); 
        
       if(b.countDbldWith("ra") == 1) 
       System.out.println("True14");
       else
        System.out.println("False14"); 
        
       b.print();
    }
}


/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{   
    public void test()
    {
    Bank b1 = new Bank();
    Account acc1 = new Account(100, "Parry Hotter", 50000, 1000);
    Account acc2 = new Account(101, "Germione Hranger", 80000, 2000);
    Account acc3 = new Account(102, "Mraco Dalfoy", 70000, 3000);
    
    
    b1.addAccount(acc1);
    b1.addAccount(acc2);
    
    if(!(b1.getAccount(0) == null)){
     System.out.println("Error 1");   
    }
    if(!(b1.getAccount(1) == null)){
     System.out.println("Error 2");   
    }
    if(!(b1.getAccount(2) != null)){
     System.out.println("Error 3");   
    }
    
    b1.addAccount(acc3);
    
    if(!(b1.getAccount(2) == null)){
     System.out.println("Error 4");   
    }
    
}
}

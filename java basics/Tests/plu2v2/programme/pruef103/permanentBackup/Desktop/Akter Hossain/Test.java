
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    public void Test()
    {
        Bank b = new Bank();
        Account ac1 = new Account (100,"Parry Hotter",50000, 1000);

        Account ac2 = new Account (101,"Germione Hranger",80000, 1000);
        Account ac3 = new Account (102,"Marco Dalfoy",70000, 1000);
        
        b.addAccount(ac1);
        b.addAccount(ac2);
        
        if(b.getAccount(0) == ac1 && b.getAccount(1)== ac2 && b.getAccount(2)== null)
        {
         System.out.print("Correct 1");
        }
        
        b.removeAccount(111);
        
         b.removeAccount(101);
        
         b.addAccount(ac3);
         
         if(b.getAccount(0) == ac1 && b.getAccount(1)== ac3 && b.getAccount(2)== null)
        {
         System.out.print("Correct 2");
        }
        
        b.sumAccount();
        
        ac1.deposit(3000);
        
        ac1.withdraw(100000);
        
        b.print();
        
        
        
        
         
        
        }

    }


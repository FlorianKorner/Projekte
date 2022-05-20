
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    public void Test() {
        Account acc1 = new Account(100, "Parry Hotter", 50000, -1000);
        Account acc2 = new Account(101, "Germine Hranger", 80000, -1000);
        Account acc3 = new Account(102, "Mraco Dalfoy", 70000, -1000);
        
        Bank b1 = new Bank();
        
        b1.addAccount(acc1);
        b1.addAccount(acc2);
        
        if(!(b1.getAccount(0) == acc1)) {
            System.out.println("Error1!");
        }
        if(!(b1.getAccount(1) == acc2)) {
            System.out.println("Error2!");
        }
        if(!(b1.getAccount(2) == null)) {
            System.out.println("Error3!");
        }
        
        if(!(b1.removeAccount(111) == null)) {
            System.out.println("Error4!");
        }
        
        if(!(b1.removeAccount(101) == acc2)) {
            System.out.println("Error5!");
        }
        
        b1.addAccount(acc3);
        if(!(b1.getAccount(0) == acc1)) {
            System.out.println("Error6!");
        }
        if(!(b1.getAccount(1) == acc3)) {
            System.out.println("Error7!");
        }
        if(!(b1.getAccount(2) == null)) {
            System.out.println("Error8!");
        }
        
        if(!(b1.sumAccount() == 200000)) {
            System.out.println("Error9!");
        }
        
        if(!(b1.sumAccount() == 200000)) {
            System.out.println("Error9!");
        }
        
        Account a = b1.getAccount(0);
        if(!(a.deposit(3000) == 203000)) {
            System.out.println("Error10!");
        }
        
        Account b = b1.getAccount(2);
        if(!(b.withDraw(3000) == 197000)) {
            System.out.println("Error11!");
        }
        
        if(!(b1.sumAccount() == 200000)) {
            System.out.println("Error12!");
        }
        
        if(!(a.withDraw(100000) == 100000)) {
            System.out.println("Error11!");
        }
        
        if(!(b1.sumAccount() == 100000)) {
            System.out.println("Error13!");
        }
        
        Account c = b1.getAccount(0);
        if(!(acc1.getDatabaseld().equals("PARRY_HOTTER_100"))) {
            System.out.println("Error14!");
        }
        
        /*
        if(!("RA".contains(acc1.getDatabaseld().equals("PARRY_HOTTER_100")))) {
            System.out.println("Error15!");
        }
        */
    }
}

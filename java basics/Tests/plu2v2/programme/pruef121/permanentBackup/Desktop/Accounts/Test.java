
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    public void test(){
        Bank myb = new Bank();
        Account acc1 = new Account(100,"Parry Hotter",5000,10000000);
        Account acc2 = new Account(101,"Germione Hranger",8000,1000);
        Account acc3 = new Account(102,"Mraco Dalfoy",7000,100000);
        myb.addAccount(acc1);
        myb.addAccount(acc2);
        if ((myb.getAccount(0) == acc1)&&(myb.getAccount(1) == acc2)&&(myb.getAccount(2) == null)) System.out.println("Right");
        if (myb.removeAccount(111)== null) System.out.println("right1");
        if(myb.removeAccount(101) == acc2) System.out.println("right2");
        myb.addAccount(acc3);
        if ((myb.getAccount(0) == acc1)&&(myb.getAccount(1) == acc3)&&(myb.getAccount(2) == null))System.out.println("right3");
        if(myb.sumAccounts() == 13000 )System.out.println("right4");
        acc1.deposite(3000);
        System.out.println(myb.sumAccounts());
        if(myb.sumAccounts() == 16000 )System.out.println("right5");
        acc3.withdraw(3000);
        System.out.println(myb.sumAccounts());
        if(myb.sumAccounts() == 13000 )System.out.println("right6");
        acc1.withdraw(100000);
        System.out.println(myb.sumAccounts());
        if (myb.sumAccounts() == 13000-100000)System.out.println("right7");
        if(acc1.getDatabase().equals("PARRY_HOTTER_100"))System.out.println("right8");
        System.out.println(myb.accoutWith("ra"));
        if(myb.accoutWith("ra") == 2)System.out.println("right9");
        myb.print();
    }
   
}

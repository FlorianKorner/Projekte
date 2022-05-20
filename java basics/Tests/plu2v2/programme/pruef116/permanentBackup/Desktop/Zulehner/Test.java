
public class Test{

    public void test(){
        Bank b= new Bank();
        Account acc1 = new Account(100, "Parry Hotter", 50000, -100000);
        Account acc2= new Account(101, "Germione Hranger", 80000, -55000);
        Account acc3 = new Account(102, "Mraco Dalfoy", 70000, -23231);

        b.addAccount(acc1);
        b.addAccount(acc2);

        if(b.getAccount(0).equals(acc1))
            System.out.println("The method get account is working");
        else
            System.out.println("The method get account is not working");

        if(b.getAccount(1).equals(acc2))
            System.out.println("The method get account 1 is working");
        else
            System.out.println("The method get account 1 is not working");

        if(b.getAccount(2).equals(null))
            System.out.println("The method get account 2 is working");
        else
            System.out.println("The method get account 2 is not working");

        if(b.removeAccount(111).equals(null))
            System.out.println("The method remove account is working");
        else
            System.out.println("The method remove account is not working");

        if(b.removeAccount(101).equals(acc2))
            System.out.println("The method remove account 1 is working");
        else
            System.out.println("The method remove account 1 is not working");

        b.addAccount(acc3);

        if(b.getAccount(0).equals(acc1))
            System.out.println("The method get account is working");
        else
            System.out.println("The method get account is not working");

        if(b.getAccount(1).equals(acc3))
            System.out.println("The method get account 1 is working");
        else
            System.out.println("The method get account 1 is not working");

        if(b.getAccount(2).equals(null))
            System.out.println("The method get account 2 is working");
        else
            System.out.println("The method get account 2 is not working");

        b.sumAccount();

        if(b.sumAccount() == 200000)
            System.out.println("The method sum account is working");
        else
            System.out.println("The method sum account is not working");
        

        if(acc1.deposit(3000)==53000)
            System.out.println("The method deposit is working");
        else
            System.out.println("The method deposit is not working");

        
        if(acc1.withdraw(3000)==47000)
            System.out.println("The method with draw 1 is working");
        else
            System.out.println("The method with draw 1 is not working");

        
        if(acc1.withdraw(100000)==(-50000))
            System.out.println("The method with draw 2 is working");
        else
            System.out.println("The method with draw 2is not working");

        if(b.sumAccount()== 200000)
            System.out.println("The method sum account is working");
        else
            System.out.println("The method sum account is not working");

        if(acc1.getDatabaseId().equals("Parry_Hotter_100"))
            System.out.println("The mehtod id works");
        else
            System.out.println("The mehtod id  doesn't work");

        
        b.print();
    }
}
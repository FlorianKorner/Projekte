public class Test{
    
    
    public void test(){
        Bank b = new Bank();
        Account acc1 = new Account(100, "Parry Hotter", 50000, 20);
        Account acc2 = new Account(101, "Germione Hranger", 80000, 300);
        Account acc3 = new Account(102, "Mraco Dalfoy", 70000, 200);
        
        b.addAccount(acc1);
        b.addAccount(acc2);
        if(b.getAccount(0) == acc1 && b.getAccount(1) == acc2)
        System.out.println("cor1");
        else
        System.out.println("err1");
        b.addAccount(acc3);
        if(b.getAccount(2) == acc3)
        System.out.println("cor2");
        else
        System.out.println("err2");
        if(b.sumAccount() == 200000)
        System.out.println("cor3");
        else
        System.out.println("err3");
        if(acc1.deposit(3000)==53000)
        System.out.println("cor4");
        else
        System.out.println("err4");
        if(acc3.withdraw(3000) == 3000)
        System.out.println("cor5");
        else
        System.out.println("err5");
        if(b.sumAccount() == 200000)
        System.out.println("cor6");
        else
        System.out.println("err6");
        if(acc1.withdraw(100000) == 0)
        System.out.println("cor7");
        else
        System.out.println("err7");
        b.print();
    }
}
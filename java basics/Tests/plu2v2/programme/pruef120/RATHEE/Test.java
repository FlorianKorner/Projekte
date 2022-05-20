public class Test
{
public void test()
{



Bank test = new Bank();


Account acc1 = new Account (100, "Parry Hotter", 50000,1000);
Account acc2 = new Account (101, "Germione Hranger", 80000,1000);
Account acc3 = new Account (100, "Mraco Dalfoz", 70000,1000);

test.addAccount(acc1);
test.addAccount(acc2);
if(!(test.getAccount(0)==acc1))System.out.println("Error 1") ;
if(!(test.getAccount(1)==acc2))System.out.println("Error 2") ;
if(!(test.getAccount(2)==null))System.out.println("Error 3") ;

if(!(test.removeAccount(111)==null)) System.out.println("Error 4") ;
if(!(test.removeAccount(101)==acc2)) System.out.println("Error 5") ;

test.addAccount(acc3);

if(!(test.getAccount(0)==acc1))System.out.println("Error 6") ;
if(!(test.getAccount(1)==acc3))System.out.println("Error 7") ;
if(!(test.getAccount(2)==null))System.out.println("Error 8") ;

test.sumAccount();
acc1.deposit(3000);
acc3.withdraw(3000);
test.sumAccount();
acc1.withdraw(100000);
test.sumAccount();


if(!(acc1.getDatabaseld().equals("Parry_Hotter_100")))System.out.println("Error 9") ;
acc1.print();
acc2.print();
acc3.print();
}





}
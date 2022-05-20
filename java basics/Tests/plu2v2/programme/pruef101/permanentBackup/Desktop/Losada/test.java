
/**
 * Beschreiben Sie hier die Klasse test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class test
{
    public void test()
    {
         Bank test=new Bank();
         Account acc0=new Account(100, "Parry Hotter", 0, 50000);
         Account acc1=new Account(101, "Germione Hranger", 0, 80000);
         Account acc2=new Account(102, "Mraco Dalfoy", 0, 70000);
         
         test.addAccount(acc0);
         test.addAccount(acc1);
         if(test.getAccount(0)!=acc0){
         System.out.println("ERROR 1");}
         if(test.getAccount(1)!=acc1){
         System.out.println("ERROR 2");}
         if(test.getAccount(2)!=null){
         System.out.println("ERROR 3");}
         test.removeAccount(111);
         test.removeAccount(101);
         test.addAccount(acc2);
         if(test.getAccount(0)!=acc0){
         System.out.println("ERROR 4");}
         if(test.getAccount(1)!=acc2){
         System.out.println("ERROR 5");}
         if(test.getAccount(2)!=null){
         System.out.println("ERROR 6");}
         if(test.sumAccount()!=0){
         System.out.println("ERROR 7");}
         if(acc0.deposit(3000)!=3000){
         System.out.println("ERROR 8");}
         if(acc2.withdraw(3000)!=3000){
         System.out.println("ERROR 9");}
         if(acc0.withdraw(100000)!=100000){
         System.out.println("ERROR 10");}
         if(test.sumAccount()!=0){
         System.out.println("ERROR 11");}
         if(test.sumAccount()!=0){
         System.out.println("ERROR 12");}
         System.out.println("If everything works good on ya. if not well....not so good");
    }
}

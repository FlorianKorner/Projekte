public class Test
{
    public void test()
    {
        Bank b0 = new b0(acc1, acc2, acc3);
        Account acc1 = new acc1(100, "Parry Hotter", 50000);
        Account acc2 = new acc2(101, "Germione Hranger", 80000);
        Account acc3 = new acc3(102, "Mraco Dalfoy", 70000);
        
        
        
        if (this.b0.sumAccount() == 200000) {System.out.println("sumAccount correct");}
        else {System.out.println("sumAccount error");}
        if (this.acc1.deposit(3000) == 53000) {System.out.println("deposit correct");}
        else {System.out.println("deposit error");}
        if (this.acc3.withdraw(3000) == 67000) {System.out.println("withdraw correct");}
        else {System.out.println("withdraw error");}
        if (this.b0.sumAccount() == 200000) {System.out.println("0sumAccount correct");}
        else {System.out.println("0sumAccount error2");}
        if (this.acc1.withdraw(100000) == -53000) {System.out.println("0withdraw correct");}
        else {System.out.println("0withdraw error");}
        if (this.b0.sumAccount() == 94000) {System.out.println("1sumAccount correct");}
        else {System.out.println("1sumAccount error");}
        
        if (this.acc1.getDatabaseId().equals("PARRY_HOTTER_100")) {System.out.println("getDatabaseId correct");}
        else {System.out.println("getDatabaseId error");}
        if ("ra".indexOf(this.b0.getDatabaseId()) == 2) {System.out.println("number of database ids correct");}
        else {System.out.println("number of database ids error");}
        
        
    }
    
    public void print()
    {
        this.b0.print();
    }
}
            
            
        
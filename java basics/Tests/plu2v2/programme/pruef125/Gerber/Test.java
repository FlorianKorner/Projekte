public class Test
{
private Bank bn = new Bank();
private Account acca = new Account(100,"Parry Hotter",5000,6000);
private Account accb = new Account (101, "Germione Hranger", 80000, 90000);
private Account accc = new Account (102, "Mraco Dalfoy", 70000, 80000);

public void test()
{
bn.addAccount(acca);
bn.addAccount(accb);

if(bn.getAccount(0)!=acca){System.out.println("ERROR01");}
if(bn.getAccount(1)!=accb){System.out.println("ERROR02");}
if(bn.getAccount(2)!=null){System.out.println("ERROR03");}

if(bn.removeAcc(0)!= acca){System.out.println("ERROR04");}
if(bn.removeAcc(1)!=accb){System.out.println("ERROR05");}
bn.addAccount(accc);
if(bn.getAccount(0)!=accc){System.out.println("ERROR06");}
if(bn.getAccount(1)!=accc){System.out.println("ERROR07");}
if(bn.getAccount(2)!=null){System.out.println("ERROR08");}

if(bn.sumAccount()!=75000){System.out.println("ERROR09");}
int j = bn.sumAccount();
if(acca.deposit(3000)!=8000){System.out.println("ERROR10");}
if(accc.withdraw(3000)!=67000){System.out.println("ERROR11");}
if(bn.sumAccount()!=j){System.out.println("ERROR12");}
j = bn.sumAccount();
if(accc.withdraw(100000)!=-30000){System.out.println("ERROR13");}
if(bn.sumAccount()!=j){System.out.println("ERROR14");}
if(!acca.getDatabaseId().equals("Parry_Hotter_100")){System.out.println("ERROR15");}
if(bn.countDbIdWith("ra")!=2){System.out.println("ERROR16");}











}

}
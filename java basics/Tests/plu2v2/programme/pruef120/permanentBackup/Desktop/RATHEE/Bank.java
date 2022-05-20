public class Bank

{
private Account b0;
private Account b1;
private Account b2;

public Account getAccount (int i)
{

if(!(i==0|| i== 1 || i==2)) return null;
if(i==0)return b0;
if(i==1)return b1;
else return b2;

}

public Account addAccount (Account a)
{
if(b0!=null)
    {
        if(a==b1 || a== b2) {return null;}
    
    else {b0=a; return b0;}}

if(b1!=null)
    {
        if(a==b0 || a== b1){
        return null;}
   
      else {b1=a; return b1;}}
    
    else
    {if(a==b1 || a== b0){ return null;}
else return b2;}
   
}

public Account removeAccount(int num)
{   Account save;
    if(b0!=null)
    {save= b0;
    b0=null;
    num = 0;
    return save;}
    
     if(b1!=null)
    {save= b1;
    b1=null;
    num = 1;
    return save;}

else
    {save= b2;
    b2=null;
    num = 0;
    return save;}

}

public int numberOfAccounts(){

int result = 0;
if(b0!=null)result+=1;
if(b1!=null)result+=1;
if(b2!=null)result+=1;
return result;


}

public int sumAccount()
{   int result=0;
if(b0!=null)result+=b0.getBalance();
if(b1!=null)result+=b1.getBalance();
if(b2!=null)result+=b2.getBalance();
return result;

}

public void print()
{
if(b0!=null)b0.print();
if(b1!=null)b1.print();
if(b2!=null)b2.print();

if(b0==null)System.out.println("account empty");
if(b1==null)System.out.println("account empty");
if(b2==null)System.out.println("account empty");

}

/*public int countDbldWith(String str)
{
    int result;
    if(b0.getDatabaseId().contains.(String str))result+=1;
    if(b1.getDatabaseId().contains.(String str))result+=1;
    if(b2.getDatabseId().contains. (String str))result+=1;

} */
}

/**
 * Diese Klasse ist die Verbesserung von BusStop.
 * 
 * @author Florian Körner 
 * @version 07.01.2020
 */
public class BusStopVerbesserung
{
    private BusVerbesserung b0;
    private BusVerbesserung b1;
    private BusVerbesserung b2;
    public BusStopVerbesserung()
    {
        b0 = new BusVerbesserung (0,20,"MA73 EHI");
        b1 = null;
        b2 = new BusVerbesserung (12, 40, "YD34 HIF");
    }

    public BusVerbesserung maxSeats()
    {   int v0=0;
        int v1=0;
        int v2=0;
        if(b0!=null) v0=b0.getSeats();
        if(b1!=null) v1=b1.getSeats();
        if(b2!=null) v2=b2.getSeats();
        if(v0>v1&&v0>v2)return b0;
        if(v1>v0&&v1>v2)return b1;
        else return b2;
    }

    public int registrationStartsWith(String s)
    {   int number=0;
        if(b0!=null&&b0.getRegistration().startsWith(s))number+=1;
        if(b1!=null&&b1.getRegistration().startsWith(s))number+=1;
        if(b2!=null&&b2.getRegistration().startsWith(s))number+=1;
        return number;
    }

    public int enter(int passengers){
        int a=passengers;
        if(b0!=null&&b0.getPassengers()<b0.getSeats())a-=b0.enter(a);
        if(b1!=null&&b1.getPassengers()<b1.getSeats())a-=b1.enter(a);
        if(b2!=null&&b2.getPassengers()<b2.getSeats())a-=b2.enter(a);
        return passengers-a;
    }

    /*public BusVerbesserung exit(int number)
    {
    int result =0;
    if(b0!=null) result += b0.exit(number);

    return null;
    }
     */

    public BusVerbesserung getBus(int position)
    {
        if(position>0&&position<3)
        if(position==0)return b0;
        if(position==1)return b1;
        if(position==2)return b2;
        return null;
    }

    public boolean addBus(BusVerbesserung b){
        if(b==null||b==b0||b==b1||b==b2)return false;
        if(b0==null)
        {
            b0=b;
            return true;
        }else if(b1==null){
            b1=b;
            return true;
        }else if(b2 ==null)
        {
            b2=b;
            return true;
        }
        return false;
    }

    public boolean addBus(BusVerbesserung b,int pos){
        if(b==null||b==b0||b==b1||b==b2)return false;
        if(b0==null)
        {
            b0=b;
            return true;
        }else if(b1==null){
            b1=b;
            return true;
        }else if(b2 ==null)
        {
            b2=b;
            return true;
        }
        return false;
    }

    public BusVerbesserung remove()
    {
        if(b0!=null)
        {
            BusVerbesserung b=b0;
            b0=null;
            return b;
        }else if(b1!=null)
        {
            BusVerbesserung b=b1;
            b1=null;
            return b;
        }else if(b2!=null)
        {
            BusVerbesserung b=b2;
            b2=null;
            return b;
        }
        return null;
    }

    public void print()
    {
        if(b0!=null)b0.print();
        else System.out.println("b0 is emty.");
        if(b1!=null)b1.print();
        else System.out.println("b1 is emty.");
        if(b2!=null)b2.print();
        else System.out.println("b2 is emty.");
    }
    /*
    public int registrationStartWith2(String s){
    int counter=0;
    if(b0!=null&&b0.getRegistration().startsWith(s))counter+=1;
    if(b1!=null&&b1.getRegistration().startsWith(s))counter+=1;
    if(b2!=null&&b2.getRegistration().startsWith(s))counter+=1;
    return counter;
    }
     */
}
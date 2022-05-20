
/**
 * Beschreiben Sie hier die Klasse BusStop.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop(Bus bo, Bus b1, Bus b2)
    {
        b0=new b0(0, 20, "MA73 EHI");
        b1=new b1(null);
        b2=new b2(12, 40 ,"YD34 HIF");
    }

    public Bus maxSeats()
    {
        int result=0;
        if(b0!=null)result+=b0.getSeats();
        if(b1!=null)result+=b1.getSeats();
        if(b2!=null)result+=b2.getSeats();
        return maxSeats();
    }

    public int enter(int passengers)
    {
        int result=0;
        if(b0!=null)result+=b0.getPassengers();
        if(b1!=null)result+=b1.getPassengers();
        if(b2!=null)result+=b2.getPassengers();
        return result;
    }

    public Bus getBus(int position)
    {
        if(position>2 && position<0)
            position=position;
        else
            return null;
    }

    public boolean addBus(Bus b)
    {
        if(b0==null || b1==null || b2==null)
        {
            return true;
        }
        else
            return false;
    }
}

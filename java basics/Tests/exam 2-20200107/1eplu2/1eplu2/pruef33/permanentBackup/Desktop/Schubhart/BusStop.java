

public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;
    
    public BusStop()
    {
        setB0(0,20,"MA73 EHI");
        setB1(null);
        setB2(12,40,"YD34 HIF");
    }
    public int maxSeats()
    {
        if(b0.maxSeats() > b1.maxSeats() && b0.maxSeats() > b2.maxSeats())
        {
            return b0.getSeats;
        }
        return false;
        if(b1.maxSeats() > b0.maxSeats() && b1.maxSeats() > b2.maxSeats())
        {
            return b1.maxSeats;
        }
        return false;
        if(b2.maxSeats() > b1.maxSeats() && b2.maxSeats() > b0.maxSeats())
        {
            return b2.maxSeats;
        }
        return false;
    }
    
   
    public Bus getBus(int position)
    {
        if(position >= 0 && position <= 2)
        {
           return ;
        }
        
    }
    public boolean addBus(Bus b,int position)
    {
        if(Bus != null || a == null || b == null || c == null)
        {
            if(position == 0)
            {
                b0=Bus;
                return true;
            }
            
            if(position == 1)
            {
                b1=Bus;
                return true;
            }
            if(position == 2)
            {
                b2=Bus;
                return true;
            }
        }
        return false;
        
    }
    public boolean addBus(Bus b)
    {
        if(Bus != null || a == null || b == null || c == null)
        {
            if(a == null)
            {
                a=Bus;
                return true;
            }
            
            if(b == null)
            {
                a=Bus;
                return true;
            }
            if(c == null)
            {
                a=Bus;
                return true;
            }
        }
        return false;
    }
        
    public boolean removeBus(Bus b,int position)
    {
        if(  a!= null || b != null || c != null)
        {
            if(position == 0)
            {
                b0=Bus;
                return true;
            }
            
            if(position == 1)
            {
                b1=Bus;
                return true;
            }
            if(position == 2)
            {
                b2=Bus;
                return true;
            }
        }
        return false;
        
    }
}
// i had a blackout and i didn't understood most of the methods, including registration(Bus)
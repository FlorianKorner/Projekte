public class BusStop
{
    Bus b0;
    Bus b1;
    Bus b2;

    public BusStop()
    {
        Bus b0 = new Bus(0,20,"MA73 EHI");
        Bus b1 = new Bus();
        Bus b2 = new Bus(12,40,"YD34 HIF");
    }

    public void maxSeats()
    {
        int result;
        if(b0 != null) result += b0.getSeats();
        if(b1 != null) result += b1.getSeats();
        if(b2 != null) result += b2.getSeats();
        return result;
    }

    public int registrationStartsWith(String s)
    {
        int result;
        if(getRegistration().startsWith(s))
            return result;
    }

    public int enter(int passengers)
    {
        int Nbpassengers;

    }

    public Bus getBus(int position)
    {
        boolean adc;
        if(position > 0 || position < 2)
        {
           adc = b0;
           adc = b1;
           adc = b2;
        }
        else
        {
            System.out.println("NOT between 0 & 2!");
        }
        
        return position;
    }
    public boolean addBus(Bus b)
    {
        int add;
        if(b != null)
        if(b0 != null )
        {
            add += b;
            return true;
        }
        if(b1 != null )
        {
            add += b;
            return true;
        }
        if(b2 != null )
        {
            add += b;
            return true;
        }
        return false;
    }
    public boolean addBus(Bus b)
    {
        int add;
        if(b != null)
        if(b != null )add += b0;
        
        if(b1 != null )add += b;
        
        if(b2 != null )add += b;
        
        return false;
    }
    public boolean addBus(Bus b, int position)
    {
        if(position >= 0 && position <= 2)
        {
            
        }
    }
    public Bus removeBus()
    {
        if(b0 != null)removeBus();
        if(b1 != null)removeBus();
        if(b2 != null)removeBus();
    }
    public Bus removeBus(int position)
    {
    }
    
}
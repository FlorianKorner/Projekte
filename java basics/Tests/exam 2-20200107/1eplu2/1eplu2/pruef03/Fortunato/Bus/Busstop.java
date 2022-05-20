public class Busstop
{
    private Busstop b0;
    private Busstop b1; 
    private Busstop b2;
  
    public Busstop()
    {
       this.b0 = new b0(0.0, 20.0, "MA73 EHI");
       this.b1 = new b1(null);
       this.b2 = new b2(12.0, 40.0, "YD34 HIF");
    }
    public Bus maxSeats()
    {
        if (maxSeats = null)
        {
            maxSeats = 40;
        }
    }
      public int registrationStartsWith (String s)
    {
        if (s = null)
        {
            s = 1;
        }        
    }
    public int enter(int passengers)
    {
        if (passengers = null)
        {
            passengers = b0;
        }       
    }
    public getBus(int position)
    {
        if (pos == 0)
        {
           return position; 
        }
        return null;
    }    
    public boolean addBus(Bus b)
    {
        if (b0 = null)
        {
            b0 = Bus;
            return true;
        }
        if (b1 = null)
        {
            b1 = Bus;
            return true;
        }
        if (b2 = null)
        {
            b2 = Bus;
            return true;
        }
    }
    public boolean addBus (Bus b, int position)
    {
        if ((b0 = null) && (pos == 0))
        {
            b0 = Bus;
            return true;
        }
        if ((b1 = null) && (pos == 1))
        {
            b1 = Bus;
            return true;
        }
        if ((b2 = null) && (pos == 2))
        {
            b2 = Bus;
            return true;
        }
    }
    public Bus removeBus()
    {
        if (removeBus = b)
        {
            removeBus = b0;
            return removeCar;
        }
        if (removeBus = null)
        {
            removeBus = b1;
            return removeCar;
        }
        if (removeBus = null)
        {
            removeBus = b2;
            return removeCar;
        }
        return null;
    }    
    public Bus removeBus(int position)
    {
        if ((removeBus = null) && (pos == 0))                            
        {
            removeBus = b0;
            return true;
        }
        if ((b1 = null) && (pos == 1))
        {
            removeBus = b1;
            return true;
        }
        if ((b2 = null) && (pos == 2))
        {
            removeBus = b2;
            return true;
        }                      
    }
}

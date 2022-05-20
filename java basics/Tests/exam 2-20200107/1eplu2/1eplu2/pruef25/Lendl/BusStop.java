public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;
    
    public BusStop()
    {
        b0 = new Bus("MA73 EHI", 0, 20);
        b1 = null;
        b2 = new Bus("YD34 HIF", 12, 40);
    }
    
    
    public boolean addBus(Bus b)
    {
        if(b != null)
        {
        if(b0 == null && b != b1 && b != b2)
        {
            b0 = b;
            return true;
        }
        else if(b1 == null && b != b0 && b != b2)
        {
            b1 = b;
            return true;
        }
        else if(b2 == null && b != b0 && b != b1)
        {
            b2 = b;
            return true;
        }
        else
        {
            return false;
        }
        }
        else
        {
            return false;
        }
    }
    
    public boolean addBusAtPos(Bus b, int position)
    {
        if(position >= 0 && position <= 2)
        {
            if(position == 0 && b0 != null && b != b1 && b  != b2)
            {
                b0 = b;
                return true;
            }
            else if(position == 1 && b1 != null && b != b0 && b  != b2)
            {
                b1 = b;
                return true;
            }
            else if(position == 2 && b2 != null && b != b0 && b  != b1)
            {
                b2 = b;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    public Bus removeBus()
    {
        Bus b = null;
        if(b0 != null)
        {
            b = b0;
            b0 = null;
            return b;
        }
        else if(b1 != null)
        {
            b = b1;
            b1 = null;
            return b;
        }
        else if(b2 != null)
        {
            b = b2;
            b2 = null;
            return b;
        }
        else
        {
            return null;
        }
    }
    
    public Bus removeAtPos(int position)
    {
        Bus b = null;
        if(position >= 0 && position <= 2)
        {
            if(position == 0 && b0 != null)
            {
                b = b0;
                b0 = null;
                return b;
            }
            else if(position == 1 && b1 != null)
            {
                b = b1;
                b1 = null;
                return b;
            }
            else if(position == 2 && b2 != null)
            {
                b = b2;
                b2 = null;
                return b;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
       
    }
    
    public int registrationStartsWith(String s)
    {
        int amount = 0;
        if(b0 != null && b0.getRegistration().startsWith(s)) amount += 1;
        if(b1 != null && b1.getRegistration().startsWith(s)) amount += 1;
        if(b2 != null && b2.getRegistration().startsWith(s)) amount += 1;
        return amount;
    }
    
    public Bus getBus(int position)
    {
        if(position <= 2 && position >= 0)
        {
           if(b0 != null && position == 0)
           {
               return b0;
           }
           else if(b1 != null && position == 1)
           {
               return b1;
           }
           else if(b2 != null && position == 2)
           {
               return b2;
           }
           else
           {
               return null;
           }
        }
        else
        {
            return null;
        }
    }
    
    public int enter(int passengers)
    {
        if(b0 != null) b0.enter(passengers);
        if(b1 != null) b1.enter(passengers - b0.enter(passengers));
        if(b2 != null) b2.enter(passengers - b1.enter(passengers));
        return b2.enter(passengers - b1.enter(passengers));
    }
}
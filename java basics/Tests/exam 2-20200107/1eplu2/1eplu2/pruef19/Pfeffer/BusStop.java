public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;
    public BusStop()
    {
        b0= new Bus(0, 20, "MA73 EHI");
        b1= new Bus();
        b2= new Bus(12, 40, "YD34 HIF");
    }
    public Bus maxSeats()
    {
        if(b0.getseats()>b1.getseats()&&b0.getseats()>b2.getseats())
        {
            return b0;
        }
        else if(b1.getseats()>b0.getseats()&&b1.getseats()>b2.getseats())
        {
            return b1;
        }
        else if(b2.getseats()>b0.getseats()&&b2.getseats()>b1.getseats())
        {
            return b2;
        }
        else
        {
            return null;
        }
    }
    public int registrationStartsWith(String s)
    {
        return 0;
    }
    public int enter(int passengers)
    {
        if(passengers==b0.getseats())
        {
            return passengers+0;
        }
        else if(passengers>=b0.getseats()&&passengers==b1.getseats())
        {
            return passengers+0;
        }
        else if(passengers>=b0.getseats()&&passengers>=b1.getseats()&&passengers==b2.getseats())
        {
            return passengers+0;
        }
        else 
        {
            return 0;
        }
    }
    public Bus getBus(int position)
    {
        if(position==0)
        {
            return b0;
        }
        if(position==1)
        {
            return b1;
        }
        if(position==2)
        {
            return b2;
        }
        return null;
    }
    public boolean addBus(Bus b)
    {
        if(b0!=null||b1!=null||b2!=null)
        {
            return false;
        }
        else if(b0==null||b1!=null||b2!=null)
        {
            return b0!=null;
        }
        else if(b0!=null||b1==null||b2!=null)
        {
            return b1!=null;
        }
        else
        {
            return b2!=null;
        }
    }
    public boolean addBus(Bus b, int position)
    {
        if(position==2&&b0!=null||b1!=null||b2==null)
        {
            return b2!=null;
        }
        else if(position==0&&b0==null||b1!=null||b2!=null)
        {
            return b0!=null;
        }
        else if(position==1&&b0!=null||b1==null||b2!=null)
        {
            return b1!=null;
        }
        else
        {
            return false;
        }
    }
    public Bus removeBus()
    {
        if(b0!=null||b1!=null||b2!=null)
        {
            b0=null;
            return b0;
        }
        else if(b0==null||b1!=null||b2!=null)
        {
            b1=null;
            return b1;
        }
        else if(b0==null||b1==null||b2!=null)
        {
            b2=null;
            return b2;
        }
        else 
        {
           return null;
        }
    }
    public Bus removeBus(int position)
    {
        if(position==0&&b0!=null||b1!=null||b2!=null)
        {
             b0=null;
            return b0;
        }
        else if(position==1&&b0==null||b1!=null||b2!=null)
        {
             b1=null;
            return b1;
        }
        else if(position==2&&b0==null||b1==null||b2!=null)
        {
            b2=null;
            return b2;
        }
        else
        {
            return null;
        }
    }
}

public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop()
    {
        b0=new Bus(0,20,"MA73 EHI");
        b1=new Bus();
        b2=new Bus(12,40,"YD34 HIF");
    }

    public Bus maxSeats()
    {        
        int a;
        if(b0.getSeats()>b1.getSeats() && b0.getSeats()>b2.getSeats())     
            a=b0.getSeats();                    
        else if(b1.getSeats()>b0.getSeats() && b1.getSeats()>b2.getSeats())
            a=b1.getSeats();
        else if(b2.getSeats()>b0.getSeats() && b2.getSeats()>b1.getSeats())
            a=b2.getSeats();
        return a;
    }

    /*
    public int registrationStartsWith(String s)
    {
    s=Bus.startsWith();
    }
     **/
    public int enter(int passengers)
    {
        if(b0.getPassengers()<=20)
        {
            b0.getPassengers()=b0.getPassengers()+passengers;
            return b0.getPassengers();
        }
        else if(b0.getPassengers()>=20)
            passengers=passengers-b0.getPassengers();
        if(b1.getPassengers()<=50)
        {
            b1.getPassengers()=b1.getPassengers()+passengers;
            return b1.getPassengers();
        }
        else if(b1.getPassengers()>=50)
            passengers=passengers-b1.getPassengers();   
        if(b2.getPassengers()<=40)
        {
            b2.getPassengers()=b2.getPassengers()+passengers;
            return b0.getPassengers();
        }
        else if(b2.getPassengers()>=40)
            passengers=passengers-b0.getPassengers();    
    }

    public Bus getBus(int position)
    {
        if(position==0)
        return b0;
        if(position==1)
        return b1;
        if(position==2)
        return b2;
    }
    
    public Bus removeBus(Bus c)
    {
        
        c=null;
        if(b0!=null)
        {
            b0=c;
            b0=null;
        }
        if(b1!=null)
        {
            b1=c;
            b1=null;
        }
        if(b2!=null)
        {
            b2=c;
            b2=null;
        }
        return c;
    }

    public boolean addBus(Bus b, int position)
    {
        
        if(b0==null)
        {
            b0=b;
            b=true;
        }
        if(b1==null)
        {
            b1=b;
            b=true;
        }
        if(b2==null)
        {
            b2=b;
            b=true;
        }
        return b;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

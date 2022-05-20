
public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop()
    {
        Bus b0= new Bus(20, 0,"MA73 EHI");
        Bus b1 = new Bus();
        Bus b2 = new Bus (40,12,"YD34 HIF");

    }

    public String maxSeats()
    {String a;
        if (b0 != null  && b0.getSeats() *2 > b1.getSeats() +b2.getSeats())
            a = "no seats in b0";
        if(b1 != null && b1.getSeats() *2 > b0.getSeats() +b2.getSeats())
            a = "no seats in b1";
        if( b2 != null && b2.getSeats() *2 > b0.getSeats() +b1.getSeats())
            a = "no seats in b2";
        else
            return "error";
        return a;
    }

    public int enter( int passengers)
    {
        int a;
        int b;
        a = b0.getSeats()-b0.getPassengers();
        b0.setPassengers(b0.getSeats());
        passengers = b0.getPassengers() - a;
         a = b1.getSeats()-b1.getPassengers();
        b1.setPassengers(b1.getSeats());
        passengers = b1.getPassengers() - a;
         a = b2.getSeats()-b2.getPassengers();
        b2.setPassengers(b2.getSeats());
        passengers = b2.getPassengers() - a;
    }

    public int regestrationStartsWith(String s)
    {
        if(b0 != null)
        {
            b0.getRegistration().startsWith(s);
        return 0;
    }
        if(b1 != null)
        {
            b1.getRegistration().startsWith(s);
        return 1;
    }
        if(b2 != null)
        {
            b2.getRegistration().startsWith(s);
        return 2;
    }
        else
        return 0;
    }

    public String getBus(int position)
    {
        String a = null;
        if(b0 != null && position == 0)
        {
            a = b0.getSeats()+b0.getPassengers()+b0.getRegistration();
        }
        if (b1 != null && position == 1) {
            a = b1.getSeats()+b1.getPassengers()+b1.getRegistration();
        }
        if(b2 != null && position == 2){
            a = b2.getSeats()+b2.getPassengers()+b2.getRegistration();
        }

        return a;
    }

    public boolean addBus(Bus b)
    {
        if( b0 == null  && b0 != b1 && b0 != b2)
        {
            b0 = b;
            return true;
        }
        if(b1 == null && b1 != b0 && b1 != b2)
        {
            b1 = b;
            return true;
        }
        if(b2 == null && b2 != b0 && b2 != b1)
        {
            b2 = b;
            return true;
        }
        return false;
    } 

    public boolean addBus(Bus b, int position)
    {

        if( b0 == null  && b0 != b1 && b0 != b2 && position == 0)
        {
            b0 = b;
            return true;
        }
        if(b1 == null && b1 != b0 && b1 != b2 && position == 1)
        {
            b1 = b;
            return true;
        }
        if(b2 == null && b2 != b0 && b2 != b1 && position == 2)
        {
            b2 = b;
            return true;
        }
        return false;
    } 

    public Bus removeBus()
    {
        Bus c ;
        if(b0 != null)
        {
            c = b0;
            b0 = null;
            return c;
        }
        if(b1 != null)
        {
            c = b1;
            b1 = null;
            return c;
        }
        if (b2 != null)
        {
            c = b2;
            b2 = null;
            return c;
        }
        return null;
    }

    public Bus removeBus(int position )
    {
        Bus c;
        if(b0 != null && position == 0)
        {
            c = b0;
            b0 = null;
            return c;
        }
        if(b1 != null && position == 1)
        {
            c = b1;
            b1 = null;
            return c;
        }
        if (b2 != null && position == 2)
        {
            c = b2;
            b2 = null;
            return c;
        }
        return null;
    }
}


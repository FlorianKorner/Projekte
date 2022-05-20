public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop()
    {
        b0 = new Bus(0,20,"MA73 EHI");
        b1 = null;
        b2 = new Bus(12,40, "YD34 HIF");
    }

    public Bus maxSeats()
    {
        if(b1 != null && b0 != null && b2 != null) return null;
        if(b0.getSeats() > b1.getSeats() && b0.getSeats() > b2.getSeats())
        {
            System.out.println("The bus b0 has the most seats.");
            return null;
        }
        else if(b1.getSeats() > b0.getSeats() && b1.getSeats() > b2.getSeats())
        {
            System.out.println("The bus b1 has the most seats.");
            return null;
        }
        else
        {
            System.out.println("The bus b2 has the most seats.");
            return null;
        }
    }

    public int registrationStartsWith(String s)
    {
        int result = 0;
        if(s == null) return 0;
        if(b0.getNumber().startsWith(s))
        {
            result = result + 1;
        }
        if(b1.getNumber().startsWith(s))
        {
            result = result + 1;
        }
        if(b2.getNumber().startsWith(s))
        {
            result = result + 1;
        } 
        return 0;
    }

    public int enter(int passengers)
    {
        int result = 0;
        if(passengers > 0 && b0.getSeats() - b0.getPassengers() > passengers)
        {
            result = b0.getPassengers() + passengers;
        }
        else if(passengers > b0.getSeats() - b0.getPassengers())
        {
            result = (b1.getSeats() - passengers) + b0.getPassengers();
        }
        else if(passengers > 0 && b1.getSeats() - b1.getPassengers() > passengers) result = b1.getPassengers() + passengers;
        else if(passengers > b1.getSeats() - b1.getPassengers())
        {
            result = (b2.getSeats() - passengers) + b1.getPassengers();
        }
        else if(passengers > 0 && b2.getSeats() - b2.getPassengers() > passengers) result = b2.getPassengers() + passengers;
        else if(passengers > b2.getSeats() - b2.getPassengers())
        {
            result = (b2.getSeats() - passengers) + b2.getPassengers();
        }
        else
        {
            System.out.println("All the Buses are full.");
            return result;
        }
        return result;
    }

    public Bus getBus(int position)
    {
        if(b1 != null && b0 != null && b2 != null) return null;
        if(position == 0 || position == 1 || position == 2 && b0 != null)
        {
            Bus result = null;
            b0 = result;
            return result;
        }
        else if (position == 0 || position == 1 || position == 2 && b1 != null)
        {
            Bus result = null;
            b1 = result;
            return result;
        }
        else if (position == 0 || position == 1 || position == 2 && b2 != null)
        {
            Bus result = null;
            b2 = result;
            return result;
        }
        else return null;
    }

    public boolean addBus(Bus b)
    {
        if(b0 == null && b != null)
        {
            b0 = b;
            return true;
        }
        else if(b1 == null)
        {
            b1 = b;
            return true;
        }
        else if(b2 == null)
        {
            b2 = b;
            return true;
        }
        else return false;
    }
    
    public boolean addBus(Bus b, int position)
    {
        if(b0 == null && position == 0)
        {
            b0 = b;
            return true;
        }
        else if(b1 == null && position == 1)
        {
            b1 = b;
            return true;
        }
        else if(b2 == null && position == 2)
        {
            b2 = b;
            return true;
        }
        else return false;        
    }
    
    public Bus removeBus()
    {
        Bus b;
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
            b2= null;
            return b;
        }
        else return null;
    }
    
    public Bus removeBus(int position)
    {
        Bus b;
        if(b0 != null && position == 0)
        {
            b = b0;
            b0 = null;
            return b;
        }
        else if(b1 != null && position == 1)
        {
            b = b1;
            b1 = null;
            return b;
        }
        else if(b2 != null && position == 2)
        {
            b = b2;
            b2= null;
            return b;
        }
        else return null;
    }
}
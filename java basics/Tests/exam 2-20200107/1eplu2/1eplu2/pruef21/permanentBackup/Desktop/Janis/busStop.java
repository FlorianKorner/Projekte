public class busStop
{
    private bus b0;
    private bus b1;
    private bus b2;

    public busStop()
    {
         b0 = new bus(0,20,"MA73 EHI");
         b1 = null;
         b2 = new bus(12,40,"YD34 HIF");
    }

    public bus maxSeats()
    {
        if(b0 != null && b1 != null && b2 != null)
        {
            if(b0.getSeats() > b1.getSeats() && b0.getSeats() > b2.getSeats())
            {
                return b0;
            }
            else if(b1.getSeats() > b0.getSeats() && b1.getSeats() > b2.getSeats())
            {
                return b1;
            }
            else if(b2.getSeats() > b0.getSeats() && b2.getSeats() > b1.getSeats())
            {
                return b2;
            }
        }
        else if(b0 == null && b1 != null && b2 != null)
        {
            if(b1.getSeats() > b2.getSeats())
            {
                return b1;
            }
            else{
                return b2;
            }
        }
        else if(b0 != null && b1 == null && b2 != null)
        {
            if(b0.getSeats() > b2.getSeats())
            {
                return b0;
            }
            else{
                return b2;
            }
        }
        else if(b0 != null && b1 != null && b2 == null)
        {
            if(b0.getSeats() > b1.getSeats())
            {
                return b0;
            }
            else{
                return b1;
            }
        }
        else if(b0 == null && b1 == null && b2 != null)
        {
            return b2;
        }
        else if(b0 == null && b1 != null && b2 == null)
        {
            return b1;
        }
        else if(b0 != null && b1 == null && b2 == null)
        {
            return b0;
        }
        else if(b0 == null && b1 == null && b2 == null)
        {
            System.out.println("there is no bus");
            return null;
        }

        return null;
    }

    public int registrationStartsWith(String s)
    {
        int result = 0;
        if(b0 != null && b0.getRegistration().startsWith(s)) result = result +1;
        else if(b1 != null && b1.getRegistration().startsWith(s)) result = result +1;
        else if(b2 != null && b2.getRegistration().startsWith(s)) result = result +1;
        else{
            return result;
        }
        return result;
    }

    public int enter(int passengers)
    {
        int result = 0;
        /*if(b0.getSeats() + b1.getSeats() + b2.getSeats() < b0.getPassengers() + b1.getPassengers() + b2.getPassengers()) return 0;*/
        if(b0 != null) result = result + b0.enter(passengers);
        if(b1 != null) result = result + b1.enter(passengers -result);
        if(b2 != null) result = result + b2.enter(passengers -result);
        return result;
    }

    public bus getBus(int position)
    {
        
            if(position == 0) return b0;
            if(position == 1) return b1;
            if(position == 2) return b2;
       
        return null;
    }

    public boolean addBus(bus b)
    {
        if(b == b0 || b == b1 || b == b2 || b == null)
        {
            return false;
        }
        else{
            if(b0 == null)
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
            else
            {
                return false;
            }
        }
    }

    public boolean addBus(bus b, int position)
    {
        if(b == b0 || b == b1 || b == b2 || b == null || position != 0 || position != 1 || position != 2)
        {
            return false;
        }
        else{
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
            else
            {
                return false;
            }
        }
    }

    public bus removeBus()
    {
        bus x = null;
        if(b0 != null)
        {
            x = b0;
            b0 = null;
            return x;
        }
        else if(b1 != null)
        {
            x = b1;
            b1 = null;
            return x;
        }
        else if(b2 != null)
        {
            x = b2;
            b2 = null;
            return x;
        }
        else{
            return null;
        }
    }

    public bus removeBus(int position)
    {
        bus x = null;
        if(position == 0 || position == 1 || position == 2)
        {
            if(b0 != null && position == 0)
            {
                x = b0;
                b0 = null;
                return x;
            }
            else if(b1 != null && position == 1)
            {
                x = b1;
                b1 = null;
                return x;
            }
            else if(b2 != null && position == 2)
            {
                x = b2;
                b2 = null;
                return x;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }
}
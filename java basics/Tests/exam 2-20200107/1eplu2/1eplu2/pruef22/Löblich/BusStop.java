public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;

    public BusStop()
    {
        b0 = new Bus(0,20,"MA73 EHI");
        b1 = null;
        b2 = new Bus(12, 40, "YD34 HIF");
    }

    public  Bus maxSeats()
    {
        if(b0 != null && b1 != null && b2 != null)
        {
            if(b0.getSeats() > b1.getSeats() && b0.getSeats() > b2.getSeats())
            {
                return b0;
            }
            else if( b1.getSeats() > b0.getSeats() && b1.getSeats() > b2.getSeats())
            {
                return b1;  
            }
            else if(b2.getSeats() > b1.getSeats() && b2.getSeats() > b0.getSeats())
            {
                return b2;   
            }
        }
        else if(b0 == null && b1 != null && b2!= null)
        {
            if(b1.getSeats() > b2.getSeats())
            {
                return b1;   
            }
            else
            {
                return b2;   
            }
        }
        else if(b0 != null && b1 == null && b2 != null)
        {
            if(b2.getSeats() > b0.getSeats())
            {
                return b2;   
            }
            else
            {
                return b0;   
            }
        }
        else if(b0 != null && b1 != null && b2 == null)
        {
            if(b0.getSeats() > b1.getSeats())   
            {
                return b0;
            }
            else
            {
                return b1;   
            }
        }
        else if(b0 == null && b1 == null  && b2 !=null)
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
        return null;
    }

    public int registrationStartsWith(String s)
    {
        int result = 0;

        if(b0.getRegistration().startsWith(s) && b0 != null)
        {result= result + 1;}

        if(b1 != null && b1.getRegistration().startsWith(s)){result = result + 1;}
        if(b2 != null &&  b2.getRegistration().startsWith(s)){result = result + 1;}
        return result;
    }

    public int enter(int passengers)
    {
        int result = 0;
        
        
        if(b0 != null) result += b0.enter(passengers);
        if(b1 != null) result += b1.enter(passengers - result);
        if(b2 != null) result += b2.enter(passengers - result);
            return result;
        
       
    }

    public Bus getBus(int position)
    {
        if(position >= 0 && position <= 2)
        {
            if(position == 0) return b0;
            if(position == 1) return b1;
            if(position ==2) return b2;

        }
        return null;
    }

    public boolean addBus(Bus b)
    {
        if(b == b0 || b ==b1|| b ==b2)
        {
            return false;
        }
        else
        {
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

    public boolean addBus(Bus b, int position)
    {
        if(b == b0 || b ==b1|| b ==b2 || b == null || position != 0 || position != 1 || position != 2)
        {
            return false;
        }
        else
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
            else
            {
                return false;   
            }

        }
    }

    public Bus removeBus()
    {
        Bus y= null;
        if(b0 != null)
        {
            y = b0;
            b0 =null;
            return y;
        }
        else if(b1 != null)
        {
            y = b1;
            b1 =null;
            return y;
        }
        else if(b2 != null)
        {
            y = b2;
            b2 =null;
            return y;
        }
        else
        {
            return null;   
        }
    }

    public Bus removeBus(int position)
    {
        Bus y= null;
        if(position == 0 || position == 1 || position == 2)
        {
            if(b0 != null && position == 0)
            {
                y = b0;
                b0 =null;
                return y;
            }
            else if(b1 != null && position == 1)
            {
                y = b1;
                b1 =null;
                return y;
            }
            else if(b2 != null && position == 2)
            {
                y = b2;
                b2 =null;
                return y;
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
}
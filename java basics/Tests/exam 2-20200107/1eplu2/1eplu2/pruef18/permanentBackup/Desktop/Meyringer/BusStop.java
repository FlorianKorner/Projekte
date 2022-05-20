public class BusStop
{
    private Bus b0;
    private Bus b1;
    private Bus b2;
    public BusStop()
    {
        b0 = new Bus(0,20,"MA73 EHI");        
        b2 = new Bus(12,40,"YD34 HIF");
    }
    
    public int maxSeats()
    {
        if(b0!=null && b1 != null && b2!= null)
        {    
            if(b0.getSeats() > b1.getSeats() &&b0.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B0");
                return b0.getSeats();
            }
            else if(b1.getSeats() > b0.getSeats() &&b1.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B1");
                return b1.getSeats();
            }
            else if(b2.getSeats() > b1.getSeats() &&b0.getSeats() < b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B2");
                return b2.getSeats();
            }
            else 
            {
                return 0;
            }
        }
        else if(b0!=null && b1 != null)
        {
            if(b0.getSeats() > b1.getSeats() &&b0.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B0");
                return b0.getSeats();
            }
            else if(b1.getSeats() > b0.getSeats() &&b1.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B1");
                return b1.getSeats();
            }
            else if(b2.getSeats() > b1.getSeats() &&b0.getSeats() < b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B2");
                return b2.getSeats();
            }
            else 
            {
                return 0;
            }
            
        }
        else if(b0!=null && b1 != null)
        {
            if(b0.getSeats() > b1.getSeats() &&b0.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B0");
                return b0.getSeats();
            }
            else if(b1.getSeats() > b0.getSeats() &&b1.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B1");
                return b1.getSeats();
            }
            else if(b2.getSeats() > b1.getSeats() &&b0.getSeats() < b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B2");
                return b2.getSeats();
            }
            else 
            {
                return 0;
            }
        }
        else if(b0!=null && b2 != null)
        {
            if(b0.getSeats()  > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B0");
                return b0.getSeats();
            }
            
            else if(b0.getSeats() < b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B2");
                return b2.getSeats();
            }
            else 
            {
                return 0;
            }
        }
        else if(b2!=null && b1 != null)
        {
            if(b1.getSeats() > b2.getSeats())
            {
                System.out.println("The Bus with the most seats is B1");
                return b1.getSeats();
            }
            else if(b2.getSeats() > b1.getSeats()){
                System.out.println("The Bus with the most seats is B2");
                return b2.getSeats();
            }
            else 
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    
    public int registrationStartsWith(String s)
    {
        if(b0!= null && b1 != null && b2 != null)
        {    
            if(b0.getRegistration().startsWith(s)||b1.getRegistration().startsWith(s)||b2.getRegistration().startsWith(s))
            {
                return 1;
            }
            else if(b0.getRegistration().startsWith(s)&& b1.getRegistration().startsWith(s)||b1.getRegistration().startsWith(s) && b2.getRegistration().startsWith(s) ||b0.getRegistration().startsWith(s) && b2.getRegistration().startsWith(s))
            {
                return 2;
            }
            else if(b0.getRegistration().startsWith(s)&&b1.getRegistration().startsWith(s)&&b2.getRegistration().startsWith(s))
            {
                return 3;
            }
            else
            {
                return 0;
            }
        }
        else if(b0!=null && b1 != null)
        {
            if(b0.getRegistration().startsWith(s)||b1.getRegistration().startsWith(s))
            {
                return 1;
            }
            else if(b0.getRegistration().startsWith(s)&&b1.getRegistration().startsWith(s))
            {
                return 2;
            }
            else
            {
                return 0;
            }
            
        }
        else if(b0!=null && b2 != null)
        {
            if(b0.getRegistration().startsWith(s)||b2.getRegistration().startsWith(s))
            {
                return 1;
            }
            else if(b0.getRegistration().startsWith(s)&&b2.getRegistration().startsWith(s))
            {
                return 2;
            }
            else
            {
                return 0;
            }
        }
        else if(b1!=null && b2 != null)
        {
            if(b1.getRegistration().startsWith(s)||b2.getRegistration().startsWith(s))
            {
                return 1;
            }
            else if(b2.getRegistration().startsWith(s)&&b1.getRegistration().startsWith(s))
            {
                return 2;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    
    public int enter(int passenger)
    {
        int actually = 0;
        if(b0!= null) actually += b0.enter(passenger);
        if(b0!=null)passenger = passenger - (b0.getSeats()-b0.getPassengers());
        if(b1!= null)actually += b0.enter(passenger);
        if(b1!=null)passenger = passenger - (b1.getSeats()-b1.getPassengers());
        if(b2!= null)actually += b0.enter(passenger);
        return actually;
    }    
    
    
    public Bus getBus(int position)
    {
        if(position == 2)
        {
            return b2;
        }
        else if(position == 1)
        {
            return b1;
        }
        else if(position == 0)
        {
            return b0;
        }
        else 
        {
            return null;
        }
    }
    
    public boolean addBus(Bus b)
    {
        if(b != null &&b0 == null ||b1 == null ||b2 == null)
        {
            if(b0 == null)
            {                
                b0 = b;
                return true;
            }
            if(b1 == null)
            {                
                b1 = b;
                return true;
            }
            if(b2 == null)
            {                
                b2 = b;
                return true;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean addBus(Bus b, int position)
    {
        if(b != null && position <= 2 && position >= 0 && b0 == null ||b1 == null ||b2 == null)
        {
            if(b0 == null&& position == 0)
            {                
                b0 = b;
                return true;
            }
            if(b1 == null && position == 1)
            {                
                b1 = b;
                return true;
            }
            if(b2 == null && position == 2)
            {
                b2 = b;
                return true;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Bus removeBus()
    {
        if(b0 != null || b1 != null ||b2 != null)
        {
            if(b0 != null)
            {
                Bus xyz = b0;
                b0 = null;
                return xyz;
            }
            else if(b1 != null)
            {
                Bus xyz = b1;
                b1 =null;
                return xyz;
            }
            else if(b2 != null)
            {
                Bus xyz = b2;
                b2 =null;
                return xyz;
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
    public Bus removeBus(int position)
    {
        if(position <= 2 && b0 != null || b1 != null ||b2 != null)
        {
            if(b0 != null&& position == 0)
            {
                Bus xyz = b0;
                b0 = null;
                return xyz;
            }
            else if(b1 != null&&position == 1)
            {
                Bus xyz = b1;
                b1 =null;
                return xyz;
            }
            else if(b2 != null&&position == 2)
            {
                Bus xyz = b2;
                b2 =null;
                return xyz;
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
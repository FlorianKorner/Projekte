public class BusStop
{
    private Bus  b0;
    private Bus  b1;
    private Bus  b2;
    public BusStop()
    {
        b0= 0,20, "MA73 EHI";
        b1= null;
        b2= 12,40,"YD34 HIGF";
    }

    public void maxSeats()
    {
        if (bus.wheels == 40)
        {
            System.out.println("b0 has the most wheels");
        }
    }

    public int enter(int newEnter,int seats, int passanger) 
    {
        if(b0.seats == b0.passanger&&b1.seats == b1.passanger&& b2.seats == b2.passanger)
        {
            return false;
        }
        else
        {   
            int c=
                b0.seats - b0.seats;
            newEnter= c + newEnter;
            int b=
                b1.seats - b1.seats;
            newEnter= b + newEnter;
            int a=
                b2.seats - b2.seats;
            newEnter= a + newEnter;
        }
    }

    public boolean getBus(int position)
    {
        if (b0.position != null||b0.position != 1|| b0.position != 2|| b0.position != 0)
        {
            return position;
        }
        else if ((b1.position != null||b1.position != 1|| b1.position != 2|| b1.position != 0)){
            return position;
        }
        else if ((b2.position != null||b2.position != 1|| b2.position != 2|| b2.position != 0)){
            return position;
        }        
    }
    public boolean addBus()
    {
        if(b0.position == null)
        {
            b0 = bus;
        }
        if(b1.position == null)
        {
            b1 = bus;
        }
        if(b2.position == null)
        {
            b2 = bus;
        }
    }
    public boolean removeBus()
    {
        if(b0.position != null)
        {
            b0 = null;
        }
        if(b1.position != null)
        {
            b1 = null;
        }
        if(b2.position != null)
        {
            b2 = null;
        }
    }
}


/**
 * simulates a bus
 * 
 * Tristan losada
 * v.1
 */
public class Bus
{
    private int passengers;
    private int seats;
    private String vrn;

    public Bus(int passengers, int seats, String vrn)
    {
        setPassengers(passengers);
        setSeats(seats);
        setVrn(vrn);
    }

    public Bus()
    {
        setPassengers(0);
        setSeats(50);
        setVrn("AB00 ABC");
    }

    public void check()
    {
        if(vrn.length(0,8) && vrn.toUpperCase(0,1,5,6,7) && charAt(2,3))
            this.check=check;
        else
            System.out.println("ERROR with the check method.");
    }

    public void setPassengers(int p)
    {
        if(p>=0)
            this.passengers=p;
        else if(p>=seats)
            this.passengers=p;
        else
        {
            this.passengers=0;
            System.out.println("ERROR with the Passengers");
        }
    }

    public void setSeats(int s)
    {
        if(s>=0)
            this.seats=s;
        else
            this.seats=0;
        System.out.println("ERROR with the seats");
    }

    public void setVrn(String v)
    {
        if(check(vrn))
            this.vrn=v;
        else
        {
            this.vrn="AB00 ABC";
            System.out.println("ERROR with the VRN");
        }
    }

    public int getPassengers()
    {
        return passengers;
    }

    public int getSeats()
    {
        return seats;
    }

    public String getVrn()
    {
        return vrn;
    }

    public int getEnter(int number)
    {
        int n;
        n=seats-passengers;
        seats=n;
        return n;
        if(seats<0)
            System.out.println("ERROR with the entering of the passengers");
    }

    public int exit(int number)
    {
        int e;
        e=seats-number;
        seats=e;
        return e;
        if(e<0)
            System.out.println("ERROR with the exiting of the passengers");
    }
    
    public void print()
    {
    System.out.println("");
    System.out.println("###################################");
    System.out.println("The people on the bus:  "+passengers);
    System.out.println("The seats on the bus:   "+seats);
    System.out.println("The Plate number:   "+vrn);
    System.out.println("###################################");
    }
    
    //as you can see I didn't do very well. I did study, but apparently it wasn't enough.
}
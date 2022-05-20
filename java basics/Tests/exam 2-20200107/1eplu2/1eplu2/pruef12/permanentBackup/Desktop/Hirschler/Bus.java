public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public Bus()
    {
        this.passengers = 0;
        this.seats = 50;
        this.registration = "AB00 ABC";
    }
    public Bus(int newPassengers, int newSeats, String newRegistration)
    {
        this.passengers = newPassengers;
        this.seats = newSeats;
        this.registration = newRegistration;
    }
    
    public void setPassengers(int newPassengers)
    {
        if(newPassengers >= 0 && newPassengers <= seats)
        {
            this.passengers = newPassengers;
        }
        else
        {
            newPassengers = 0; // Default Value!!
        }
    }

    public int getPassengers()
    {
        return passengers;
    }

    public void setSeats(int newSeats)
    {
        if(newSeats >= 0)
        {
            this.seats = newSeats;
        }
        else
        {
            newSeats = 50; // Default Value!!
        }
    }

    public int getSeats()
    {
        return seats;
    }

    public void setRegistration(String newRegistration)
    {
        if(newRegistration.length("8"))
        {
            this.registration = newRegistration;
        }
        else
        {
            newRegistration = "AB00 ABC"; // Default Value!!
        }
    }

    public String getRegistration()
    {
        return registration;
    }
    
    public  void checkConsistency()
    {
   /*     if(getRegistration().(0,1,5,6,7).toUppercase())
        {
        }
      */  
    }
    
    public int enter(int number)
    {
        int NBpassenger = 0;
        if(getSeats() >= getPassengers() && getSeats() != 0)
        {
            System.out.println("Passengers == Seats");
        }
        else
        {
            System.out.println("Passengers != Seats");
        }
        return NBpassenger;
    }

}
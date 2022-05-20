

public class Bus
{
    private int passenger;
    private int seats;
    private String registration;
    
    public boolean check(int passenger, int seats, String register)
    {
        if(passenger >= 0 && passenger <= seats)
        {
            return true;
        }
        else
        {
            return false;
        }
        if(seats >= 0 )
        {
            return true;
        }
        return false;
        if(registration.length() = 8)
        {
            return true;
        }
        return false;
    }
    public void Bus(int passenger, int seats, String register)
    {
        if(check(passenger, seats, register))
        {
            this.passenger=passenger;
            this.seats=seats;
            this.register=register;
            
        }
        else
        {
            System.out.println("Error1");
            this.passenger = 0;
            this.seats = 50;
            
        }
    }
    public Bus()
    {
        setPassenger(0);
        setSeats(50);
        setRegistration("AB00 ABC");
    }
    public void setPassenger(int passenger)
    {
        if(passenger <= 50 && passenger >= 0)
        {
            return true;
        }
        return false;
    }
    public int getPassenger()
    {
        return passenger;
    }
    public int getSeats()
    {
        return seats;
    }
    public String getRegistration()
    {
        return registration;
    }
    public void setRegistration(String registration)
    
    {
         if(check(seats, passenger, registration )
         {
             this.registration=registration
            }
    }
    public void setSeats(int seats)
    {
        if(check(seats, passenger, registration ))
        {
            return true;
        }
        return false;
    }
    public int enter()
    {
        if(passengers <= 50)
        {
            return true;
        }
        
    }
    
}

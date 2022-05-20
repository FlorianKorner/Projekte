public class Bus
{
    private int passengers;
    private int seats;
    private String registration;
    
    public Bus(int passengers, int seats, String registration)
    {
        if(check(passengers,seats,registration))
        {
            this.passengers = passengers;
            this.seats = seats;
            this.registration = registration;
        }
    }
    public Bus()
    {
        setPassengers(0);
        setSeats(50);
        setRegistration("AB00 ABC");
    }
    
    public boolean check(int passengers, int seats,String registration)
    {
        if(passengers >= 0 && passengers <= seats) return true;
        if(seats >= 0) return true;
        if(registration.length()==7&&registration.substring(4)==" ")return true;
        return false;
    }
    
    public void setPassengers(int passengers)
    {
        if(check(passengers,seats,registration))
        {
            this.passengers = passengers;
        }
        else
        {
            System.out.println("Error in setPassengers");
        }
    }
    public int getPassengers()
    {
        return passengers;
    }
    
    public void setSeats(int seats)
    {
        if(check(passengers,seats,registration))
        {
            this.seats=seats;
        }
        else
        {
           System.out.println("Error in setSeats");
        }
    }
    public int getSeats()
    {
        return seats;
    }
    
    public void setRegistration(String registration)
    {
        if(check(passengers,seats,registration))
        {
            this.registration = registration;
        }
        else
        {
            System.out.println("Error in setNumber");
        }
    }
    public String getRegistration()
    {
        return registration;
    }
    
    public int enter(int number)
    {
        if(number+passengers <= seats&& number >= 0)
        {
            passengers = passengers + number;
            return number;
        }
        else if(number >=0&& number > passengers)
        {
            int actuallyentered =0;
            actuallyentered= seats - passengers;
            passengers = seats;
            return actuallyentered;
        }
        else
        {
            return 0;
        }
    }
    public int exit(int number)
    {
        if(number <= passengers && number>= 0)
        {
            passengers = passengers - number;
            return number;
        }
        else if(number > passengers && number >= 0)
        {
            int actuallyleft=0;
            actuallyleft = passengers;
            passengers = 0;
            return actuallyleft;
        }
        else
        {
            return 0;
        }
    }
    public void print()
    {
        System.out.println("Passengers: "+getPassengers());
        System.out.println("Seats: "+getSeats());
        System.out.println("Registration Number: "+getRegistration());
    }
}

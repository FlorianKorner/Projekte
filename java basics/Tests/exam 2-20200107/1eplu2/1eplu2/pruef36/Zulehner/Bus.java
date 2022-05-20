
public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public Bus()
    {
       if(CeckConsistency() == true)
        setSeats(20);
         setPassengers(10);
        setRegistration("AD00 DEF");
    }

    public Bus(  int seats,int passengers, String registration)
    {
        
        setSeats(seats);
        setPassengers(passengers);
        setRegistration(registration);
    }

    public boolean CeckConsistency()
    {
        if(getPassengers()  < 0) return false;
        if(getPassengers() > getSeats()) return false;
        if(getSeats() < 0 ) return false;

       
         else
            return true;
    }

    public void setPassengers(int passengers)
    {if(passengers>= 0 &&  seats >= passengers)

            this.passengers = passengers;
        else
            this.passengers = 0;
    }

    public int getPassengers()
    {
        return this.passengers;
    }

    public void setSeats( int seats)
    {
        if(seats >= 0)
            this.seats = seats;
        else
            this.seats = 50;
    }

    public int getSeats()
    {
        return this.seats;
    }

    public void setRegistration( String registration)
    {
        if(registration.length()  == 8)
            this.registration = registration;
        else
            this.registration = "AB00 ABC";

    }

    public String getRegistration()
    {
        return this.registration;
    }

    public int enter( int number)
    {
        int numberfpeople;
        if(number >= 1 && (number +passengers) >= seats ){
            numberfpeople = number;
            passengers =+ number;
           
            return numberfpeople;

        } 
        else
            return 0;
    }

    public int exit( int number)
    {
        if(number >= 0 && number <= passengers)  
        { passengers = passengers -number;

            return number;
        }
        else
        {
            return 0;
        }
    }

    public void print()
    {
        System.out.println("NUmber of passengers is :" +getPassengers()+" "+"the number of seats is"+getSeats()+" " +"the registration is"+getRegistration());

    }
}
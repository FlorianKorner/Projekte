
/**
 * Beschreiben Sie hier die Klasse Bus.
 * 
 * @author (El Badry Laetitia) 
 * @version (17.12.2019)
 */
public class Bus
{
    private int passengers;
    private int seats;
    private String registration;
    
    // constr
    public Bus (int passengers, int seats, String registration)
    {
        passengers (setPassengers);
        seats (setSeats);
        registration (setRegistration);
        
        
    }
    
    public Bus ()
    {
        passengers = 0;
        seats = 50;
        registration = "AB00 ABC";
    }
    
    // sett
    public void setPassengers (int passengers)
    {
        if (passengers >= 0 && passengers <= getSeats())
        {
            passengers = passengers;
        }
    }
    
    public void setSeats (int seats)
    {
        if (seats >= 0)
        {
            seats = seats;
        }
       
    }
    
    public void setRegistration (String registration)
    {
         
       
    }
    
    // gett
    public int getPassengers ()
    {
        return passengers;
    }
    
    public int getSeats ()
    {
        return seats;
    }
    
    public String getRegistration ()
    {
        return registration;
    }
    
    // meth
    public String checkConsistency ()
    {
        
    }
    
    public int enter(int number)
    {
        int enter = 0;
        if (number <= getSeats() && number > 0)
        {
            passengers = passengers + number;
            return number;
        }
        else if (number = 0)
        {
            return 0;
        }
        else if (number > getSeats())
        {
            passengers = getSeats();
            enter = getSeats();
        }
    }
    
    public int exit(int number)
    {
        if (number <= getPassengers() && number > 0)
        {
            passengers = passengers - number;
            return number;
        }
        else
        {
            System.out.println("exit() not possible")
        }
    }
    
    public void print()
    {
        System.out.println ("passengers: " + getPassengers());
        System.out.println ("seats: " + getSeats());
        System.out.println ("registration: " + getRegistration());
    }
        
            
            
            
        
   
}

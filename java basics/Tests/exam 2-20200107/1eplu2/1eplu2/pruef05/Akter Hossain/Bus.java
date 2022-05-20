
/**
 * Beschreiben Sie hier die Klasse Bus.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bus
{
    private int passenger; 
    private int seats;
    private String registration;
    
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
    
    public void setPassenger(int passenger)
    {
        if(passenger >= 0 && passenger <= seats)
        {
         this.passenger = passenger;   
        }
        else
        {
            this.passenger = 0;
        }
    }
    
    public void setSeats(int seats)
    {
     if(seats >= 0)
     {
         this.seats = seats;
        }
        else
        {
            this.seats = 50;
        }
    }
    public void setRegistration(String registration)
    {
     if(registration != null && registration.length() == 8)
     {
         this.registration = registration;
        }else
        {
            this.registration = "AB00 ABC";
        }
    }
    
    public void checkConsistency()
    {
        
    }
    
    public int enter(int number)
    {
     if(number >= 0)
     {
         System.out.println("correct");
        }
        
        
    }
    
    public int exit (int number)
    {
     if(number >= 0)
     {
         System.out.println("correct");
        }
        
        
    }
    
    // public String Regestration()
    // {
        // String a = getRegistration()
    // }
    
    
}

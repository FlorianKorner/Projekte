
/**
 * Beschreiben Sie hier die Klasse BusStop.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class BusStop
{
    private Bus b0; 
    private Bus b1;
    private Bus b2;

    public BusStop()
    {
        Bus b0 = new Bus();
        b0.setPassenger(0);
        b0.setSeats(20);
        b0.setRegistration("MA73 EHI");

        Bus b1 = null;

        Bus b2 = new Bus();
        b2.setPassenger(12);
        b2.setSeats(40);
        b2.setRegistration("YD34 HIF");

    }

    // bearbeiten 
    public Bus maxSeats()
    {
        b0.getSeats(); 
        b1.getSeats();
        b2.getSeats();
        return b2;
    }

    public int registrationStartsWith(String s){
        if(s.startsWith("yd") == true)
        {
        }
        return 0;

    }

    public int enter(int passengers)
    {
        int seats;
        if(b0 != null)
        {

            seats  = passengers;
            return passengers;
        }
        else
        if(b0 == null && b1 != null)
        {

            seats = passengers;
            return passengers;
        }
        return passengers;
    }

    public Bus getBus (int position)
    {

        if(position >= 2 && position <= 0)
        {
            System.out.println("Error");

        }

        if(position == 0 && b0 != null)
        {
            return b0;   
        }
        else if( position == 1 && b1 != null)
        {
            return b1;   
        }
        else if(position == 2 && b2 != null)
        {
            return b2;   
        }
        else
        {
            return null;   
        }

    }
    public boolean addBus(Bus b)
    {

        if(b0 == null && b != null)
        {
            b0 = b;
            return true;
        }
        else if(b1 == null&& b != null)
        {
            b1 = b;
            return true;
        }
        else if(b2 == null&& b != null)
        {
            b2 = b;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean addBus(Bus b, int position)
    {
        if(position >= 2 && position <= 0)
        {
            System.out.println("Error");

        }

        if(position == 0 && b0 == null && b != null)
        {
            b0 = b;
            return true;
        }
        else if(position == 1 && b1 == null&& b != null)
        {
            b1 = b;
            return true;
        }
        else if(position == 2 && b2 == null&& b != null)
        {
            b2 = b;
            return true;
        }
        else
        {
            return false;
        }
    } 

    public Bus removeBus ()
    {
       if( b0 != null)
        {
            b0 = null;
            return null;

            }
            else if( b1 != null)
            {
            b1 = null;
            return null;
            }
            else if(b2 != null)
            {
            b2 = null;
            return null;
            }
            else
            {
            return null;
            }
    }

    public Bus removeBus( int position)
    {
        if(position >= 2 && position <= 0)
        {
            System.out.println("Error");

        }

        if(position == 0 && b0 != null)
        {
            b0 = null;
            return null;

            }
            else if(position == 1 && b1 != null)
            {
            b1 = null;
            return null;
            }
            else if(position == 2 && b2 != null)
            {
            b2 = null;
            return null;
            }
            else
            {
            return null;
            }
        
     

   
    }
    
    
}    

    

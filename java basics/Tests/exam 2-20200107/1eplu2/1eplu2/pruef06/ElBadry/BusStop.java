
/**
 * Beschreiben Sie hier die Klasse BusStop.
 * 
 * @author (El Badry Laetitia) 
 * @version (17.12.2019)
 */
public class BusStop
{
    private Bus b0;
    private Bus b1;
    private bus b2;

    public BusStop ()
    {
        this.b0 (0, 20, "MA73 EHI");
        this.b1 (null);
        this.b2 (12, 40, "YD34 HIF");
    }

    public int maxSeats()
    {
        if (this.b0.getSeats() > this.b1.getSeats() && this.b0.getSeats() > this.b2.getSeats())
        {
            System.out.println("b0 has the most seats");
        }
        if (this.b1.getSeats() > this.b0.getSeats() && this.b1.getSeats() > this.b2.getSeats())
        {
            System.out.println("b1 has the most seats");
        }
        if (this.b2.getSeats() > this.b0.getSeats() && this.b2.getSeats() > this.b1.getSeats())
        {
            System.out.println("b2 has the most seats");
        }
    }

    public int registrationStartsWith (String s)
    {
        int n = 0;
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        if (this.b0.getRegistration().startsWith("s"))
        {
            n0 = n0 + 1;
        }
        else if (this.b1.getRegistration().startsWith("s"))
        {
            n1 = n1 + 1;
        }
        else if (this.b2.getRegistration().startsWith("s"))
        {
            n2 = n2 + 1;
        }
        else 
        {
            return 0;
        }
        n = n0 + n1 + n2;
        return n;
    }

    public int enter (int passengers)
    {
        int e = 0;
        int uebrig = 0;
        int uebrig2 = 0;
        if (passengers <= this.b0.getSeats())
        {
            this.b0.passengers = passengers;
            e = e + this.b0.getPassengers();
            return e;
        }
        else 
        {
            uebrig = this.b0.getPassengers() - this.b0.getSeats();
            this.b0.getPassengers() = this.b0.getSeats;
            if (uebrig <= this.b1.getSeats())
            {
                this.b1.getPassengers() = uebrig;
                e = e + this.b0.getPassengers() + this.b1.getPassengers();
                return e;
            }
            else
            {
                uebrig2 = uebrig - this.b1.getSeats;
                this.b1.getPassengers() = this.b1.getSeats;
                if (uebrig2 <= this.b2.getSeats())
                {
                    this.b2.getPassengers() = uebrig2;
                    e = e + this.b0.getPassengers() + this.b1.getPassengers() + this.b2.getPassengers();
                    return e;
                }
                else
                {
                    this.b2.getPassengers() = this.b2.getSeats;
                    e = this.b0.getPassengers() + this.b1.getPassengers() + this.b2.getPassengers();
                    return e;
                }
            }
        }
    }

    public Bus getBus(int position)
    {
        if (position == 0)
        {
            return this.b0;
        }
        else if (position == 1)
        {
            return this.b1;
        }
        else if (position == 2)
        {
            return this.b2;
        }
        else if (position > 2)
        {
            return null;
        }
    }

    public boolean addBus (Bus b)
    {
        if (this.b0 == null && b != null)
        {
            this.b0 = b;
            if (this.b0 == b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if ( this.b1 == null && b != null)
        {
            this.b1 = b;
            if (this.b1 == b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (this.b2 == null && b != null)
        {
            this.b2 = b;
            if (this.b2 == b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else 
        {
            return false;
        }
    }

    public boolean addBus (Bus b, int position)
    {
        if (position == 0 && this.b0 == null && b != null)
        {
            this.b0 = b;
            if (this.b0 == b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (position == 1 && this.b1 == null && b != null)
        {
            this.b1 = b;
            if (this.b1 == b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (position == 2 && this.b2 == null && b != null)
        {
            this.b2 = b;
            if (this.b2 == b)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else 
        {
            return false;
        }
    }

    public Bus removeBus ()
    {
        if (this.b0 != null)
        {
            this.b0 = null;
            return null;
        }
        else 
        {
            return false;
        }
    }

    public Bus removeBus (int position)
    {
        if (position == 0 && this.b0 != null)
        {
            this.b0 = null;
            return null;
        }
        else if (position == 1 && this.b1 != null)
        {
            this.b1 = null;
            return null;
        }
        if (position == 2 && this.b2 != null)
        {
            this.b2 = null;
            return null;
        }
        else
        {
            return false;
        }
    }

                
}

public class bus
{
    private int passengers;
    private int seats;
    private String registration;

    public bus()
    {
        this.passengers = 0;
        this.seats = 50;
        this.registration = "AB00 ABC";
    }

    public bus(int passengers, int seats, String registration)
    {
        if(check(passengers, seats, registration))
        {
            this.passengers = passengers;
            this.seats = seats;
            this.registration = registration;
        }
        else{
            this.passengers = 0;
            this.seats = 50;
            this.registration = "AB00 ABC";
        }
    }

    private boolean check(int passengers, int seats, String registration)
    {
        if(passengers < 0 && passengers > seats) return false;
        else if(seats < 0) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÖÄÜ".indexOf(registration.charAt(0)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÖÄÜ".indexOf(registration.charAt(1)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÖÄÜ".indexOf(registration.charAt(5)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÖÄÜ".indexOf(registration.charAt(6)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÖÄÜ".indexOf(registration.charAt(7)) == -1) return false;
        else if("0123456789".indexOf(registration.charAt(2)) == -1) return false;
        else if(" ".indexOf(registration.charAt(4)) == -1) return false;
        return true;
    }

    public void setPassengers(int passengers)
    {
        if(check(passengers, seats, registration))
        {
            this.passengers = passengers;
        }
        else{
            System.out.println("The passengers number " + passengers + " is not valid");
        }
    }

    public void setSeats(int seats)
    {
        if(check(passengers, seats, registration))
        {
            this.seats = seats;
        }
        else{
            System.out.println("The seats number " + seats + " is not valid");
        }
    }

    public void setRegistration(String registration)
    {
        if(check(passengers, seats, registration))
        {
            this.registration = registration;
        }
        else{
            System.out.println("The registration " + seats + " is not valid");
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

    public String getRegistration()
    {
        return registration;
    }

    public int exit(int number)
    {
        if(!(number > 0))
        {
            return 0;
        }
        int a = 0;
        if(number >getPassengers())
        {
            a = getPassengers();
            setPassengers(0);
            return a;
        }
        else{
            setPassengers(getPassengers() - number);
            return number;
        }
    }

   public int enter(int number)
    {
        if(!(number > 0))
        {
            return 0;
        }
        int a = 0;
        if(number >(getSeats() - getPassengers()))
        {
            a = getSeats() - getPassengers();
            setPassengers(getSeats());
            return a;
        }
        else{
            setPassengers(getPassengers() + number);
            return number;
        }
    }

    public void print()
    {
        System.out.println("The bus has " + seats + " seats and currently " + passengers + " passengers on it. It's registration is " + registration); 
    }
}
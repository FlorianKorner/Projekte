public class Bus
{
    private int passenger;
    private int seats;
    private String registration;

    public Bus(int passenger, int seats, String registration)
    {
      if(checkConsistency(passenger, seats, registration))
      {
          this.passenger = passenger;
          this.seats = seats;
          this.registration=registration;
        }
    }
    
    public Bus()
    {
        this(3,5,"AC22 DFG");
    }
    
    

    public boolean checkConsistency(int passenger, int seats, String registration)
    {
        if(passenger <= 0 && passenger > seats)return false;
        else if(seats <0)return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.charAt(0)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.charAt(1)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.charAt(5)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.charAt(6)) == -1) return false;
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.charAt(7)) == -1) return false;
        else if("0123456789".indexOf(registration.charAt(2)) == -1) return false;
        else if(" ".indexOf(registration.charAt(4)) == -1) return false;
        return true;
    }

     
        public void setPassenger(int passenger)
        {
        if(checkConsistency(passenger, seats, registration))
        {
            this.passenger = passenger;
        }
        else
        {
            this.passenger= 0;
        }
    }

    public int getPassenger()
    {
        return passenger;
    }

    public void setSeats(int seats)
    {
        if(checkConsistency(passenger, seats, registration))
        {
            this.seats = seats;
        }
        else
        {
            this.seats= 50;
        }
    }

    public int getSeats()
    {
        return seats;
    }

    public void setRegistration(String registration)
    {
        if(checkConsistency(passenger, seats, registration))
        {
            this.registration = registration;

        }
        else
        {
            this.registration = "AB00 ABC";
        }
    }
    
    public String getRegistration()
    {
        return registration;
    }
    
    public int enter(int number)
    {
     
     if(number <= seats && number > 0)
     {
         number= number - passenger;
         passenger = passenger + number;
         return passenger;
        }
        else
        {
         return 0;   
        }
    }
    
    public int exit(int number)
    {
        if(number > 0 && passenger >0 && number <= passenger)
        {
            passenger= passenger - number;
            return passenger;
        }
        else
        {
         return 0;   
        }
    }
    
    public void print()
    {
        System.out.println("The number of passenger on the bus is: " + getPassenger());
        System.out.println("The number of seats on the bus is: " + getSeats());
        System.out.println("The registration number of the bus is: " + getRegistration());
    }
    
    
}
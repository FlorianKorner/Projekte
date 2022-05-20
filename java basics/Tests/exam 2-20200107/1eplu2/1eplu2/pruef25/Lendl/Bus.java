public class Bus
{
    private int passengers;
    private int seats;
    private String registration;
    
    public Bus(String registration, int passengers, int seats)
    {
        if(checkConsistency(registration, passengers, seats))
        {
            setRegistration(registration);
            setPassengers(passengers);
            setSeats(seats);
        }
        else
        {
            setRegistration("AB00 ABC");
            setPassengers(0);
            setSeats(50);
        }
    }
    
    public Bus()
    {
        this("AB00 ABC", 0, 50);
    }
    
    public boolean checkConsistency(String registration, int passengers, int seats)
    {
        if(passengers < 0) return false;
        if(seats < 0) return false;
        if(passengers > seats) return false;
        if(registration == null) return false;
        if(registration.length() != 8) return false; 
        if("QWERTZUIOPÜASDFGHJKLÖÄYXCVBNM".indexOf(registration.charAt(0)) == -1) return false;
        if("QWERTZUIOPÜASDFGHJKLÖÄYXCVBNM".indexOf(registration.charAt(1)) == -1) return false;
        if(" ".indexOf(registration.charAt(4)) == -1) return false;
        if("1234567890".indexOf(registration.charAt(2)) == -1) return false;
        if("1234567890".indexOf(registration.charAt(3)) == -1) return false;
        if("QWERTZUIOPÜASDFGHJKLÖÄYXCVBNM".indexOf(registration.charAt(5)) == -1) return false;
        if("QWERTZUIOPÜASDFGHJKLÖÄYXCVBNM".indexOf(registration.charAt(6)) == -1) return false;
        if("QWERTZUIOPÜASDFGHJKLÖÄYXCVBNM".indexOf(registration.charAt(7)) == -1) return false;
        else
        return true;
    }
    
    public void setRegistration(String registration)
    {
        if(checkConsistency(registration, passengers, seats))
        {
            this.registration = registration;
        }
        else
        {
            this.registration = "AB00 ABC";
            System.out.println("The registration number is invalid");
        }
    }
    
    public void setPassengers(int passengers)
    {
        if(checkConsistency(registration, passengers, seats))
        {
            this.passengers = passengers;
        }
        else
        {
            System.out.println("Wrong input, there is not enogh space for more passengers");
            this.passengers = 0;
        }
    }
    
    public void setSeats(int seats)
    {
        if(checkConsistency(registration, passengers, seats))
        {
            this.seats = seats;
        }
        else
        {
            this.seats = 50;
            System.out.println("Seats are too little");
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
    
    public int enter(int number)
    {
        if(passengers + number <= seats && number > 0)
        {
            passengers += passengers + number;
            return passengers;
        }
        else if(passengers + number > seats && number > 0)
        {
            number = seats - passengers;
            passengers += number;
            return passengers;
        }
        else
        {
            return 0;
        }
    }
    
    public int exit(int number)
    {
        if(number > 0)
        {
            if(passengers - number >= 0)
            {
                passengers = passengers - number;
                return passengers;
            }
            else if(passengers - number < 0)
            {
                number = passengers;
                passengers = passengers - number;
                return number;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
}
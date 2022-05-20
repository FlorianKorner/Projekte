public class Bus
{
    private int passengers;
    private int seats;
    private String number;
    
    public boolean check(int passengers, int seats, String number)
    {
        if(passengers <= 0 && seats >= passengers) return false;
        if(seats <= 0) return false;
        if(number.length() != 8)return false;
        
        if("ABCDEFGHIJKLMNOPRSTUVXYZ".substring(number.charAt(0)) != "ABCDEFGHIJKLMNOPRSTUVXYZ" && "ABCDEFGHIJKLMNOPRSTUVXYZ".substring(number.charAt(1)) != "ABCDEFGHIJKLMNOPRSTUVXYZ"
            && "ABCDEFGHIJKLMNOPRSTUVXYZ".substring(number.charAt(5)) != "ABCDEFGHIJKLMNOPRSTUVXYZ" && "ABCDEFGHIJKLMNOPRSTUVXYZ".substring(number.charAt(6)) != "ABCDEFGHIJKLMNOPRSTUVXYZ"
            && "ABCDEFGHIJKLMNOPRSTUVXYZ".substring(number.charAt(7)) != "ABCDEFGHIJKLMNOPRSTUVXYZ") return false;
        if("0123456789".substring(number.charAt(2)) != "0123456789" && "0123456789".substring(number.charAt(3)) != "0123456789") return false;
        if(" ".substring(number.charAt(4)) != " ") return false;
        
        return true;
    }
    
    public Bus(int passengers, int seats, String number)
    {
        if(check(passengers,seats,number))
        {
            this.passengers = passengers;
            this.seats = seats;
            this.number = number;
        }
        else
        {
            this.passengers = 0;
            this.seats = 50;
            this.number = "AB00 ABC";
        }
    }
    
    public Bus()
    {
       this(0,50,"AB00 ABC");
    }
    
    public void setPassengers(int passengers)
    {
        if(check(passengers,seats,number))
        {
            this.passengers = passengers;
        }
        else
        {
            System.out.println("Number of Passengers is Invalid");
            this.passengers = 0;
        }
    }
    public int getPassengers()
    {
        return passengers;
    }
    
    public void setSeats(int seats)
    {
        if(check(passengers,seats,number))
        {
            this.seats = seats;
        }
        else
        {
            System.out.println("Number of Seats is Invalid");
            this.seats = 50;
        }
    }
    public int getSeats()
    {
        return seats;
    }
    
    public void setNumber(String number)
    {
        if(check(passengers,seats,number))
        {
            this.number = number;
        }
        else
        {
            System.out.println("Vehicle registration number is Invalid");
            this.number = "AB00 ABC";
        }
    }
    public String getNumber()
    {
        return number;
    }
    
    public int enter(int enterNumber)
    {
        if(enterNumber > 0 && passengers <= seats)
        {
            enterNumber = enterNumber + getPassengers();
            return enterNumber;
        }
        else
        {
            System.out.println("There are too many or none Passengers onboard.");
            return 0;
        }
    }
    
    public int exit(int exitNumber)
    {
        if(exitNumber < getPassengers() && exitNumber > 0)
        {
            int result = 0;
            result = exitNumber;
            return result;
        }
        else
        {
            System.out.println("The exitNumber is Invalid");
            return 0;
        }
    }
    
    public void print()
    {
        System.out.println("The amount of passengers is " + getPassengers());
        System.out.println("The amount of seats is " + getSeats());
        System.out.println("The registration number is " + getNumber());
    }
}
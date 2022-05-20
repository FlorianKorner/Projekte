public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public Bus(int passengers, int seats, String registration)
    {
        setPassengers(passengers);
        setSeats(seats);
        setRegistration(registration);
    }

    public boolean checkConsistency(int passengers, int seats, String registration)
    {
        if(passengers<=0 && passengers>=seats)return false;
        if(seats<=0)return false;
        if(registration.length()!=8)return false;
        if(registration.charAt(0,1,5,6,7)==registration.equals(toLowerCase()))return false;
        return true;
    }

    public Bus()
    {
        setPassengers(0);
        setSeats(50);
        setRegistration("AB00 ABC");
    }

    public void setPassengers(int passengers)
    {
        this.passengers=passengers;
    }

    public void setSeats(int seats)
    {
        this.seats=seats;
    }

    public void setRegistration(String registration)
    {
        this.registration=registration;
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
        if(number<=seats && number>0)
        passengers=passengers+number;
        return passengers;
    }

    public int exit(int number)
    {
        if(number<=passengers && number>0)
        passengers=passengers-number;
        return passengers;
    }

    public void print()
    {
        System.out.println("***************");
        System.out.println("The bus has "+getPassengers()+" passengers");
        System.out.println("The bus has "+getSeats()+" seats");
        System.out.println("The vehicle registration number of the bus is: "+getRegistration());
        System.out.println("***************");
    }

}
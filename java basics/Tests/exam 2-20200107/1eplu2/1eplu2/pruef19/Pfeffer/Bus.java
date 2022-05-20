public class Bus
{
    private int passenger;
    private int seats;
    private String vrn;
    public boolean check(int passenger, int seats, String vrn)
    {
        if(passenger>=0&&passenger<=seats)return true;
        if(seats>=0)return true; 
        else seats=50;
        return false;
    }
    public Bus(int passenger, int seats, String vrn)
    {
        this.passenger=passenger;
        this.seats=seats;
        this.vrn=vrn;
    }
    public Bus()
    {
        passenger=5;
        seats=20;
        vrn=("BD51 SMR");
    }
    public void passenger(int passenger)
    {
        if(check(passenger, seats, vrn))
        {
          this.passenger=passenger;
        }
        else
        {
            passenger=0;
        }
    }
    public void seats(int seats)
    {
        if(check(passenger, seats, vrn))
        {
          this.seats=seats;
        }
        else
        {
            seats=50;
        }
    }
    public void vrn(String vrn)
    {
        if(check(passenger, seats, vrn))
        {   
            this.vrn=vrn;
        }
        else
        {
            vrn=("AB00 ABC");
        }
    }
    public int enter(int number)
    {
        if(number<=seats&&number>=0)
        {
            return number;
        }
        else if(seats-passenger>=0)
        {
            return seats-passenger;
        }
        else
        {
            return 0;
        }
    }
    public int exit(int number)
    {
        if (number-seats>=0)
        {
            return number;
        }
        else if (passenger-number>=0)
        {
            return passenger-number;
        }
        else
        {
            return 0;
        }
    }
    public int getpassenger()
    {
        return passenger;
    }
    public int getseats()
    {
        return seats;
    }
    public String getvrn()
    {
        return vrn;
    }
    public void desc()
    {
        System.out.println("Passengers" +getpassenger());
        System.out.println("Seats" +getseats());
        System.out.println("Vehicel registration number" +getvrn());
    }
}
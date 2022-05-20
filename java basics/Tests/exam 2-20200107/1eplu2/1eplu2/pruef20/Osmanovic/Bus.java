public class Bus
{
    private int passengers;
    private int seats;
    private String registration;
    
    public Bus(int passengers, int seats, String registration)
    {
        if(check(passengers, seats, registration)){
            setPassengers(passengers);
            setSeats(seats);
            setRegistration(registration);
        }
        else
          System.out.println("Error in setting some of these.");
    }
    
    public boolean check(int passengers, int seats, String registration)
    {
        if(passengers < 0 && passengers > seats) return false;
        else if(seats < 0) return false;
       // else if("abcdefghijklmnopqrstuvwxyzäöü".) return false;
        //else if((registration.substring(4, 4)).contains(" ")) return false;
        else
        return true;
    }
    public int enter(int amount)
    {
        if(amount < 0) return amount;
          if(check(passengers, seats, registration) && amount > seats){
              int a;
              a = amount + passengers;
              passengers = a;
              return a;
          }
        else
        return amount;
    }
   
    public int exit(int amount)
    {
        if(amount < 0 && amount <= passengers) return amount;
         if(check(passengers, seats, registration) && amount <= passengers){
             int a;
             a = passengers - amount;
             passengers = a;
             return a;
            }
        else
          return amount;
    }
    public void print()
    {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Passengers on bus: " + passengers);
        System.out.println("Seats on bus: " + seats);
        System.out.println("Registration: " + registration);
        System.out.println("-------------------------------------------------------------------");
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
    public void setPassengers(int passengers)
    {
        if(check(passengers, seats, registration))
         this.passengers = passengers;
        else
         System.out.println("Error");
    }
    public void setSeats(int seats)
    {
        if(check(passengers, seats, registration))
         this.seats = seats;
        else
         System.out.println("Error");
    }
    public void setRegistration(String registration)
    {
        if(check(passengers, seats, registration))
         this.registration = registration;
        else
         System.out.println("Error");
    }
}

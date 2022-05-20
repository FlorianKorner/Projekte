public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public boolean checkConsistency(int passengers, int seats, String registration){
        if((("" + registration.charAt(1)).equals(("" + registration.charAt(0)).toUpperCase())&&
        (("" + registration.charAt(1)).equals(("" + registration.charAt(1)).toUpperCase()))&&
        (("" + registration.charAt(5)).equals(("" + registration.charAt(5)).toUpperCase()))&&
        (("" + registration.charAt(6)).equals(("" + registration.charAt(6)).toUpperCase()))&&
        (("" + registration.charAt(7)).equals(("" + registration.charAt(7)).toUpperCase()))&&
        (("" + registration.charAt(4)).equals(" "))&& passengers <= seats && seats >= 0))
        return true;
        else
        return false;
    }

    public Bus(int passengers, int seats, String registration){
        
        if(checkConsistency(passengers, seats, registration)){
            setPassengers(passengers);
            setSeats(seats);
            setRegistration(registration);
        }
        System.out.println("Error in Constructor!");
    }
    public Bus(){
        setPassengers(0);
        setSeats(50);
        setRegistration("AB00 ABC");
    }
   
    public void setPassengers(int passengers){
        if(checkConsistency(passengers, seats, registration))
        this.passengers = passengers;
        else
        System.out.println("Error in setPassengers!");
    }

    

    public void setSeats(int seats){
        if(checkConsistency(passengers, seats, registration))
        this.seats = seats;
        else
         System.out.println("Error in setSeats!");
    }

    public void setRegistration(String registration){
        if(checkConsistency(passengers, seats, registration))
        this.registration = registration;
        else
        System.out.println("Error in setRegistration!");
    }
    
    public int getPassengers(){
        return passengers;
    }

    public int getSeats(){
        return seats;   
    }
    public String getRegistration(){
        return registration;
    }
    
    public int enter(int number){
        if(number > 0 && number <= getSeats() && getPassengers() != getSeats() && number <= getSeats() - getPassengers())
        passengers = passengers + number;
        return number;
    }
    
    public int exit(int number){
        if(number > 0 && number <= getPassengers())
        passengers = passengers - number;
        return number;
    }
    
    public void print(){
        System.out.println("+++++++++++++++++++");
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Seats: " + getSeats());
        System.out.println("Registration: " + getRegistration());
    }
}
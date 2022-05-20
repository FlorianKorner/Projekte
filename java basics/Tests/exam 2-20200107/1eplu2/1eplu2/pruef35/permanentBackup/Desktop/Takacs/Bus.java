
public class Bus{
    
    private int passengers;
    private int seats;
    private String registration;
    
    public Bus()
    {
       
        setSeats(44);
        setPassengers(16);
        setRegistration("AC10 DCA");
    }
    
    public Bus(int seats ,int passengers, String registration)
    {
        setSeats(seats);
        setPassengers(passengers);
        
        setRegistration(registration);
    }
    
    public boolean CheckConsistency(){
        if(passengers < 0  ) return false;
        if(passengers > seats ) return false;
        if(seats < 0 ) return false;
        if(registration.length() < 8 ) return false;
        
        
        else return true;
    }
    
    public void setSeats(int seats){
        
        
        if(seats >= 0 )
            this.seats = seats;
        else
            this.seats = 50;
    }
    public int getSeats(){
        return seats;
        
    }
    
    public void setPassengers(int passengers){
        
        if(passengers >= 0 && seats >= passengers )
            this.passengers = passengers;
        else
            this.passengers = 0;
        }
    
    public int getPassengers()
    {
        return passengers;
    }
    
    
    public void setRegistration(String registration){
        if(registration.length() == 8 )
            this.registration = registration;
        else
            this.registration = "AB00 ABC";
        }
    
    public String getRegistration(){
            return registration;
        }
    
        public int Enter(int enter){
        int numOfEnteredpersons;
        if(enter >= 1 && (enter+passengers) <= seats  ){
            numOfEnteredpersons = enter;
            passengers = passengers +  enter;
            return numOfEnteredpersons;
        }
        else{
            return 0;
        }
        
    }
    
    public int Exit(int exit){
       int numOfExitedPersons;
        if(exit >= 0 && exit <= passengers){
            numOfExitedPersons = exit;
        passengers = passengers - exit;
        return exit;
    }else{
        return 0;
    }
    
    
    }
    
    public void print()
    {
        System.out.println("******Bus******");
        System.out.println("Current number of Passengers = " + getPassengers());
        System.out.println("Max number of Seats = " + getSeats());
        System.out.println("Registration Num. = " + getRegistration());
        System.out.println("----------------");
        
    }
    
    
    
    
    
    
    
    
    
    
}
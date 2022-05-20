
public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public boolean checkConsistancy(int passengers, int seats, String registration){
        if(passengers >=0 && passengers <=seats && seats >= 0 && registration.length()==8)
            return true;
        else {
            this.passengers=0;
            this.seats=50;
            this.registration="AB00 ABC";
            return false;
        }

    }

    public Bus(){
        passengers=0;
        seats=50;
        registration="AB00 ABC";
    }

    public Bus(int passegers, int seats, String registration){
        if(checkConsistancy(passengers, seats, registration)){
            this.passengers=passengers;
            this.seats=seats;
            this.registration=registration;
        }
    }

    public void setPassengers(int passengers){
        if(checkConsistancy(passengers, seats, registration))
        this.passengers=passengers;
    }
    public void setSeats(int seats){
        if(checkConsistancy(passengers, seats, registration))
        this.seats=seats;
    }
    public void setRegistration(String registration){
        if(checkConsistancy(passengers, seats, registration))
        this.registration=registration;
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
        int spaceLeft = 0;
        if(number<=0) return 0;
        spaceLeft=seats-passengers;
        if(number+passengers<=seats) {
            setPassengers(passengers+number);
            return number;
        }
        else {
            setPassengers(passengers+spaceLeft);
            return spaceLeft;
        }
    }
    public int exit(int number){
        if(number>passengers) {
            int x=passengers;
            setPassengers(0);
            return x;
        }
        else if(number>0) {
            setPassengers(passengers-number);
            return number;
        }
        else
        return 0;

    }
    
    public void print(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The number of passengers is " + passengers);
        System.out.println("The number of seats is " + seats);
        System.out.println("The registration number is " + registration);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

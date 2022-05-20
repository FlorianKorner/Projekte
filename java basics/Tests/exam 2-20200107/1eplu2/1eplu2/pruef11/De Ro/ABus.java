
/**
 * Beschreiben Sie hier die Klasse ABus.
 * 
 * @author (Adrian De Ro) 
 * @version (17/12/2019)
 */
public class ABus
{
    private int passengers;
    private int seats;
    private String registration;

    public boolean checkConsistency(int passengers, int seats, String registration) {
        
        boolean rightSideOfLife = false;
        if(registration.substring(0, 1).equals("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ") &&
        registration.substring(1, 2).equals("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ") &&
        registration.substring(5, 6).equals("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ") &&
        registration.substring(5, 6).equals("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ") &&
        registration.substring(6, 7).equals("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÜÖ") &&
        registration.substring(3, 4).equals("1234567890") &&
        registration.substring(1, 2).equals(" ")) {
            return true;
        }
        
        if(passengers >= 0 && passengers <= seats) {
            return true;
        }
        
        if(seats >= 0) {
            return true;
        }
        
        return rightSideOfLife;
    }
    
    /**
     * constructors
     */
    public ABus() {
        
        this.passengers = 0;
        this.seats = 50;
        this.registration = "AB00 ABC";
        
    }
    public ABus(int passengers, int seats, String registration) {
            this.passengers = passengers;
            this.seats = seats;
            this.registration = registration;
    }
    
    
    /**
     * setters
     */
    public void setPassengers(int passengers) {
        if(checkConsistency(passengers, seats, registration)){
            this.passengers = passengers;
        }
        else {
            this.passengers = 0;
        }
    }
    public void setSeats(int seats) {
        if(seats >= 0) {
            this.seats = seats;
        }
        else {
            this.seats = 50;
        }
    }
    public void setRegistration(String registration) {
        if(checkConsistency(passengers, seats, registration)) {
            this.registration = registration;
        }
        else {
            this.registration = "AB00 ABC";
        }
    }
    
    /**
     * getters
     */
    public int getPassengers() {
        return this.passengers;
    }
    public int getSeats() {
        return this.seats;
    }
    public String getRegistration() {
        return this.registration;
    }
    
    public int enter(int number) {
        int passengersEntered = 0;
        if(number >= 0 && number <= this.seats) {
            passengersEntered = number;
        }
        else {
            passengersEntered = number - this.seats;
        }
        return passengersEntered;
    }
    
    public int exit(int number) {
        int passengersExited = 0;
        if(number >= 0 && number <= this.seats) {
            passengersExited = this.passengers - number;
        }
        else {
            System.out.println("Passengers cant exit!");
            passengersExited = 0;
        }
        return passengersExited;
    }
    
    public void print() {
        System.out.println("####################################################");
        System.out.println("The bus has " + getPassengers() + " Passengers");
        System.out.println("The bus registration plate is " + getRegistration() + " Registration");
        System.out.println("The bus has " + getSeats() + " Seats");
        System.out.println("####################################################");
    }
}

import java.io.OutputStream;
import java.io.IOException;

/**
 * The Bus class. A class from the exam
 * 
 * @author Dominik Fluch 
 * @version 1.0
 * 
 * INFO: I decided to use the Integer Object and not the datatype because I am more used to it. (I know that the Object needs more memory since it has reference And a place where it is saved to)
 * 
 */
public class Bus {
    
    /**
     * Tests the bus class. (Created for mid-time testing purposes thats why it is not in the test class)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Bus b = new Bus();
        
        b.enter(51);
        
        b.print();
        
        b.exit(6);
        
        b.print();
    }
    
    /**
     * All variables (passengers, seats, registration)
     */
    private Integer passengers;
    private Integer seats;
    private String registration;
    
    /**
     * Creates a bus with the given data.
     * @param passengers
     * @param seats
     * @param registration
     * @throws IllegalArgumentException when invalid arguments are given obviously.
     */
    public Bus(Integer passengers, Integer seats, String registration) {
        
        // Throws an exception on error. Could use setters, but the passenger & seats setter would call the checkPassengerSeats() method twice, so that way there is a tiny tiny performance enhancement.
        Bus.checkConsistency(passengers, seats, registration);
        
        this.passengers = passengers;
        this.seats = seats;
        this.registration = registration;
    }
    
    /**
     *  The default bus constructor.
     *  passengers = 0
     *  seats = 50
     *  registration = AB00 ABC
     */
    public Bus() {
        this(0, 50, "AB00 ABC");
    }
    
    /**
     * Overriding toString for print method.
     */
    @Override
    public String toString() {
        return "Bus with "+this.getPassengers()+" passengers, "+this.getSeats()+" seats and the registration \""+this.getRegistration()+"\".";
    }
    
    /**
     * Prints the data of the bus into the given outputStream.
     * @param outputStream
     * @throws IOException
     */
    public void print(OutputStream outputStream) throws IOException {
        outputStream.write((this.toString()+"\n").getBytes());
        outputStream.flush();
    }
    
    /**
     * Prints the info of the bus into the std out.
     * @throws IOException
     */
    public void print() throws IOException {
        this.print(System.out);
    }
    
    /**
     * Makes the given amount of people enter the bus.
     * @param amount
     * @return the amount of people who could enter the bus.
     */
    public Integer enter(Integer amount) {
        if(amount<=0) throw new IllegalArgumentException("Amount needs to be bigger than zero.");
        
        Integer entered = 0;
        
        for(; entered<amount; entered++) {
            try {
                // Throws an exception if value is higher than seats.
                this.setPassengers(this.getPassengers()+1);
            }catch(IllegalArgumentException exception) {
                break;
            }
        }
        
        return entered;
    }
    
    /**
     * Makes the given amount of people exit the bus.
     * @param amount
     * @return the amount of people who could leave the bus.
     */
    public Integer exit(Integer amount) {
        if(amount<=0) throw new IllegalArgumentException("Amount needs to be bigger than zero.");
        
        Integer left = 0;
        
        for(;left<amount; left++) {
            try {
                // Throws an exception if value is lower than zero.
                this.setPassengers(this.getPassengers()-1);
            }catch(IllegalArgumentException exception) {
                break;
            }
        }
        
        return left;
    }
    
    /**
     * @return the amount of passengers.
     */
    public Integer getPassengers() {
        return this.passengers;
    }
    
    /**
     * @return the amount of seats.
     */
    public Integer getSeats() {
        return this.seats;
    }
    
    /**
     * @return the registration.
     */
    public String getRegistration() {
        return this.registration;
    }
    
    /**
     *  Sets the amount of passengers.
     *  @param passengers
     *  @throws IllegalArgumentException when invalid arguments are given obviously.
     */
    public void setPassengers(Integer passengers) {
        // Throws an exception if anything is wrong.
        Bus.checkPassengerSeats(passengers, this.getSeats());
        this.passengers = passengers;
    }
    
    /**
     *  Sets the amount of seats.
     *  @param seats
     *  @throws IllegalArgumentException when invalid arguments are given obviously.
     */
    public void setSeats(Integer seats) {
        // Throws an exception if anything is wrong.
        // Bus.checkConsistency(this.getPassengers(), this.seats=seats, this.getRegistration());
        Bus.checkPassengerSeats(this.getPassengers(), seats);
        this.seats=seats;
    }
    
    /**
     *  Sets the registration.
     *  @param registration
     *  @throws IllegalArgumentException when invalid arguments are given obviously.
     */
    public void setRegistration(String registration) {
        // Throws an exception if anything is wrong.
        Bus.checkRegistration(registration);
        this.registration=registration;
    }
    
    /**
     * Checks the passengers and seats.
     * @param passengers
     * @param seats
     * @throws IllegalArgumentException
     */
    private static void checkPassengerSeats(Integer passengers, Integer seats) {
        if(passengers<0||passengers>seats)throw new IllegalArgumentException("Amount of passengers is invalid. Needs to be bigger than 0 and lower than the amount of seats ("+seats+")");
    }
    
    /**
     * Checks the registration string.
     * @param registration
     * @throws IllegalArgumentException
     */
    private static void checkRegistration(String registration) {
        if(registration.length()==8) {
            final Integer[] upperCase = new Integer[]{0, 1, 5, 6, 7};
            for(Integer upper : upperCase) {
                if(!Character.isUpperCase(registration.charAt(upper)))throw new IllegalArgumentException("Registration is invalid. Letter at "+upper+" needs to be upper case.");
            }
            if(!Character.isDigit(registration.charAt(2))||!Character.isDigit(registration.charAt(3)))throw new IllegalArgumentException("Registration is invalid. Character at 2 & 3 need to be digits.");
            if(registration.charAt(4)!=' ')throw new IllegalArgumentException("Registration is invalid. On position 4 needs to be a space.");
        }else throw new IllegalArgumentException("Registration is invalid. Its length needs to be 8.");
    }
    
    /**
     *  Checks the given three values.
     *  @param passengers
     *  @param seats
     *  @param registration
     *  @throws IllegalArgumentException        If a value is invalid.
     */
    private static void checkConsistency(Integer passengers, Integer seats, String registration) {
        
        // Passengers & seats check
        Bus.checkPassengerSeats(passengers, seats);
        
        
        // Registration checks
        Bus.checkRegistration(registration);
    }
}

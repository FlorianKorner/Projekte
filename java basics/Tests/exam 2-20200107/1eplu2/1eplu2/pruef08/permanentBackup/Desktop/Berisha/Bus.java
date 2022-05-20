
/**
 * POS PLÜ 17.12.2019
 * 
 * @author Leon Berisha 
 * @version 17.12.2019
 */
public class Bus
{
    private int passengers;
    private int seats;
    private String registration;

    public Bus(int passengers, int seats, String registration) {
        this.passengers = passengers;
        this.seats = seats;
        this.registration = registration;    
    }

    public Bus() {
        this.passengers = 0;
        this.seats = 50;
        this.registration = "AB00 ABC";    
    }

    public void setPassengers(int passengers) {
        if (this.passengers >= 0 && this.seats >= this.passengers) {
            this.passengers = passengers;
        }
        else {
            System.out.println("Requirements not met!");

        }
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setSeats(int seats) {
        if (this.seats >= 0) {
            this.seats = seats;
        }
        else {
            System.out.println("You can't have below 0 seats!");
        }
    }

    public int getSeats() {
        return this.seats;
    }

    public void setRegistration(String registration) {
        if (this.registration != null) {
            this.registration = registration;
        }
       /* else if (this.registration = ´´) {
         this.registration = registration;   
        }
        */
        else {
            System.out.println("There is something wrong with the registration number.");
        }

    }

    public String getRegistration() {
        return this.registration;
    }

    public int enter(int number) {
        number = this.passengers;
        if(number < this.seats && number > 0) {
              this.passengers  = number + passengers;
              return passengers;
        }

        else {
            System.out.println("No more passengers can enter the bus!");   
        }
        return passengers;
    }
    
    public void checkConsistency() {
       
    } 
    
   
    
}



public class ABusStop
{
    private ABus b0;
    private ABus b1;
    private ABus b2;
    
    public ABusStop() {
        this.b0 = new ABus(0, 20, "MA73 EHI");
        this.b1 = new ABus();
        this.b2 = new ABus(12, 40, "YD34 HIF");
    }
    
    public ABus maxSteats() {
        ABus busWithMostSeats = null;
        
        if(this.b0.getSeats() > this.b1.getSeats() && this.b0.getSeats() > this.b2.getSeats()) {
            busWithMostSeats = this.b0;
        }
        else if(this.b1.getSeats() > this.b0.getSeats() && this.b1.getSeats() > this.b2.getSeats()) {
            busWithMostSeats = this.b1;
        }
        else if(this.b2.getSeats() > this.b1.getSeats() && this.b2.getSeats() > this.b0.getSeats()) {
            busWithMostSeats = this.b2;
        }
        
        return busWithMostSeats;
    }
    
    public int registrationStartsWith(String s) {
        int numberOfCars = 0;
        
        if(this.b0.getRegistration().startsWith(s)) {
            numberOfCars += 1;
        }
        if(this.b1.getRegistration().startsWith(s)) {
            numberOfCars += 1;
        }
        if(this.b2.getRegistration().startsWith(s)) {
            numberOfCars += 1;
        }
        
        return numberOfCars;
    }
    
    public int enter(int passengers) {
        int passengersEntered = 0;
        
        if(this.b0.getPassengers() <= this.b0.getSeats()) {
            passengersEntered = this.b0.getSeats() - this.b0.getPassengers();
            passengersEntered = passengers - passengersEntered; 
        }
        if(this.b1.getPassengers() <= this.b1.getSeats()) {
            passengersEntered = this.b1.getSeats() - this.b1.getPassengers();
            passengersEntered = passengers - passengersEntered; 
        }
        if(this.b2.getPassengers() <= this.b2.getSeats()) {
            passengersEntered = this.b2.getSeats() - this.b2.getPassengers();
            passengersEntered = passengers - passengersEntered; 
        }
        
        return passengersEntered;
    }
    
    public boolean getABus(int position) {
        if(this.b0 != null && position == 0) {
           
            return true;
        }
        else if(this.b1 != null && position == 1) {
            
            return true;
        }
        else if(this.b2 != null && position == 2) {

            return true;
        }
        else {
            return false;
        }
    }
    
  
    
    public boolean addBus(ABus b) {
        if(this.b0 == null) {
            this.b0 = b;
            return true;
        }
        else if(this.b1 == null)  {
            this.b1 = b;
            return true;
        }
        else if(this.b2 == null) {
            this.b2 = b;
            return true;
        }
        else {
            System.out.println("the stop might be full");
            return false;
        }
    }
    
    public boolean addBus(ABus b, int position) {
        if(this.b0 == null && position == 0) {
            this.b0 = b;
            return true;
        }
        else if(this.b1 == null&& position == 1)  {
            this.b1 = b;
            return true;
        }
        else if(this.b2 == null&& position == 2) {
            this.b2 = b;
            return true;
        }
        else {
            System.out.println("the stop might be full");
            return false;
        }
    }
    
    public ABus removeBus(int position) {
        ABus removedBus = null;
        if(this.b0 != null && position == 0) {
            this.b0 = null;
            removedBus = this.b0;
        }
        else if(this.b1 != null&& position == 1)  {
            this.b1 = null;
            removedBus = this.b1;
        }
        else if(this.b2 != null&& position == 2) {
            this.b2 = null;
            removedBus = this.b2;
        }
        return removedBus;
    }
    
    public ABus removeBus() {
        ABus removedBus = null;
        
        if(this.b0 != null ) {
             this.b0 = null;
             removedBus = this.b0;
        }
        else if(this.b1 != null)  {
             this.b1 = null;
             removedBus = this.b1;
        }
        else if(this.b2 != null) {
             this.b2 = null;
             removedBus = this.b2;
        }
        return removedBus;
    }
}

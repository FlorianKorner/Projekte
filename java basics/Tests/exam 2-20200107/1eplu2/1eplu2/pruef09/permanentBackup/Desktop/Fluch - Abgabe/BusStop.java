
/**
 * The BusStop class. A class from the exam
 * 
 * @author Dominik Fluch 
 * @version 1.0
 * 
 * INFO: I decided to use the Integer Object and not the datatype because I am more used to it. (I know that the Object needs more memory since it has reference And a place where it is saved to)
 * 
 */
public class BusStop {
    
    /**
     * All bus "slots"
     */
    private final Bus[] buses;
    
    /**
     * Creates the default bus stop.
     */
    public BusStop() {
        this.buses = new Bus[]{new Bus(0, 20, "MA73 EHI"), null, new Bus(12, 40, "YD34 HIF")};
    }
    
    /**
     * @return the bus with the highest amount of seats.
     */
    public Bus maxSeats() {
        Bus current = null;
        
        for(Bus bus : this.getBuses()) {
            if(bus==null)continue;
            
            // Also a null check inderectly.
            if(current==null||bus.getSeats()>current.getSeats()) current=bus;
        }
        
        return current;
    }
    
    /**
     * @param s
     * @return the amount of buses wiches registration starts with s.
     */
    public Integer registrationStartsWith(String s) {
        Integer amount = 0;
        for(Bus bus : this.getBuses()) {
            if(bus!=null&&bus.getRegistration().startsWith(s)) amount++;
        }
        return amount;
    }
    
    /**
     * Makes the given amount of people enter the bus.
     * @param amount
     * @return the amount that couldn't enter the bus.
     */
    public Integer enter(Integer amount) {
        
        Integer returner = 0;
        
        for(Bus bus : this.getBuses()) {
            if(bus==null)continue;
            Integer entered = bus.enter(amount);
            amount=amount-entered;
            returner=returner+entered;
            if(amount==0) break;
        }
        
        return returner;
    }
    
    /**
     * @param index
     * @return the bus at the given index or null if the given number is invalid or there is no bus at the given index.
     */
    public Bus getBus(Integer index) {
        if(index<0||index>=this.getBuses().length) return null;
        return this.getBuses()[index];
    }
    
    /**
     * Tries to add the given bus.
     * @param bus
     * return true if there was room for the given bus.
     */
    public Boolean addBus(Bus bus) {
        if(bus==null) {
            // throw new IllegalArgumentException("Given bus is null.");    - Needed to be commented since angabe ordered me to return false if something failed.
            return false;
        }
        
        // Check if bus is alredy inside the bus stop.
        for(Bus item : this.getBuses()) if(item==bus) return false;
        
        for(Integer i = 0; i<this.getBuses().length; i++) {
            if(this.getBuses()[i]==null) {
                // Could have called addBus(bus, index)     But it is more elegant to just set it since the checks would be have done twice.
                this.getBuses()[i]=bus;
                return true;
            }
        }
        return false;
    }
    
    /**
     * @param bus
     * @param index
     * @return true if the bus could be added.
     */
    public Boolean addBus(Bus bus, Integer index) {
        if(index<0||index>=this.getBuses().length) return null;
        
        if(bus==null) {
            // throw new IllegalArgumentException("Given bus is null.");    - Needed to be commented since angabe ordered me to return false if something failed.
            return false;
        }
        
        // Check if bus is alredy inside the bus stop.
        for(Bus item : this.getBuses()) if(item==bus) return false;
        
        if(this.getBuses()[index]==null){
            this.getBuses()[index]=bus;
            return true;
        }else return false;
        
    }
    
    /**
     * Removes the bus in the first slot that is filled.
     * @return the removed bus or null.
     */
    public Bus removeBus() {
        for(Integer i = 0; i<this.getBuses().length; i++) {
            if(this.getBuses()[i]!=null) {
                final Bus bus = this.getBuses()[i];
                this.getBuses()[i]=null;
                return bus;
            }
        }
        return null;
    }
    
    /**
     * Removes the bus at the given index.
     * @param index
     * @param the removed bus or null.
     * @return the removed bus or null.
     */
    public Bus removeBus(Integer index) {
        if(index<0||index>=this.getBuses().length) return null;
        
        if(this.getBuses()[index]!=null) {
            final Bus bus = this.getBuses()[index];
            this.getBuses()[index]=null;
            return bus;
        }
        
        return null;
    }
    
    /**
     * @return the bus slots.
     */
    public Bus[] getBuses() {
        return buses;
    }
}

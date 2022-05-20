public class Bus {
    
    private int passengers;
    private int seats;
    private String registration;
    
    public Bus(int passengers, int seats, String registration) {
        if (checkConsistency(passengers, seats, registration)) {
            this.passengers = passengers;
            this.seats = seats;
            this.registration = registration;
        } else {
            System.out.println("ERROR\nThe given constructor parameters are not valid.");
            this.passengers = 0;
            this.seats = 50;
            this.registration = "AB00 ABC";
        }
    }
    
    public Bus() {
        this.passengers = 0;
        this.seats = 50;
        this.registration = "AB00 ABC";
    }
    
    public void setPassengers(int passengers) {
        if (checkConsistency(passengers, this.seats, this.registration)) {
            this.passengers = passengers;
        } else {
            System.out.println("");
            this.passengers = 0;
        }
    }
    public int getPassengers() {
        return passengers;
    }
    
    public void setSeats(int seats) {
       if (checkConsistency(this.passengers, seats, this.registration)) {
            this.seats = seats;
       } else {
            System.out.println("");
            this.seats = 50;
       } 
    }
    public int getSeats() {
        return seats;
    }
    
    public void setRegistration(String registration) {
       if (checkConsistency(this.passengers, this.seats, registration)) {
            this.registration = registration;
       } else {
            System.out.println("");
            this.registration = "AB00 ABC";
       } 
    }
    public String getRegistration() {
        return registration;
    }
    
    private boolean isUpperCase(char i) {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".contains(""+i);
    }
    
    private boolean isDigit(char i) {
        return "1234567890".contains(""+i);
    }
    
    public boolean checkConsistency(int passengers, int seats, String registration) {
        if (registration == null || registration.length() != 8) {
            System.out.println("ERROR\nThe registration is either null or is not 7 characters long.");
            return false;
        }
        if (seats <= 0) {
            System.out.println("ERROR\nInvalid seats. The seats have to above 0.");
            return false;
        }
        if (!(passengers >= 0) || !(passengers <= seats)) {
            System.out.println("ERROR\nInvalid passengers. The passengers have to be above 0.");
            return false;
        }
        if (!(isUpperCase(registration.charAt(0)) && isUpperCase(registration.charAt(1)) && isUpperCase(registration.charAt(5)) && isUpperCase(registration.charAt(6)) 
            && isUpperCase(registration.charAt(7)))) {
            System.out.println("ERROR\nInvalid registration. Characters 0, 1, 5, 6 and 7 have to be upper case.");
            return false;
        }
        if (!(isDigit(registration.charAt(2)) && isDigit(registration.charAt(3)))) {
            System.out.println("ERROR\nInvalid registration. Characters 2 and 3 have to be digits.");
            return false;
        }
        if (!" ".equals(""+registration.charAt(4))) {
            System.out.println("ERROR\nInvalid registration. Character 4 has to be a space.");
            return false;
        }
        
        return true;
    }
    
    public int enter(int i) {
        if (i < 0) {
            System.out.println("ERROR\nInvalid entering. The number of people entering has to be greater than 0.");
            return 0;
        }
        int freeSpace = seats - passengers;
        int amount = seats - passengers - i;
        if (amount < 0) {
            setPassengers(seats);
            return freeSpace;
        }
        setPassengers(passengers + i);
        return i;
    }
    public int exit(int i) {
        if (i < 0) {
            System.out.println("ERROR\nInvalid entering. The number of people entering has to be greater than 0.");
            return 0;
        }
        int amount = passengers - i;
        
        if (amount <= 0) {
            setPassengers(0);
            return i;
        }
        setPassengers(amount);
        return amount;
    }
    
    public void print() {
        System.out.println("-- BUS --");
        System.out.println("Passengers: " + passengers);
        System.out.println("Seats: " + seats);
        System.out.println("Registration: " + registration);
    }
}
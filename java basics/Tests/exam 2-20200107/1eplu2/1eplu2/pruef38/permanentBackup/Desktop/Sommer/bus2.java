public class Bus {
    private int seats;
    private int passengers;
    private String registration;
    
    public Bus() {
        this(50, 0, "AB00 ABC"); 
    }
    
    public Bus(int seats, int passengers, String registration) {
        if (checkConsistency(seats, passengers, registration)) {
            this.seats = seats;
            this.passengers = passengers;
            this.registration = registration;
        }
        
        else {
            System.out.println("Invalid variables!");
            setSeats(50);
            setPassengers(0);
            setRegistration("AB00 ABC");
        }    
    }
    
    public void setSeats(int seats) {
        if (checkConsistency(seats, passengers, registration))
            this.seats = seats;
        else
            this.seats = 50;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public void setPassengers(int passengers) {
        if (checkConsistency(seats, passengers, registration))
            this.passengers = passengers;
        else
            this.passengers = 0;
    }
    
    public int getPassengers() {
        return passengers;
    }
    
    public void setRegistration(String registration) {
        if (checkConsistency(seats, passengers, registration))
            this.registration = registration;
        else
            this.registration = "AB00 ABC";
    }
    
    public String getRegistration() {
        return registration;
    }
    
    public boolean checkConsistency(int seats, int passengers, String registration) {
        if (seats < 0) {
            System.out.println("There must be > 0 seats!");
            return false;
        }
        
        if (passengers < 0) {
            System.out.println("There must be > 0 passengers!");
            return false;
        }
        if (passengers > seats) {
            System.out.println("The number of passengers must be <= seats!");
            return false;
        }
        
        if (registration.length() != 8) {
            System.out.println("The length of the registration must be 8!");
            return false;
        }
        if (!"ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(0,1))) {
            System.out.println("Char at 0 must be uppercase!");
            return false;
        }
        if (!"ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(1,2))) {
            System.out.println("Char at 1 must be uppercase!");
            return false;
        }
        if (!"ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(5,6))) {
            System.out.println("Char at 5 must be uppercase!");
            return false;
        }
        if (!"ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(6,7))) {
            System.out.println("Char at 6 must be uppercase!");
            return false;
        }
        if (!"ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(7,8))) {
            System.out.println("Char at 7 must be uppercase!");
            return false;
        }
        if (!"0123456789".contains(registration.substring(2,3))) {
            System.out.println("Char at 2 must be a number!");
            return false;
        }
        if (!"0123456789".contains(registration.substring(3,4))) {
            System.out.println("Char at 3 must be a number!");
            return false;
        }
        if (registration.substring(4,5).equals(" ")) {
            System.out.println("Char at 4 must be a space!");
            return false;
        }
        return true;
    }
    
    public boolean checkConsistency2(int seats, int passengers, String registration) {
        if (seats < 0) {
            System.out.println("There must be > 0 seats!");
            return false;
        }
        
        if (passengers < 0) {
            System.out.println("There must be > 0 passengers!");
            return false;
        }
        if (passengers > seats) {
            System.out.println("The number of passengers must be <= seats!");
            return false;
        }
        
        if (registration.length() != 8) {
            System.out.println("The length of registration must be 8!");
            return false;
        }
        if (!"ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(0,1))) {
            System.out.println("Char at 0 must be uppercase!");
            return false;
        }
        if (!registration.substring(1,2).equals(registration.substring(1,2).toUpperCase())) {
            System.out.println("Char at 1 must be uppercase!");
            return false;
        }
        if (!registration.substring(5,6).equals(registration.substring(5,6).toUpperCase())) {
            System.out.println("Char at 5 must be uppercase!");
            return false;
        }
        if (!registration.substring(6,7).equals(registration.substring(6,7).toUpperCase())) {
            System.out.println("Char at 6 must be uppercase!");
            return false;
        }
        if (!registration.substring(7,8).equals(registration.substring(7,8).toUpperCase())) {
            System.out.println("Char at 7 must be uppercase!");
            return false;
        }
        if ("ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(2,3)))
            return false;
        if ("ABCDEFGHIJKLMONPQRSTUVWXYZÖÜÄ".contains(registration.substring(3,4)))
            return false;
        if (registration.indexOf(" ") != 4)
            return false;
           
        return true;
    }
    
    public int enter(int number) {
        int peopleEntered = 0;
        if (number > 0) {
            if (getPassengers() + number <= getSeats()) {
                peopleEntered = number;
                setPassengers(getPassengers() + number);
            }
            if (getPassengers() + number > getSeats()) {
                peopleEntered = getSeats() - getPassengers();
                setPassengers(getSeats());
            }
        }
        return peopleEntered;
    }
    
    public int exit(int number) {
        int peopleLeft = 0;
        if (number > 0) {
            if (getPassengers() - number >= 0) {
                peopleLeft = number;
                setPassengers(getPassengers() - number);
            }
            if (getPassengers() - number < 0) {
                peopleLeft = getPassengers();
                setPassengers(0);
            }
        }
        return peopleLeft;
    }
    
    public void print() {
        System.out.println("There are " + getSeats() + " seats.");
        System.out.println("There are " + getPassengers() + " passengers.");
        System.out.println("The registration number is: " + getRegistration());
    }
}
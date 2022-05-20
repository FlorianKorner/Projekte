public class Bus {
    private int passengers;
    private int seats;
    private String registration;
    //constructor with parameters
    public Bus(int passengers, int seats, String registration) {
        if(checkConsistency(passengers,seats,registration)) {
            this.passengers = passengers;
            this.seats = seats;
            this.registration = registration;
        }
    }
    //default constructor
    public Bus() {
        this.passengers = 0;
        this.seats = 50;
        this.registration = "AB00 ABC";
    }

    public boolean checkConsistency(int passengers, int seats, String registration) {
        if(passengers < 0 || passengers > seats) {
            this.passengers = 0;
            return false;
        }
        if(seats < 0) {
            this.seats = 50;
            return false;
        }
        if(registration.length() != 8) {
            return false;
        }
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.substring(0,1)) != -1 &&
        "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.substring(1,2)) != -1 && 
        "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.substring(5,6)) != -1 &&
        "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.substring(6,7)) != -1 &&
        "ABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ".indexOf(registration.substring(7,8)) != -1 &&
        " ".indexOf(registration.substring(4,5)) != -1 && 
        "0123456789".indexOf(registration.substring(2,3)) != -1 &&
        "0123456789".indexOf(registration.substring(3,4)) != -1) {
            return true;
        }
        else {
            return false;
        }
    } 

    public void setPassengers(int passengers) {
        if(checkConsistency(passengers,seats,registration)) {
            this.passengers = passengers;
        }
    }

    public void setSeats(int seats) {
        if(checkConsistency(passengers,seats,registration)) {
            this.seats = seats;
        }
    }

    public void setRegistration(String registration) {
        if(checkConsistency(passengers,seats,registration)) {
            this.registration = registration;
        }
    }

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
        if(number < 0) {
            System.out.println("number is smaller than 0");
            return 0;
        }
        if(checkConsistency((this.passengers + number),seats,registration)) {
            this.passengers += number;
        } 
        else {
            number = this.seats - this.passengers;
            this.passengers = this.seats;
        }
        return number;
    }

    public int exit(int number) {
        if(number < 0) {
            System.out.println("number is smaller than 0");
            return 0;
        }
        if(checkConsistency((this.passengers - number),seats,registration)) {
            this.passengers -= number;
        } 
        else {
            number = this.passengers;
            this.passengers = 0;
        }
        return number;
    }

    public void print() {
        System.out.println("Bus:");
        System.out.println("passengers: "+ passengers);
        System.out.println("seats: "+ seats);
        System.out.println("registration number: "+ registration);
    }
    
    public boolean equals(Bus b) {
        if(b == null) {
            return false;
        }
        if(b.getPassengers() == passengers && b.getSeats() == seats &&
        b.getRegistration() == registration) {
            return true;
        }
        return false;
    }
}

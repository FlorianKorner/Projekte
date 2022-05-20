public class Bus{
    private int passengers;
    private int seats;
    private String registration;

    public Bus(){
        this(0, 50, "AB00 ABC");
    }

    public Bus(int passengers, int seats, String registration){
        if(check(passengers, seats, registration)){
            this.passengers = passengers;
            this.seats = seats;
            this.registration = registration;
        }
        else{
            this.passengers = 0;
            this.seats = 50;
            this.registration = "AB00 ABC";
            System.out.println("Error. Invalid inputs");
        }
    }
    
    public int enter(int number){
        if(!(number > 0)) return 0;
        int save = 0;
        if(number >(getSeats() - getPassengers())){
            save = getSeats() - getPassengers();
            setPassengers(getSeats());
            return save;
        }
        else{
            setPassengers(getPassengers() + number);
            return number;
        }
    }
    
    public int exit(int number){
        if(!(number > 0)) return 0;
        int save = 0;
        if(number >getPassengers()){
            save = getPassengers();
            setPassengers(0);
            return save;
        }
        else{
            setPassengers(getPassengers() - number);
            return number;
        }
    }
    
    public boolean check(int passengers, int seats, String registration){
        if(!(seats >= 0)) return false;
        if(!(passengers <= seats && passengers >= 0)) return false;
        if(!("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(registration.charAt(0)) != -1)) return false;
        if(!("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(registration.charAt(1)) != -1)) return false;
        if(!("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(registration.charAt(5)) != -1)) return false;
        if(!("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(registration.charAt(6)) != -1)) return false;
        if(!("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(registration.charAt(7)) != -1)) return false;
        if(!("1234567890".indexOf(registration.charAt(2)) != -1)) return false;
        if(!("1234567890".indexOf(registration.charAt(3)) != -1)) return false;
        if(!(" ".indexOf(registration.charAt(4)) != -1)) return false;
        if(!(registration.length() == 8)) return false;

        return true;
    } 

    public void setPassengers(int passengers){
        if(check(passengers, getSeats(), getRegistration()))
            this.passengers = passengers;
        else
            this.passengers = 0;

    }

    public void setSeats(int seats){
        if(check(getPassengers(), seats, getRegistration()))
            this.seats = seats;
        else
            this.seats = 50;
    }

    public void setRegistration(String registration){
        if(check(getPassengers(), getSeats(), registration))
            this.registration = registration;
        else
            this.registration = "AB00 ABC";
    }

    public int getSeats(){
        return seats;
    }

    public int getPassengers(){
        return passengers;
    }

    public String getRegistration(){
        return registration;
    }
    
    public void print(){
        System.out.println("There are " + getSeats() + " seats and " + getPassengers() + " on the bus, its registration is: " + getRegistration());
    }
}
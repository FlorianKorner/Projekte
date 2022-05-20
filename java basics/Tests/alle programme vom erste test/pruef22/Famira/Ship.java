public class Ship {
    //fields
    String name;
    double speed; //in knots (=nautical miles per hour)
    int numberOfMasts;
    boolean hasGuns;
    //constructors that use the setters
    //constructor without parameters
    public Ship() {
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGuns(false);
    }
    //constructor with 4 parameters
    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns) {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    }
    //constructor with 2 parameters
    public Ship(String newName, int newNumberOfMasts) {
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }
    //setters for all fields with parameter checks
    //setter for name
    public void setName(String newName) {
        if(newName == "") {
            name = "unnamed";
            System.out.println("This Ship was not named/named: " + newName);
        }
        else {
            name = newName;
        }
    }
    //setter for speed
    public void setSpeed(double newSpeed) {
        if(newSpeed < 0.0) {
            speed = 0.0;
            System.out.println("Speed must not be negative!");
        }
        else {
            speed = newSpeed;
        }
    }
    //setter for numberOfMasts
    public void setNumberOfMasts(int newNumberOfMasts) {
        if(newNumberOfMasts <= 0 || newNumberOfMasts > 4) {
            numberOfMasts = 1;
            System.out.println("There have to be 1 - 4 masts! Not: " + newNumberOfMasts);
        }
        else {
            numberOfMasts = newNumberOfMasts;
        }
    }
    //setter for hasGuns
    public void setHasGuns(boolean newHasGuns) {
        hasGuns = newHasGuns;
    }
    //getters for all fields
    //getter for name
    public String getName() {
        return name;
    }
    //getter for speed
    public double getSpeed() {
        return speed;
    }
    //getter for numberOfMasts
    public int getNumberOfMasts() {
        return numberOfMasts;
    }
    //getter for hasGuns
    public boolean getHasGuns() {
        return hasGuns;
    }
    //methods to speed up the ship or to slow it down
    //method to speed the ship up by 1 knot
    public void speedup() {
        speed = speed + 1.0;
    }
    //method to slow the ship down by one knot
    public void slowdown() {
        if(speed - 1.0 < 0) {
            speed = 0.0;
            System.out.println("Speed cannot be reduced by 1 as it is lower than 1. " + 
            "It was set to 0.0.");
        }
        else {
            speed = speed - 1.0;
        }
    }
    //print method
    public void print() {
        System.out.println("The name of the ship is: " + getName() + ".");
        System.out.println("The speed of the ship is: " + getSpeed() + " knots.");
        System.out.println("The ship has " + getNumberOfMasts() + " masts.");
        if(getHasGuns() == true) {
            System.out.println("The ship has Guns.");
        }
        else {
            System.out.println("The ship is not equipped with Guns.");
        }
    }
}

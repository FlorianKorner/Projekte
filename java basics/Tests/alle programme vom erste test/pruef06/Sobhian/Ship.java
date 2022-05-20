
public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
    
    //constructors
    public Ship() {
        name=("Mary Celeste");
        speed=0.0;
        numberOfMasts=2;
        hasGuns=false;
    }
    
    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns) {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    }
    
    public Ship(String newName, int newNumberOfMasts) {
        setName(newName);
        speed=0.0;
        setNumberOfMasts(newNumberOfMasts);
        hasGuns=false;
    }
    
    
    //setter and getter
    
    public void setName(String newName) {
        if (newName != null)
        name=newName;
        else
        System.out.println("The input was invalid.");
        name="Mary Celeste";
    }
    public void setSpeed(double newSpeed) {
        if(newSpeed<400)
        speed=newSpeed;
        else
        speed=0;
        System.out.println("input not accepted(number too big)");
    }
    public void setNumberOfMasts(int newNumberOfMasts) {
        if(newNumberOfMasts < 15)
        numberOfMasts=newNumberOfMasts;
        else
        System.out.println("Your input was invalid.");
    }
    public void setHasGuns(boolean newHasGuns) {
        hasGuns=newHasGuns;
    }
    
    
    public String getName() {
        return name;
    }
    public double getSpeed() {
        return speed;
    }
    public int getNumberOfMasts() {
        return numberOfMasts;
    }
    public boolean getHasGuns() {
        return hasGuns;
    }
    
    //extra methods
    
    public void speedup() {
        speed=speed+1;
    }
    
    public void slowdown() {
        if(speed >= 1)
        speed=speed-1;
        else
        System.out.println("You can't decrease the speed anymore as you are standing still.");
        speed=3;
    }
    
    public void print() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("**** Ship ****");
        System.out.println("The name of the ship is " + name + ".");
        System.out.println("The speed of the ship is " + speed + ".");
        System.out.println("The ship has " + numberOfMasts + " masts.");
        if(hasGuns == true)
        System.out.println("The ship has guns.");
        else
        System.out.println("The ship has no guns.");
    }
}

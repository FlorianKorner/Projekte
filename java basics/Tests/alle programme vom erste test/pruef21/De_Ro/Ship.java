
public class Ship
{
    //fields
    public String name;
    public double speed;
    public int numberOfMast;
    public boolean hasGuns;
    
    //constructors
    public Ship() {
        
        name = "Mary Celeste";
        speed = 0.0;
        numberOfMast = 2;
        hasGuns = false;
    }
    
    public Ship(String newName, double newSpeed, int newNumberOfMast, boolean newHasGuns) {
    
        name = newName;
        speed = newSpeed;
        numberOfMast = newNumberOfMast;
        hasGuns = newHasGuns;
    }
    
    //getters
    public String getName() {
    
        return name;
    }
    public double getSpeed() {
    
        return speed;
    }
    public int getNumberOfMast() {
    
        return numberOfMast;
    }
    public boolean getHasGuns() {
    
        return hasGuns;
    }
    
    //setters
    public void setName(String newName) {
        
        if(newName == null) {
            System.out.println("name can must be something");
            name = "Mary Celeste";
        }
        else {
            name = newName;
        }
    }
    public void setSpeed(double newSpeed) {
        
        if(newSpeed < 0.0) {
            System.out.println("speed must be greater or equal 0.0");
            speed = 0.0;
        }
        else {
            speed = newSpeed;
        }
    }
    public void setNumberOfMast(int newNumberOfMast) {
        if(newNumberOfMast >= 0.0 && newNumberOfMast <= 4) {
            System.out.println("the number of the masts must be greater then 0 and smaler then 4");
            numberOfMast = 2;
        }
        numberOfMast = newNumberOfMast;
    }
    public void setHasGuns(boolean newHasGuns) {
    
        hasGuns = newHasGuns;
    }
    
    //speedup & slowdown
    public void speedup(double newSpeed) {
        
        speed = speed + 1;
    }
    public void slowdown(double newSpeed) {
    
        speed = speed - 1;
    }
    
    public void print() {
    
        System.out.println("The ship's name is " + getName() + " and it can go " + getSpeed() + " nautical miles per hour. It has " + getNumberOfMast()
        + " masts." + " Does it have guns: " + getHasGuns());
    }
}

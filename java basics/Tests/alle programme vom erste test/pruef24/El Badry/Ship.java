public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
    // constructor with no parameters
    public Ship()
    {
        this.name = "Mary Celeste";
        this.speed = 0.0;
        this.numberOfMasts = 2;
        this.hasGuns = false;
    }
    
    // constructor with 4 parameters
    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    }
    
    // constructor 3
    public Ship(String newName, int newNumberOfMasts)
    {
        setName(newName);
        setNumberOfMasts(newNumberOfMasts);
        this.speed = 0.0;
        this.hasGuns = false;
    }
    
    // setters
    public void setName(String newName)
    {
        if (newName == "0" || newName == "")
        {
            name = "Mary Celeste";
        }
        else
        {
            name = newName;
        }
    }
    
    public void setSpeed(double newSpeed)
    {
        if (newSpeed >= 0.0)
        {
            speed = newSpeed;
        }
        else
        {
            speed = 0.0;
        }
    }
    
    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if (newNumberOfMasts > 0 && newNumberOfMasts <= 4)
        {
            numberOfMasts = newNumberOfMasts;
        }
        else
        {
            numberOfMasts = 2;
        }
    }
    
    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns = newHasGuns;
    }
    
    // getters
    public String getName()
    {
        return name;
    }
    
    public double getSpeed()
    {
        return speed;
    }
    
    public int getNumberOfMasts()
    {
        return numberOfMasts;
    }
    
    public boolean getHasGuns()
    {
        return hasGuns;
    }
    
    // methods
    public double getSpeedUp()
    {
        double newSpeedUp;
        newSpeedUp = getSpeed() + 1;
        return newSpeedUp;
    }
    
    public double getSlowDown()
    {
        if (getSpeed() - 1 >= 0.0)
        {
            double setSlowDown = 1;
            return getSpeed() - setSlowDown;
        }
        else
        {
            return getSpeed();
        }
    }
    
    // print
    public void printInfo()
    {
        System.out.println("The ship " + getName() + " has a speed of " + getSpeed() + ", " + getNumberOfMasts() + " masts and that is has guns is " + getHasGuns());
    }
}
        
    
    
    
    
        
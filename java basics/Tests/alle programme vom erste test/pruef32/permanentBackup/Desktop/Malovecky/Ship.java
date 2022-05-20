public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
    public void setName(String newName)
    {
        if(newName != null && newName.length() > 0)
        {
            name=newName;
        }
        else
        {
            System.out.println("False input in setName");
            name = "Mary Celeste";
        }
    }
    public String getName()
    {
        return name;
    }
    
    public void setSpeed(double newSpeed)
    {
        if(newSpeed >= 0.0)
        {
            speed=newSpeed;
        }
        else
        {
            System.out.println("False input in setSpeed");
            speed= 0.0;
        }
    }
    public double getSpeed()
    {
        return speed;
    }
    
    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if(newNumberOfMasts > 0 && newNumberOfMasts <= 4)
        {
            numberOfMasts = newNumberOfMasts;
        }
        else
        {
            System.out.println("False input in setNumberOfMasts");
            numberOfMasts = 2;
        }
    }
    public int getNumberOfMasts()
    {
        return numberOfMasts;
    }
    
    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns = newHasGuns;
    }
    public boolean getHasGuns()
    {
        return hasGuns;
    }
    
    public Ship()
    {
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGuns(false);
    }
    
    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    }
    
    public Ship(String newName, int newNumberOfMasts)
    {
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }
    
    public void speedup()
    {
        speed = Math.abs(speed + 1);
    }
    
    public void slowdown()
    {
        if(speed>1)
        {
            speed = speed - 1;
        }      
    }
    
    public void print()
    {
        System.out.println("Name of the ship:" + getName());
        System.out.println("Speed of the ship:" + getSpeed());
        System.out.println("Number Of the Masts:" + getNumberOfMasts());
        if(getHasGuns() == true)
        {
            System.out.println("The ship has got guns.");
            
        }
        else
        {
            System.out.println("The ship has got no guns.");
        }
    }
}

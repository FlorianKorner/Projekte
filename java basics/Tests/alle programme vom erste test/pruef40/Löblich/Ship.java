public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
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
    
    public Ship (String newName, int newNumberOfMasts)
    {
        setName(newName);
        setNumberOfMasts(newNumberOfMasts);
        setSpeed(0.0);
        setHasGuns(false);
    }
    
    public void setName(String newName)
    {
        if(newName != null && newName.length() > 0-0)
        {
            name = newName;
        }
        else
        {
            System.out.println("Wrong parameter in setName:" + newName);
            name = "Ariadne";
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
            speed = newSpeed;
        }
        else
        {
            System.out.println("Wrong parameter in setSpeed:" + newSpeed);
            speed = 50.0;
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
            System.out.println("wrong parameter in setNumberOfMasts :" + newNumberOfMasts);
            numberOfMasts = 3;
        }
    }
    
    public int getNumberOfMasts()
    {
        return numberOfMasts;
    }
    
    public void setHasGuns( boolean newHasGuns)
    {
        hasGuns = newHasGuns;
    }
    
    public boolean getHasGuns()
    {
        return hasGuns;
    }
    
    public void speedup()
    {
        speed = speed + 1;
    }
    
    public void slowdown()
    {
        if((speed -1)  < 0.0 )
        {
            System.out.println("Speed cant be lower than 0.0");
        }
        else
        {
            speed = speed - 1;
            System.out.println("new speed is :" + speed );
        }
    }
    
    public void print()
    {
        System.out.println("The name of the ship is :" + getName());
        System.out.println("The speed of the ship is :" + getSpeed());
        System.out.println("The number of masts on the ship is :" + getNumberOfMasts());
        if(hasGuns)
        {
            System.out.println("The ship has guns");
        }
        else
        {
            System.out.println("The ship doesnt have guns");
        }
    }
    
}
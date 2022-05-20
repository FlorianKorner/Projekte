public class Ship
{ 

    // these are the given fields.

    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;

    // this is a default constructor.

    public Ship() 
    {
        name = "Mary Celeste";
        speed = 0.0;
        numberOfMasts = 2;
        hasGuns = false;
    }

    // this is a constructor with parameters.

    public Ship( String newName,double newSpeed,int newNumberOfMasts, boolean newHasGuns) 
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);

    }

    // this is a constructor with only 2 parameters.

    public Ship(String newName, int newNumberOfMasts) 
    {
        setName(newName);
        speed = 0.0;
        setNumberOfMasts(newNumberOfMasts);
        hasGuns = false;

    }

    public void setName( String newName)
    {
        if (newName != null && newName != "")
            name = newName;
        else 
        {
            System.out.println(" ERROR in setName");
            name = "unknown";
        }
    }

    public void setSpeed( double newSpeed)
    {
        if ( newSpeed >= 0.0)
            speed = newSpeed;
        else
        {
            System.out.println(" ERROR in setSpeed");
            speed = 0.1;
        }
    }

    public void setNumberOfMasts(int newNumberOfMasts)
    { 
        if (newNumberOfMasts > 0 && newNumberOfMasts <= 4)
            numberOfMasts = newNumberOfMasts;
        else
        {
            System.out.println(" ERROR in setNumberOfMasts");
            numberOfMasts = 0;
        }
    }

    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns = newHasGuns;
    }

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

    public void speedup()
    {
        speed = speed+1.0;
    }

    public void slowdown()
    { 
        if (speed >= 1.0)
            speed = speed-1.0;
        else
        {
            System.out.println(" Speed is to low");
            speed = 0.0;
        }
    }

    public void printInfo() 
    {
        System.out.println(" The ships name is: " + getName() + ".");
        System.out.println(" It drives with a speed of " + getSpeed() + " knotes.");
        System.out.println(" It has " + getNumberOfMasts() + " Masts. " );

        if ( getHasGuns() == true )
            System.out.println(" It has guns on board. ");
        else
        {
            System.out.println(" It has no guns on board. ");
        }
    }
}


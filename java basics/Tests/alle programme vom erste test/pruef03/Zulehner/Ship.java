
public class Ship
{
    private String name;
    private double speed; // in nautical miles per hour
    private int numberOfMasts;
    private boolean hasGuns;

    public Ship()
    {
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGuns(false);
    }

    public Ship( String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    } 

    public Ship ( String newName, int newNumberOfMasts)
    {
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }

    public void setName ( String newName)
    {if (newName == null || "empty" )
            System.out.println("Error1");
        else
            name = newName;
    }

    public void setSpeed( double newSpeed)
    {if(newSpeed >= 0)
            speed = newSpeed;
        else
            System.out.println("Error2");
    }

    public void setNumberOfMasts( int newNumberOfMasts)
    {if(newNumberOfMasts > 0 && newNumberOfMasts <= 4)
            numberOfMasts = newNumberOfMasts;
        else 
            System.out.println("Error3");
    }

    public void setHasGuns ( boolean newHasGuns)
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
        speedup = speed+1;   
    }

    public void slowdown()
    {if (speed > 0.0)
            slowdown = speed-1 ;
        else 
            System.out.println("Error4");
    }

    public void print()
    {
        System.out.println("The name of the ship is:" + getName());
        System.out.println("The speed is :" + getSpeed());
        System.out.println("The number of masts is:" + getNumberOfMasts());
        System.out.println("The person has a gun:" + getHasGuns());
    }

}
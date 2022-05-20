
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

    public Ship(String newName, double newSpeed, int newNumberOfMasts)
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }

    public Ship(double newSpeed,boolean newHasGuns)
    {
        setSpeed(0.0);
        setHasGuns(false);
    }

    public void setSpeed(double newSpeed)
    {
        speed=newSpeed;
    }

    public double getSpeed()
    {
        if(speed >= 0.0 )
        {
            return speed;
        }
        else
        {
            System.out.println("Error 1");
            return -1;
        }
    }

    public void setName(String newName)
    {
        name=newName;

    }

    public String getName()
    {

        return name;
    }

    public void setNumberOfMasts(int newNumberOfMasts)
    {
        numberOfMasts=newNumberOfMasts;
    }

    public int getNumberOfMasts()
    { 
        if(numberOfMasts > 0 && numberOfMasts <= 4)
        {
            return numberOfMasts;
        }
        else
        {
            System.out.println("Error 5");
            return 5;
        }
    }

    
    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns=newHasGuns;
    }

    public boolean getHasGuns()
    {
        return hasGuns;
    }

    public double getSpeedup()
    {
        if(speed > 0.0)
        {    
            return speed + 1.0;
        }
        else
        {
            System.out.println("Error 2");
            return 187;
        }
    }

    public double getSlowdown()
    {
        if(speed > 0.0)
        {
            return speed-1.0;
        }
        else
        {
            System.out.println("Error 3");
            return 287;

        }
    }

    public void print()
    {
        System.out.println("#############");
        System.out.println("Speed:" + getSpeed());
        System.out.println("Slowdown:" + getSlowdown());
        System.out.println("Speed up:" + getSpeedup());
        System.out.println("#############");
    }
}

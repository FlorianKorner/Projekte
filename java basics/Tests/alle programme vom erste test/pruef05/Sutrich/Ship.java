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
        setnumberOfMasts(2);
        sethasGuns(false);
    }

    public Ship(String newName, double newSpeed, int newnumberOfMasts, boolean newhasGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setnumberOfMasts(newnumberOfMasts);
        sethasGuns(newhasGuns);
    }

    public Ship(String newName, int newnumberOfMasts)
    {
        setName(newName);
        setnumberOfMasts(newnumberOfMasts);
        setSpeed(0.0);
        sethasGuns(false);
    }

    public void setName(String newName)
    {
        if(newName == "null")
        {
            System.out.println("Error in setName!");
            setName("Mary Celeste");
        }
        else
        {
            name= newName;
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
            System.out.println("Error in setSpeed!");
            setSpeed(0.0);
        }
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setnumberOfMasts(int newnumberOfMasts)
    {
        if(newnumberOfMasts >= 0 && newnumberOfMasts <= 4)
        {
            numberOfMasts = newnumberOfMasts;
        }
        else
        {
            System.out.println("Error in setnumberOfMasts!");
            setnumberOfMasts(2);
        }
    }

    public int getnumberOfMasts()
    {
        return numberOfMasts;
    }

    public void sethasGuns(boolean newhasGuns)
    {
        hasGuns = newhasGuns;                
    }

    public boolean gethasGuns()
    {
        return hasGuns;
    }

    public void speedup()
    {
        speed = speed + 1;
    }

    public void slowdown()
    {
        if(speed > 0.0)
        {
            speed = speed - 1;
        }
        else
        {
            System.out.println("Speed is already 0.0!");
            setSpeed(0.0);
        }
    }
    
    public void print()
    {
        System.out.println("**************** Data of Ship ****************");        
        System.out.println("The Ship's name is: " + getName());
        System.out.println("The Ship currently drives with a speed of: " + getSpeed() + " knots.");
        System.out.println("The Ship has " + getnumberOfMasts() + " masts.");
        if(hasGuns == true)
        {
            System.out.println("The ship has guns!");
        }
        else
        {
            System.out.println("The ship has no guns!");
        }
    }

}
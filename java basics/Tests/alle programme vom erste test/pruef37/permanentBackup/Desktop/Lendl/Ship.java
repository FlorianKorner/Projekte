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

    public Ship(String newName, int newNumberOfMasts)
    {
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }

    public void setName(String newName)
    {
        if(newName == null)
        {
            System.out.println("Error 567; Please set name");
            name = "Mary Celeste";
        }
        else
        {
            name = newName;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setSpeed(double newSpeed)
    {
        if(newSpeed >= 0)
        {
            speed = newSpeed;
        }
        else
        {
            System.out.println("Error 234; Ship must move!");
            speed = 2;
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
            System.out.println("Error 132; a ship can only have between 1 and 4 masts!");
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

    public void speedup()
    {
        speed = speed + 1;
    }

    public void slowdown()
    {
        if((speed - 1) >= 0)
        {
            speed = speed - 1;
        }
        else
        {
            speed = 0;
        }
    }

    public void print()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name of the ship: " + getName());
        System.out.println("Speed of the ship: " + getSpeed() + "knots");
        System.out.println("Number of masts on the ship: " + getNumberOfMasts());
        if(hasGuns)
        {
            System.out.println("The " + getName() + " has guns on board");
        }
        else
        {
            System.out.println("The " + getName() + " has no guns on board");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
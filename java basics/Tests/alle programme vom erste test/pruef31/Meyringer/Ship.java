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
        name = newName;
        speed = newSpeed;
        numberOfMasts = newNumberOfMasts;
        hasGuns = newHasGuns;
    }

    public Ship(String newName, int newNumberOfMasts)
    {
        name = newName;
        setSpeed(0.0);
        numberOfMasts = newNumberOfMasts;
        setHasGuns(false);
    }

    public void setName(String newName)
    {
        if(newName != null)
        {
            name = newName;
        }
        else
        {
            System.out.println("Error 1");
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
            speed = newSpeed;
        }
        else
        {
            System.out.println("Error 2");
            speed = 0.0;
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
            System.out.println("Error 3");
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
        if(speed >= 1)
        {
            speed = speed - 1;
        }
        else
        {
            System.out.println("Ship is already standing!");
        }
    }

    public void print()
    {
        System.out.println("The name of the ship is: "+name);
        System.out.println("The speed of the ship is: "+speed);
        System.out.println("The number of Masts is: "+numberOfMasts);
        System.out.println("The ship has guns: "+hasGuns);
    }
}
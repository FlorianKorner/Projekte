public class Ship
{
    private String Name;
    private double Speed;
    private int NumberOfMasts;
    private boolean HasGuns;

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

    public Ship(String newName,int newNumberOfMasts)
    {
        setName(newName);
        setNumberOfMasts(newNumberOfMasts);
        setSpeed(0.0);
        setHasGuns(false);
    }

    public void speedup()
    {
        Speed = Speed+1.0;
    }

    public void slowdown()
    {
        if (Speed >= 1.0)
        {
            Speed = Speed-1.0;
        }
        else
        {
            System.out.println("-The speed is below 1.0-");
        }
    }

    public void setName(String newName)
    {
        if (newName.length() > 0)
        {
            Name = newName;
        }
        else
        {
            System.out.println("-The length of the name must be greater than 0-");
        }
    }

    public String getName()
    {
        return Name;
    }

    public void setSpeed(double newSpeed)
    {
        if (newSpeed >= 0.0)
        {
            Speed = newSpeed;
        }
        else
        {
            System.out.println("-The speed must be greater than 0.0");
        }
    }

    public double getSpeed()
    {
        return Speed;
    }

    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if (newNumberOfMasts > 0 && newNumberOfMasts <= 4)
        {
            NumberOfMasts = newNumberOfMasts;
        }
        else
        {
            System.out.println("-The number of masts must be grater than 0 and lower then 5-");
        }
    }

    public int getNumberOfMasts()
    {
        return NumberOfMasts;
    }

    public void setHasGuns(boolean newHasGuns)
    {
        HasGuns = newHasGuns;
    }

    public boolean getHasGuns()
    {
        return HasGuns;
    }

    public void print()
    {
        System.out.println("----Ship----");
        System.out.println("Name= " +getName());
        System.out.println("Speed= " +getSpeed());
        System.out.println("NumberOfMasts= " +getNumberOfMasts());
        System.out.println("HasGuns= " +getHasGuns());
        System.out.println("------------");
    }
}
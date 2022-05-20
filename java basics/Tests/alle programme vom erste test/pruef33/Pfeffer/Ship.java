public class Ship
{
    private String Name;
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
        setNumberOfMasts(newNumberOfMasts);
        setSpeed(0.0);
        setHasGuns(false);
    }
    public void speedup()
    {
        speed=speed+1.0;
    }
    public void slowdown()
    {
        if(speed>=1.0)
        {
            speed=speed-1;
        }
        else
        {
            System.out.println("error is also under 0.9");
        }
    }
    public void setName(String newName)
    {
    if(newName.length() > 0)
    {
        Name = newName;
    }
    else
    {
        System.out.println("error 1");
    }
    }
    public String getName()
    {
        return Name;
    }
    public void setSpeed(double newSpeed)
    {
        if(newSpeed>=0.0)
        {
            speed=newSpeed;
        }
        else
        {
            System.out.println("error 2");
        }
    }
    public double getSpeed()
    {
        return speed;
    }
    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if(newNumberOfMasts>0&&newNumberOfMasts<=4)
        {
            numberOfMasts=newNumberOfMasts;
        }
        else
        {
            System.out.println("error 3");
        }
    }
    public int getNumberOfMasts()
    {
        return numberOfMasts;
    }
    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns=newHasGuns;
    }
    public boolean getHasGuns()
    {
        return hasGuns;
    }
    public void print()
    {
        System.out.println("-----You'r Ship-----");
        System.out.println("Name of Ship: "+getName());
        System.out.println("The speed: "+getSpeed());
        System.out.println("The number of Masts: "+getNumberOfMasts());
        System.out.println("Has it guns: "+getHasGuns());
    }
}
public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGun;
    
    public Ship()
    {
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGun(false);
    }
    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGun)
    {
       setName(newName);
       setSpeed(newSpeed);
       setNumberOfMasts(newNumberOfMasts);
       setHasGun(newHasGun); 
    }
    public Ship(String newName, int newNumberOfMasts)
    {
        setName(newName);
        setNumberOfMasts(newNumberOfMasts);
        setSpeed(0.0);
        setHasGun(false);
    }
    
    public void setName(String newName)
    {
        if (newName != null && newName.length() != 0)
            name = newName;
        else
        {
            System.out.println("Invalid Name: " + newName);
            name = "unknown";
        }
    }
    public void setSpeed(double newSpeed)
    {
        if (newSpeed >= 0.0)
            speed = newSpeed;
        else
        {
            System.out.println("Invalid Speed: " + newSpeed);
            speed = 0.0;
        }
    }
    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if (newNumberOfMasts <= 4 && newNumberOfMasts > 0)
            numberOfMasts = newNumberOfMasts;
        else
        {
            System.out.println("Invalid numberOfMasts: " + newNumberOfMasts);
            numberOfMasts = 1;
        }
    }
    public void setHasGun(boolean newHasGun)
    {
        hasGun = newHasGun;
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
    public boolean getHasGun()
    {
        return hasGun;
    }
    
    public void speedup()
    {
        setSpeed(getSpeed() + 1.0);
    }
    public void slowdown()
    {
        if (getSpeed() < 1)
        {
            System.out.println("Ship would be too slow.");
            setSpeed(0.0);
        }
        else
            setSpeed(getSpeed() - 1.0);
    }
    
    public void print()
    {
        System.out.println("--- Ship Info ---");
        System.out.println("Name: " + getName());
        System.out.println("Speed (in knots): " + getSpeed());
        System.out.println("Number Of Masts: " + getNumberOfMasts());
        if (getHasGun())
            System.out.println("Has Gun: Yes");
        else
            System.out.println("Has Gun: No");
    }
}
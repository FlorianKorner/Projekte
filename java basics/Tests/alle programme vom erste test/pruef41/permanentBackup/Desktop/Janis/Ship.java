public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
    
    public Ship()
    {
        name = "Mary Celeste";
        speed = 0.0;
        numberOfMasts = 2;
        hasGuns = false;
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
         speed = 0.0;
         setNumberOfMasts(newNumberOfMasts);
         hasGuns = false;
    }
    
    public void setName(String newName)
    {
        if(newName == null || newName.length() == 0)
        {
            System.out.println("The given Name " + newName + " isn't valid");
            name = "Titanic";
        }else
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
        if(newSpeed >=0)
        {
            speed = newSpeed;
        }
        else{
            System.out.println("The given speed " + newSpeed + " isn't valid");
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
        else{
            System.out.println("The given number of masts " + newNumberOfMasts + " isn't valid");
            numberOfMasts = 1;
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
        System.out.println("The new Speed is " + speed);
    }
    
    public void slowdown()
    {
        if((speed - 1) < 0.0)
        {
            System.out.println("The speed can not be lower than 0");
        }else
        {
            speed = speed - 1;
            System.out.println("The new Speed is " + speed);
        }
    }
    
    public void print()
    {
        String Guns;
        if(hasGuns == true)
        {
            Guns = " has";
        }
        else{
            Guns = " has no";
        }
        System.out.println("The ship " + name + " has a speed of " + speed + " and has " + numberOfMasts + " masts. The " + name + Guns + " Guns.");
    }
    
    
}

public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    private double speedup;
    private double slowdown;

    public Ship(String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns)
    {
        name=("Mary Celeste");
        speed=(0.0);
        numberOfMasts=(2);
        hasGuns=(false);
    }

    public void setName(String newName)
    {
        if(newName!=null)
        {
            name=newName;
        }
        else
        {
            System.out.println("Name Error");
            name="Paul";
        }
    }

    public void setSpeed(double newSpeed)
    {
        if(newSpeed>=0.0)
        {
            speed=newSpeed;
        }
        else
        {
            System.out.println("Speed Error");
            speed=3;
        }
    }

    public void setNumberOfMasts(int newNumberOfMasts)
    { 
        if(newNumberOfMasts>0 && newNumberOfMasts<4)
        {           
            numberOfMasts=newNumberOfMasts;
        }
        else
        {
            System.out.println("NumberOfMasts Error");
            numberOfMasts=3;
        }
    }

    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns=newHasGuns;
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

    public double getSpeedup()    
    {
        if(speed>0.0)
        {
            speedup=(speed+1);
            return speedup;
        }    
        else
        {
            System.out.println("Speedup Error");
            return speedup;
        }
    }

    public double getSlowdown()
    {
        if(speed>0.0)
        {
            slowdown=(speed-1);  
            return slowdown;
        }
        else
        {
            System.out.println("Slowdown Error");
            return slowdown;
        }
    }

    public void print()
    {
        System.out.println("*********************");
        System.out.println("The Name is " + getName());
        System.out.println("The Speed is " + getSpeed());
        System.out.println("The NumberOfMasts is " + getNumberOfMasts());
        System.out.println("The Ship HasGuns " + getHasGuns());
        System.out.println("*********************");
    }
}


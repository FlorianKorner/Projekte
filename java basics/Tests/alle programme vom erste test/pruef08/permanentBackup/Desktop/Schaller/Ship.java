public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;

    private Ship()
    {
        setName ("Mary Celeste");
        setSpeed (0.0);
        setNumberOfMasts (2);
        setHasGuns (true);
    }

    public Ship(String newName,double newSpeed,int newNumberOfMasts,boolean newHasGuns)
    {
        name=newName;
        numberOfMasts=newNumberOfMasts;
    }

    public void setName (String newName)
    {
        if(newName==null)
        {
            name="Mary Celeste";
        }
        else
        {
            name=newName;
        }
    }

    public void setNumberOfMasts (int newNumberOfMasts)
    {
        if(newNumberOfMasts==0.0||newNumberOfMasts>0.0&&newNumberOfMasts==4&&newNumberOfMasts>4)
        {
            numberOfMasts=newNumberOfMasts;
        }
        else
        {
            numberOfMasts=2;
        }
    }    

    public void setSpeed (double newSpeed)
    {
        if(newSpeed>0.0)
        {
            speed=newSpeed;
        }
        else
        {
            speed=0.0;
            System.out.println("number must be above 0.0");
        }
    }    

    public void setHasGuns (boolean newHasGuns)
    {
        hasGuns=newHasGuns;
    }

    public int getNumberOfMasts()
    {
        return numberOfMasts;
    }

    public boolean getHasGuns()
    {
        return hasGuns;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void speedup(double newSpeed)
    {
        newSpeed=speed+1;
    }

    public void slowdown(double newSpeed)
    {
        if(newSpeed<0.0)
        {
            speed=2;
        }
        else
        {
            newSpeed=speed+1;
        }
    }

    public void print()
    {
        System.out.println("name is="+name);
        System.out.println("speed is="+speed);
        System.out.println("There are so many mast="+numberOfMasts);
        System.out.println("has guns="+hasGuns);
    }
}


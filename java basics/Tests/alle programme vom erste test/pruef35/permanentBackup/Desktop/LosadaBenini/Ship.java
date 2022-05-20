public class Ship
{
    public String name;
    public double speed;
    public int masts;
    public boolean guns;

    public Ship(String newName,int newMasts)
    {
        setName(newName);
        setMasts(newMasts);
    }

    public Ship(String newName,double newSpeed,int newMasts,boolean newGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setMasts(newMasts);
        setGuns(newGuns);
    }

    public Ship()
    {
        setName("Mary Celeste");
        setSpeed(0.0);
        setMasts(2);
        setGuns(false);
    }

    public void setName(String newName)
    {
        if(newName !=null)
            name=newName;
        else
        {
            System.out.println("not possible:  "+getName());
            name="Mary Celeste";
        }
    }

    public String getName()
    {
        return name;
    }

    public void setSpeed(double newSpeed)
    {
        if (newSpeed>=0.0)
            speed=newSpeed;
        else
        {
            System.out.print("not valid"+getSpeed());
            speed=0.0;
        }
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setMasts(int newMasts)
    {
        if (newMasts>0.0 && newMasts<=4)
            masts=newMasts;
        else
        {
            System.out.println("not valid"+getMasts());
            masts=0;
        }
    }

    public int getMasts()
    {
        return masts;
    }

    public void setGuns(boolean newGuns)
    {
        guns=newGuns;
    }

    public boolean getGuns()
    {
        return guns;
    }

    public double getSpeedup()
    {
        return speed+1;
    }

    public double getSlowdown()
    {
        return speed-1;
    }

    public void print()
    {
        System.out.println("--------------------------------------");
        System.out.println("This is your boats name:    "+getName());
        System.out.println("This is it's max speed: "+getSpeed());
        System.out.println("This is/are his masts:  "+getMasts());
        System.out.println("Does it have Guns:  "+getGuns());
        System.out.println("---------------------------------------");
    }
}
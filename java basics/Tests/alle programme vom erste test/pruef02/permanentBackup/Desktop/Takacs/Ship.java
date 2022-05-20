
public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
    
    
    public  Ship()
    {
        setName("Mary Celeste");
        setSpeed(0.0);
        setNumberOfMasts(2);
        setHasGuns(false);
    }
    
    public Ship(String newName,double newSpeed,int newNumberOfMasts,boolean newHasGuns)
    {
       setName(newName); 
       setSpeed(newSpeed);
       setNumberOfMasts(newNumberOfMasts);
       setHasGuns(newHasGuns); 
    }
    
    public Ship(String newName,int newNumberOfMasts)
    {
        setName(newName); 
       setSpeed(0.0);
       setNumberOfMasts(newNumberOfMasts);
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
            System.out.println("Wrong parameter in setName ;");
            name = "Concordia";
        }
    }

    public void setSpeed(double newSpeed)
    {
        if(newSpeed >= 0.0 )
        {
            speed = newSpeed;
        }
        else
        {
            System.out.println("Wrong parameter in setSpeed ;");
            speed = 5.0;
        }

    }

    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if(newNumberOfMasts > 0 && 4 >= newNumberOfMasts  )
        {
            numberOfMasts = newNumberOfMasts;
        }
        else
        { 
            System.out.println("Wrong parameter in setNumberOfMasts ;");
            numberOfMasts  = 1;
        }
    }

    public void setHasGuns(boolean newHasGuns)
    {
        hasGuns = newHasGuns;
    }

    public void Speedup(double newSpeedup)
    {
        setSpeed( 1 + speed);
    }

    public void SlowDown(double newSlowdn)
    {
        if(speed >=1)
        {
            setSpeed(speed -1);
        }
        else
        {
            System.out.println("Not possible");
        }

        
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
    public void print()
    {
        System.out.println("+++++++++++++"+getName() + "ship+++++++++");
        System.out.println("The ship is called " +  getName() );
        System.out.println("The ship is "+ getSpeed() + " knots fast");
        System.out.println("The ship has " + getNumberOfMasts() + " man on board ");
        if(hasGuns == true)
        {
            System.out.println("This ship do have guns on board");
        }
        else
        {
           System.out.println("This ship do NOT have guns  on board");
        }
    }
}
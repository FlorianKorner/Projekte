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
        setNumberOfMasts(1);
        setHasGuns(false);
    }

    public Ship(String name, double speed, int numberOfMasts, boolean hasGuns)
    {
        setName(name);
        setSpeed(speed);
        setNumberOfMasts(numberOfMasts);
        setHasGuns(hasGuns);
    }

    public Ship(double speed, String name, int numberOfMasts, boolean hasGuns)
    {
        setName(name);
        setNumberOfMasts(numberOfMasts);
        setSpeed(20);
        setHasGuns(false);
    }

    public void setName(String newName)
    {   String length="";
        if(newName==null||newName==length)
        {System.out.println("Error 505");
            name="Alina";
        }
        else
        {name=newName;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setSpeed(double newSpeed)
    {
        if(newSpeed<=0.0)
        {System.out.println("Error 506 please check the Speed "+getSpeed());
        }else{
            speed=newSpeed; 
        }
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if(newNumberOfMasts>0 && newNumberOfMasts >=4)
        {numberOfMasts=newNumberOfMasts;}
        else
        {   System.out.println("Error 507 check on the number of masts you wanted to set them to "+getNumberOfMasts());
            newNumberOfMasts=2;
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

    public void speedup()
    {  
        setSpeed(getSpeed()+1);
    }

    public void slowdown()
    {  
        if(getSpeed()<=0.0)
        {
            setSpeed(getSpeed()-1);
        }
        else
        {
            System.out.println("Error 508 Speed can not be smaller than 0.0");
        }
    }

    public void print()
    {if(getHasGuns()==false)
        {
            System.out.println("------------------------------------------------------------");
            System.out.println("Name: "+getName());
            System.out.println("Speed: "+getSpeed());
            System.out.println("number of masts is "+getNumberOfMasts());
            System.out.println("the Ship has guns");
            System.out.println("------------------------------------------------------------");
        }else{
            System.out.println("------------------------------------------------------------");
            System.out.println("Name: "+getName());
            System.out.println("Speed: "+getSpeed());
            System.out.println("number of masts is "+getNumberOfMasts());
            System.out.println("the Ship has no guns");
            System.out.println("------------------------------------------------------------");
        }
    }
}
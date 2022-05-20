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
    
    public Ship(String newName, int newNumberOfMasts)
    {
        setName(newName);
        setSpeed(0.0);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(false);
    }
    
    public Ship(String newName,double newSpeed, int newNumberOfMasts, boolean newHasGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);
    }
    
    public void speedup()
    {
        setSpeed(getSpeed()+1);
    }
    
    public void slowdown()
    {
        if((getSpeed()-1) <=0)
            setSpeed(0.0);
        else
            setSpeed(getSpeed()-1);
    }
    
    public void setName(String newName)
    {
        if(newName != null && newName.length()!=0)
            name = newName;
        else
            {
                System.out.println("Error. Wrong input: "+newName);
                name = "Mary Celeste";
            }
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setSpeed(double newSpeed)
    {
        if(newSpeed>=0)
            speed = newSpeed;
        else
        {
            System.out.println("Error. Wrong input: "+newSpeed);
            speed = 15.0;
        }
    }
    
    public double getSpeed()
    {
        return speed;
    }
    
    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if(newNumberOfMasts >0 && newNumberOfMasts <=4)
            numberOfMasts = newNumberOfMasts;
        else
        {
            System.out.println("Error. Wrong input: "+newNumberOfMasts);
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
    
    public void print()
    {
        String yesNo;
        if(getHasGuns())
            yesNo = "It has ";
        else
            yesNo = "It does not have ";
        System.out.println("The ships name is: "+getName());
        System.out.println("It has a speed of "+getSpeed()+" knots");
        System.out.println("It has "+getNumberOfMasts()+ " masts");
        System.out.println(yesNo+"guns");
    }
}
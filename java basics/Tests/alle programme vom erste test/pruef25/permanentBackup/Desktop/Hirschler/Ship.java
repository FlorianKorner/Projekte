public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    
    public void Ship()
    {
        name = "Mary Celeste";
        speed = 0.0;
        numberOfMasts = 2;
        hasGuns = false;
    }
    public void Ship (String newName, double newSpeed, int newNumberOfMasts, boolean newHasGuns);
    {
        this.name = newName;
        this.speed = 0.0;
        this.numberOfMasts = newNumberOfMasts;
        this.hasGuns = false;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    public String getName()
    {
        return name;
    }
    
    public void setSpeed(double newSpeed)
    {
        if(speed >= 0.0)
        {
          
        }
        this.speed = newSpeed;
    }
    public double getSpeed()
    {
        return speed;
    }
    public void speedup(int speedup)
    {
        if()
        {
        }
        else
        {
           
        }
       speedup = speed + 1;
       
    }
    public void slowdown()
    {
        if()
        {
            
        }
        
    }
    public void setNumberOfMasts(int newNumberOfMasts)
    {
        if(numberOfMasts > 0 || numberOfMasts = 4)
        this.numberOfMasts = newNumberOfMasts;
    }
    public int getNumbersOfMasts()
    {
        return numberOfMasts;
    }
    
    public void setHasGuns(boolean newHasGuns)
    {
        this.hasGuns = newHasGuns;
    }
    public boolean getHasGuns()
    {
        return hasGuns;
    }
    
    public void printInfo()
    {
        System.out.println("The name of the boat is: "+ name + "it's speed is: "+speed + " it has:" + numberOfMasts + "Masts" + 
        "it has guns" + hasGuns);
    }
}
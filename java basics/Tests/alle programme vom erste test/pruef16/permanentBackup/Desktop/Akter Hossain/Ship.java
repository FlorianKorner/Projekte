
/**
 * Beschreiben Sie hier die Klasse Ship.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ship
{
   private String name;
   private double speed;
   private int numberOfMasts;
   private boolean hasGuns;
   
   public Ship ()
   {
     this.name = "Marry Celeste";
     this.speed = 0.0;
     this.numberOfMasts = 2;
     this.hasGuns = false;
    }
    
    public Ship (String name,double speed,int numberOfMasts,boolean hasGuns )
   {
     setName (name);
     setSpeed (speed);
     setNumberOfMasts (numberOfMasts);
     setHasGuns (hasGuns);
    }
    
    public Ship (String name,int numberOfMasts)
   {
     setName (name);
     setNumberOfMasts (numberOfMasts);
     this.speed = 0.0;
     this.hasGuns = false;
    }
    
    public String getName ()
    {
        return name;
    }
    public double getSpeed ()
    {
        return speed;
    }
    public int getNumberOfMasts()
    {
        return numberOfMasts;
    }
    public boolean getHasGuns ()
    {
        return hasGuns;
    }
    
    public void setName(String name)
    {
     if(name != null && name.length() >= 0)
     {
         this.name = name;
         
        }
        else
        {
            System.out.println ("Invalid name: " + getName());
        }
    }
    public void setSpeed (double speed)
    {
     if (speed >= 0.0)
     {
      this.speed = speed;   
        }
        else
        System.out.println ("Invalid speed: "+ getSpeed());
    }
    public void setNumberOfMasts(int numberOfMasts)
    {
        if(numberOfMasts >= 0 && numberOfMasts <= 4)
        {
        this.numberOfMasts = numberOfMasts;
    }
    else
    {
        System.out.println ("Invalid number of masts: "+ getNumberOfMasts());
    }    
    }
    public void setHasGuns(boolean hasGuns)
    {
     this.hasGuns = hasGuns;   
    }
    
    public void speedup()
    {
        if (speed >= 0.0)
        {
        speed = getSpeed() + 1;
    }
    else
    {
        System.out.println ("Invalid speed");
    }
    }
    
    public void slowdown()
    {
         if (speed >= 0.0)
        {
        speed = getSpeed() - 1;
    }
    else
    {
        System.out.println ("Invalid speed");
    }
    }
    
    public void print()
    {
     System.out.println ("Name: " + getName());  
     System.out.println ("Speed: " + getSpeed());
     System.out.println ("Number of masts: " + getNumberOfMasts());
     if(hasGuns == true)
     {
         System.out.println ("Has Guns: " + getHasGuns());
         
        }
        else
        if(hasGuns == false)
        {
            System.out.println ("Has Guns: " + getHasGuns());
        }
    }
    
    
    
}
        
    
    
    
    


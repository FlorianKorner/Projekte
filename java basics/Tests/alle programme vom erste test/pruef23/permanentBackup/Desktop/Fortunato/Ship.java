public class Ship
{ 
    public String Name;
    public double speed;
    public int numberOfMasts;
    public boolean hasGun;
    
    public Ship()
    {
       this.Name = "Mary Celeste"; 
       this.speed = 0.0;
       this.numberOfMasts = 2;
       this.hasGun = false;
    }
    
    public Ship(String Name, double speed, int numberOfMasts, boolean hasGun)
    {
       Name = Name;
       speed = speed;
       numberOfMasts = numberOfMasts;
       hasGun = hasGun;
    }
    
    public Ship(String Name, int numberOfMasts)
    {
        Name = "Mary Cleste";
        numberOfMasts = 2;
    }
    
    public Ship(double speed, boolean hasGun)
    {
        speed = 0.0;
        hasGun = false;
    }
    
    //setters// //getters//
    public Ship (String Name)
    {
        if ( (Name==0) )
        {
            return name;
        }
        
    }
    
    public Ship (double speed)
    {
        if ( (speed>=0) )
        {
            return speed; 
        }
    }
    
    public Ship (int numberOfMasts)
    {
        if ( ( numberOfMasts>=0 && numberOfMasts<=4) )
        {
          return numberOfMasts;
        }   
    }
    
     public void speedup()
     {
         if (speed-1)
         {
          return speed;
        }
    }
    
    public void slowdown()
    {
        if (speed + 1>=0.0)
       {
         return speed;
       }
        
    } 
}

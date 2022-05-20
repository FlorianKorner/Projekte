public class SHip
{
    private String name;
    private double speed;
    private int numberofMasts;
    private boolean hasGuns;
    public void Statistics(String newName, double newSpeed, int newNumberofMasts, boolean newHasGuns)
    {
         setName(newName);
         setSpeed(newSpeed);
         setNumberofMasts(newNumberofMasts);
         setHasGuns(newHasGuns);
    }
    public void setName(String newName)
    {   
        if(name != "null")
         name = newName;
        else
         System.out.println("Error in setting name " + newName);
    }
    public void setSpeed(double newSpeed)
    {   
        if(newSpeed >= 0 && newSpeed < 100)
         speed = newSpeed;
        else
         System.out.println("Error in setting speed " + newSpeed);
    }
    public void setNumberofMasts(int newNumberofMasts)
    {   
        if(newNumberofMasts > 0)
         numberofMasts = newNumberofMasts;
        else
         System.out.println("Error in setting numberofMasts " + newNumberofMasts);
    }
    public void setHasGuns(boolean newHasGuns)
    {  
         hasGuns = newHasGuns;
    }
    public String getName()
    {
         return name;
    }
    public double getSpeed()
    {
         return speed;
    }
    public int getNumberofMasts()
    {
         return numberofMasts;
    }
    public boolean getHasGuns()
    {
         return hasGuns;
    }
    public void speedUp()
    {   
         speed = speed + 1;
    }
    public void slowDown()
    {   
        if(speed >= 0)
        speed = speed - 1;
        else
        System.out.println("Cant go below 0");
    }
    public void print()
    {
        System.out.println("---------------------------");
        System.out.println("The name of the ship is " + name);
        System.out.println("The speed currently is " + speed);
        System.out.println("It has " + numberofMasts + " number of masts");
        System.out.println("Guns: " + hasGuns);
        System.out.println("---------------------------");
        System.out.println("Age of discovery 1444");
    }
}

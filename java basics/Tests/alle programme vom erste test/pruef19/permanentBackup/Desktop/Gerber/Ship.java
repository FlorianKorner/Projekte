public class Ship
{
    private String name;
    private double speed;
    private int numberOfMasts;
    private boolean hasGuns;
    public Ship()
    {
        name = "Mary Celeste";
        speed = 0.0;
        numberOfMasts = 2;
        hasGuns = false;
    }

    public Ship( String newName,double newSpeed,int newNumberOfMasts, boolean newHasGuns)
    {
        setName(newName);
        setSpeed(newSpeed);
        setNumberOfMasts(newNumberOfMasts);
        setHasGuns(newHasGuns);

    }

    public Ship(String newName, int newNumberOfMasts)
    {
        setName(newName);
        speed = 0.0;
        numberOfMasts = newNumberOfMasts;
        hasGuns = false;

    }
    
}